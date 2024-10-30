package io.github.errordude42.sillywillycore;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModTabs;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModParticleTypes;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModItems;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluids;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluidTypes;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModBlocks;

@Mod("silly_willy_core")
public class SillyWillyCoreMod {
	public static final Logger LOGGER = LogManager.getLogger(SillyWillyCoreMod.class);
	public static final String MODID = "silly_willy_core";

	public SillyWillyCoreMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		SillyWillyCoreModBlocks.REGISTRY.register(bus);

		SillyWillyCoreModItems.REGISTRY.register(bus);

		SillyWillyCoreModTabs.REGISTRY.register(bus);

		SillyWillyCoreModParticleTypes.REGISTRY.register(bus);

		SillyWillyCoreModFluids.REGISTRY.register(bus);
		SillyWillyCoreModFluidTypes.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
