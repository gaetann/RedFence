package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class Render_RedFence extends TileEntitySpecialRenderer
{
    public Render_RedFence()
    {
        nomdubloc = new Model_RedFence();
    }

    public void renderAModelAt(TileEntity_RedFence  tileentity1, double d, double d1, double d2, float f)
    {
        mod_RedFence .RedFence .setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 1.0F, 0.625F);
        GL11.glPushMatrix(); //(
        GL11.glTranslatef((float) d + 0.5F, (float) d1 + 1.5F, (float) d2 + 0.5F);
        GL11.glRotatef(180, 0, 0, 1F);
        bindTextureByName("/mod_RedFence/Texture_RedFence.png");
        GL11.glPushMatrix();  //)
        nomdubloc .renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
    {
        renderAModelAt((TileEntity_RedFence)tileentity, d, d1, d2, f);
    }

    private Model_RedFence  nomdubloc ;
}
