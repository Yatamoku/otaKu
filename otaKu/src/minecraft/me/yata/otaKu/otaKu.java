package me.yata.otaKu;

import me.yata.otaKu.managers.GuiManager;
import me.yata.otaKu.module.ModuleManager;

import org.darkstorm.minecraft.gui.theme.simple.SimpleTheme;
import org.darkstorm.minecraft.gui.util.GuiManagerDisplayScreen;
import org.lwjgl.opengl.Display;

public class otaKu {

		public static String Client_Name = "otaKu";
		public static double Client_Version = 1.2;
		
		public static final otaKu theClient = new otaKu();
		
		public static ModuleManager moduleManager;
		
		private GuiManagerDisplayScreen gui;
		private GuiManager guiManager;
		
		public static void StartClient() {
			
			moduleManager = new ModuleManager();
			Display.setTitle(Client_Name + "(release" + Client_Version + ") dev: yata / eroge");
			
		}
		
		public GuiManager getGuiManager() {
			
			if(guiManager == null) {
				
				guiManager = new GuiManager();
				guiManager.setTheme(new SimpleTheme());
				guiManager.setup();
				
			}
			
			return guiManager;
			
		}
		
		public GuiManagerDisplayScreen getGui() {
			
			if(gui == null) {
				
				gui = new GuiManagerDisplayScreen(getGuiManager());
				
			}
			
			return gui;
			
		}

		public static String getClient_Name() {
			return Client_Name;
		}

		public static void setClient_Name(String client_Name) {
			Client_Name = client_Name;
		}

		public static double getClient_Version() {
			return Client_Version;
		}

		public static void setClient_Version(double client_Version) {
			Client_Version = client_Version;
		}
		
		
		
		
		
}
