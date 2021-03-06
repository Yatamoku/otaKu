package me.yata.otaKu.module;

import java.util.ArrayList;

import me.yata.otaKu.modules.*;

public class ModuleManager {
	
	public static ArrayList<Module> activeModules = new ArrayList<Module>();
	
	public ModuleManager() {
		
		this.activeModules.add(new Sprint());
		this.activeModules.add(new FullBright());
		this.activeModules.add(new Fly());
		this.activeModules.add(new Sneak());
		this.activeModules.add(new FastPlace());
		this.activeModules.add(new Speed());
		this.activeModules.add(new GUI());

	}
	
	public static ArrayList<Module> getModules() {
		
		return activeModules;
		
	}
	
	public Module getModule(Class <? extends Module> clazz) {
		
		for(Module mod: getModules()) {
			
			if(mod.getClass() == clazz) {
				
				return mod;
				
			}
			
		}
		return null;
		
	}
	
}
