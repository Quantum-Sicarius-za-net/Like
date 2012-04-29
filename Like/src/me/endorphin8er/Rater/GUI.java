package me.endorphin8er.Rater;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
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

	public GUI(SpoutPlayer sp, Player target, Plugin plugin) {
		
		title = new GenericLabel(target.getName());
		title.setAnchor(WidgetAnchor.TOP_CENTER);
		
		likes = new GenericLabel("Likes: ");
		likes.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		dislikes = new GenericLabel("Dislikes: ");
		dislikes.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		agrees = new GenericLabel("Agrees: ");
		agrees.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		disagrees = new GenericLabel("Disagrees: ");
		disagrees.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		facepalms = new GenericLabel("Facepalms: ");
		facepalms.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		box.addChildren(title, likes, dislikes, agrees, disagrees, facepalms);
		box.setAnchor(WidgetAnchor.CENTER_CENTER);
		
		box.setDirty(true);
		
		popup.attachWidget(plugin, box);
		sp.getMainScreen().attachPopupScreen(popup);
		
	}
}
