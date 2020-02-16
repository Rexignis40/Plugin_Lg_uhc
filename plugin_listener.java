package fr.rexignis.LG_uhc;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class plugin_listener implements Listener{
	@EventHandler
	void onPlayerDeath(PlayerDeathEvent e){
		if(e.getEntity().getKiller() == Bukkit.getPlayer(cmd_join.nlg1)){
			Bukkit.getPlayer(cmd_join.nlg1).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 2));
		}else if(e.getEntity().getKiller() == Bukkit.getPlayer(cmd_join.nlg2)){
			Bukkit.getPlayer(cmd_join.nlg2).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 2));
		}else if(e.getEntity().getKiller() == Bukkit.getPlayer(cmd_join.nlg3)){
			Bukkit.getPlayer(cmd_join.nlg3).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 2));
		}else if(e.getEntity().getKiller() == Bukkit.getPlayer(cmd_join.nlg4)){
			Bukkit.getPlayer(cmd_join.nlg4).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 2));
		}else if(e.getEntity().getKiller() == Bukkit.getPlayer(cmd_join.nlg5)){
			Bukkit.getPlayer(cmd_join.nlg5).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 2));
		}else if(e.getEntity().getKiller() == Bukkit.getPlayer(cmd_join.nlgb)){
			Bukkit.getPlayer(cmd_join.nlgb).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 2));
		}
	}
}
