package com.darkona.adventurebackpack.fluids;

import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import com.darkona.adventurebackpack.client.Icons;

/**
 * Created by Darkona on 12/10/2014.
 */
public class FluidMelonJuice extends Fluid {

    public FluidMelonJuice() {
        super("melonJuice");
        setUnlocalizedName("melonJuice");
    }

    @Override
    public IIcon getStillIcon() {
        return Icons.melonJuiceStill;
    }

    @Override
    public IIcon getIcon() {
        return Icons.melonJuiceStill;
    }

    @Override
    public IIcon getFlowingIcon() {
        return Icons.melonJuiceFlowing;
    }

    @Override
    public int getColor(FluidStack stack) {
        return 0xc31d08;
    }

    @Override
    public boolean isGaseous(World world, int x, int y, int z) {
        return false;
    }
}
