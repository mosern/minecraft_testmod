package no.mosern.TM;



import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import no.mosern.TM.blocks.TestBlock;
import no.mosern.TM.refrence.Refrence;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class TM {

	public static Block TestBlock = new TestBlock(3000, Material.rock);
	
	@Mod.Instance(Refrence.MOD_ID)
	public static TM instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
		GameRegistry.registerBlock(TestBlock, "TestBlock");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
