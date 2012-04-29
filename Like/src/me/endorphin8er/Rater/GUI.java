package me.endorphin8er.Rater;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.getspout.commons.ChatColor;
import org.getspout.spoutapi.gui.GenericContainer;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.gui.WidgetAnchor;
import org.getspout.spoutapi.player.SpoutPlayer;

public class GUI {
	
	GenericPopup popup;
	GenericContainer box;
	GenericLabel title;
	GenericLabel likes;
	GenericLabel dislikes;
	GenericLabel agrees;
	GenericLabel disagrees;
	GenericLabel facepalms;
	
	// Define the Rate object
	Rate rate;

	public GUI(SpoutPlayer sp, Player target, Plugin plugin, Rate rate_class) {
		
		rate = rate_class;
		
		title = new GenericLabel(ChatColor.GREEN + target.getName());
		title.setAnchor(WidgetAnchor.TOP_CENTER);
		title.doResize();
		
		likes = new GenericLabel(ChatColor.AQUA + "Likes: " + ChatColor.WHITE + rate.Likes(target));
		likes.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		dislikes = new GenericLabel(ChatColor.GREEN + "Dislikes: " + ChatColor.WHITE + rate.DisLikes(target));
		dislikes.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		agrees = new GenericLabel(ChatColor.AQUA + "Agrees: " + ChatColor.WHITE + rate.Agrees(target));
		agrees.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		disagrees = new GenericLabel(ChatColor.GREEN + "Disagrees: " + ChatColor.WHITE + rate.DisAgrees(target));
		disagrees.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		facepalms = new GenericLabel(ChatColor.AQUA + "Facepalms: " + ChatColor.WHITE + rate.Facepalms(target));
		facepalms.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		box = new GenericContainer();
		
		box.addChildren(title, likes, dislikes, agrees, disagrees, facepalms);
		box.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		box.setDirty(true);
		
		popup = new GenericPopup(); 
		popup.attachWidget(plugin, box);
		sp.getMainScreen().attachPopupScreen(popup);
		
	}
}
