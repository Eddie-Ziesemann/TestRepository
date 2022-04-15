package de.kartofel.testmod.core.init;

import de.kartofel.testmod.Testmod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Testmod.Mod_ID);

    public static final RegistryObject<Block> TEST_Block = BLOCKS.register("test_block",
            ()-> new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.YELLOW)
            .hardnessAndResistance(1.5f, 6)
            .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL)));
}
