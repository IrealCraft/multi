package net.minecraft.server;

import net.minecraft.server.Block;
import net.minecraft.server.Material;

public abstract class BlockFurnitureAbstract extends Block
{
  public static final String[] b = new String[] { "oak", "spruce", "birch", "jungle"};

    protected BlockFurnitureAbstract(int id, Material material)
    {
        super(id, material);
        a(Block.j);
        c(2.0F);
        b(5F);
    }

    public boolean c()
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }
}
