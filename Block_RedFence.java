package net.minecraft.src;

import java.util.Random;

public class Block_RedFence extends BlockContainer
{
    private Class Block_nomdubloc_EntityClass;

    protected Block_RedFence(int i, Class tClass)

    {
        super(i, Material.wood);
        Block_nomdubloc_EntityClass = tClass;
    }

    public TileEntity getBlockEntity()

    {
        try
        {
            return (TileEntity)Block_nomdubloc_EntityClass.newInstance();
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
    }

    public int idDropped(int i, Random random, int j)
    {
        return mod_RedFence.Item_RedFence.shiftedIndex;
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    public int getRenderType()
    {
        return -1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return true;
    }
}
