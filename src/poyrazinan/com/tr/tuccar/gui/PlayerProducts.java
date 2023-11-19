package poyrazinan.com.tr.tuccar.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;


import poyrazinan.com.tr.tuccar.Tuccar;
import poyrazinan.com.tr.tuccar.Utils.Item;
import poyrazinan.com.tr.tuccar.Utils.getLang;
import poyrazinan.com.tr.tuccar.Utils.Storage.ProductStorage;
import poyrazinan.com.tr.tuccar.database.DatabaseQueries;

@SuppressWarnings("deprecation")
public class PlayerProducts {
	
	public static void createGui(Player player, int page)
	{
			
			List<ProductStorage> list = DatabaseQueries.getPlayerProducts(player.getName());
			
			Inventory gui = Bukkit.getServer().createInventory(player, 54, (getLang.getText("selfProducts") + " " + page));
			
			Bukkit.getScheduler().runTaskAsynchronously(Tuccar.instance, () ->
			{
				
				ItemStack pageEmpty = Item.defaultItem(getLang.getText("Gui.empty.name"),
						getLang.getLore("Gui.empty.lore"),
						Material.getMaterial(getLang.getText("Gui.empty.material")));

				ItemStack nextPage = Item.defaultItem(getLang.getText("Gui.nextPage.name"),
					getLang.getLore("Gui.nextPage.lore"),
					Material.getMaterial(getLang.getText("Gui.nextPage.material")));
				
				ItemStack previousPage = Item.defaultItem(getLang.getText("Gui.previousPage.name"),
						getLang.getLore("Gui.previousPage.lore"),
						Material.getMaterial(getLang.getText("Gui.previousPage.material")));
				
				if (list == null || list.size() == 0) { gui.setItem(22, pageEmpty);
				} else {
					int itemCount = list.size();
					int pageCount = 0;
				  	int startingValue = 28*page;
				  	for (int b = startingValue-28; b <= itemCount-1 ; b++) {
				  		if (pageCount > (itemCount-1)-(startingValue-28)) break;
				  		ItemStack guiItem = new ItemStack(Material.getMaterial(list.get(b).getItemMaterial().toUpperCase()));
				  		if (guiItem.getType() == null || guiItem.getType() == Material.AIR) continue;

				  		List<String> newList = new ArrayList<String>();
				  		String nms = Tuccar.getNMSVersion();
						if (nms.contains("1_16") || nms.contains("1_15") || nms.contains("1_14") || nms.contains("1_13")) {
							Material mat = Material.getMaterial(list.get(b).getItemMaterial());
							if ((mat.equals(Material.SPLASH_POTION) || mat.equals(Material.POTION) || mat.equals(Material.LINGERING_POTION))
									&& (Tuccar.instance.getConfig().isSet("Tuccar." + list.get(b).getItemCategory() + ".items." + list.get(b).getDataName() + ".potionType")) ) {
								PotionType type = null;
								try {type = PotionType.valueOf(Tuccar.instance.getConfig().getString("Tuccar." + list.get(b).getItemCategory() + ".items." + list.get(b).getDataName() + ".potionType"));
								} catch (NullPointerException e1) {Bukkit.getConsoleSender().sendMessage(Tuccar.color("&4&lHATA &bTüccar materyal yanlış bulundu geçiliyor... &c" +
										list.get(b).getItemCategory() + ">" + list.get(b).getDataName())); continue;}
								Potion potion = null;
								if (list.get(b).getItemDamage() == 1 || list.get(b).getItemDamage() == 2)potion = new Potion(type, list.get(b).getItemDamage());
								else {
									potion = new Potion(type, 1);
									potion.extend();
								}
								if (mat.equals(Material.SPLASH_POTION)) potion.setSplash(true);
								guiItem = potion.toItemStack(1);
								if (mat.equals(Material.LINGERING_POTION)) guiItem.setType(Material.LINGERING_POTION);
							}
						}
						ItemMeta meta = guiItem.getItemMeta();
						
						int CUSTOM_AMOUNT = 32;
						
						if (Tuccar.instance.getConfig().isSet("Settings.customBuyAmount"))
							CUSTOM_AMOUNT = Tuccar.instance.getConfig().getInt("Settings.customBuyAmount");

						for (String string : getLang.getLore("Gui.selfProductTemplate.lore")) {
				    		newList.add(string.replace("&", "§")
				    				.replace("{category}", list.get(b).getItemCategory())
				    				.replace("{stock}", String.valueOf(list.get(b).getStock()))
				    				.replace("{price}", String.valueOf(list.get(b).getPrice()))
				    				.replace("{custom_amount}", String.valueOf(CUSTOM_AMOUNT)) );}
						
				    	if (list.get(b).getDisplayLore() != null) for (String string : list.get(b).getDisplayLore()) {
				    		newList.add(Tuccar.color(string));}
				    	meta.setLore(newList);
				    	if (list.get(b).getItemDisplayName() != null) meta.setDisplayName(Tuccar.color(list.get(b).getItemDisplayName()));
				    	
				    	if (list.get(b).getItemDamage() != 0) guiItem.setDurability((short) list.get(b).getItemDamage());
				    	
				    	List<String> enchantment = null;
						if (Tuccar.instance.getConfig().isSet("Tuccar." + list.get(b).getItemCategory() + ".items." + list.get(b).getDataName() + ".enchantment")) 
							enchantment = Tuccar.instance.getConfig().getStringList("Tuccar." + list.get(b).getItemCategory() + ".items." + list.get(b).getDataName() + ".enchantment");
						if (enchantment != null) {
							for (String ench : enchantment) {
								try{
									String[] enchant = ench.split(":");
									Enchantment enchObj = Enchantment.getByName(enchant[0].toUpperCase());
									if (enchObj == null) continue;
									else {
										if (guiItem.getType().name().equalsIgnoreCase("ENCHANTED_BOOK")) {
											EnchantmentStorageMeta AMeta = (EnchantmentStorageMeta) guiItem.getItemMeta();
											AMeta.addStoredEnchant(enchObj, Integer.parseInt(enchant[1]), true);
											if (list.get(b).getItemDisplayName() != null) AMeta.setDisplayName(Tuccar.color(list.get(b).getItemDisplayName()));
									    	AMeta.setLore(newList);
											guiItem.setItemMeta(AMeta);
										} else meta.addEnchant(enchObj, Integer.parseInt(enchant[1]), true);
									}
								} catch(NullPointerException e1) {continue;}
							}
						}
						if (!guiItem.getType().name().equalsIgnoreCase("ENCHANTED_BOOK")) guiItem.setItemMeta(meta);
				    	
				    	
				  		if (pageCount <= 6) gui.setItem(10 + pageCount, guiItem);
				  		else if (pageCount <= 13 && pageCount > 6) gui.setItem(12 + pageCount, guiItem);
				  		else if (pageCount <= 20 && pageCount > 13) gui.setItem(14 + pageCount, guiItem);
				  		else if (pageCount == 28) break;
				  		else gui.setItem(16 + pageCount, guiItem);
				  		pageCount = pageCount+1;
				  	}
				  	double maxPageCounter = (itemCount/28);
				  	int maxPage = (int) (maxPageCounter+1);
				  	if (page == 1 && maxPage > 1) gui.setItem(50, nextPage);
				  	else if (page == maxPage && maxPage > 1) gui.setItem(48, previousPage);
				  	else if (page < maxPage && maxPage > 1 && page % 28 == 0){ gui.setItem(50, nextPage); gui.setItem(48, previousPage);}
				}
				
			});
			
			gui.setItem(Integer.valueOf(getLang.getText("Gui.selfProductHelp.slot")), Item.defaultItem(getLang.getText("Gui.selfProductHelp.name"),
					getLang.getLore("Gui.selfProductHelp.lore"),
					Material.getMaterial(getLang.getText("Gui.selfProductHelp.material"))));
			Bukkit.getScheduler().runTask(Tuccar.instance, () -> {player.openInventory(gui);});
	}

}
