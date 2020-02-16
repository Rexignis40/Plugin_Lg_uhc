package fr.rexignis.LG_uhc;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Night {
	private static Plugin plugin;
	public Night(final Player lg1,final Player lg2,final Player lg3,final Player lg4,final Player lg5,final Player lgb,final Player es,final Player a,final Player s1,final Player s2){
		lg1.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 12000, 1));
		lg2.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 12000, 1));
		lg3.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 12000, 1));
		lg4.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 12000, 1));
		lg5.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 12000, 1));
		lgb.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 12000, 1));
		lg1.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
		lg2.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
		lg3.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
		lg4.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
		lg5.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
		lgb.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
		Bukkit.getScheduler().runTaskLater(plugin,new Runnable() {
			  @Override
			  public void run() {
			    new Day(lg1,lg2,lg3,lg4,lg5,lgb,es,a,s1,s2);
			  }
			},1200L);
	}
}
