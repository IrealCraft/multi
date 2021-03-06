package net.minecraft.server;

import java.util.List;
import net.minecraft.server.EntityLiving;
import net.minecraft.server.MathHelper;
import net.minecraft.server.World;
import net.minecraft.server.AxisAlignedBB;
import net.minecraft.server.Entity;
import net.minecraft.server.Material;

// Referenced classes of package fr.nukkit.blocks:
//            BlockFurnitureAbstract

public class BlockBank extends BlockFurnitureAbstract
{

    public BlockBank(int i, Material material)
    {
        super(i, material);
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }

    public int d()
    {
        return 72;
    }

    public void postPlace(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = MathHelper.floor((double)((par5EntityLiving.yaw * 4F) / 360F) + 2.5D) & 3;
        par1World.setData(par2, par3, par4, var6, var6);
    }

    public void a(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        int direction = par1World.getData(par2, par3, par4);
        if(direction % 2 == 0)
        {
            a(0.1F, 0.0F, 0.3F, 0.2F, 0.4F, 0.4F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.8F, 0.0F, 0.3F, 0.9F, 0.4F, 0.4F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.1F, 0.0F, 0.6F, 0.2F, 0.4F, 0.7F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.8F, 0.0F, 0.6F, 0.9F, 0.4F, 0.7F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.0F, 0.4F, 0.2F, 1.0F, 0.5F, 0.8F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        } else
        {
            a(0.3F, 0.0F, 0.1F, 0.4F, 0.4F, 0.2F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.3F, 0.0F, 0.8F, 0.4F, 0.4F, 0.9F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.6F, 0.0F, 0.1F, 0.7F, 0.4F, 0.2F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.6F, 0.0F, 0.8F, 0.7F, 0.4F, 0.9F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
            a(0.2F, 0.4F, 0.0F, 0.8F, 0.5F, 1.0F);
            super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
