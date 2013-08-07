package net.minecraft.server;

import java.util.List;
import java.util.Random;

import net.minecraft.server.BlockOre;
import net.minecraft.server.BlockOreBlock;
import net.minecraft.server.BlockStairs;
import net.minecraft.server.BlockTapisLaine;
import net.minecraft.server.BlockTapisVerre;
import net.minecraft.server.BlockVerreColored;
import net.minecraft.server.BlockBank;
import net.minecraft.server.BlockChair;
import net.minecraft.server.BlockTable;

public class Block {

    private CreativeModeTab creativeTab;
    public static final StepSound f = new StepSound("stone", 1.0F, 1.0F);
    public static final StepSound g = new StepSound("wood", 1.0F, 1.0F);
    public static final StepSound h = new StepSound("gravel", 1.0F, 1.0F);
    public static final StepSound i = new StepSound("grass", 1.0F, 1.0F);
    public static final StepSound j = new StepSound("stone", 1.0F, 1.0F);
    public static final StepSound k = new StepSound("stone", 1.0F, 1.5F);
    public static final StepSound l = new StepSoundStone("stone", 1.0F, 1.0F);
    public static final StepSound m = new StepSound("cloth", 1.0F, 1.0F);
    public static final StepSound n = new StepSound("sand", 1.0F, 1.0F);
    public static final StepSound o = new StepSound("snow", 1.0F, 1.0F);
    public static final StepSound p = new StepSoundLadder("ladder", 1.0F, 1.0F);
    public static final StepSound q = new StepSoundAnvil("anvil", 0.3F, 1.0F);
    public static final Block[] byId = new Block[8192];
    public static final boolean[] s = new boolean[8192];
    public static final int[] lightBlock = new int[8192];
    public static final boolean[] u = new boolean[8192];
    public static final int[] lightEmission = new int[8192];
    public static boolean[] w = new boolean[8192];
    public static final Block STONE = (new BlockStone(1)).c(1.5F).b(10.0F).a(j).c("stone");
    public static final BlockGrass GRASS = (BlockGrass) (new BlockGrass(2)).c(0.6F).a(i).c("grass");
    public static final Block DIRT = (new BlockDirt(3)).c(0.5F).a(h).c("dirt");
    public static final Block COBBLESTONE = (new Block(4, Material.STONE)).c(2.0F).b(10.0F).a(j).c("stonebrick").a(CreativeModeTab.b);
    public static final Block WOOD = (new BlockWood(5)).c(2.0F).b(5.0F).a(g).c("wood");
    public static final Block SAPLING = (new BlockSapling(6)).c(0.0F).a(i).c("sapling");
    public static final Block BEDROCK = (new Block(7, Material.STONE)).r().b(6000000.0F).a(j).c("bedrock").D().a(CreativeModeTab.b);
    public static final BlockFluids WATER = (BlockFluids) (new BlockFlowing(8, Material.WATER)).c(100.0F).k(3).c("water").D();
    public static final Block STATIONARY_WATER = (new BlockStationary(9, Material.WATER)).c(100.0F).k(3).c("water").D();
    public static final BlockFluids LAVA = (BlockFluids) (new BlockFlowing(10, Material.LAVA)).c(0.0F).a(1.0F).c("lava").D();
    public static final Block STATIONARY_LAVA = (new BlockStationary(11, Material.LAVA)).c(100.0F).a(1.0F).c("lava").D();
    public static final Block SAND = (new BlockSand(12)).c(0.5F).a(n).c("sand");
    public static final Block GRAVEL = (new BlockGravel(13)).c(0.6F).a(h).c("gravel");
    public static final Block GOLD_ORE = (new BlockOre(14)).c(3.0F).b(5.0F).a(j).c("oreGold");
    public static final Block IRON_ORE = (new BlockOre(15)).c(3.0F).b(5.0F).a(j).c("oreIron");
    public static final Block COAL_ORE = (new BlockOre(16)).c(3.0F).b(5.0F).a(j).c("oreCoal");
    public static final Block LOG = (new BlockLog(17)).c(2.0F).a(g).c("log");
    public static final BlockLeaves LEAVES = (BlockLeaves) (new BlockLeaves(18)).c(0.2F).k(1).a(i).c("leaves");
    public static final Block SPONGE = (new BlockSponge(19)).c(0.6F).a(i).c("sponge");
    public static final Block GLASS = (new BlockGlass(20, Material.SHATTERABLE, false)).c(0.3F).a(l).c("glass");
    public static final Block LAPIS_ORE = (new BlockOre(21)).c(3.0F).b(5.0F).a(j).c("oreLapis");
    public static final Block LAPIS_BLOCK = (new Block(22, Material.STONE)).c(3.0F).b(5.0F).a(j).c("blockLapis").a(CreativeModeTab.b);
    public static final Block DISPENSER = (new BlockDispenser(23)).c(3.5F).a(j).c("dispenser");
    public static final Block SANDSTONE = (new BlockSandStone(24)).a(j).c(0.8F).c("sandStone");
    public static final Block NOTE_BLOCK = (new BlockNote(25)).c(0.8F).c("musicBlock");
    public static final Block BED = (new BlockBed(26)).c(0.2F).c("bed").D();
    public static final Block GOLDEN_RAIL = (new BlockPoweredRail(27)).c(0.7F).a(k).c("goldenRail");
    public static final Block DETECTOR_RAIL = (new BlockMinecartDetector(28)).c(0.7F).a(k).c("detectorRail");
    public static final BlockPiston PISTON_STICKY = (BlockPiston) (new BlockPiston(29, true)).c("pistonStickyBase");
    public static final Block WEB = (new BlockWeb(30)).k(1).c(4.0F).c("web");
    public static final BlockLongGrass LONG_GRASS = (BlockLongGrass) (new BlockLongGrass(31)).c(0.0F).a(i).c("tallgrass");
    public static final BlockDeadBush DEAD_BUSH = (BlockDeadBush) (new BlockDeadBush(32)).c(0.0F).a(i).c("deadbush");
    public static final BlockPiston PISTON = (BlockPiston) (new BlockPiston(33, false)).c("pistonBase");
    public static final BlockPistonExtension PISTON_EXTENSION = new BlockPistonExtension(34);
    public static final Block WOOL = (new BlockCloth()).c(0.8F).a(m).c("cloth");
    public static final BlockPistonMoving PISTON_MOVING = new BlockPistonMoving(36);
    public static final BlockFlower YELLOW_FLOWER = (BlockFlower) (new BlockFlower(37)).c(0.0F).a(i).c("flower");
    public static final BlockFlower RED_ROSE = (BlockFlower) (new BlockFlower(38)).c(0.0F).a(i).c("rose");
    public static final BlockFlower BROWN_MUSHROOM = (BlockFlower) (new BlockMushroom(39, "mushroom_brown")).c(0.0F).a(i).a(0.125F).c("mushroom");
    public static final BlockFlower RED_MUSHROOM = (BlockFlower) (new BlockMushroom(40, "mushroom_red")).c(0.0F).a(i).c("mushroom");
    public static final Block GOLD_BLOCK = (new BlockOreBlock(41)).c(3.0F).b(10.0F).a(k).c("blockGold");
    public static final Block IRON_BLOCK = (new BlockOreBlock(42)).c(5.0F).b(10.0F).a(k).c("blockIron");
    public static final BlockStepAbstract DOUBLE_STEP = (BlockStepAbstract) (new BlockStep(43, true)).c(2.0F).b(10.0F).a(j).c("stoneSlab");
    public static final BlockStepAbstract STEP = (BlockStepAbstract) (new BlockStep(44, false)).c(2.0F).b(10.0F).a(j).c("stoneSlab");
    public static final Block BRICK = (new Block(45, Material.STONE)).c(2.0F).b(10.0F).a(j).c("brick").a(CreativeModeTab.b);
    public static final Block TNT = (new BlockTNT(46)).c(0.0F).a(i).c("tnt");
    public static final Block BOOKSHELF = (new BlockBookshelf(47)).c(1.5F).a(g).c("bookshelf");
    public static final Block MOSSY_COBBLESTONE = (new Block(48, Material.STONE)).c(2.0F).b(10.0F).a(j).c("stoneMoss").a(CreativeModeTab.b);
    public static final Block OBSIDIAN = (new BlockObsidian(49)).c(50.0F).b(2000.0F).a(j).c("obsidian");
    public static final Block TORCH = (new BlockTorch(50)).c(0.0F).a(0.9375F).a(g).c("torch");
    public static final BlockFire FIRE = (BlockFire) (new BlockFire(51)).c(0.0F).a(1.0F).a(g).c("fire").D();
    public static final Block MOB_SPAWNER = (new BlockMobSpawner(52)).c(5.0F).a(k).c("mobSpawner").D();
    public static final Block WOOD_STAIRS = (new BlockStairs(53, WOOD, 0)).c("stairsWood");
    public static final BlockChest CHEST = (BlockChest) (new BlockChest(54, 0)).c(2.5F).a(g).c("chest");
    public static final BlockRedstoneWire REDSTONE_WIRE = (BlockRedstoneWire) (new BlockRedstoneWire(55)).c(0.0F).a(f).c("redstoneDust").D();
    public static final Block DIAMOND_ORE = (new BlockOre(56)).c(3.0F).b(5.0F).a(j).c("oreDiamond");
    public static final Block DIAMOND_BLOCK = (new BlockOreBlock(57)).c(5.0F).b(10.0F).a(k).c("blockDiamond");
    public static final Block WORKBENCH = (new BlockWorkbench(58)).c(2.5F).a(g).c("workbench");
    public static final Block CROPS = (new BlockCrops(59)).c("crops");
    public static final Block SOIL = (new BlockSoil(60)).c(0.6F).a(h).c("farmland");
    public static final Block FURNACE = (new BlockFurnace(61, false)).c(3.5F).a(j).c("furnace").a(CreativeModeTab.c);
    public static final Block BURNING_FURNACE = (new BlockFurnace(62, true)).c(3.5F).a(j).a(0.875F).c("furnace");
    public static final Block SIGN_POST = (new BlockSign(63, TileEntitySign.class, true)).c(1.0F).a(g).c("sign").D();
    public static final Block WOODEN_DOOR = (new BlockDoor(64, Material.WOOD)).c(3.0F).a(g).c("doorWood").D();
    public static final Block LADDER = (new BlockLadder(65)).c(0.4F).a(p).c("ladder");
    public static final Block RAILS = (new BlockMinecartTrack(66)).c(0.7F).a(k).c("rail");
    public static final Block COBBLESTONE_STAIRS = (new BlockStairs(67, COBBLESTONE, 0)).c("stairsStone");
    public static final Block WALL_SIGN = (new BlockSign(68, TileEntitySign.class, false)).c(1.0F).a(g).c("sign").D();
    public static final Block LEVER = (new BlockLever(69)).c(0.5F).a(g).c("lever");
    public static final Block STONE_PLATE = (new BlockPressurePlateBinary(70, "stone", Material.STONE, EnumMobType.MOBS)).c(0.5F).a(j).c("pressurePlate");
    public static final Block IRON_DOOR_BLOCK = (new BlockDoor(71, Material.ORE)).c(5.0F).a(k).c("doorIron").D();
    public static final Block WOOD_PLATE = (new BlockPressurePlateBinary(72, "wood", Material.WOOD, EnumMobType.EVERYTHING)).c(0.5F).a(g).c("pressurePlate");
    public static final Block REDSTONE_ORE = (new BlockRedstoneOre(73, false)).c(3.0F).b(5.0F).a(j).c("oreRedstone").a(CreativeModeTab.b);
    public static final Block GLOWING_REDSTONE_ORE = (new BlockRedstoneOre(74, true)).a(0.625F).c(3.0F).b(5.0F).a(j).c("oreRedstone");
    public static final Block REDSTONE_TORCH_OFF = (new BlockRedstoneTorch(75, false)).c(0.0F).a(g).c("notGate");
    public static final Block REDSTONE_TORCH_ON = (new BlockRedstoneTorch(76, true)).c(0.0F).a(0.5F).a(g).c("notGate").a(CreativeModeTab.d);
    public static final Block STONE_BUTTON = (new BlockStoneButton(77)).c(0.5F).a(j).c("button");
    public static final Block SNOW = (new BlockSnow(78)).c(0.1F).a(o).c("snow").k(0);
    public static final Block ICE = (new BlockIce(79)).c(0.5F).k(3).a(l).c("ice");
    public static final Block SNOW_BLOCK = (new BlockSnowBlock(80)).c(0.2F).a(o).c("snow");
    public static final Block CACTUS = (new BlockCactus(81)).c(0.4F).a(m).c("cactus");
    public static final Block CLAY = (new BlockClay(82)).c(0.6F).a(h).c("clay");
    public static final Block SUGAR_CANE_BLOCK = (new BlockReed(83)).c(0.0F).a(i).c("reeds").D();
    public static final Block JUKEBOX = (new BlockJukeBox(84)).c(2.0F).b(10.0F).a(j).c("jukebox");
    public static final Block FENCE = (new BlockFence(85, "wood", Material.WOOD)).c(2.0F).b(5.0F).a(g).c("fence");
    public static final Block PUMPKIN = (new BlockPumpkin(86, false)).c(1.0F).a(g).c("pumpkin");
    public static final Block NETHERRACK = (new BlockBloodStone(87)).c(0.4F).a(j).c("hellrock");
    public static final Block SOUL_SAND = (new BlockSlowSand(88)).c(0.5F).a(n).c("hellsand");
    public static final Block GLOWSTONE = (new BlockLightStone(89, Material.SHATTERABLE)).c(0.3F).a(l).a(1.0F).c("lightgem");
    public static final BlockPortal PORTAL = (BlockPortal) (new BlockPortal(90)).c(-1.0F).a(l).a(0.75F).c("portal");
    public static final Block JACK_O_LANTERN = (new BlockPumpkin(91, true)).c(1.0F).a(g).a(1.0F).c("litpumpkin");
    public static final Block CAKE_BLOCK = (new BlockCake(92)).c(0.5F).a(m).c("cake").D();
    public static final BlockRepeater DIODE_OFF = (BlockRepeater) (new BlockRepeater(93, false)).c(0.0F).a(g).c("diode").D();
    public static final BlockRepeater DIODE_ON = (BlockRepeater) (new BlockRepeater(94, true)).c(0.0F).a(0.625F).a(g).c("diode").D();
    public static final Block LOCKED_CHEST = (new BlockLockedChest(95)).c(0.0F).a(1.0F).a(g).c("lockedchest").b(true);
    public static final Block TRAP_DOOR = (new BlockTrapdoor(96, Material.WOOD)).c(3.0F).a(g).c("trapdoor").D();
    public static final Block MONSTER_EGGS = (new BlockMonsterEggs(97)).c(0.75F).c("monsterStoneEgg");
    public static final Block SMOOTH_BRICK = (new BlockSmoothBrick(98)).c(1.5F).b(10.0F).a(j).c("stonebricksmooth");
    public static final Block BIG_MUSHROOM_1 = (new BlockHugeMushroom(99, Material.WOOD, 0)).c(0.2F).a(g).c("mushroom");
    public static final Block BIG_MUSHROOM_2 = (new BlockHugeMushroom(100, Material.WOOD, 1)).c(0.2F).a(g).c("mushroom");
    public static final Block IRON_FENCE = (new BlockThinFence(101, "fenceIron", "fenceIron", Material.ORE, true)).c(5.0F).b(10.0F).a(k).c("fenceIron");
    public static final Block THIN_GLASS = (new BlockThinFence(102, "glass", "thinglass_top", Material.SHATTERABLE, false)).c(0.3F).a(l).c("thinGlass");
    public static final Block MELON = (new BlockMelon(103)).c(1.0F).a(g).c("melon");
    public static final Block PUMPKIN_STEM = (new BlockStem(104, PUMPKIN)).c(0.0F).a(g).c("pumpkinStem");
    public static final Block MELON_STEM = (new BlockStem(105, MELON)).c(0.0F).a(g).c("pumpkinStem");
    public static final Block VINE = (new BlockVine(106)).c(0.2F).a(i).c("vine");
    public static final Block FENCE_GATE = (new BlockFenceGate(107)).c(2.0F).b(5.0F).a(g).c("fenceGate");
    public static final Block BRICK_STAIRS = (new BlockStairs(108, BRICK, 0)).c("stairsBrick");
    public static final Block STONE_STAIRS = (new BlockStairs(109, SMOOTH_BRICK, 0)).c("stairsStoneBrickSmooth");
    public static final BlockMycel MYCEL = (BlockMycel) (new BlockMycel(110)).c(0.6F).a(i).c("mycel");
    public static final Block WATER_LILY = (new BlockWaterLily(111)).c(0.0F).a(i).c("waterlily");
    public static final Block NETHER_BRICK = (new Block(112, Material.STONE)).c(2.0F).b(10.0F).a(j).c("netherBrick").a(CreativeModeTab.b);
    public static final Block NETHER_FENCE = (new BlockFence(113, "netherBrick", Material.STONE)).c(2.0F).b(10.0F).a(j).c("netherFence");
    public static final Block NETHER_BRICK_STAIRS = (new BlockStairs(114, NETHER_BRICK, 0)).c("stairsNetherBrick");
    public static final Block NETHER_WART = (new BlockNetherWart(115)).c("netherStalk");
    public static final Block ENCHANTMENT_TABLE = (new BlockEnchantmentTable(116)).c(5.0F).b(2000.0F).c("enchantmentTable");
    public static final Block BREWING_STAND = (new BlockBrewingStand(117)).c(0.5F).a(0.125F).c("brewingStand");
    public static final BlockCauldron CAULDRON = (BlockCauldron) (new BlockCauldron(118)).c(2.0F).c("cauldron");
    public static final Block ENDER_PORTAL = (new BlockEnderPortal(119, Material.PORTAL)).c(-1.0F).b(6000000.0F);
    public static final Block ENDER_PORTAL_FRAME = (new BlockEnderPortalFrame(120)).a(l).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(CreativeModeTab.c);
    public static final Block WHITESTONE = (new Block(121, Material.STONE)).c(3.0F).b(15.0F).a(j).c("whiteStone").a(CreativeModeTab.b);
    public static final Block DRAGON_EGG = (new BlockDragonEgg(122)).c(3.0F).b(15.0F).a(j).a(0.125F).c("dragonEgg");
    public static final Block REDSTONE_LAMP_OFF = (new BlockRedstoneLamp(123, false)).c(0.3F).a(l).c("redstoneLight").a(CreativeModeTab.d);
    public static final Block REDSTONE_LAMP_ON = (new BlockRedstoneLamp(124, true)).c(0.3F).a(l).c("redstoneLight");
    public static final BlockStepAbstract WOOD_DOUBLE_STEP = (BlockStepAbstract) (new BlockWoodStep(125, true)).c(2.0F).b(5.0F).a(g).c("woodSlab");
    public static final BlockStepAbstract WOOD_STEP = (BlockStepAbstract) (new BlockWoodStep(126, false)).c(2.0F).b(5.0F).a(g).c("woodSlab");
    public static final Block COCOA = (new BlockCocoa(127)).c(0.2F).b(5.0F).a(g).c("cocoa");
    public static final Block SANDSTONE_STAIRS = (new BlockStairs(128, SANDSTONE, 0)).c("stairsSandStone");
    public static final Block EMERALD_ORE = (new BlockOre(129)).c(3.0F).b(5.0F).a(j).c("oreEmerald");
    public static final Block ENDER_CHEST = (new BlockEnderChest(130)).c(22.5F).b(1000.0F).a(j).c("enderChest").a(0.5F);
    public static final BlockTripwireHook TRIPWIRE_SOURCE = (BlockTripwireHook) (new BlockTripwireHook(131)).c("tripWireSource");
    public static final Block TRIPWIRE = (new BlockTripwire(132)).c("tripWire");
    public static final Block EMERALD_BLOCK = (new BlockOreBlock(133)).c(5.0F).b(10.0F).a(k).c("blockEmerald");
    public static final Block SPRUCE_WOOD_STAIRS = (new BlockStairs(134, WOOD, 1)).c("stairsWoodSpruce");
    public static final Block BIRCH_WOOD_STAIRS = (new BlockStairs(135, WOOD, 2)).c("stairsWoodBirch");
    public static final Block JUNGLE_WOOD_STAIRS = (new BlockStairs(136, WOOD, 3)).c("stairsWoodJungle");
    public static final Block COMMAND = (new BlockCommand(137)).c("commandBlock");
    public static final BlockBeacon BEACON = (BlockBeacon) (new BlockBeacon(138)).c("beacon").a(1.0F);
    public static final Block COBBLE_WALL = (new BlockCobbleWall(139, COBBLESTONE)).c("cobbleWall");
    public static final Block FLOWER_POT = (new BlockFlowerPot(140)).c(0.0F).a(f).c("flowerPot");
    public static final Block CARROTS = (new BlockCarrots(141)).c("carrots");
    public static final Block POTATOES = (new BlockPotatoes(142)).c("potatoes");
    public static final Block WOOD_BUTTON = (new BlockWoodButton(143)).c(0.5F).a(g).c("button");
    public static final Block SKULL = (new BlockSkull(144)).c(1.0F).a(j).c("skull");
    public static final Block ANVIL = (new BlockAnvil(145)).c(5.0F).a(q).b(2000.0F).c("anvil");
    public static final Block TRAPPED_CHEST = (new BlockChest(146, 1)).c(2.5F).a(g).c("chestTrap");
    public static final Block GOLD_PLATE = (new BlockPressurePlateWeighted(147, "blockGold", Material.ORE, 64)).c(0.5F).a(g).c("weightedPlate_light");
    public static final Block IRON_PLATE = (new BlockPressurePlateWeighted(148, "blockIron", Material.ORE, 640)).c(0.5F).a(g).c("weightedPlate_heavy");
    public static final BlockRedstoneComparator REDSTONE_COMPARATOR_OFF = (BlockRedstoneComparator) (new BlockRedstoneComparator(149, false)).c(0.0F).a(g).c("comparator").D();
    public static final BlockRedstoneComparator REDSTONE_COMPARATOR_ON = (BlockRedstoneComparator) (new BlockRedstoneComparator(150, true)).c(0.0F).a(0.625F).a(g).c("comparator").D();
    public static final BlockDaylightDetector DAYLIGHT_DETECTOR = (BlockDaylightDetector) (new BlockDaylightDetector(151)).c(0.2F).a(g).c("daylightDetector");
    public static final Block REDSTONE_BLOCK = (new BlockRedstone(152)).c(5.0F).b(10.0F).a(k).c("blockRedstone");
    public static final Block QUARTZ_ORE = (new BlockOre(153)).c(3.0F).b(5.0F).a(j).c("netherquartz");
    public static final BlockHopper HOPPER = (BlockHopper) (new BlockHopper(154)).c(3.0F).b(8.0F).a(g).c("hopper");
    public static final Block QUARTZ_BLOCK = (new BlockQuartz(155)).a(j).c(0.8F).c("quartzBlock");
    public static final Block QUARTZ_STAIRS = (new BlockStairs(156, QUARTZ_BLOCK, 0)).c("stairsQuartz");
    public static final Block ACTIVATOR_RAIL = (new BlockPoweredRail(157)).c(0.7F).a(k).c("activatorRail");
    public static final Block DROPPER = (new BlockDropper(158)).c(3.5F).a(j).c("dropper");
    
