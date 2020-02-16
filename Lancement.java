package fr.rexignis.LG_uhc;

import org.bukkit.plugin.java.JavaPlugin;

public class Lancement extends JavaPlugin{
public static boolean bgame = false;
public static int nbp = 0;
public static int nblg = 0;
public static int nblgb = 0;
public static int nbes = 0;
public static int nba = 0;
public static int nbs = 0;
	public void onEnable(){
		System.out.println("Le plugin LG_uhc est activé");
		getCommand("distribuer_roles").setExecutor(new LG_uhc_cmd());
		getCommand("stop_game").setExecutor(new cmd_stop_game());
		getCommand("join").setExecutor(new cmd_join());
	}
	public void onDisable(){
		System.out.println("Le plugin LG_uhc est éteint");
	}
}
