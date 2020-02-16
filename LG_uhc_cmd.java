package fr.rexignis.LG_uhc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LG_uhc_cmd implements CommandExecutor{
	public boolean onCommand(CommandSender sender,Command distrirole,String distribuer_roles,String[] arg){
		sender.getServer().broadcastMessage("Le LG_uhc est lancé pour rejoindre faites /join");
		Lancement.bgame = true;
		return false;
	}
}
