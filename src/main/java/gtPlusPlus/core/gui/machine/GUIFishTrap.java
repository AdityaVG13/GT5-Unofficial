package gtPlusPlus.core.gui.machine;

import static gregtech.api.enums.Mods.GTPlusPlus;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gtPlusPlus.core.container.ContainerFishTrap;
import gtPlusPlus.core.tileentities.general.TileEntityFishTrap;

@SideOnly(Side.CLIENT)
public class GUIFishTrap extends GuiContainer {

    private static final ResourceLocation craftingTableGuiTextures = new ResourceLocation(
        GTPlusPlus.ID,
        "textures/gui/FishTrap.png");

    public GUIFishTrap(final InventoryPlayer player_inventory, final TileEntityFishTrap te) {
        super(new ContainerFishTrap(player_inventory, te));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(craftingTableGuiTextures);
        final int x = (this.width - this.xSize) / 2;
        final int y = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
    }

    // This method is called when the Gui is first called!
    @Override
    public void initGui() {
        // You have to add this line for the Gui to function properly!
        super.initGui();

        // The parameters of GuiButton are(id, x, y, width, height, text);
        // this.buttonList.add(new GuiButton( 1, 367, 132, 18, 18, "X"));
        // this.buttonList.add(new GuiButton( 2, 385, 132, 18, 18, "Y"));
        // NOTE: the id always has to be different or else it might get called twice or never!

        // Add any other buttons here too!
    }
}
