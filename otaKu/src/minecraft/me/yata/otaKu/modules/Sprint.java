package me.yata.otaKu.modules;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import me.yata.otaKu.module.Category;
import me.yata.otaKu.module.Module;
import me.yata.otaKu.utils.Wrapper;

public class Sprint extends Module {

	public Sprint() {
		
		super("|Sprint|", Keyboard.KEY_R, Category.PLAYER);
		
	}
	
	public void onUpdate() {
		
		if(!this.getState())
			
			return;
			
		if(!(Wrapper.mc.thePlayer.isCollidedHorizontally) && Wrapper.mc.thePlayer.moveForward > 0.0f) {
			
			Wrapper.mc.thePlayer.setSprinting(true);
			
		}
		
		else {
			Wrapper.mc.thePlayer.setSprinting(false);
		}

	}
	
}

