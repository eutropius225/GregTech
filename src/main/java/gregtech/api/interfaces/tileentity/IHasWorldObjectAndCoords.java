package gregtech.api.interfaces.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fluids.IFluidHandler;

/**
 * This is a bunch of Functions my TileEntities provide, to make life much easier, and to get rid of internal TileEntity stuff.
 * <p/>
 * This also makes access to adjacent TileEntities more Efficient.
 * <p/>
 * Note: It doesn't have to be a TileEntity in certain cases! And only certain cases, such as the Recipe checking of the findRecipe Function.
 */
public interface IHasWorldObjectAndCoords {

    public World getWorldObj();

    public BlockPos getWorldPos();

    public boolean isServerSide();

    public boolean isClientSide();

    public int getRandomNumber(int aRange);

    /**
     * Checks if the TileEntity is Invalid or Unloaded. Stupid Minecraft cannot do that btw.
     */
    public boolean isDead();

    /**
     * Sends a Block Event to the Client TileEntity, the byte Parameters are only for validation as Minecraft doesn't properly write Packet Data.
     */
    public void sendBlockEvent(byte aID, byte aValue);

    /**
     * @return the Time this TileEntity has been loaded.
     */
    public long getTimer();

    /**
     * Function of the regular TileEntity
     */
    public boolean isInvalidTileEntity();


}