package tardis.common.blocks;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SchemaBlock extends AbstractBlock 
{
	private final boolean visible;
	
	
	public SchemaBlock(boolean vis)
	{
		super(vis);
		visible = vis;
	}

	@Override
	public void initData()
	{
		setBlockName("Schema");
	}

	@Override
	public void initRecipes()
	{
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube()
	{
		return visible;
	}
	
	/*@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		if(visible)
			super.registerBlockIcons(register);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int s, int d)
	{
		if(visible)
			return super.getIcon(s, d);
		return blankIcon;
	}*/
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess w, int x, int y, int z, int s)
	{
		return visible;
	}
}