    /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public static final Block BLOCKCUIVRE = (new BlockOreBlock(500)).c(5.0F).b(10.0F).a(k).c("blockCuivre");
    public static final Block BLOCKCITRINE = (new BlockOreBlock(501)).c(5.0F).b(10.0F).a(k).c("blockCitrine");
    public static final Block BLOCKSAPHIR = (new BlockOreBlock(502)).c(5.0F).b(10.0F).a(k).c("blockSaphir");
    public static final Block BLOCKRUBIS = (new BlockOreBlock(503)).c(5.0F).b(10.0F).a(k).c("blockRubis");
    public static final Block BLOCKEMERAUDE = (new BlockOreBlock(504)).c(5.0F).b(10.0F).a(k).c("blockEmeraude");
    public static final Block ORECUIVRE = (new BlockOre(505)).c(3.0F).b(5.0F).a(j).c("oreCuivre");
    public static final Block ORECITRINE = (new BlockOre(506)).c(3.0F).b(5.0F).a(j).c("oreCitrine");
    public static final Block OREEMERAUDE = (new BlockOre(507)).c(3.0F).b(5.0F).a(j).c("oreEmeraude");
    public static final Block ORESAPHIR = (new BlockOre(508)).c(3.0F).b(5.0F).a(j).c("oreSaphir");
    public static final Block ORERUBIS = (new BlockOre(509)).c(3.0F).b(5.0F).a(j).c("oreRubis");
    public static final Block BLOCKVERRECOLORED = (new BlockVerreColored(510, Material.SHATTERABLE, false)).c("blockVerreColored").a(l).c(0.7F);
    public static final Block TAPISLAINE = (new BlockTapisLaine(511)).c("tapisLaine").a(m).c(0.7F);
    public static final Block TAPISVERRE = (new BlockTapisVerre(512)).c("tapisVerre").a(l).c(0.7F);
    
