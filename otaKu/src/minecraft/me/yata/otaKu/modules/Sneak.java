package me.yata.otaKu.modules;

import org.lwjgl.input.Keyboard;

import me.yata.otaKu.module.Category;
import me.yata.otaKu.module.Module;

public class Sneak extends Module{

	public Sneak() {
		
		super("Sneak", Keyboard.KEY_Z, Category.PLAYER);
		
	}
	
	public void onUpdate() {
		
		if(!this.getState())
			return;
			mc.thePlayer.setSneaking(true);
		
	}
	
	public void onDisable() {
		
		mc.thePlayer.setSneaking(false);

		
	}

}
