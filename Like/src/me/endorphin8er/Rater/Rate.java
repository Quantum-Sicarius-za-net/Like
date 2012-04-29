package me.endorphin8er.Rater;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Rate extends JavaPlugin implements Listener {
	public static Rate Plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	int counter = 0;

	
	@Override
	public void onDisable() {
	PluginDescriptionFile pdfFile = this.getDescription();
	this.logger.info(pdfFile.getName() + " Is Offline!");
	}
	 
	@Override
	public void onEnable() {
	PluginDescriptionFile pdfFile = this.getDescription();
	this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +  " Is Online!");
   
    }
 

	

	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("like")){
			if(args.length == 0){
				if(player.isOp()){
					player.sendMessage("----" + ChatColor.GREEN + "Like Help" + ChatColor.WHITE + "----");
					player.sendMessage(ChatColor.AQUA + "/like" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
					player.sendMessage(ChatColor.AQUA + "/like <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Like Them");
					player.sendMessage(ChatColor.AQUA + "/like amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Likes You Have!");
					player.sendMessage(ChatColor.AQUA + "/facepalm" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows Facepalm Commands!");
					player.sendMessage(ChatColor.AQUA + "/dislike" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows Dislike Commands!");
					player.sendMessage(ChatColor.AQUA + "/agree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows 'Agree' Commands!");
					player.sendMessage(ChatColor.AQUA + "/disagree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows 'Disagree' Commands!");



				}else{
					player.sendMessage("----" + ChatColor.GREEN + "Like Help" + ChatColor.WHITE + "----");
					player.sendMessage(ChatColor.AQUA + "/like" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
					player.sendMessage(ChatColor.AQUA + "/like amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Likes You Have");
					player.sendMessage(ChatColor.AQUA + "/like <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Like Them");
					player.sendMessage(ChatColor.AQUA + "/facepalm" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows Facepalm Commands!");
					player.sendMessage(ChatColor.AQUA + "/dislike" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows Dislike Commands!");
					player.sendMessage(ChatColor.AQUA + "/agree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows 'Agree' Commands!");
					player.sendMessage(ChatColor.AQUA + "/disagree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows 'Disagree' Commands!");

					



				}
			}if(args.length == 1){
				if(player.getServer().getPlayer(args[0]) !=null){
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					if(targetPlayer.isOp()){
						counter++;
						targetPlayer.sendMessage(ChatColor.GREEN + "You Have A Like From " + ChatColor.DARK_AQUA + player.getName());
						targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " Likes!");
					}else{
						targetPlayer.sendMessage(ChatColor.GREEN + "You Have A Like From " + ChatColor.DARK_AQUA + player.getName());
						targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " Likes!");
					}
				}if(player.isOp()){
					if(args[0].equalsIgnoreCase("amount")){
						if(counter == 0){
							player.sendMessage(ChatColor.GREEN + "There Are No Likes At The Moment");
						}else if(counter == 1){
							player.sendMessage(ChatColor.AQUA + "You Have 1 Like!");
						}else{
							player.sendMessage(ChatColor.AQUA + "You Have" + counter + "Likes!");
						}
					}else if(args[0].equalsIgnoreCase("done")){
						if(counter <=0){
							player.sendMessage(ChatColor.DARK_RED + "There Are No Likes!");
						}else{
							counter--;
							if(counter == 0){
								player.sendMessage(ChatColor.BLUE + "There Are No Likes left!");
							}else if(counter == 1){
								player.sendMessage(ChatColor.BLUE + "You Have A Like Left!");
							}else{
								player.sendMessage(ChatColor.BLUE + "You Have " + counter + " Likes!");}}}

							    	}else{
							    		if(args[0].equalsIgnoreCase("amount")){
							    			if(counter == 0){
							    				player.sendMessage(ChatColor.GREEN + "There Are No Likes At The Moment");
							    			}else if(counter == 1){
							    				player.sendMessage(ChatColor.AQUA + "You Have 1 Like!");
							    			}else{
							    				player.sendMessage(ChatColor.AQUA + "You Have" + counter + "Likes!");
							    				
							    			}
							    		}
							    	}
					            }
						    
						    							    			
						    							    		
						    							    	
						    					            
						    		  
						    		
						    	
						    
							
		return false;
		}if(commandLabel.equalsIgnoreCase("facepalm")){
			if(args.length == 0){
				if(player.isOp()){
					player.sendMessage("----" + ChatColor.GREEN + "Facepalm Help" + ChatColor.WHITE + "----");
					player.sendMessage(ChatColor.AQUA + "/facepalm" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
					player.sendMessage(ChatColor.AQUA + "/facepalm <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You facepalmed Them");
					player.sendMessage(ChatColor.AQUA + "/facepalm amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Facepalms You Have!");
				}else{
					player.sendMessage("----" + ChatColor.GREEN + "Facepalm Help" + ChatColor.WHITE + "----");
					player.sendMessage(ChatColor.AQUA + "/facepalm" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
					player.sendMessage(ChatColor.AQUA + "/facepalm amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Facepalms You Have");
					player.sendMessage(ChatColor.AQUA + "/facepalm <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You facepalmed Them");
				}
			}if(args.length == 1){
				if(player.getServer().getPlayer(args[0]) !=null){
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					if(targetPlayer.isOp()){
						counter++;
						targetPlayer.sendMessage(ChatColor.GREEN + "You Have A Facepalm From " + ChatColor.DARK_AQUA + player.getName());
						targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " Facepalms");
					}else{
						targetPlayer.sendMessage(ChatColor.GREEN + "You Have A Facepalm From " + ChatColor.DARK_AQUA + player.getName());
						targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " Facepalms!");
					}
				}if(player.isOp()){
					if(args[0].equalsIgnoreCase("amount")){
						if(counter == 0){
							player.sendMessage(ChatColor.GREEN + "There Are No Facepalms At The Moment");
						}else if(counter == 1){
							player.sendMessage(ChatColor.AQUA + "You Have 1 Facepalm!");
						}else{
							player.sendMessage(ChatColor.AQUA + "You Have " + counter + " Facepalms!");
						}
					}else if(args[0].equalsIgnoreCase("done")){
						if(counter <=0){
							player.sendMessage(ChatColor.DARK_RED + "There Are No Facepalms!");
						}else{
							counter--;
							if(counter == 0){
								player.sendMessage(ChatColor.BLUE + "There Are No Facepalms left!");
							}else if(counter == 1){
								player.sendMessage(ChatColor.BLUE + "You Have A Facepalm Left!");
							}else{
								player.sendMessage(ChatColor.BLUE + "You Have " + counter + " Facepalms!");}}}

							    	}else{
							    		if(args[0].equalsIgnoreCase("amount")){
							    			if(counter == 0){
							    				player.sendMessage(ChatColor.GREEN + "There Are No Facepalms At The Moment");
							    			}else if(counter == 1){
							    				player.sendMessage(ChatColor.AQUA + "You Have 1 Facepalm!");
							    			}else{
							    				player.sendMessage(ChatColor.AQUA + "You Have " + counter + " Facepalms!");
							    				
		return false;}}}}}
	if(commandLabel.equalsIgnoreCase("dislike")){
		if(args.length == 0){
			if(player.isOp()){
				player.sendMessage("----" + ChatColor.GREEN + "Dislike Help" + ChatColor.WHITE + "----");
				player.sendMessage(ChatColor.AQUA + "/dislike" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
				player.sendMessage(ChatColor.AQUA + "/dislike <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Disliked Them");
				player.sendMessage(ChatColor.AQUA + "/dislike amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Dislikes You Have!");
			}else{
				player.sendMessage("----" + ChatColor.GREEN + "Dislike Help" + ChatColor.WHITE + "----");
				player.sendMessage(ChatColor.AQUA + "/dislike" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
				player.sendMessage(ChatColor.AQUA + "/dislike amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Dislikes You Have");
				player.sendMessage(ChatColor.AQUA + "/dislike <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Disliked Them");
			}
		}if(args.length == 1){
			if(player.getServer().getPlayer(args[0]) !=null){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				if(targetPlayer.isOp()){
					counter++;
					targetPlayer.sendMessage(ChatColor.GREEN + "You Have A Dislike From " + ChatColor.DARK_AQUA + player.getName());
					targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " Dislikes");
				}else{
					targetPlayer.sendMessage(ChatColor.GREEN + "You Have A Dislike From " + ChatColor.DARK_AQUA + player.getName());
					targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " Dislikes!");
				}
			}if(player.isOp()){
				if(args[0].equalsIgnoreCase("amount")){
					if(counter == 0){
						player.sendMessage(ChatColor.GREEN + "There Are No Dislikes At The Moment");
					}else if(counter == 1){
						player.sendMessage(ChatColor.AQUA + "You Have 1 Dislike!");
					}else{
						player.sendMessage(ChatColor.AQUA + "You Have " + counter + " Dislikes!");
					}
				}else if(args[0].equalsIgnoreCase("done")){
					if(counter <=0){
						player.sendMessage(ChatColor.DARK_RED + "There Are No Dislikes!");
					}else{
						counter--;
						if(counter == 0){
							player.sendMessage(ChatColor.BLUE + "There Are No Dislikes left!");
						}else if(counter == 1){
							player.sendMessage(ChatColor.BLUE + "You Have A Dislike Left!");
						}else{
							player.sendMessage(ChatColor.BLUE + "You Have " + counter + " Dislikes!");}}}

						    	}else{
						    		if(args[0].equalsIgnoreCase("amount")){
						    			if(counter == 0){
						    				player.sendMessage(ChatColor.GREEN + "There Are No Dislikes At The Moment");
						    			}else if(counter == 1){
						    				player.sendMessage(ChatColor.AQUA + "You Have 1 Dislike!");
						    			}else{
						    				player.sendMessage(ChatColor.AQUA + "You Have " + counter + " Dislikes!");
		return false;}}}}}
	if(commandLabel.equalsIgnoreCase("agree")){
		if(args.length == 0){
			if(player.isOp()){
				player.sendMessage("----" + ChatColor.GREEN + "Agree Help" + ChatColor.WHITE + "----");
				player.sendMessage(ChatColor.AQUA + "/agree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
				player.sendMessage(ChatColor.AQUA + "/agree <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Agree With Them");
				player.sendMessage(ChatColor.AQUA + "/agree amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Agrees You Have!");
			}else{
				player.sendMessage("----" + ChatColor.GREEN + "Agree Help" + ChatColor.WHITE + "----");
				player.sendMessage(ChatColor.AQUA + "/agree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
				player.sendMessage(ChatColor.AQUA + "/agree amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Agrees You Have");
				player.sendMessage(ChatColor.AQUA + "/agree <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Agree With Them");
			}
		}if(args.length == 1){
			if(player.getServer().getPlayer(args[0]) !=null){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				if(targetPlayer.isOp()){
					counter++;
					targetPlayer.sendMessage(ChatColor.GREEN + "You Have A 'Agree' From " + ChatColor.DARK_AQUA + player.getName());
					targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " People That Agree With You");
				}else{
					targetPlayer.sendMessage(ChatColor.GREEN + "You Have A 'Agree' From " + ChatColor.DARK_AQUA + player.getName());
					targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " People That Agree With You!");
				}
			}if(player.isOp()){
				if(args[0].equalsIgnoreCase("amount")){
					if(counter == 0){
						player.sendMessage(ChatColor.GREEN + "There Are No People That Agree With You At The Moment");
					}else if(counter == 1){
						player.sendMessage(ChatColor.AQUA + "You Have 1 Person That Agrees!");
					}else{
						player.sendMessage(ChatColor.AQUA + "You Have " + counter + " People That Agree!");
					}
				}else if(args[0].equalsIgnoreCase("done")){
					if(counter <=0){
						player.sendMessage(ChatColor.DARK_RED + "There Are No People That Agree's!");
					}else{
						counter--;
						if(counter == 0){
							player.sendMessage(ChatColor.BLUE + "There Are No People That Agree With You left!");
						}else if(counter == 1){
							player.sendMessage(ChatColor.BLUE + "You Have A 'Agree' Left!");
						}else{
							player.sendMessage(ChatColor.BLUE + "You Have " + counter + " People That Agree!");}}}

						    	}else{
						    		if(args[0].equalsIgnoreCase("amount")){
						    			if(counter == 0){
						    				player.sendMessage(ChatColor.GREEN + "You Have 0 People That Agree With You At The Moment");
						    			}else if(counter == 1){
						    				player.sendMessage(ChatColor.AQUA + "You Have 1 Person That Agrees!");
						    			}else{
						    				player.sendMessage(ChatColor.AQUA + "You Have " + counter + " People That Agree!");
	
	return false;}}}}}
	if(commandLabel.equalsIgnoreCase("disagree")){
		if(args.length == 0){
			if(player.isOp()){
				player.sendMessage("----" + ChatColor.GREEN + "Disagree Help" + ChatColor.WHITE + "----");
				player.sendMessage(ChatColor.AQUA + "/disagree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
				player.sendMessage(ChatColor.AQUA + "/disagree <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Agree With Them");
				player.sendMessage(ChatColor.AQUA + "/disagree amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Dislikes You Have!");
			}else{
				player.sendMessage("----" + ChatColor.GREEN + "Disagree Help" + ChatColor.WHITE + "----");
				player.sendMessage(ChatColor.AQUA + "/disagree" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows This Screen!");
				player.sendMessage(ChatColor.AQUA + "/disagree amount" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows The Amount Of Disagrees You Have");
				player.sendMessage(ChatColor.AQUA + "/disagree <player's name>" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Sends A Message To The Player That You Disagree With Them");
			}
		}if(args.length == 1){
			if(player.getServer().getPlayer(args[0]) !=null){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				if(targetPlayer.isOp()){
					counter++;
					targetPlayer.sendMessage(ChatColor.GREEN + "You Have A 'Disagree' From " + ChatColor.DARK_AQUA + player.getName());
					targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " People That Disagree With You");
				}else{
					targetPlayer.sendMessage(ChatColor.GREEN + "You Have A 'Disagree' From " + ChatColor.DARK_AQUA + player.getName());
					targetPlayer.sendMessage(ChatColor.GREEN + "You Now Have " + counter + " People That Disagree With You!");
				}
			}if(player.isOp()){
				if(args[0].equalsIgnoreCase("amount")){
					if(counter == 0){
						player.sendMessage(ChatColor.GREEN + "There Are No People That Disagree With You At The Moment");
					}else if(counter == 1){
						player.sendMessage(ChatColor.AQUA + "You Have 1 Person That Disagrees!");
					}else{
						player.sendMessage(ChatColor.AQUA + "You Have " + counter + " People That Disagree!");
					}
				}else if(args[0].equalsIgnoreCase("done")){
					if(counter <=0){
						player.sendMessage(ChatColor.DARK_RED + "There Are No People That Disagree's!");
					}else{
						counter--;
						if(counter == 0){
							player.sendMessage(ChatColor.BLUE + "There Are No People That Disagree With You left!");
						}else if(counter == 1){
							player.sendMessage(ChatColor.BLUE + "You Have A 'Disagree' Left!");
						}else{
							player.sendMessage(ChatColor.BLUE + "You Have " + counter + " People That Disagree!");}}}

						    	}else{
						    		if(args[0].equalsIgnoreCase("amount")){
						    			if(counter == 0){
						    				player.sendMessage(ChatColor.GREEN + "You Have 0 People That Disagree With You At The Moment");
						    			}else if(counter == 1){
						    				player.sendMessage(ChatColor.AQUA + "You Have 1 Person That Disagrees!");
						    			}else{
						    				player.sendMessage(ChatColor.AQUA + "You Have " + counter + " People That Disagree!");
	
	return false;}}}}}
	return false;}


		
	}