    public static final Block STAIRSVERREWHITE = (new BlockStairs(513, BLOCKVERRECOLORED, 0)).c("stairsVerreWhite");
    public static final Block STAIRSVERREORANGE = (new BlockStairs(514, BLOCKVERRECOLORED, 1)).c("stairsVerreOrange");
    public static final Block STAIRSVERREMAGENTA = (new BlockStairs(515, BLOCKVERRECOLORED, 2)).c("stairsVerreMagenta");
    public static final Block STAIRSVERRESKYBLUE = (new BlockStairs(516, BLOCKVERRECOLORED, 3)).c("stairsVerreSkyBlue");
    public static final Block STAIRSVERREYELLOW = (new BlockStairs(517, BLOCKVERRECOLORED, 4)).c("stairsVerreYellow");
    public static final Block STAIRSVERREGREEN = (new BlockStairs(518, BLOCKVERRECOLORED, 5)).c("stairsVerreGreen");
    public static final Block STAIRSVERREPINK = (new BlockStairs(519, BLOCKVERRECOLORED, 6)).c("stairsVerrePink");
    public static final Block STAIRSVERREDARKGREY = (new BlockStairs(520, BLOCKVERRECOLORED, 7)).c("stairsVerreDarkGrey");
    public static final Block STAIRSVERRELIGHTGREY = (new BlockStairs(521, BLOCKVERRECOLORED, 8)).c("stairsVerreLightGrey");
    public static final Block STAIRSVERRECYAN = (new BlockStairs(522, BLOCKVERRECOLORED, 9)).c("stairsVerreCyan");
    public static final Block STAIRSVERREPURPLE = (new BlockStairs(523, BLOCKVERRECOLORED, 10)).c("stairsVerrePurple");
    public static final Block STAIRSVERREDARKBLUE = (new BlockStairs(524, BLOCKVERRECOLORED, 11)).c("stairsVerreDarkBlue");
    public static final Block STAIRSVERREBROWN = (new BlockStairs(525, BLOCKVERRECOLORED, 12)).c("stairsVerreBrown");
    public static final Block STAIRSVERREDARKGREEN = (new BlockStairs(526, BLOCKVERRECOLORED, 13)).c("stairsVerreDarkGreen");
    public static final Block STAIRSVERRERED = (new BlockStairs(527, BLOCKVERRECOLORED, 14)).c("stairsVerreRed");
    public static final Block STAIRSVERREBLACK = (new BlockStairs(528, BLOCKVERRECOLORED, 15)).c("stairsVerreBlack");
    
