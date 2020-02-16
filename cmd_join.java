package fr.rexignis.LG_uhc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class cmd_join implements CommandExecutor{
	public static String nlg1;
	public static String nlg2;
	public static String nlg3;
	public static String nlg4;
	public static String nlg5;
	public static String nlgb;
	public static String nes;
	public static String na;
	public static String ns1;
	public static String ns2;
	public boolean onCommand(CommandSender sender,Command pjoin,String join,String[] arg){
		final Player player = ((OfflinePlayer) sender).getPlayer();
		if(Lancement.bgame){
			ItemStack IS;
			if(Lancement.nblg != 5){
						if(Lancement.nblg < 1){
							nlg1 = player.getName();
						}else if(Lancement.nblg < 2){
							nlg2 = player.getName();
						}else if(Lancement.nblg < 3){
							nlg3 = player.getName();
						}else if(Lancement.nblg < 4){
							nlg4 = player.getName();
						}else{
							nlg5 = player.getName();
						}
						Lancement.nblg += 1;
						Lancement.nbp += 1;
							}else if(Lancement.nblgb != 1){
								player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 1));
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 1));
								player.	setHealthScale(30);
								Lancement.nblgb = 1;
								Lancement.nbp += 1;
								nlgb = player.getName();
									}else if(Lancement.nbes != 1){
										player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 1));
										Lancement.nbes += 1;
										Lancement.nbp += 1;
										nes = player.getName();
											}else if(Lancement.nba != 1){
												IS = new ItemStack(Material.IRON_SWORD, 1);
												IS.addEnchantment (Enchantment.DAMAGE_UNDEAD, 1);
										        ((HumanEntity) sender).getInventory().addItem(IS);
												Lancement.nba += 1;
												Lancement.nbp += 1;
												na = player.getName();
													}else if(Lancement.nbs != 2){
														player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 1));
														if(Lancement.nbs < 1){
															ns1 = player.getName();
																}else if(Lancement.nbs !=2){
																	ns2 = player.getName();	
																}
															}
if(Lancement.nbp == 19){
	World world = player.getWorld();
	world.setTime(1000L);
	final Player lg1 = Bukkit.getPlayer(nlg1);
	final Player lg2 = Bukkit.getPlayer(nlg2);
	final Player lg3 = Bukkit.getPlayer(nlg3);
	final Player lg4 = Bukkit.getPlayer(nlg4);
	final Player lg5 = Bukkit.getPlayer(nlg5);
	final Player lgb = Bukkit.getPlayer(nlgb);
	final Player es = Bukkit.getPlayer(nes);
	final Player a = Bukkit.getPlayer(na);
	final Player s1 = Bukkit.getPlayer(ns1);
	final Player s2 = Bukkit.getPlayer(ns2);
	new Day(lg1,lg2,lg3,lg4,lg5,lgb,es,a,s1,s2);
	}
															}
		return false;
	}
}
