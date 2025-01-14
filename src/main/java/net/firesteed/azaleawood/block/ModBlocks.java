package net.firesteed.azaleawood.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.firesteed.azaleawood.AzaleaWood;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlocks {
    /*this.name = string;
        this.soundType = blockSoundGroup;
        this.doorClose = soundEvent;
        this.doorOpen = soundEvent2;
        this.trapdoorClose = soundEvent3;
        this.trapdoorOpen = soundEvent4;
        this.pressurePlateClickOff = soundEvent5;
        this.pressurePlateClickOn = soundEvent6;
        this.buttonClickOff = soundEvent7;
        this.buttonClickOn = soundEvent8;*/

    public static final BlockSetType AZALEA = new BlockSetType("azalea");
    public static final Block AZALEA_BUTTON = registerBlock("azalea_button",
            new ButtonBlock(AZALEA, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate",
            new PressurePlateBlock(
                    AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor",
            new TrapdoorBlock(AZALEA,
                    AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new DoorBlock(AZALEA, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final WoodType AZALEA_TYPE = new WoodType("azalea", AZALEA);
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate",
            new FenceGateBlock(AZALEA_TYPE,
                    AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_FENCE = registerBlock("azalea_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
            new StairsBlock(AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor((state) -> {
                return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_GRAY :
                        MapColor.RAW_IRON_PINK;})));

    public static final TerraformSignBlock AZALEA_SIGN = registerSignBlock("azalea_sign", new TerraformSignBlock(
            id("entity/signs/azalea"),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final TerraformWallSignBlock AZALEA_WALL_SIGN = registerWallSignBlock("azalea_wall_sign",
            new TerraformWallSignBlock(id("entity/signs/azalea"),
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).dropsLike(AZALEA_SIGN)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final TerraformHangingSignBlock AZALEA_HANGING_SIGN = registerHangingSignBlock(
            "azalea_hanging_sign", new TerraformHangingSignBlock(
            id("entity/signs/hanging/azalea"),
            id("textures/gui/hanging_signs/azalea"),
                    AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final TerraformWallHangingSignBlock AZALEA_WALL_HANGING_SIGN = registerWallHangingSignBlock(
            "azalea_wall_hanging_sign", new TerraformWallHangingSignBlock(
            id("entity/signs/hanging/azalea"),
            id("textures/gui/hanging_signs/azalea"),
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(AZALEA_HANGING_SIGN)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformSignBlock registerSignBlock(String name, TerraformSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformWallSignBlock registerWallSignBlock(String name, TerraformWallSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformHangingSignBlock registerHangingSignBlock(String name, TerraformHangingSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformWallHangingSignBlock registerWallHangingSignBlock(String name,
                                                                              TerraformWallHangingSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, id(name),
                new BlockItem(block, new Item.Settings()));

        return item;
    }

    public static void registerModBlocks() {
        AzaleaWood.LOGGER.debug("Registering ModBlocks for " + AzaleaWood.MOD_ID);
    }

    private static Identifier id(String path) {
        return Identifier.of(AzaleaWood.MOD_ID, path);
    }
}
