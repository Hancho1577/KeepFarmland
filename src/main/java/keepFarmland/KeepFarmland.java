package keepFarmland;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockAir;
import cn.nukkit.block.BlockID;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockFadeEvent;
import cn.nukkit.event.player.PlayerInteractEntityEvent;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.event.player.PlayerInteractEvent.Action;
import cn.nukkit.plugin.PluginBase;

public class KeepFarmland extends PluginBase  implements Listener{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent ev) {
		Block block = ev.getBlock();
		
		if(ev.getAction() != Action.PHYSICAL)
			return;
		if(block == null)
			return;
		
		if(block.getId() == BlockID.FARMLAND) 
			ev.setCancelled();
	}

}
