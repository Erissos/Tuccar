package poyrazinan.com.tr.tuccar.api;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;


import poyrazinan.com.tr.tuccar.Tuccar;
import poyrazinan.com.tr.tuccar.Utils.Storage.ProductCategoryStorage;

@SuppressWarnings("deprecation")
public class TuccarAPI {
	
	public static ProductCategoryStorage getProduct(String name, String category)
	{
		
		int damage = 0;
		
		String displayName = null;
		
		List<String> displayLore = null;
		
		String itemName = null;
		
		final boolean hasCUI = Bukkit.getPluginManager().getPlugin("CustomItems") != null;
		
		if (Tuccar.instance.getConfig().isSet("Tuccar." + category + ".items." + name + ".itemName")) 
			itemName = Tuccar.instance.getConfig().getString("Tuccar." + category + ".items." + name + ".itemName");
		
		if (Tuccar.instance.getConfig().isSet("Tuccar." + category + ".items." + name + ".displayLore")) 
			displayLore = Tuccar.instance.getConfig().getStringList("Tuccar." + category + ".items." + name + ".displayLore");
		
		if (Tuccar.instance.getConfig().isSet("Tuccar." + category + ".items." + name + ".displayName")) 
			displayName = Tuccar.instance.getConfig().getString("Tuccar." + category+ ".items." + name+ ".displayName");
		
		if (Tuccar.instance.getConfig().isSet("Tuccar." + category + ".items." + name + ".damage")) 
			damage = Tuccar.instance.getConfig().getInt("Tuccar." + category + ".items." + name + ".damage");
		
		String material = Tuccar.instance.getConfig().getString("Tuccar." + category + ".items." + name + ".material");
		
		return new ProductCategoryStorage(name, material, category, itemName, displayName, displayLore, damage);
		
	}
	
	/**
	 * @deprecated
	 * @param product
	 * @param amount
	 * @return
	 */
	public static ItemStack storageToItemStack(ProductCategoryStorage product, int amount)
	{
		
		List<String> newList = new ArrayList<String>();
		
		if (product.getDisplayLore() != null)
		{
			
			for (String string : product.getDisplayLore())
			{
	    		newList.add(string.replace("&", "§"));
	    	}
			
		}
		
		final boolean hasCUI = Bukkit.getPluginManager().getPlugin("CustomItems") != null;

		
    	ItemStack item = new ItemStack(Material.getMaterial(product.getItemMaterial().toUpperCase()), amount);
    	
    	String nms = Tuccar.getNMSVersion();
    	
		if (nms.contains("1_16") || nms.contains("1_15") || nms.contains("1_14") || nms.contains("1_13"))
		{
			
			Material mat = Material.getMaterial(product.getItemMaterial());
			
			if ((mat.equals(Material.SPLASH_POTION) || mat.equals(Material.POTION) || mat.equals(Material.LINGERING_POTION))
					&& (Tuccar.instance.getConfig().isSet("Tuccar." + product.getItemCategory() + ".items." + product.getDataName() + ".potionType")) )
			{
				
				PotionType type = null;
				
				try {type = PotionType.valueOf(Tuccar.instance.getConfig().getString("Tuccar." + product.getItemCategory() + ".items." + product.getDataName() + ".potionType"));}
				catch (NullPointerException e1) {}
				
				Potion potion = null;
				
				if (product.getItemDamage() == 1 || product.getItemDamage() == 2)potion = new Potion(type, product.getItemDamage());
				
				else
				{
					
					potion = new Potion(type, 1);
					
					potion.extend();
					
				}
				
				if (mat.equals(Material.SPLASH_POTION)) potion.setSplash(true);
				
				item = potion.toItemStack(amount);
				
				if (mat.equals(Material.LINGERING_POTION)) item.setType(Material.LINGERING_POTION);
				
			}
			
		}
    	
		ItemMeta meta = item.getItemMeta();
		
    	if (product.getItemName() != null)
    		meta.setDisplayName(product.getItemName().replace("&", "§"));
    	
    	if (product.getDisplayLore() != null)
    		meta.setLore(newList);
    	
    	if (product.getItemDamage() != 0)
    		item.setDurability((short) product.getItemDamage());
    	
    	if (!item.getType().equals(Material.ENCHANTED_BOOK)) item.setItemMeta(meta);
    	
    	return item;
    	
	}

}
