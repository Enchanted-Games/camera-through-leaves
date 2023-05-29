package games.enchanted.ctl;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CTLclient implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("camera-through-leaves");

	@Override
	public void onInitialize() {
		System.out.println("ctl initialised");
	}
}