    public static final Block STAIRSLAINEWHITE = (new BlockStairs(529, WOOL, 0)).c("stairsLaineWhite");
    public static final Block STAIRSLAINEORANGE = (new BlockStairs(530, WOOL, 1)).c("stairsLaineOrange");
    public static final Block STAIRSLAINEMAGENTA = (new BlockStairs(531, WOOL, 2)).c("stairsLaineMagenta");
    public static final Block STAIRSLAINESKYBLUE = (new BlockStairs(532, WOOL, 3)).c("stairsLaineSkyBlue");
    public static final Block STAIRSLAINEYELLOW = (new BlockStairs(533, WOOL, 4)).c("stairsLaineYellow");
    public static final Block STAIRSLAINEGREEN = (new BlockStairs(534, WOOL, 5)).c("stairsLaineGreen");
    public static final Block STAIRSLAINEPINK = (new BlockStairs(535, WOOL, 6)).c("stairsLainePink");
    public static final Block STAIRSLAINEDARKGREY = (new BlockStairs(536, WOOL, 7)).c("stairsLaineDarkGrey");
    public static final Block STAIRSLAINELIGHTGREY = (new BlockStairs(537, WOOL, 8)).c("stairsLaineLightGrey");
    public static final Block STAIRSLAINECYAN = (new BlockStairs(538, WOOL, 9)).c("stairsLaineCyan");
    public static final Block STAIRSLAINEPURPLE = (new BlockStairs(539, WOOL, 10)).c("stairsLainePurple");
    public static final Block STAIRSLAINEDARKBLUE = (new BlockStairs(540, WOOL, 11)).c("stairsLaineDarkBlue");
    public static final Block STAIRSLAINEBROWN = (new BlockStairs(541, WOOL, 12)).c("stairsLaineBrown");
    public static final Block STAIRSLAINEDARKGREEN = (new BlockStairs(542, WOOL, 13)).c("stairsLaineDarkGreen");
    public static final Block STAIRSLAINERED = (new BlockStairs(543, WOOL, 14)).c("stairsLaineRed");
    public static final Block STAIRSLAINEBLACK = (new BlockStairs(544, WOOL, 15)).c("stairsLaineBlack");
    
    public static final Block LANTERNE1 = (new Block(545, Material.SHATTERABLE)).c(0.3F).a(l).a(1.0F).c("lanterne1");
    public static final Block LANTERNE2 = (new Block(546, Material.SHATTERABLE)).c(0.3F).a(l).a(1.0F).c("lanterne2");
    public static final Block LANTERNE3 = (new Block(547, Material.WOOD)).c(0.3F).a(g).a(1.0F).c("lanterne3");
    public static final Block LANTERNE4 = (new Block(548, Material.WOOD)).c(0.3F).a(g).a(1.0F).c("lanterne4");
    public static final Block LANTERNE5 = (new Block(549, Material.STONE)).c(0.3F).a(j).a(1.0F).c("lantern5");
    public static final Block LANTERNE6 = (new Block(550, Material.STONE)).c(0.3F).a(j).a(1.0F).c("lanterne6");
    public static final Block LANTERNE7 = (new Block(551, Material.ORE)).c(0.3F).a(k).a(1.0F).c("lantern7");
    public static final Block LANTERNE8 = (new Block(552, Material.ORE)).c(0.3F).a(k).a(1.0F).c("lanterne8");
    
