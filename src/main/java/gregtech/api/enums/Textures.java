package gregtech.api.enums;

import static gregtech.api.enums.GT_Values.RES_PATH_BLOCK;
import static gregtech.api.enums.GT_Values.RES_PATH_ITEM;
import gregtech.api.GregTech_API;
import gregtech.api.interfaces.IIconContainer;
import gregtech.api.interfaces.ITexture;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.objects.GT_SidedTexture;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

public class Textures {
    public enum BlockIcons implements IIconContainer, Runnable {
        VOID // The Empty Texture
        , RENDERING_ERROR, PIPE_RESTRICTOR, INSULATION_FULL, INSULATION_TINY, INSULATION_SMALL, INSULATION_MEDIUM, INSULATION_LARGE, INSULATION_HUGE,
        CFOAM_FRESH, CFOAM_HARDENED, SOLARPANEL, SOLARPANEL_8V, SOLARPANEL_LV, SOLARPANEL_MV, SOLARPANEL_HV, SOLARPANEL_EV, SOLARPANEL_IV, SOLARPANEL_LuV, SOLARPANEL_ZPM, SOLARPANEL_UV,
        VENT_NORMAL, VENT_ADVANCED, COVER_WOOD_PLATE, ARROW_UP, ARROW_DOWN, ARROW_LEFT, ARROW_RIGHT,
        AUTOMATION_FILTER, AUTOMATION_TYPEFILTER, AUTOMATION_CHESTBUFFER, AUTOMATION_SUPERBUFFER, AUTOMATION_REGULATOR,
        CONCRETE_LIGHT_STONE, CONCRETE_LIGHT_COBBLE, CONCRETE_LIGHT_COBBLE_MOSSY, CONCRETE_LIGHT_BRICKS, CONCRETE_LIGHT_BRICKS_CRACKED,
        CONCRETE_LIGHT_BRICKS_MOSSY, CONCRETE_LIGHT_BRICKS_CHISELED, CONCRETE_LIGHT_SMOOTH, CONCRETE_DARK_STONE, CONCRETE_DARK_COBBLE,
        CONCRETE_DARK_COBBLE_MOSSY, CONCRETE_DARK_BRICKS, CONCRETE_DARK_BRICKS_CRACKED, CONCRETE_DARK_BRICKS_MOSSY,
        CONCRETE_DARK_BRICKS_CHISELED, CONCRETE_DARK_SMOOTH, GRANITE_BLACK_STONE, GRANITE_BLACK_COBBLE, GRANITE_BLACK_COBBLE_MOSSY,
        GRANITE_BLACK_BRICKS, GRANITE_BLACK_BRICKS_CRACKED, GRANITE_BLACK_BRICKS_MOSSY, GRANITE_BLACK_BRICKS_CHISELED, GRANITE_BLACK_SMOOTH,
        GRANITE_RED_STONE, GRANITE_RED_COBBLE, GRANITE_RED_COBBLE_MOSSY, GRANITE_RED_BRICKS, GRANITE_RED_BRICKS_CRACKED,
        GRANITE_RED_BRICKS_MOSSY, GRANITE_RED_BRICKS_CHISELED, GRANITE_RED_SMOOTH,
        MACHINE_BRONZEBRICKS_TOP, MACHINE_BRONZEBRICKS_SIDE, MACHINE_BRONZEBRICKS_BOTTOM, MACHINE_STEELBRICKS_TOP, MACHINE_STEELBRICKS_SIDE,
        MACHINE_STEELBRICKS_BOTTOM, MACHINE_BRONZE_TOP, MACHINE_BRONZE_SIDE, MACHINE_BRONZE_BOTTOM, MACHINE_STEEL_TOP, MACHINE_STEEL_SIDE,
        MACHINE_STEEL_BOTTOM, MACHINE_8V_TOP, MACHINE_8V_SIDE, MACHINE_8V_BOTTOM, MACHINE_LV_TOP, MACHINE_LV_SIDE, MACHINE_LV_BOTTOM,
        MACHINE_MV_TOP, MACHINE_MV_SIDE, MACHINE_MV_BOTTOM, MACHINE_HV_TOP, MACHINE_HV_SIDE, MACHINE_HV_BOTTOM, MACHINE_EV_TOP,
        MACHINE_EV_SIDE, MACHINE_EV_BOTTOM, MACHINE_IV_TOP, MACHINE_IV_SIDE, MACHINE_IV_BOTTOM, MACHINE_LuV_TOP, MACHINE_LuV_SIDE,
        MACHINE_LuV_BOTTOM, MACHINE_ZPM_TOP, MACHINE_ZPM_SIDE, MACHINE_ZPM_BOTTOM, MACHINE_UV_TOP, MACHINE_UV_SIDE, MACHINE_UV_BOTTOM,
        MACHINE_MAX_TOP, MACHINE_MAX_SIDE, MACHINE_MAX_BOTTOM, MACHINE_BRONZEPLATEDBRICKS, MACHINE_HEATPROOFCASING,
        MACHINE_BRONZEBLASTFURNACE, MACHINE_BRONZEBLASTFURNACE_ACTIVE, MACHINE_CASING_ROBUST_TUNGSTENSTEEL, MACHINE_CASING_CLEAN_STAINLESSSTEEL,
        MACHINE_CASING_STABLE_TITANIUM, MACHINE_CASING_FIREBOX_TITANIUM, MACHINE_CASING_FUSION_COIL, MACHINE_CASING_FUSION,
        MACHINE_CASING_FUSION_GLASS, MACHINE_CASING_FUSION_GLASS_YELLOW, MACHINE_CASING_FUSION_2, MACHINE_CASING_MAGIC,
        MACHINE_CASING_MAGIC_ACTIVE, MACHINE_CASING_MAGIC_FRONT, MACHINE_CASING_MAGIC_FRONT_ACTIVE, MACHINE_CASING_DRAGONEGG,
        MACHINE_CASING_SOLID_STEEL, MACHINE_CASING_FROST_PROOF, MACHINE_CASING_PUMP, MACHINE_CASING_MOTOR, MACHINE_CASING_PIPE_BRONZE,
        MACHINE_CASING_PIPE_STEEL, MACHINE_CASING_PIPE_TITANIUM, MACHINE_CASING_PIPE_TUNGSTENSTEEL, MACHINE_CASING_GEARBOX_BRONZE,
        MACHINE_CASING_GEARBOX_STEEL, MACHINE_CASING_GEARBOX_TITANIUM, MACHINE_CASING_GEARBOX_TUNGSTENSTEEL, MACHINE_CASING_DATA_DRIVE,
        MACHINE_CASING_CONTAINMENT_FIELD, MACHINE_CASING_ASSEMBLER, MACHINE_CASING_PROCESSOR, MACHINE_CASING_STRIPES_A,
        MACHINE_CASING_STRIPES_B, MACHINE_CASING_RADIOACTIVEHAZARD, MACHINE_CASING_BIOHAZARD, MACHINE_CASING_EXPLOSIONHAZARD,
        MACHINE_CASING_FIREHAZARD, MACHINE_CASING_ACIDHAZARD, MACHINE_CASING_MAGICHAZARD, MACHINE_CASING_FROSTHAZARD,
        MACHINE_CASING_NOISEHAZARD, MACHINE_CASING_GRATE, MACHINE_CASING_VENT, MACHINE_CASING_RADIATIONPROOF, MACHINE_CASING_FIREBOX_BRONZE,
        MACHINE_CASING_FIREBOX_STEEL, MACHINE_CASING_FIREBOX_TUNGSTENSTEEL, BOILER_SOLAR, BOILER_FRONT, BOILER_FRONT_ACTIVE,
        BOILER_LAVA_FRONT, BOILER_LAVA_FRONT_ACTIVE, NAQUADAH_REACTOR_SOLID_BACK, NAQUADAH_REACTOR_SOLID_FRONT, NAQUADAH_REACTOR_SOLID_SIDE,
        NAQUADAH_REACTOR_SOLID_BOTTOM, NAQUADAH_REACTOR_SOLID_TOP, NAQUADAH_REACTOR_SOLID_BACK_ACTIVE, NAQUADAH_REACTOR_SOLID_FRONT_ACTIVE,
        NAQUADAH_REACTOR_SOLID_SIDE_ACTIVE, NAQUADAH_REACTOR_SOLID_BOTTOM_ACTIVE, NAQUADAH_REACTOR_SOLID_TOP_ACTIVE,
        NAQUADAH_REACTOR_FLUID_BACK, NAQUADAH_REACTOR_FLUID_FRONT, NAQUADAH_REACTOR_FLUID_SIDE, NAQUADAH_REACTOR_FLUID_BOTTOM,
        NAQUADAH_REACTOR_FLUID_TOP, NAQUADAH_REACTOR_FLUID_BACK_ACTIVE, NAQUADAH_REACTOR_FLUID_FRONT_ACTIVE,
        NAQUADAH_REACTOR_FLUID_SIDE_ACTIVE, NAQUADAH_REACTOR_FLUID_BOTTOM_ACTIVE, NAQUADAH_REACTOR_FLUID_TOP_ACTIVE,
        DIESEL_GENERATOR_BACK, DIESEL_GENERATOR_FRONT, DIESEL_GENERATOR_SIDE, DIESEL_GENERATOR_BOTTOM, DIESEL_GENERATOR_TOP,
        DIESEL_GENERATOR_BACK_ACTIVE, DIESEL_GENERATOR_FRONT_ACTIVE, DIESEL_GENERATOR_SIDE_ACTIVE, DIESEL_GENERATOR_BOTTOM_ACTIVE,
        DIESEL_GENERATOR_TOP_ACTIVE, GAS_TURBINE_BACK, GAS_TURBINE_FRONT, GAS_TURBINE_SIDE, GAS_TURBINE_BOTTOM, GAS_TURBINE_TOP,
        GAS_TURBINE_BACK_ACTIVE, GAS_TURBINE_FRONT_ACTIVE, GAS_TURBINE_SIDE_ACTIVE, GAS_TURBINE_BOTTOM_ACTIVE, GAS_TURBINE_TOP_ACTIVE,
        STEAM_TURBINE_BACK, STEAM_TURBINE_FRONT, STEAM_TURBINE_SIDE, STEAM_TURBINE_BOTTOM, STEAM_TURBINE_TOP, STEAM_TURBINE_BACK_ACTIVE,
        STEAM_TURBINE_FRONT_ACTIVE, STEAM_TURBINE_SIDE_ACTIVE, STEAM_TURBINE_BOTTOM_ACTIVE, STEAM_TURBINE_TOP_ACTIVE,
        MACHINE_COIL_CUPRONICKEL, MACHINE_COIL_KANTHAL, MACHINE_COIL_NICHROME, MACHINE_COIL_SUPERCONDUCTOR,
        OVERLAY_LOCKER, OVERLAY_LOCKER_000, OVERLAY_LOCKER_001, OVERLAY_LOCKER_002, OVERLAY_LOCKER_003, OVERLAY_LOCKER_004, OVERLAY_LOCKER_005,
        OVERLAY_LOCKER_006, OVERLAY_LOCKER_007, OVERLAY_LOCKER_008, OVERLAY_LOCKER_009, OVERLAY_LOCKER_010, OVERLAY_LOCKER_011, OVERLAY_LOCKER_012, OVERLAY_LOCKER_013,
        OVERLAY_LENS, OVERLAY_PIPE, OVERLAY_PIPE_IN, OVERLAY_PIPE_OUT, OVERLAY_MUFFLER, OVERLAY_CONTROLLER, OVERLAY_ACTIVITYDETECTOR, OVERLAY_ENERGYDETECTOR,
        OVERLAY_FLUIDDETECTOR, OVERLAY_ITEMDETECTOR, OVERLAY_FUSION1, OVERLAY_FUSION2, OVERLAY_FUSION3, OVERLAY_SCREEN, OVERLAY_QTANK,
        OVERLAY_QCHEST, OVERLAY_SHUTTER, OVERLAY_CLOSET, OVERLAY_DUCTTAPE, OVERLAY_MAINTENANCE, OVERLAY_CONVEYOR, OVERLAY_PUMP, OVERLAY_ARM,
        OVERLAY_DRAIN, OVERLAY_CRAFTING, OVERLAY_ENERGY_IN, OVERLAY_ENERGY_OUT, OVERLAY_ENERGY_IN_MULTI, OVERLAY_ENERGY_OUT_MULTI,
        OVERLAY_FRONT_LARGE_BOILER, OVERLAY_FRONT_LARGE_BOILER_ACTIVE, OVERLAY_FRONT_VACUUM_FREEZER, OVERLAY_FRONT_VACUUM_FREEZER_ACTIVE,
        OVERLAY_FRONT_MULTI_SMELTER, OVERLAY_FRONT_MULTI_SMELTER_ACTIVE, OVERLAY_FRONT_ELECTRIC_BLAST_FURNACE, OVERLAY_FRONT_ELECTRIC_BLAST_FURNACE_ACTIVE,
        OVERLAY_FRONT_IMPLOSION_COMPRESSOR, OVERLAY_FRONT_IMPLOSION_COMPRESSOR_ACTIVE, OVERLAY_TOP_POTIONBREWER, OVERLAY_TOP_REPLICATOR, OVERLAY_TOP_MASSFAB,
        OVERLAY_TOP_STEAM_HAMMER, OVERLAY_TOP_STEAM_FURNACE, OVERLAY_TOP_STEAM_ALLOY_SMELTER, OVERLAY_TOP_STEAM_MACERATOR, OVERLAY_TOP_STEAM_COMPRESSOR,
        OVERLAY_TOP_STEAM_EXTRACTOR, OVERLAY_TOP_DISASSEMBLER, OVERLAY_TOP_BOXINATOR, OVERLAY_TOP_ROCK_BREAKER, OVERLAY_TOP_SCANNER,
        OVERLAY_FRONT_POTIONBREWER, OVERLAY_FRONT_REPLICATOR, OVERLAY_FRONT_MASSFAB, OVERLAY_FRONT_STEAM_HAMMER, OVERLAY_FRONT_STEAM_FURNACE,
        OVERLAY_FRONT_STEAM_ALLOY_SMELTER, OVERLAY_FRONT_STEAM_MACERATOR, OVERLAY_FRONT_STEAM_COMPRESSOR, OVERLAY_FRONT_STEAM_EXTRACTOR,
        OVERLAY_FRONT_DISASSEMBLER, OVERLAY_FRONT_BOXINATOR, OVERLAY_FRONT_ROCK_BREAKER, OVERLAY_FRONT_SCANNER, OVERLAY_BOTTOM_POTIONBREWER,
        OVERLAY_BOTTOM_REPLICATOR, OVERLAY_BOTTOM_MASSFAB, OVERLAY_BOTTOM_STEAM_HAMMER, OVERLAY_BOTTOM_STEAM_FURNACE, OVERLAY_BOTTOM_STEAM_ALLOY_SMELTER,
        OVERLAY_BOTTOM_STEAM_MACERATOR, OVERLAY_BOTTOM_STEAM_COMPRESSOR, OVERLAY_BOTTOM_STEAM_EXTRACTOR, OVERLAY_BOTTOM_DISASSEMBLER, OVERLAY_BOTTOM_BOXINATOR,
        OVERLAY_BOTTOM_ROCK_BREAKER, OVERLAY_BOTTOM_SCANNER, WOOD_SIDE, WOOD_TOPBOTTOM, OVERLAY_SIDE_POTIONBREWER, OVERLAY_SIDE_REPLICATOR, OVERLAY_SIDE_MASSFAB,
        OVERLAY_SIDE_STEAM_HAMMER, OVERLAY_SIDE_STEAM_FURNACE, OVERLAY_SIDE_STEAM_ALLOY_SMELTER, OVERLAY_SIDE_STEAM_MACERATOR,
        OVERLAY_SIDE_STEAM_COMPRESSOR, OVERLAY_SIDE_STEAM_EXTRACTOR, OVERLAY_SIDE_DISASSEMBLER, OVERLAY_SIDE_BOXINATOR, OVERLAY_SIDE_ROCK_BREAKER,
        OVERLAY_SIDE_SCANNER, OVERLAY_TOP_POTIONBREWER_ACTIVE, OVERLAY_TOP_REPLICATOR_ACTIVE, OVERLAY_TOP_MASSFAB_ACTIVE,
        OVERLAY_TOP_STEAM_HAMMER_ACTIVE, OVERLAY_TOP_STEAM_FURNACE_ACTIVE, OVERLAY_TOP_STEAM_ALLOY_SMELTER_ACTIVE, OVERLAY_TOP_STEAM_MACERATOR_ACTIVE,
        OVERLAY_TOP_STEAM_COMPRESSOR_ACTIVE, OVERLAY_TOP_STEAM_EXTRACTOR_ACTIVE, OVERLAY_TOP_DISASSEMBLER_ACTIVE,
        OVERLAY_TOP_BOXINATOR_ACTIVE, OVERLAY_TOP_ROCK_BREAKER_ACTIVE, OVERLAY_TOP_SCANNER_ACTIVE, OVERLAY_FRONT_POTIONBREWER_ACTIVE,
        OVERLAY_FRONT_REPLICATOR_ACTIVE, OVERLAY_FRONT_MASSFAB_ACTIVE, OVERLAY_FRONT_STEAM_HAMMER_ACTIVE, OVERLAY_FRONT_STEAM_FURNACE_ACTIVE,
        OVERLAY_FRONT_STEAM_ALLOY_SMELTER_ACTIVE, OVERLAY_FRONT_STEAM_MACERATOR_ACTIVE, OVERLAY_FRONT_STEAM_COMPRESSOR_ACTIVE,
        OVERLAY_FRONT_STEAM_EXTRACTOR_ACTIVE, OVERLAY_FRONT_DISASSEMBLER_ACTIVE, OVERLAY_FRONT_BOXINATOR_ACTIVE, OVERLAY_FRONT_ROCK_BREAKER_ACTIVE,
        OVERLAY_FRONT_SCANNER_ACTIVE, OVERLAY_BOTTOM_POTIONBREWER_ACTIVE, OVERLAY_BOTTOM_REPLICATOR_ACTIVE, OVERLAY_BOTTOM_MASSFAB_ACTIVE,
        OVERLAY_BOTTOM_STEAM_HAMMER_ACTIVE, OVERLAY_BOTTOM_STEAM_FURNACE_ACTIVE, OVERLAY_BOTTOM_STEAM_ALLOY_SMELTER_ACTIVE,
        OVERLAY_BOTTOM_STEAM_MACERATOR_ACTIVE, OVERLAY_BOTTOM_STEAM_COMPRESSOR_ACTIVE, OVERLAY_BOTTOM_STEAM_EXTRACTOR_ACTIVE,
        OVERLAY_BOTTOM_DISASSEMBLER_ACTIVE, OVERLAY_BOTTOM_BOXINATOR_ACTIVE, OVERLAY_BOTTOM_ROCK_BREAKER_ACTIVE, OVERLAY_BOTTOM_SCANNER_ACTIVE,
        OVERLAY_SIDE_POTIONBREWER_ACTIVE, OVERLAY_SIDE_REPLICATOR_ACTIVE, OVERLAY_SIDE_MASSFAB_ACTIVE, OVERLAY_SIDE_STEAM_HAMMER_ACTIVE,
        OVERLAY_SIDE_STEAM_FURNACE_ACTIVE, OVERLAY_SIDE_STEAM_ALLOY_SMELTER_ACTIVE, OVERLAY_SIDE_STEAM_MACERATOR_ACTIVE,
        OVERLAY_SIDE_STEAM_COMPRESSOR_ACTIVE, OVERLAY_SIDE_STEAM_EXTRACTOR_ACTIVE, OVERLAY_SIDE_DISASSEMBLER_ACTIVE,
        OVERLAY_SIDE_BOXINATOR_ACTIVE, OVERLAY_SIDE_ROCK_BREAKER_ACTIVE, OVERLAY_SIDE_SCANNER_ACTIVE, OVERLAY_ADV_PUMP, OVERLAY_TELEPORTER,
        OVERLAY_TELEPORTER_ACTIVE, FUSIONI_1, FUSIONI_2, FUSIONI_3, FUSIONI_4, FUSIONI_5, FUSIONI_6, FUSIONI_7, FUSIONI_8, FUSIONI_9,
        FUSIONI_10, FUSIONI_11, FUSIONI_12, FUSIONII_1, FUSIONII_2, FUSIONII_3, FUSIONII_4, FUSIONII_5, FUSIONII_6, FUSIONII_7, FUSIONII_8, FUSIONII_9,
        FUSIONII_10, FUSIONII_11, FUSIONII_12, LARGETURBINE1, LARGETURBINE2, LARGETURBINE3, LARGETURBINE4, LARGETURBINE5,
        LARGETURBINE6, LARGETURBINE7, LARGETURBINE8, LARGETURBINE9, LARGETURBINE_ACTIVE1, LARGETURBINE_ACTIVE2, LARGETURBINE_ACTIVE3, LARGETURBINE_ACTIVE4,
        MACHINE_CASING_DENSEBRICKS, MACHINE_CASING_BRICKEDBLASTFURNACE_ACTIVE, MACHINE_CASING_BRICKEDBLASTFURNACE_INACTIVE, LARGETURBINE_ACTIVE5, LARGETURBINE_ACTIVE6, LARGETURBINE_ACTIVE7, LARGETURBINE_ACTIVE8, LARGETURBINE_ACTIVE9, OVERLAY_FRONT_PYROLYSE_OVEN_ACTIVE, OVERLAY_FRONT_PYROLYSE_OVEN, MACHINE_CASING_TURBINE;

