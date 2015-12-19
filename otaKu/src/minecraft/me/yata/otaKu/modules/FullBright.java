package me.yata.otaKu.modules;

import org.lwjgl.input.Keyboard;

import me.yata.otaKu.module.Category;
import me.yata.otaKu.module.Module;
import me.yata.otaKu.utils.Wrapper;

public class FullBright extends Module{

	public FullBright() {
		
		super("|Full Bright|", Keyboard.KEY_V, Category.RENDER);
		
	}
	
	public void onUpdate() {
		if(this.getState()) {
			
			Wrapper.mc.gameSettings.gammaSetting = 10f;
			
		}
		else {
			
			Wrapper.mc.gameSettings.gammaSetting = 1f;
			
		}
	}
	

}