    public static final Block STAIRSSTONE = (new BlockStairs(553, STONE, 0)).c("stairsStone");
    public static final Block STAIRSDIRT = (new BlockStairs(554, DIRT, 0)).c("stairsDirt");
    public static final Block STAIRSBEDROCK = (new BlockStairs(555, BEDROCK, 0)).c("stairsBedrock");
    public static final Block STAIRSLOG = (new BlockStairs(556, WOOD, 0)).c("stairsWood");
    public static final Block STAIRSBLOCKGOLD = (new BlockStairs(557, GOLD_BLOCK, 0)).c("stairsBlockGold");
    public static final Block STAIRSBLOCKIRON = (new BlockStairs(558, IRON_BLOCK, 0)).c("stairsBlockIron");
    public static final Block STAIRSCOBBLESTONEMOSSY = (new BlockStairs(559, MOSSY_COBBLESTONE, 0)).c("stairsCobblestoneMossy");
    public static final Block STAIRSOBSIDIAN = (new BlockStairs(560, OBSIDIAN, 0)).c("stairsObsidian");
    public static final Block STAIRSBLOCKDIAMOND = (new BlockStairs(561, DIAMOND_BLOCK, 0)).c("stairsBlockDiamond");
    public static final Block STAIRSBLOCKSNOW = (new BlockStairs(562, SNOW_BLOCK, 0)).c("stairsBlockSnow");
    public static final Block STAIRSBLOCKCLAY = (new BlockStairs(563, CLAY, 0)).c("stairsBlockClay");
    public static final Block STAIRSSLOWSAND = (new BlockStairs(564, SOUL_SAND, 0)).c("stairsSlowSand");
    public static final Block STAIRSBLOCKEMERALD = (new BlockStairs(565, EMERALD_BLOCK, 0)).c("stairsBlockEmerald");
    public static final Block STAIRSBLOCKCUIVRE = (new BlockStairs(566, BLOCKCUIVRE, 0)).c("stairsBlockCuivre");
    public static final Block STAIRSBLOCKCITRINE = (new BlockStairs(567, BLOCKCITRINE, 0)).c("stairsBlockCitrine");
    public static final Block STAIRSBLOCKEMERAUDE = (new BlockStairs(568, BLOCKEMERAUDE, 0)).c("stairsBlockEmeraude");
    public static final Block STAIRSBLOCKSAPHIR = (new BlockStairs(569, BLOCKSAPHIR, 0)).c("stairsBlockSaphir");
    public static final Block STAIRSBLOCKRUBIS = (new BlockStairs(570, BLOCKRUBIS, 0)).c("stairsBlockRubis");
    public static final Block CAISSEBOIS = (new BlockCaisseBois(571, Material.WOOD, false)).c("caisseBois").a(g).c(0.7F);
    public static final Block STONEBRICK2 = (new BlockStoneBrick2(572, Material.STONE, false)).c("stoneBrick2").a(j).c(0.7F);
    public static final Block STONEBRICK3 = (new BlockStoneBrick3(573, Material.STONE, false)).c("stoneBrick3").a(j).c(0.7F);
    
    public static final Block BIBLIOTHEQUES1 = (new BlockBookshelf(574)).c(1.5F).a(g).c("bibliotheques_1");
    public static final Block BIBLIOTHEQUES2 = (new BlockBookshelf(575)).c(1.5F).a(g).c("bibliotheques_2");
    public static final Block BIBLIOTHEQUES3 = (new BlockBookshelf(576)).c(1.5F).a(g).c("bibliotheques_3");
    public static final Block BIBLIOTHEQUES4 = (new BlockBookshelf(577)).c(1.5F).a(g).c("bibliotheques_4");
    public static final Block BIBLIOTHEQUES5 = (new BlockBookshelf(578)).c(1.5F).a(g).c("bibliotheques_5");
    public static final Block BIBLIOTHEQUES6 = (new BlockBookshelf(579)).c(1.5F).a(g).c("bibliotheques_6");
    public static final Block BIBLIOTHEQUES7 = (new BlockBookshelf(580)).c(1.5F).a(g).c("bibliotheques_7");
    public static final Block BIBLIOTHEQUES8 = (new BlockBookshelf(581)).c(1.5F).a(g).c("bibliotheques_8");
    public static final Block BIBLIOTHEQUES9 = (new BlockBookshelf(582)).c(1.5F).a(g).c("bibliotheques_9");
    public static final Block BIBLIOTHEQUES10 = (new BlockBookshelf(583)).c(1.5F).a(g).c("bibliotheques_10");
    public static final Block BIBLIOTHEQUES11 = (new BlockBookshelf(584)).c(1.5F).a(g).c("bibliotheques_11");
    public static final Block BIBLIOTHEQUES12 = (new BlockBookshelf(585)).c(1.5F).a(g).c("bibliotheques_12");
    public static final Block BIBLIOTHEQUES13 = (new BlockBookshelf(586)).c(1.5F).a(g).c("bibliotheques_13");
    public static final Block BIBLIOTHEQUES14 = (new BlockBookshelf(587)).c(1.5F).a(g).c("bibliotheques_14");
    public static final Block BIBLIOTHEQUES15 = (new BlockBookshelf(588)).c(1.5F).a(g).c("bibliotheques_15");
    public static final Block BIBLIOTHEQUES16 = (new BlockBookshelf2(589)).c(1.5F).a(g).c("bibliotheques_16");
    public static final Block BIBLIOTHEQUES17 = (new BlockBookshelf2(590)).c(1.5F).a(g).c("bibliotheques_17");
    public static final Block BIBLIOTHEQUES18 = (new BlockBookshelf2(591)).c(1.5F).a(g).c("bibliotheques_18");
    public static final Block BIBLIOTHEQUES19 = (new BlockBookshelf2(592)).c(1.5F).a(g).c("bibliotheques_19");
    public static final Block BIBLIOTHEQUES20 = (new BlockBookshelf2(593)).c(1.5F).a(g).c("bibliotheques_20");
    public static final Block BIBLIOTHEQUES21 = (new BlockBookshelf2(594)).c(1.5F).a(g).c("bibliotheques_21");
    public static final Block BIBLIOTHEQUES22 = (new BlockBookshelf2(595)).c(1.5F).a(g).c("bibliotheques_22");
    public static final Block BIBLIOTHEQUES23 = (new BlockBookshelf2(596)).c(1.5F).a(g).c("bibliotheques_23");
    public static final Block BIBLIOTHEQUES24 = (new BlockBookshelf2(597)).c(1.5F).a(g).c("bibliotheques_24");
    public static final Block BIBLIOTHEQUES25 = (new BlockBookshelf2(598)).c(1.5F).a(g).c("bibliotheques_25");
    public static final Block BIBLIOTHEQUES26 = (new BlockBookshelf2(599)).c(1.5F).a(g).c("bibliotheques_26");
    public static final Block BIBLIOTHEQUES27 = (new BlockBookshelf2(600)).c(1.5F).a(g).c("bibliotheques_27");
    public static final Block BIBLIOTHEQUES28 = (new BlockBookshelf2(601)).c(1.5F).a(g).c("bibliotheques_28");
    public static final Block BIBLIOTHEQUES29 = (new BlockBookshelf2(602)).c(1.5F).a(g).c("bibliotheques_29");
    public static final Block BIBLIOTHEQUES30 = (new BlockBookshelf2(603)).c(1.5F).a(g).c("bibliotheques_30");
    public static final Block BIBLIOTHEQUES31 = (new BlockBookshelf3(604)).c(1.5F).a(g).c("bibliotheques_31");
    public static final Block BIBLIOTHEQUES32 = (new BlockBookshelf3(605)).c(1.5F).a(g).c("bibliotheques_32");
    public static final Block BIBLIOTHEQUES33 = (new BlockBookshelf3(606)).c(1.5F).a(g).c("bibliotheques_33");
    public static final Block BIBLIOTHEQUES34 = (new BlockBookshelf3(607)).c(1.5F).a(g).c("bibliotheques_34");
    public static final Block BIBLIOTHEQUES35 = (new BlockBookshelf3(608)).c(1.5F).a(g).c("bibliotheques_35");
    public static final Block BIBLIOTHEQUES36 = (new BlockBookshelf3(609)).c(1.5F).a(g).c("bibliotheques_36");
    public static final Block BIBLIOTHEQUES37 = (new BlockBookshelf3(610)).c(1.5F).a(g).c("bibliotheques_37");
    public static final Block BIBLIOTHEQUES38 = (new BlockBookshelf3(611)).c(1.5F).a(g).c("bibliotheques_38");
    public static final Block BIBLIOTHEQUES39 = (new BlockBookshelf3(612)).c(1.5F).a(g).c("bibliotheques_39");
    public static final Block BIBLIOTHEQUES40 = (new BlockBookshelf3(613)).c(1.5F).a(g).c("bibliotheques_40");
    public static final Block BIBLIOTHEQUES41 = (new BlockBookshelf3(614)).c(1.5F).a(g).c("bibliotheques_41");
    public static final Block BIBLIOTHEQUES42 = (new BlockBookshelf3(615)).c(1.5F).a(g).c("bibliotheques_42");
    public static final Block BIBLIOTHEQUES43 = (new BlockBookshelf3(616)).c(1.5F).a(g).c("bibliotheques_43");
    public static final Block BIBLIOTHEQUES44 = (new BlockBookshelf3(617)).c(1.5F).a(g).c("bibliotheques_44");
    public static final Block BIBLIOTHEQUES45 = (new BlockBookshelf3(618)).c(1.5F).a(g).c("bibliotheques_45");
    public static final Block BIBLIOTHEQUES46 = (new BlockBookshelf4(619)).c(1.5F).a(g).c("bibliotheques_46");
    public static final Block BIBLIOTHEQUES47 = (new BlockBookshelf4(620)).c(1.5F).a(g).c("bibliotheques_47");
    public static final Block BIBLIOTHEQUES48 = (new BlockBookshelf4(621)).c(1.5F).a(g).c("bibliotheques_48");
    public static final Block BIBLIOTHEQUES49 = (new BlockBookshelf4(622)).c(1.5F).a(g).c("bibliotheques_49");
    public static final Block BIBLIOTHEQUES50 = (new BlockBookshelf4(623)).c(1.5F).a(g).c("bibliotheques_50");
    public static final Block BIBLIOTHEQUES51 = (new BlockBookshelf4(624)).c(1.5F).a(g).c("bibliotheques_51");
    public static final Block BIBLIOTHEQUES52 = (new BlockBookshelf4(625)).c(1.5F).a(g).c("bibliotheques_52");
    public static final Block BIBLIOTHEQUES53 = (new BlockBookshelf4(626)).c(1.5F).a(g).c("bibliotheques_53");
    public static final Block BIBLIOTHEQUES54 = (new BlockBookshelf4(627)).c(1.5F).a(g).c("bibliotheques_54");
    public static final Block BIBLIOTHEQUES55 = (new BlockBookshelf4(628)).c(1.5F).a(g).c("bibliotheques_55");
    public static final Block BIBLIOTHEQUES56 = (new BlockBookshelf4(629)).c(1.5F).a(g).c("bibliotheques_56");
    public static final Block BIBLIOTHEQUES57 = (new BlockBookshelf4(630)).c(1.5F).a(g).c("bibliotheques_57");
    public static final Block BIBLIOTHEQUES58 = (new BlockBookshelf4(631)).c(1.5F).a(g).c("bibliotheques_58");
    public static final Block BIBLIOTHEQUES59 = (new BlockBookshelf4(632)).c(1.5F).a(g).c("bibliotheques_59");
    public static final Block BIBLIOTHEQUES60 = (new BlockBookshelf4(633)).c(1.5F).a(g).c("bibliotheques_60");
    