        /**
         * Icon for Fresh CFoam
         */
        public static final ITexture[] FRESHFOAM = new ITexture[]{new GT_RenderedTexture(CFOAM_FRESH)};
        /**
         * Icons for Hardened CFoam
         * 0 = No Color
         * 1 - 16 = Colors
         */
        public static final ITexture[][] HARDENEDFOAMS = new ITexture[][]{
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.CONSTRUCTION_FOAM.mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[0].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[1].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[2].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[3].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[4].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[5].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[6].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[7].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[8].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[9].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[10].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[11].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[12].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[13].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[14].mRGBa)},
                new ITexture[]{new GT_RenderedTexture(CFOAM_HARDENED, Dyes.VALUES[15].mRGBa)}
        };

        /**
         * Machine Casings by Tier
         * 0 = 8V, 1 = LV, 2 = MV, 3 = HV, 4 = EV, 5 = IV, 6 = IV, 7 = IV, 8 = IV, 9 = IV
         */
        public static final IIconContainer[]
                STORAGE_SIDE = new IIconContainer[]{
                WOOD_SIDE,
                MACHINE_BRONZEPLATEDBRICKS,
                MACHINE_CASING_SOLID_STEEL,
                MACHINE_CASING_STABLE_TITANIUM,
                MACHINE_CASING_ROBUST_TUNGSTENSTEEL,

        },
                STORAGE_TOPBOTTOM = new IIconContainer[]{
                        WOOD_TOPBOTTOM,
                        MACHINE_BRONZEPLATEDBRICKS,
                        MACHINE_CASING_SOLID_STEEL,
                        MACHINE_CASING_STABLE_TITANIUM,
                        MACHINE_CASING_ROBUST_TUNGSTENSTEEL,
                },

                MACHINECASINGS_SIDE = new IIconContainer[]{
                MACHINE_8V_SIDE,
                MACHINE_LV_SIDE,
                MACHINE_MV_SIDE,
                MACHINE_HV_SIDE,
                MACHINE_EV_SIDE,
                MACHINE_IV_SIDE,
                MACHINE_LuV_SIDE,
                MACHINE_ZPM_SIDE,
                MACHINE_UV_SIDE,
                MACHINE_MAX_SIDE,
                MACHINE_MAX_SIDE,
                MACHINE_MAX_SIDE,
                MACHINE_MAX_SIDE,
                MACHINE_MAX_SIDE,
                MACHINE_MAX_SIDE,
                MACHINE_MAX_SIDE,
        },
                MACHINECASINGS_TOP = new IIconContainer[]{
                        MACHINE_8V_TOP,
                        MACHINE_LV_TOP,
                        MACHINE_MV_TOP,
                        MACHINE_HV_TOP,
                        MACHINE_EV_TOP,
                        MACHINE_IV_TOP,
                        MACHINE_LuV_TOP,
                        MACHINE_ZPM_TOP,
                        MACHINE_UV_TOP,
                        MACHINE_MAX_TOP,
                        MACHINE_MAX_TOP,
                        MACHINE_MAX_TOP,
                        MACHINE_MAX_TOP,
                        MACHINE_MAX_TOP,
                        MACHINE_MAX_TOP,
                        MACHINE_MAX_TOP,
                },
                MACHINECASINGS_BOTTOM = new IIconContainer[]{
                        MACHINE_8V_BOTTOM,
                        MACHINE_LV_BOTTOM,
                        MACHINE_MV_BOTTOM,
                        MACHINE_HV_BOTTOM,
                        MACHINE_EV_BOTTOM,
                        MACHINE_IV_BOTTOM,
                        MACHINE_LuV_BOTTOM,
                        MACHINE_ZPM_BOTTOM,
                        MACHINE_UV_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                        MACHINE_MAX_BOTTOM,
                },
                GRANITES = new IIconContainer[]{
                        GRANITE_BLACK_STONE,
                        GRANITE_BLACK_COBBLE,
                        GRANITE_BLACK_COBBLE_MOSSY,
                        GRANITE_BLACK_BRICKS,
                        GRANITE_BLACK_BRICKS_CRACKED,
                        GRANITE_BLACK_BRICKS_MOSSY,
                        GRANITE_BLACK_BRICKS_CHISELED,
                        GRANITE_BLACK_SMOOTH,
                        GRANITE_RED_STONE,
                        GRANITE_RED_COBBLE,
                        GRANITE_RED_COBBLE_MOSSY,
                        GRANITE_RED_BRICKS,
                        GRANITE_RED_BRICKS_CRACKED,
                        GRANITE_RED_BRICKS_MOSSY,
                        GRANITE_RED_BRICKS_CHISELED,
                        GRANITE_RED_SMOOTH,
                },
                CONCRETES = new IIconContainer[]{
                        CONCRETE_DARK_STONE,
                        CONCRETE_DARK_COBBLE,
                        CONCRETE_DARK_COBBLE_MOSSY,
                        CONCRETE_DARK_BRICKS,
                        CONCRETE_DARK_BRICKS_CRACKED,
                        CONCRETE_DARK_BRICKS_MOSSY,
                        CONCRETE_DARK_BRICKS_CHISELED,
                        CONCRETE_DARK_SMOOTH,
                        CONCRETE_LIGHT_STONE,
                        CONCRETE_LIGHT_COBBLE,
                        CONCRETE_LIGHT_COBBLE_MOSSY,
                        CONCRETE_LIGHT_BRICKS,
                        CONCRETE_LIGHT_BRICKS_CRACKED,
                        CONCRETE_LIGHT_BRICKS_MOSSY,
                        CONCRETE_LIGHT_BRICKS_CHISELED,
                        CONCRETE_LIGHT_SMOOTH,
                },
                TURBINE = new IIconContainer[]{
                        LARGETURBINE1,
                        LARGETURBINE2,
                        LARGETURBINE3,
                        LARGETURBINE4,
                        LARGETURBINE5,
                        LARGETURBINE6,
                        LARGETURBINE7,
                        LARGETURBINE8,
                        LARGETURBINE9
                },
                TURBINE_ACTIVE = new IIconContainer[]{
                        LARGETURBINE_ACTIVE1,
                        LARGETURBINE_ACTIVE2,
                        LARGETURBINE_ACTIVE3,
                        LARGETURBINE_ACTIVE4,
                        LARGETURBINE_ACTIVE5,
                        LARGETURBINE_ACTIVE6,
                        LARGETURBINE_ACTIVE7,
                        LARGETURBINE_ACTIVE8,
                        LARGETURBINE_ACTIVE9
                },
                CONNECTED_HULLS = new IIconContainer[]{
                        CONCRETE_DARK_STONE,
                        FUSIONI_1,
                        FUSIONI_2,
                        FUSIONI_3,
                        FUSIONI_4,
                        FUSIONI_5,
                        FUSIONI_6,
                        FUSIONI_7,
                        FUSIONI_8,
                        FUSIONI_9,
                        FUSIONI_10,
                        FUSIONI_11,
                        FUSIONI_12,
                        FUSIONII_1,
                        FUSIONII_2,
                        FUSIONII_3,
                        FUSIONII_4,
                        FUSIONII_5,
                        FUSIONII_6,
                        FUSIONII_7,
                        FUSIONII_8,
                        FUSIONII_9,
                        FUSIONII_10,
                        FUSIONII_11,
                        FUSIONII_12,
                };
        public static ITexture[]
                ERROR_RENDERING = new ITexture[]{
                new GT_RenderedTexture(RENDERING_ERROR)
        },
                OVERLAYS_ENERGY_IN = new ITexture[]{
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{255, 100, 0, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{255, 255, 30, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{128, 128, 128, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN, new short[]{240, 240, 245, 0}),
                },
                OVERLAYS_ENERGY_OUT = new ITexture[]{
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{255, 100, 0, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{255, 255, 30, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{128, 128, 128, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT, new short[]{240, 240, 245, 0}),
                },
                OVERLAYS_ENERGY_IN_MULTI = new ITexture[]{
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{255, 100, 0, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{255, 255, 30, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{128, 128, 128, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_IN_MULTI, new short[]{240, 240, 245, 0}),
                },
                OVERLAYS_ENERGY_OUT_MULTI = new ITexture[]{
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{220, 220, 220, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{255, 100, 0, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{255, 255, 30, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{128, 128, 128, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{240, 240, 245, 0}),
                        new GT_RenderedTexture(OVERLAY_ENERGY_OUT_MULTI, new short[]{240, 240, 245, 0}),
                },
                LOCKERS = new ITexture[]{
                        new GT_RenderedTexture(OVERLAY_LOCKER_000),
                        new GT_RenderedTexture(OVERLAY_LOCKER_001),
                        new GT_RenderedTexture(OVERLAY_LOCKER_002),
                        new GT_RenderedTexture(OVERLAY_LOCKER_003),
                        new GT_RenderedTexture(OVERLAY_LOCKER_004),
                        new GT_RenderedTexture(OVERLAY_LOCKER_005),
                        new GT_RenderedTexture(OVERLAY_LOCKER_006),
                        new GT_RenderedTexture(OVERLAY_LOCKER_007),
                        new GT_RenderedTexture(OVERLAY_LOCKER_008),
                        new GT_RenderedTexture(OVERLAY_LOCKER_009),
                        new GT_RenderedTexture(OVERLAY_LOCKER_010),
                        new GT_RenderedTexture(OVERLAY_LOCKER_011),
                        new GT_RenderedTexture(OVERLAY_LOCKER_012),
                        new GT_RenderedTexture(OVERLAY_LOCKER_013),
                },
                CASING_BLOCKS = new ITexture[128],
                MACHINE_CASINGS[] = new ITexture[10][17],
                STORAGESTUFF[] = new ITexture [5][3];

        static {
            for (byte i = 0; i < MACHINE_CASINGS.length; i++)
                for (byte j = 0; j < MACHINE_CASINGS[i].length; j++)
                    MACHINE_CASINGS[i][j] = new GT_SidedTexture(MACHINECASINGS_BOTTOM[i], MACHINECASINGS_TOP[i], MACHINECASINGS_SIDE[i], Dyes.getModulation(j - 1, Dyes.MACHINE_METAL.mRGBa));
        }

        static {
            for (byte i = 0; i < STORAGESTUFF.length; i++)
                for (byte j = 0; j < STORAGESTUFF[i].length; j++)
                    STORAGESTUFF[i][j] = new GT_SidedTexture(STORAGE_TOPBOTTOM[i], STORAGE_TOPBOTTOM[i], STORAGE_SIDE[i], Dyes.getModulation(j - 1, Dyes.MACHINE_METAL.mRGBa));
        }

        protected IIcon mIcon;

        private BlockIcons() {
            GregTech_API.sGTBlockIconload.add(this);
        }

        @Override
        public IIcon getIcon() {
            return mIcon;
        }

        @Override
        public IIcon getOverlayIcon() {
            return null;
        }

        @Override
        public void run() {
            mIcon = GregTech_API.sBlockIcons.registerIcon(RES_PATH_BLOCK + "iconsets/" + this);
        }

        @Override
        public ResourceLocation getTextureFile() {
            return TextureMap.locationBlocksTexture;
        }

        public static class CustomIcon implements IIconContainer, Runnable {
            protected IIcon mIcon;
            protected String mIconName;

            public CustomIcon(String aIconName) {
                mIconName = aIconName;
                GregTech_API.sGTBlockIconload.add(this);
            }

            @Override
            public IIcon getIcon() {
                return mIcon;
            }

            @Override
            public IIcon getOverlayIcon() {
                return null;
            }

            @Override
            public void run() {
                mIcon = GregTech_API.sBlockIcons.registerIcon(RES_PATH_BLOCK + mIconName);
            }

            @Override
            public ResourceLocation getTextureFile() {
                return TextureMap.locationBlocksTexture;
            }
        }
    }

    public enum ItemIcons implements IIconContainer, Runnable {
        VOID // The Empty Texture
        , RENDERING_ERROR, WRENCH, MORTAR, CROWBAR, JACKHAMMER, WIRE_CUTTER, KNIFE, BUTCHERYKNIFE, SICKLE, SCOOP, GRAFTER, PLUNGER, ROLLING_PIN, HANDLE_SWORD, HANDLE_FILE, HANDLE_SAW, HANDLE_SCREWDRIVER, HANDLE_BUZZSAW, HANDLE_ELECTRIC_SCREWDRIVER, HANDLE_SOLDERING, POWER_UNIT_LV, POWER_UNIT_MV, POWER_UNIT_HV, DURABILITY_BAR_0, DURABILITY_BAR_1, DURABILITY_BAR_2, DURABILITY_BAR_3, DURABILITY_BAR_4, DURABILITY_BAR_5, DURABILITY_BAR_6, DURABILITY_BAR_7, DURABILITY_BAR_8, ENERGY_BAR_0, ENERGY_BAR_1, ENERGY_BAR_2, ENERGY_BAR_3, ENERGY_BAR_4, ENERGY_BAR_5, ENERGY_BAR_6, ENERGY_BAR_7, ENERGY_BAR_8, TURBINE, TURBINE_SMALL, TURBINE_LARGE, TURBINE_HUGE;

        public static final IIconContainer[]
                DURABILITY_BAR = new IIconContainer[]{
                DURABILITY_BAR_0,
                DURABILITY_BAR_1,
                DURABILITY_BAR_2,
                DURABILITY_BAR_3,
                DURABILITY_BAR_4,
                DURABILITY_BAR_5,
                DURABILITY_BAR_6,
                DURABILITY_BAR_7,
                DURABILITY_BAR_8,
        },
                ENERGY_BAR = new IIconContainer[]{
                        ENERGY_BAR_0,
                        ENERGY_BAR_1,
                        ENERGY_BAR_2,
                        ENERGY_BAR_3,
                        ENERGY_BAR_4,
                        ENERGY_BAR_5,
                        ENERGY_BAR_6,
                        ENERGY_BAR_7,
                        ENERGY_BAR_8,
                };

        public static final ITexture[] ERROR_RENDERING = new ITexture[]{new GT_RenderedTexture(RENDERING_ERROR)};

        protected IIcon mIcon, mOverlay;

        private ItemIcons() {
            GregTech_API.sGTItemIconload.add(this);
        }

        @Override
        public IIcon getIcon() {
            return mIcon;
        }

        @Override
        public IIcon getOverlayIcon() {
            return mOverlay;
        }

        @Override
        public ResourceLocation getTextureFile() {
            return TextureMap.locationItemsTexture;
        }

        @Override
        public void run() {
            mIcon = GregTech_API.sItemIcons.registerIcon(RES_PATH_ITEM + "iconsets/" + this);
            mOverlay = GregTech_API.sItemIcons.registerIcon(RES_PATH_ITEM + "iconsets/" + this + "_OVERLAY");
        }

        public static class CustomIcon implements IIconContainer, Runnable {
            protected IIcon mIcon, mOverlay;
            protected String mIconName;

            public CustomIcon(String aIconName) {
                mIconName = aIconName;
                GregTech_API.sGTItemIconload.add(this);
            }

            @Override
            public IIcon getIcon() {
                return mIcon;
            }

            @Override
            public IIcon getOverlayIcon() {
                return mOverlay;
            }

            @Override
            public void run() {
                mIcon = GregTech_API.sItemIcons.registerIcon(RES_PATH_ITEM + mIconName);
                mOverlay = GregTech_API.sItemIcons.registerIcon(RES_PATH_ITEM + mIconName + "_OVERLAY");
            }

            @Override
            public ResourceLocation getTextureFile() {
                return TextureMap.locationItemsTexture;
            }
        }
    }
}