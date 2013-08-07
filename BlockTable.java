package net.minecraft.server;

import java.util.List;
import net.minecraft.server.*;

// Referenced classes of package fr.nukkit.blocks:
//            BlockFurnitureAbstract

public class BlockTable extends BlockFurnitureAbstract
{

    public BlockTable(int i, Material material)
    {
        super(i, material);
        a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public int d()
    {
        return 71;
    }

    public void a(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        a(0.4F, 0.0F, 0.4F, 0.6F, 0.9F, 0.6F);
        super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        a(0.0F, 0.9F, 0.0F, 1.0F, 1.0F, 1.0F);
        super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
   
}