    public static final Block TRAPPEACIER = (new BlockTrapdoor(634, Material.ORE)).c(3.0F).a(g).c("trappeAcier").D();
    
    public static final Block BLOCKPARTICULES1 = (new BlockParticules1(700)).c("blockInvisible");
    public static final Block BLOCKPARTICULES2 = (new BlockParticules2(701)).c("blockInvisible");
    public static final Block BLOCKPARTICULES3 = (new BlockParticules3(702)).c("blockInvisible");
    public static final Block BLOCKPARTICULES4 = (new BlockParticules4(703)).c("blockInvisible");
    public static final Block BLOCKPARTICULES5 = (new BlockParticules5(704)).c("blockInvisible");
    public static final Block BLOCKPARTICULES6 = (new BlockParticules6(705)).c("blockInvisible");
    public static final Block BLOCKPARTICULES7 = (new BlockParticules7(706)).c("blockInvisible");
    public static final Block BLOCKPARTICULES8 = (new BlockParticules8(707)).c("blockInvisible");
    public static final Block BLOCKPARTICULES9 = (new BlockParticules9(708)).c("blockInvisible");
    public static final Block BLOCKPARTICULES10 = (new BlockParticules10(709)).c("blockInvisible");
    public static final Block BLOCKPARTICULES11 = (new BlockParticules11(710)).c("blockInvisible");
    public static final Block BLOCKPARTICULES12 = (new BlockParticules12(711)).c("blockInvisible");
    public static final Block BLOCKPARTICULES13 = (new BlockParticules13(712)).c("blockInvisible");
    public static final Block BLOCKPARTICULES14 = (new BlockParticules14(713)).c("blockInvisible");
    public static final Block BLOCKPARTICULES15 = (new BlockParticules15(714)).c("blockInvisible");
    public static final Block BLOCKPARTICULES16 = (new BlockParticules16(715)).c("blockInvisible");
    public static final Block BLOCKPARTICULES17 = (new BlockParticules17(716)).c("blockInvisible");
    public static final Block BLOCKPARTICULES18 = (new BlockParticules18(717)).c("blockInvisible");
    public static final Block BLOCKPARTICULES19 = (new BlockParticules19(718)).c("blockInvisible");
    
    public static final Block CHAIR = (new BlockChair(719, Material.WOOD).c("chaise"));
    public static final Block BANK = (new BlockBank(720, Material.WOOD).c("bank"));
    public static final Block TABLE = (new BlockTable(721, Material.WOOD).c("table"));
    
    public static final Block WOOD1 = (new Block(800, Material.WOOD)).c(2.0F).a(5.0F).a(g).c("wood_spruce");
    public static final Block WOOD2 = (new Block(801, Material.WOOD)).c(2.0F).a(5.0F).a(g).c("wood_birch");
    public static final Block WOOD3 = (new Block(802, Material.WOOD)).c(2.0F).a(5.0F).a(g).c("wood_jungle");

    /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    
    public final int id;
    protected float strength;
    protected float durability;
    protected boolean cC = true;
    protected boolean cD = true;
    protected boolean cE;
    protected boolean isTileEntity;
    protected double minX;
    protected double minY;
    protected double minZ;
    protected double maxX;
    protected double maxY;
    protected double maxZ;
    public StepSound stepSound;
    public float cN;
    public final Material material;
    public float frictionFactor;
    private String name;

    protected Block(int i, Material material) {
        this.stepSound = f;
        this.cN = 1.0F;
        this.frictionFactor = 0.6F;
        if (byId[i] != null) {
            throw new IllegalArgumentException("Slot " + i + " is already occupied by " + byId[i] + " when adding " + this);
        } else {
            this.material = material;
            byId[i] = this;
            this.id = i;
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            s[i] = this.c();
            lightBlock[i] = this.c() ? 255 : 0;
            u[i] = !material.blocksLight();
        }
    }

    protected void s_() {}

    protected Block a(StepSound stepsound) {
        this.stepSound = stepsound;
        return this;
    }

    protected Block k(int i) {
        lightBlock[this.id] = i;
        return this;
    }

    protected Block a(float f) {
        lightEmission[this.id] = (int) (15.0F * f);
        return this;
    }

    protected Block b(float f) {
        this.durability = f * 3.0F;
        return this;
    }

    public static boolean l(int i) {
        Block block = byId[i];

        return block == null ? false : block.material.k() && block.b() && !block.isPowerSource();
    }

    public boolean b() {
        return true;
    }

    public boolean b(IBlockAccess iblockaccess, int i, int j, int k) {
        return !this.material.isSolid();
    }

    public int d() {
        return 0;
    }

    protected Block c(float f) {
        this.strength = f;
        if (this.durability < f * 5.0F) {
            this.durability = f * 5.0F;
        }

        return this;
    }

    protected Block r() {
        this.c(-1.0F);
        return this;
    }

    public float l(World world, int i, int j, int k) {
        return this.strength;
    }

    protected Block b(boolean flag) {
        this.cE = flag;
        return this;
    }

    public boolean isTicking() {
        return this.cE;
    }

    public boolean t() {
        return this.isTileEntity;
    }

    protected final void a(float f, float f1, float f2, float f3, float f4, float f5) {
        this.minX = (double) f;
        this.minY = (double) f1;
        this.minZ = (double) f2;
        this.maxX = (double) f3;
        this.maxY = (double) f4;
        this.maxZ = (double) f5;
    }

    public boolean a_(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return iblockaccess.getMaterial(i, j, k).isBuildable();
    }

