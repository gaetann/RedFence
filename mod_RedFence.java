package net.minecraft.src;

public class mod_RedFence extends BaseMod
{
    public static final Block RedFence = (new Block_RedFence(230, net.minecraft.src.TileEntity_RedFence.class)).setHardness(1F).setResistance(1F).setBlockName("RedFence");
    public static final Item Item_RedFence = (new ItemReed(230, RedFence)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/mod_RedFence/item_RedFence.png")).setItemName("RedFence");

    public void load()
    {
        Render_RedFence render_RedFence = new Render_RedFence();
        ModLoader.registerTileEntity(net.minecraft.src.TileEntity_RedFence.class, "TileEntity_RedFence", render_RedFence);
        ModLoader.addName(RedFence, "RedFence");
        ModLoader.addRecipe(new ItemStack(Item_RedFence, 1), new Object[]
                {
                    " # ",
                    " / ",
                    " # ",
                    '#', Block.planks, '/', Item.stick,
                });
    }
    public String getVersion()
    {
        return null;
    }
}
