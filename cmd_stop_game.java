package fr.rexignis.LG_uhc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class cmd_stop_game implements CommandExecutor{
	public boolean onCommand(CommandSender sender,Command end,String stop_game,String[] arg){
		sender.getServer().broadcastMessage("Le LG_uhc est stoppé");
		Lancement.bgame = false;
		Lancement.nbp = 0;
		Lancement.nblg = 0;
		Lancement.nblgb = 0;
		Lancement.nbes = 0;
		Lancement.nba = 0;
		Lancement.nbs = 0;
		return false;
	}
}
