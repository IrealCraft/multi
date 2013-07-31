package net.minecraft.server;

import java.util.Random;

public class BlockFumee extends Block
{
  
    public BlockFumee(int i)
    {
        super(i, Material.AIR);
        a(CreativeModeTab.j);
        b(true);
    }
        

    public AxisAlignedBB b(World world, int i, int j, int i1)
    {
        return null;
    }
        
        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
    public boolean c()
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public int d()
    {
        return 23;
    }

}
