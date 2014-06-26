package no.mosern.TM.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import no.mosern.TM.refrence.Refrence;

public class TestBlock extends Block {

	private String Texture = Refrence.MOD_ID + ":TestBlock";
	public TestBlock(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setLightLevel(1F);
		this.setBlockName("TestBlock");
		this.setBlockTextureName(Texture);
	}

}