    public void a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, List list, Entity entity) {
        AxisAlignedBB axisalignedbb1 = this.b(world, i, j, k);

        if (axisalignedbb1 != null && axisalignedbb.a(axisalignedbb1)) {
            list.add(axisalignedbb1);
        }
    }

    public AxisAlignedBB b(World world, int i, int j, int k) {
        return AxisAlignedBB.a().a((double) i + this.minX, (double) j + this.minY, (double) k + this.minZ, (double) i + this.maxX, (double) j + this.maxY, (double) k + this.maxZ);
    }

    public boolean c() {
        return true;
    }

    public boolean a(int i, boolean flag) {
        return this.m();
    }

    public boolean m() {
        return true;
    }

    public void a(World world, int i, int j, int k, Random random) {}

    public void postBreak(World world, int i, int j, int k, int l) {}

    public void doPhysics(World world, int i, int j, int k, int l) {}

    public int a(World world) {
        return 10;
    }

    public void onPlace(World world, int i, int j, int k) {}

    public void remove(World world, int i, int j, int k, int l, int i1) {}

    public int a(Random random) {
        return 1;
    }

    public int getDropType(int i, Random random, int j) {
        return this.id;
    }

    public float getDamage(EntityHuman entityhuman, World world, int i, int j, int k) {
        float f = this.l(world, i, j, k);

        return f < 0.0F ? 0.0F : (!entityhuman.a(this) ? entityhuman.a(this, false) / f / 100.0F : entityhuman.a(this, true) / f / 30.0F);
    }

    public final void c(World world, int i, int j, int k, int l, int i1) {
        this.dropNaturally(world, i, j, k, l, 1.0F, i1);
    }

    public void dropNaturally(World world, int i, int j, int k, int l, float f, int i1) {
        if (!world.isStatic) {
            int j1 = this.getDropCount(i1, world.random);

            for (int k1 = 0; k1 < j1; ++k1) {
                // CraftBukkit - <= to < to allow for plugins to completely disable block drops from explosions
                if (world.random.nextFloat() < f) {
                    int l1 = this.getDropType(l, world.random, i1);

                    if (l1 > 0) {
                        this.b(world, i, j, k, new ItemStack(l1, 1, this.getDropData(l)));
                    }
                }
            }
        }
    }

    protected void b(World world, int i, int j, int k, ItemStack itemstack) {
        if (!world.isStatic && world.getGameRules().getBoolean("doTileDrops")) {
            float f = 0.7F;
            double d0 = (double) (world.random.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
            double d1 = (double) (world.random.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
            double d2 = (double) (world.random.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(world, (double) i + d0, (double) j + d1, (double) k + d2, itemstack);

            entityitem.pickupDelay = 10;
            world.addEntity(entityitem);
        }
    }

    protected void j(World world, int i, int j, int k, int l) {
        if (!world.isStatic) {
            while (l > 0) {
                int i1 = EntityExperienceOrb.getOrbValue(l);

                l -= i1;
                world.addEntity(new EntityExperienceOrb(world, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, i1));
            }
        }
    }

    public int getDropData(int i) {
        return 0;
    }

    public float a(Entity entity) {
        return this.durability / 5.0F;
    }

    public MovingObjectPosition a(World world, int i, int j, int k, Vec3D vec3d, Vec3D vec3d1) {
        this.updateShape(world, i, j, k);
        vec3d = vec3d.add((double) (-i), (double) (-j), (double) (-k));
        vec3d1 = vec3d1.add((double) (-i), (double) (-j), (double) (-k));
        Vec3D vec3d2 = vec3d.b(vec3d1, this.minX);
        Vec3D vec3d3 = vec3d.b(vec3d1, this.maxX);
        Vec3D vec3d4 = vec3d.c(vec3d1, this.minY);
        Vec3D vec3d5 = vec3d.c(vec3d1, this.maxY);
        Vec3D vec3d6 = vec3d.d(vec3d1, this.minZ);
        Vec3D vec3d7 = vec3d.d(vec3d1, this.maxZ);

        if (!this.a(vec3d2)) {
            vec3d2 = null;
        }

        if (!this.a(vec3d3)) {
            vec3d3 = null;
        }

        if (!this.b(vec3d4)) {
            vec3d4 = null;
        }

        if (!this.b(vec3d5)) {
            vec3d5 = null;
        }

        if (!this.c(vec3d6)) {
            vec3d6 = null;
        }

        if (!this.c(vec3d7)) {
            vec3d7 = null;
        }

        Vec3D vec3d8 = null;

        if (vec3d2 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d2) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d2;
        }

        if (vec3d3 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d3) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d3;
        }

        if (vec3d4 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d4) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d4;
        }

        if (vec3d5 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d5) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d5;
        }

        if (vec3d6 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d6) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d6;
        }

        if (vec3d7 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d7) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d7;
        }

        if (vec3d8 == null) {
            return null;
        } else {
            byte b0 = -1;

            if (vec3d8 == vec3d2) {
                b0 = 4;
            }

            if (vec3d8 == vec3d3) {
                b0 = 5;
            }

            if (vec3d8 == vec3d4) {
                b0 = 0;
            }

            if (vec3d8 == vec3d5) {
                b0 = 1;
            }

            if (vec3d8 == vec3d6) {
                b0 = 2;
            }

            if (vec3d8 == vec3d7) {
                b0 = 3;
            }

            return new MovingObjectPosition(i, j, k, b0, vec3d8.add((double) i, (double) j, (double) k));
        }
    }

    private boolean a(Vec3D vec3d) {
        return vec3d == null ? false : vec3d.d >= this.minY && vec3d.d <= this.maxY && vec3d.e >= this.minZ && vec3d.e <= this.maxZ;
    }

    private boolean b(Vec3D vec3d) {
        return vec3d == null ? false : vec3d.c >= this.minX && vec3d.c <= this.maxX && vec3d.e >= this.minZ && vec3d.e <= this.maxZ;
    }

    private boolean c(Vec3D vec3d) {
        return vec3d == null ? false : vec3d.c >= this.minX && vec3d.c <= this.maxX && vec3d.d >= this.minY && vec3d.d <= this.maxY;
    }

    public void wasExploded(World world, int i, int j, int k, Explosion explosion) {}

    public boolean canPlace(World world, int i, int j, int k, int l, ItemStack itemstack) {
        return this.canPlace(world, i, j, k, l);
    }

    public boolean canPlace(World world, int i, int j, int k, int l) {
        return this.canPlace(world, i, j, k);
    }

    public boolean canPlace(World world, int i, int j, int k) {
        int l = world.getTypeId(i, j, k);

        return l == 0 || byId[l].material.isReplaceable();
    }

    public boolean interact(World world, int i, int j, int k, EntityHuman entityhuman, int l, float f, float f1, float f2) {
        return false;
    }

    public void b(World world, int i, int j, int k, Entity entity) {}

    public int getPlacedData(World world, int i, int j, int k, int l, float f, float f1, float f2, int i1) {
        return i1;
    }

    public void attack(World world, int i, int j, int k, EntityHuman entityhuman) {}

    public void a(World world, int i, int j, int k, Entity entity, Vec3D vec3d) {}

    public void updateShape(IBlockAccess iblockaccess, int i, int j, int k) {}

    public final double u() {
        return this.minX;
    }

    public final double v() {
        return this.maxX;
    }

    public final double w() {
        return this.minY;
    }

    public final double x() {
        return this.maxY;
    }

    public final double y() {
        return this.minZ;
    }

    public final double z() {
        return this.maxZ;
    }

    public int b(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return 0;
    }

    public boolean isPowerSource() {
        return false;
    }

    public void a(World world, int i, int j, int k, Entity entity) {}

    public int c(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return 0;
    }

    public void g() {}

    public void a(World world, EntityHuman entityhuman, int i, int j, int k, int l) {
        entityhuman.a(StatisticList.C[this.id], 1);
        entityhuman.j(0.025F);
        if (this.r_() && EnchantmentManager.hasSilkTouchEnchantment(entityhuman)) {
            ItemStack itemstack = this.c_(l);

            if (itemstack != null) {
                this.b(world, i, j, k, itemstack);
            }
        } else {
            int i1 = EnchantmentManager.getBonusBlockLootEnchantmentLevel(entityhuman);

            this.c(world, i, j, k, l, i1);
        }
    }

    protected boolean r_() {
        return this.b() && !this.isTileEntity;
    }

    protected ItemStack c_(int i) {
        int j = 0;

        if (this.id >= 0 && this.id < Item.byId.length && Item.byId[this.id].m()) {
            j = i;
        }

        return new ItemStack(this.id, 1, j);
    }

    public int getDropCount(int i, Random random) {
        return this.a(random);
    }

    public boolean f(World world, int i, int j, int k) {
        return true;
    }

    public void postPlace(World world, int i, int j, int k, EntityLiving entityliving, ItemStack itemstack) {}

    public void postPlace(World world, int i, int j, int k, int l) {}

    public Block c(String s) {
        this.name = s;
        return this;
    }

    public String getName() {
        return LocaleI18n.get(this.a() + ".name");
    }

    public String a() {
        return "tile." + this.name;
    }

    public boolean b(World world, int i, int j, int k, int l, int i1) {
        return false;
    }

    public boolean C() {
        return this.cD;
    }

    protected Block D() {
        this.cD = false;
        return this;
    }

    public int h() {
        return this.material.getPushReaction();
    }

    public void a(World world, int i, int j, int k, Entity entity, float f) {}

    public int getDropData(World world, int i, int j, int k) {
        return this.getDropData(world.getData(i, j, k));
    }

    public Block a(CreativeModeTab creativemodetab) {
        this.creativeTab = creativemodetab;
        return this;
    }

    public void a(World world, int i, int j, int k, int l, EntityHuman entityhuman) {}

    public void l(World world, int i, int j, int k, int l) {}

    public void g(World world, int i, int j, int k) {}

    public boolean l() {
        return true;
    }

    public boolean a(Explosion explosion) {
        return true;
    }

    public boolean i(int i) {
        return this.id == i;
    }

    public static boolean b(int i, int j) {
        return i == j ? true : (i != 0 && j != 0 && byId[i] != null && byId[j] != null ? byId[i].i(j) : false);
    }

    public boolean q_() {
        return false;
    }

    public int b_(World world, int i, int j, int k, int l) {
        return 0;
    }

    static {
        Item.byId[WOOL.id] = (new ItemCloth(WOOL.id - 8192)).b("cloth");
        Item.byId[LOG.id] = (new ItemMultiTexture(LOG.id - 8192, LOG, BlockLog.a)).b("log");
        Item.byId[WOOD.id] = (new ItemMultiTexture(WOOD.id - 8192, WOOD, BlockWood.a)).b("wood");
        Item.byId[MONSTER_EGGS.id] = (new ItemMultiTexture(MONSTER_EGGS.id - 8192, MONSTER_EGGS, BlockMonsterEggs.a)).b("monsterStoneEgg");
        Item.byId[SMOOTH_BRICK.id] = (new ItemMultiTexture(SMOOTH_BRICK.id - 8192, SMOOTH_BRICK, BlockSmoothBrick.a)).b("stonebricksmooth");
        Item.byId[SANDSTONE.id] = (new ItemMultiTexture(SANDSTONE.id - 8192, SANDSTONE, BlockSandStone.a)).b("sandStone");
        Item.byId[QUARTZ_BLOCK.id] = (new ItemMultiTexture(QUARTZ_BLOCK.id - 8192, QUARTZ_BLOCK, BlockQuartz.a)).b("quartzBlock");
        Item.byId[STEP.id] = (new ItemStep(STEP.id - 8192, STEP, DOUBLE_STEP, false)).b("stoneSlab");
        Item.byId[DOUBLE_STEP.id] = (new ItemStep(DOUBLE_STEP.id - 8192, STEP, DOUBLE_STEP, true)).b("stoneSlab");
        Item.byId[WOOD_STEP.id] = (new ItemStep(WOOD_STEP.id - 8192, WOOD_STEP, WOOD_DOUBLE_STEP, false)).b("woodSlab");
        Item.byId[WOOD_DOUBLE_STEP.id] = (new ItemStep(WOOD_DOUBLE_STEP.id - 8192, WOOD_STEP, WOOD_DOUBLE_STEP, true)).b("woodSlab");
        Item.byId[SAPLING.id] = (new ItemMultiTexture(SAPLING.id - 8192, SAPLING, BlockSapling.a)).b("sapling");
        Item.byId[LEAVES.id] = (new ItemLeaves(LEAVES.id - 8192)).b("leaves");
        Item.byId[VINE.id] = new ItemWithAuxData(VINE.id - 8192, false);
        Item.byId[LONG_GRASS.id] = (new ItemWithAuxData(LONG_GRASS.id - 8192, true)).a(new String[] { "shrub", "grass", "fern"});
        Item.byId[SNOW.id] = new ItemSnow(SNOW.id - 8192, SNOW);
        Item.byId[WATER_LILY.id] = new ItemWaterLily(WATER_LILY.id - 8192);
        Item.byId[PISTON.id] = new ItemPiston(PISTON.id - 8192);
        Item.byId[PISTON_STICKY.id] = new ItemPiston(PISTON_STICKY.id - 8192);
        Item.byId[COBBLE_WALL.id] = (new ItemMultiTexture(COBBLE_WALL.id - 8192, COBBLE_WALL, BlockCobbleWall.a)).b("cobbleWall");
        Item.byId[ANVIL.id] = (new ItemAnvil(ANVIL)).b("anvil");
        // CraftBukkit start
        Item.byId[BIG_MUSHROOM_1.id] = new ItemWithAuxData(BIG_MUSHROOM_1.id - 8192, true);
        Item.byId[BIG_MUSHROOM_2.id] = new ItemWithAuxData(BIG_MUSHROOM_2.id - 8192, true);
        Item.byId[MOB_SPAWNER.id] = new ItemWithAuxData(MOB_SPAWNER.id - 8192, true);
        
        /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        Item.byId[BLOCKVERRECOLORED.id] = (new ItemCloth(BLOCKVERRECOLORED.id - 8192)).b("blockVerreColored");
        Item.byId[TAPISLAINE.id] = (new ItemCloth(TAPISLAINE.id - 8192)).b("tapisLaine");
        Item.byId[TAPISVERRE.id] = (new ItemCloth(TAPISVERRE.id - 8192)).b("tapisVerre");
        Item.byId[CAISSEBOIS.id] = (new ItemCloth(CAISSEBOIS.id - 8192)).b("caisseBois");
        Item.byId[STONEBRICK2.id] = (new ItemCloth(STONEBRICK2.id - 8192)).b("stoneBrick2");
        Item.byId[STONEBRICK3.id] = (new ItemCloth(STONEBRICK3.id - 8192)).b("stoneBrick3");
        Item.byId[CHAIR.id] = (new ItemMultiTexture(CHAIR.id - 8192, CHAIR, BlockFurnitureAbstract.b)).b("cobbleWall");
        Item.byId[TABLE.id] = (new ItemMultiTexture(TABLE.id - 8192, TABLE, BlockFurnitureAbstract.b)).b("cobbleWall");
        Item.byId[BANK.id] = (new ItemMultiTexture(BANK.id - 8192, BANK, BlockFurnitureAbstract.b)).b("cobbleWall");
        /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        
        // CraftBukkit end

        for (int i = 0; i < 8192; ++i) {
            if (byId[i] != null) {
                if (Item.byId[i] == null) {
                    Item.byId[i] = new ItemBlock(i - 8192);
                    byId[i].s_();
                }

                boolean flag = false;

                if (i > 0 && byId[i].d() == 10) {
                    flag = true;
                }

                if (i > 0 && byId[i] instanceof BlockStepAbstract) {
                    flag = true;
                }

                if (i == SOIL.id) {
                    flag = true;
                }

                if (u[i]) {
                    flag = true;
                }

                if (lightBlock[i] == 0) {
                    flag = true;
                }

                w[i] = flag;
            }
        }

        u[0] = true;
        StatisticList.b();
    }

    // CraftBukkit start
    public int getExpDrop(World world, int data, int enchantmentLevel) {
        return 0;
    }
    // CraftBukkit end
}
