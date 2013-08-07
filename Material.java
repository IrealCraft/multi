
package org.bukkit;

import java.lang.reflect.Constructor;
import java.util.Map;

import net.minecraft.server.Block;
import net.minecraft.server.BlockStairs;

import org.apache.commons.lang.Validate;
import org.bukkit.map.MapView;
import org.bukkit.material.Bed;
import org.bukkit.material.Button;
import org.bukkit.material.Cake;
import org.bukkit.material.Cauldron;
import org.bukkit.material.Chest;
import org.bukkit.material.Coal;
import org.bukkit.material.CocoaPlant;
import org.bukkit.material.Command;
import org.bukkit.material.Crops;
import org.bukkit.material.DetectorRail;
import org.bukkit.material.Diode;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.Dispenser;
import org.bukkit.material.Door;
import org.bukkit.material.Dye;
import org.bukkit.material.EnderChest;
import org.bukkit.material.FlowerPot;
import org.bukkit.material.Furnace;
import org.bukkit.material.Gate;
import org.bukkit.material.Ladder;
import org.bukkit.material.Lever;
import org.bukkit.material.LongGrass;
import org.bukkit.material.MaterialData;
import org.bukkit.material.MonsterEggs;
import org.bukkit.material.Mushroom;
import org.bukkit.material.NetherWarts;
import org.bukkit.material.PistonBaseMaterial;
import org.bukkit.material.PistonExtensionMaterial;
import org.bukkit.material.PoweredRail;
import org.bukkit.material.PressurePlate;
import org.bukkit.material.Pumpkin;
import org.bukkit.material.Rails;
import org.bukkit.material.RedstoneTorch;
import org.bukkit.material.RedstoneWire;
import org.bukkit.material.Sandstone;
import org.bukkit.material.Sign;
import org.bukkit.material.Skull;
import org.bukkit.material.SmoothBrick;
import org.bukkit.material.SpawnEgg;
import org.bukkit.material.Stairs;
import org.bukkit.material.Step;
import org.bukkit.material.Torch;
import org.bukkit.material.TrapDoor;
import org.bukkit.material.Tree;
import org.bukkit.material.Tripwire;
import org.bukkit.material.TripwireHook;
import org.bukkit.material.Vine;
import org.bukkit.material.WoodenStep;
import org.bukkit.material.Wool;
import org.bukkit.potion.Potion;
import org.bukkit.util.Java15Compat;

import com.google.common.collect.Maps;
import net.minecraft.server.Item;

/**
 * An enum of all material ids accepted by the official server + client
 */
public enum Material {
    AIR(0, 0),
    STONE(1),
    GRASS(2),
    DIRT(3),
    COBBLESTONE(4),
    WOOD(5, Tree.class),
    SAPLING(6, Tree.class),
    BEDROCK(7),
    WATER(8, MaterialData.class),
    STATIONARY_WATER(9, MaterialData.class),
    LAVA(10, MaterialData.class),
    STATIONARY_LAVA(11, MaterialData.class),
    SAND(12),
    GRAVEL(13),
    GOLD_ORE(14),
    IRON_ORE(15),
    COAL_ORE(16),
    LOG(17, Tree.class),
    LEAVES(18, Tree.class),
    SPONGE(19),
    GLASS(20),
    LAPIS_ORE(21),
    LAPIS_BLOCK(22),
    DISPENSER(23, Dispenser.class),
    SANDSTONE(24, Sandstone.class),
    NOTE_BLOCK(25),
    BED_BLOCK(26, Bed.class),
    POWERED_RAIL(27, PoweredRail.class),
    DETECTOR_RAIL(28, DetectorRail.class),
    PISTON_STICKY_BASE(29, PistonBaseMaterial.class),
    WEB(30),
    LONG_GRASS(31, LongGrass.class),
    DEAD_BUSH(32),
    PISTON_BASE(33, PistonBaseMaterial.class),
    PISTON_EXTENSION(34, PistonExtensionMaterial.class),
    WOOL(35, Wool.class),
    PISTON_MOVING_PIECE(36),
    YELLOW_FLOWER(37),
    RED_ROSE(38),
    BROWN_MUSHROOM(39),
    RED_MUSHROOM(40),
    GOLD_BLOCK(41),
    IRON_BLOCK(42),
    DOUBLE_STEP(43, Step.class),
    STEP(44, Step.class),
    BRICK(45),
    TNT(46),
    BOOKSHELF(47),
    MOSSY_COBBLESTONE(48),
    OBSIDIAN(49),
    TORCH(50, Torch.class),
    FIRE(51),
    MOB_SPAWNER(52),
    WOOD_STAIRS(53, Stairs.class),
    CHEST(54, Chest.class),
    REDSTONE_WIRE(55, RedstoneWire.class),
    DIAMOND_ORE(56),
    DIAMOND_BLOCK(57),
    WORKBENCH(58),
    CROPS(59, Crops.class),
    SOIL(60, MaterialData.class),
    FURNACE(61, Furnace.class),
    BURNING_FURNACE(62, Furnace.class),
    SIGN_POST(63, 64, Sign.class),
    WOODEN_DOOR(64, Door.class),
    LADDER(65, Ladder.class),
    RAILS(66, Rails.class),
    COBBLESTONE_STAIRS(67, Stairs.class),
    WALL_SIGN(68, 64, Sign.class),
    LEVER(69, Lever.class),
    STONE_PLATE(70, PressurePlate.class),
    IRON_DOOR_BLOCK(71, Door.class),
    WOOD_PLATE(72, PressurePlate.class),
    REDSTONE_ORE(73),
    GLOWING_REDSTONE_ORE(74),
    REDSTONE_TORCH_OFF(75, RedstoneTorch.class),
    REDSTONE_TORCH_ON(76, RedstoneTorch.class),
    STONE_BUTTON(77, Button.class),
    SNOW(78),
    ICE(79),
    SNOW_BLOCK(80),
    CACTUS(81, MaterialData.class),
    CLAY(82),
    SUGAR_CANE_BLOCK(83, MaterialData.class),
    JUKEBOX(84),
    FENCE(85),
    PUMPKIN(86, Pumpkin.class),
    NETHERRACK(87),
    SOUL_SAND(88),
    GLOWSTONE(89),
    PORTAL(90),
    JACK_O_LANTERN(91, Pumpkin.class),
    CAKE_BLOCK(92, 64, Cake.class),
    DIODE_BLOCK_OFF(93, Diode.class),
    DIODE_BLOCK_ON(94, Diode.class),
    LOCKED_CHEST(95),
    TRAP_DOOR(96, TrapDoor.class),
    MONSTER_EGGS(97, MonsterEggs.class),
    SMOOTH_BRICK(98, SmoothBrick.class),
    HUGE_MUSHROOM_1(99, Mushroom.class),
    HUGE_MUSHROOM_2(100, Mushroom.class),
    IRON_FENCE(101),
    THIN_GLASS(102),
    MELON_BLOCK(103),
    PUMPKIN_STEM(104, MaterialData.class),
    MELON_STEM(105, MaterialData.class),
    VINE(106, Vine.class),
    FENCE_GATE(107, Gate.class),
    BRICK_STAIRS(108, Stairs.class),
    SMOOTH_STAIRS(109, Stairs.class),
    MYCEL(110),
    WATER_LILY(111),
    NETHER_BRICK(112),
    NETHER_FENCE(113),
    NETHER_BRICK_STAIRS(114, Stairs.class),
    NETHER_WARTS(115, NetherWarts.class),
    ENCHANTMENT_TABLE(116),
    BREWING_STAND(117, MaterialData.class),
    CAULDRON(118, Cauldron.class),
    ENDER_PORTAL(119),
    ENDER_PORTAL_FRAME(120),
    ENDER_STONE(121),
    DRAGON_EGG(122),
    REDSTONE_LAMP_OFF(123),
    REDSTONE_LAMP_ON(124),
    WOOD_DOUBLE_STEP(125, WoodenStep.class),
    WOOD_STEP(126, WoodenStep.class),
    COCOA(127, CocoaPlant.class),
    SANDSTONE_STAIRS(128, Stairs.class),
    EMERALD_ORE(129),
    ENDER_CHEST(130, EnderChest.class),
    TRIPWIRE_HOOK(131, TripwireHook.class),
    TRIPWIRE(132, Tripwire.class),
    EMERALD_BLOCK(133),
    SPRUCE_WOOD_STAIRS(134, Stairs.class),
    BIRCH_WOOD_STAIRS(135, Stairs.class),
    JUNGLE_WOOD_STAIRS(136, Stairs.class),
    COMMAND(137, Command.class),
    BEACON(138),
    COBBLE_WALL(139),
    FLOWER_POT(140, FlowerPot.class),
    CARROT(141),
    POTATO(142),
    WOOD_BUTTON(143, Button.class),
    SKULL(144, Skull.class),
    ANVIL(145),
    TRAPPED_CHEST(146),
    GOLD_PLATE(147),
    IRON_PLATE(148),
    REDSTONE_COMPARATOR_OFF(149),
    REDSTONE_COMPARATOR_ON(150),
    DAYLIGHT_DETECTOR(151),
    REDSTONE_BLOCK(152),
    QUARTZ_ORE(153),
    HOPPER(154),
    QUARTZ_BLOCK(155),
    QUARTZ_STAIRS(156, Stairs.class),
    ACTIVATOR_RAIL(157, PoweredRail.class),
    DROPPER(158, Dispenser.class),
    
    /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    BLOCKCUIVRE(500),
    BLOCKCITRINE(501),
    BLOCKSAPHIR(502),
    BLOCKRUBIS(503),
    BLOCKEMERAUDE(504),
    ORECUIVRE(505),
    ORECITRINE(506),
    OREEMERAUDE(507),
    ORESAPHIR(508),
    ORERUBIS(509),
    BLOCKVERRECOLORED(510),
    TAPISLAINE(511),
    TAPISVERRE(512),

    STAIRSVERREWHITE(513),
    STAIRSVERREORANGE(514),
    STAIRSVERREMAGENTA(515),
    STAIRSVERRESKYBLUE(516),
    STAIRSVERREYELLOW(517),
    STAIRSVERREGREEN(518),
    STAIRSVERREPINK(519),
    STAIRSVERREDARKGREY(520),
    STAIRSVERRELIGHTGREY(521),
    STAIRSVERRECYAN(522),
    STAIRSVERREPURPLE(523),
    STAIRSVERREDARKBLUE(524),
    STAIRSVERREBROWN(525),
    STAIRSVERREDARKGREEN(526),
    STAIRSVERRERED(527),
    STAIRSVERREBLACK(528),
    
    STAIRSLAINEWHITE(529, Stairs.class),
    STAIRSLAINEORANGE(530, Stairs.class),
    STAIRSLAINEMAGENTA(531, Stairs.class),
    STAIRSLAINESKYBLUE(532, Stairs.class),
    STAIRSLAINEYELLOW(533, Stairs.class),
    STAIRSLAINEGREEN(534, Stairs.class),
    STAIRSLAINEPINK(535, Stairs.class),
    STAIRSLAINEDARKGREY(536, Stairs.class),
    STAIRSLAINELIGHTGREY(537, Stairs.class),
    STAIRSLAINECYAN(538, Stairs.class),
    STAIRSLAINEPURPLE(539, Stairs.class),
    STAIRSLAINEDARKBLUE(540, Stairs.class),
    STAIRSLAINEBROWN(541, Stairs.class),
    STAIRSLAINEDARKGREEN(542, Stairs.class),
    STAIRSLAINERED(543, Stairs.class),
    STAIRSLAINEBLACK(544, Stairs.class),
    LANTERNE1(545),
    LANTERNE2(546),
    LANTERNE3(547),
    LANTERNE4(548),
    LANTERNE5(549),
    LANTERNE6(550),
    LANTERNE7(551),
    LANTERNE8(552),
    STAIRSSTONE(553),
    STAIRSDIRT(554),
    STAIRSBEDROCK(555),
    STAIRSLOG(556),
    STAIRSBLOCKGOLD(557),
    STAIRSBLOCKIRON(558),
    STAIRSCOBBLESTONEMOSSY(559),
    STAIRSOBSIDIAN(560),
    STAIRSBLOCKDIAMOND(561),
    STAIRSBLOCKSNOW(562),
    STAIRSBLOCKCLAY(563),
    STAIRSSLOWSAND(564),
    STAIRSBLOCKEMERALD(565),
    STAIRSBLOCKCUIVRE(566),
    STAIRSBLOCKCITRINE(567),
    STAIRSBLOCKEMERAUDE(568),
    STAIRSBLOCKSAPHIR(569),
    STAIRSBLOCKRUBIS(570),
    CAISSEBOIS(571),
    STONEBRICK2(572),
    STONEBRICK3(573),
    
    BIBLIOTHEQUES1(574),
    BIBLIOTHEQUES2(575),
    BIBLIOTHEQUES3(576),
    BIBLIOTHEQUES4(577),
    BIBLIOTHEQUES5(578),
    BIBLIOTHEQUES6(579),
    BIBLIOTHEQUES7(580),
    BIBLIOTHEQUES8(581),
    BIBLIOTHEQUES9(582),
    BIBLIOTHEQUES10(583),
    BIBLIOTHEQUES11(584),
    BIBLIOTHEQUES12(585),
    BIBLIOTHEQUES13(586),
    BIBLIOTHEQUES14(587),
    BIBLIOTHEQUES15(588),
    BIBLIOTHEQUES16(589),
    BIBLIOTHEQUES17(590),
    BIBLIOTHEQUES18(591),
    BIBLIOTHEQUES19(592),
    BIBLIOTHEQUES20(593),
    BIBLIOTHEQUES21(594),
    BIBLIOTHEQUES22(595),
    BIBLIOTHEQUES23(596),
    BIBLIOTHEQUES24(597),
    BIBLIOTHEQUES25(598),
    BIBLIOTHEQUES26(599),
    BIBLIOTHEQUES27(600),
    BIBLIOTHEQUES28(601),
    BIBLIOTHEQUES29(602),
    BIBLIOTHEQUES30(603),
    BIBLIOTHEQUES31(604),
    BIBLIOTHEQUES32(605),
    BIBLIOTHEQUES33(606),
    BIBLIOTHEQUES34(607),
    BIBLIOTHEQUES35(608),
    BIBLIOTHEQUES36(609),
    BIBLIOTHEQUES37(610),
    BIBLIOTHEQUES38(611),
    BIBLIOTHEQUES39(612),
    BIBLIOTHEQUES40(613),
    BIBLIOTHEQUES41(614),
    BIBLIOTHEQUES42(615),
    BIBLIOTHEQUES43(616),
    BIBLIOTHEQUES44(617),
    BIBLIOTHEQUES45(618),
    BIBLIOTHEQUES46(619),
    BIBLIOTHEQUES47(620),
    BIBLIOTHEQUES48(621),
    BIBLIOTHEQUES49(622),
    BIBLIOTHEQUES50(623),
    BIBLIOTHEQUES51(624),
    BIBLIOTHEQUES52(625),
    BIBLIOTHEQUES53(626),
    BIBLIOTHEQUES54(627),
    BIBLIOTHEQUES55(628),
    BIBLIOTHEQUES56(629),
    BIBLIOTHEQUES57(630),
    BIBLIOTHEQUES58(631),
    BIBLIOTHEQUES59(632),
    BIBLIOTHEQUES60(633),
    
    TRAPPEACIER(634, TrapDoor.class),
    
    BLOCKPARTICULES1(700),
    BLOCKPARTICULES2(701),
    BLOCKPARTICULES3(702),
    BLOCKPARTICULES4(703),
    BLOCKPARTICULES5(704),
    BLOCKPARTICULES6(705),
    BLOCKPARTICULES7(706),
    BLOCKPARTICULES8(707),
    BLOCKPARTICULES9(708),
    BLOCKPARTICULES10(709),
    BLOCKPARTICULES11(710),
    BLOCKPARTICULES12(711),
    BLOCKPARTICULES13(712),
    BLOCKPARTICULES14(713),
    BLOCKPARTICULES15(714),
    BLOCKPARTICULES16(715),
    BLOCKPARTICULES17(716),
    BLOCKPARTICULES18(717),
    BLOCKPARTICULES19(718),
    
    CHAIR(719),
    BANK(720),
    TABLE(721),
    
    WOOD1(800),
    WOOD2(801),
    WOOD3(802),
    /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    
    
    
    // ----- Item Separator -----
    IRON_SPADE(8192, 1, 250),
    IRON_PICKAXE(8193, 1, 250),
    IRON_AXE(8194, 1, 250),
    FLINT_AND_STEEL(8195, 1, 64),
    APPLE(8196),
    BOW(8197, 1, 384),
    ARROW(8198),
    COAL(8199, Coal.class),
    DIAMOND(8200),
    IRON_INGOT(8201),
    GOLD_INGOT(8202),
    IRON_SWORD(8203, 1, 250),
    WOOD_SWORD(8204, 1, 59),
    WOOD_SPADE(8205, 1, 59),
    WOOD_PICKAXE(8206, 1, 59),
    WOOD_AXE(8207, 1, 59),
    STONE_SWORD(8208, 1, 131),
    STONE_SPADE(8209, 1, 131),
    STONE_PICKAXE(8210, 1, 131),
    STONE_AXE(8211, 1, 131),
    DIAMOND_SWORD(8212, 1, 1561),
    DIAMOND_SPADE(8213, 1, 1561),
    DIAMOND_PICKAXE(8214, 1, 1561),
    DIAMOND_AXE(8215, 1, 1561),
    STICK(8216),
    BOWL(8217),
    MUSHROOM_SOUP(8218, 1),
    GOLD_SWORD(8219, 1, 32),
    GOLD_SPADE(8220, 1, 32),
    GOLD_PICKAXE(8221, 1, 32),
    GOLD_AXE(8222, 1, 32),
    STRING(8223),
    FEATHER(8224),
    SULPHUR(8225),
    WOOD_HOE(8226, 1, 59),
    STONE_HOE(8227, 1, 131),
    IRON_HOE(8228, 1, 250),
    DIAMOND_HOE(8229, 1, 1561),
    GOLD_HOE(8230, 1, 32),
    SEEDS(8231),
    WHEAT(8232),
    BREAD(8233),
    LEATHER_HELMET(8234, 1, 55),
    LEATHER_CHESTPLATE(8235, 1, 80),
    LEATHER_LEGGINGS(8236, 1, 75),
    LEATHER_BOOTS(8237, 1, 65),
    CHAINMAIL_HELMET(8238, 1, 165),
    CHAINMAIL_CHESTPLATE(8239, 1, 240),
    CHAINMAIL_LEGGINGS(8240, 1, 225),
    CHAINMAIL_BOOTS(8241, 1, 195),
    IRON_HELMET(8242, 1, 165),
    IRON_CHESTPLATE(8243, 1, 240),
    IRON_LEGGINGS(8244, 1, 225),
    IRON_BOOTS(8245, 1, 195),
    DIAMOND_HELMET(8246, 1, 363),
    DIAMOND_CHESTPLATE(8247, 1, 528),
    DIAMOND_LEGGINGS(8248, 1, 495),
    DIAMOND_BOOTS(8249, 1, 429),
    GOLD_HELMET(8250, 1, 77),
    GOLD_CHESTPLATE(8251, 1, 112),
    GOLD_LEGGINGS(8252, 1, 105),
    GOLD_BOOTS(8253, 1, 91),
    FLINT(8254),
    PORK(8255),
    GRILLED_PORK(8256),
    PAINTING(8257),
    GOLDEN_APPLE(8258),
    SIGN(8259, 16),
    WOOD_DOOR(8260, 1),
    BUCKET(8261, 16),
    WATER_BUCKET(8262, 1),
    LAVA_BUCKET(8263, 1),
    MINECART(8264, 1),
    SADDLE(8265, 1),
    IRON_DOOR(8266, 1),
    REDSTONE(8267),
    SNOW_BALL(8268, 16),
    BOAT(8269, 1),
    LEATHER(8270),
    MILK_BUCKET(8271, 1),
    CLAY_BRICK(8272),
    CLAY_BALL(8273),
    SUGAR_CANE(8274),
    PAPER(8275),
    BOOK(8276),
    SLIME_BALL(8277),
    STORAGE_MINECART(8278, 1),
    POWERED_MINECART(8279, 1),
    EGG(8280, 16),
    COMPASS(8281),
    FISHING_ROD(8282, 1, 64),
    WATCH(8283),
    GLOWSTONE_DUST(8284),
    RAW_FISH(8285),
    COOKED_FISH(8286),
    INK_SACK(8287, Dye.class),
    BONE(8288),
    SUGAR(8289),
    CAKE(8290, 1),
    BED(8291, 1),
    DIODE(8292),
    COOKIE(8293),
    /**
     * @see MapView
     */
    MAP(8294, MaterialData.class),
    SHEARS(8295, 1, 238),
    MELON(8296),
    PUMPKIN_SEEDS(8297),
    MELON_SEEDS(8298),
    RAW_BEEF(8299),
    COOKED_BEEF(8300),
    RAW_CHICKEN(8301),
    COOKED_CHICKEN(8302),
    ROTTEN_FLESH(8303),
    ENDER_PEARL(8304, 16),
    BLAZE_ROD(8305),
    GHAST_TEAR(8306),
    GOLD_NUGGET(8307),
    NETHER_STALK(8308),
    /**
     * @see Potion
     */
    POTION(8309, 1, MaterialData.class),
    GLASS_BOTTLE(8310),
    SPIDER_EYE(8311),
    FERMENTED_SPIDER_EYE(8312),
    BLAZE_POWDER(8313),
    MAGMA_CREAM(8314),
    BREWING_STAND_ITEM(8315),
    CAULDRON_ITEM(8316),
    EYE_OF_ENDER(8317),
    SPECKLED_MELON(8318),
    MONSTER_EGG(8319, 64, SpawnEgg.class),
    EXP_BOTTLE(8320, 64),
    FIREBALL(8321, 64),
    BOOK_AND_QUILL(8322, 1),
    WRITTEN_BOOK(8323, 1),
    EMERALD(8324, 64),
    ITEM_FRAME(8325),
    FLOWER_POT_ITEM(8326),
    CARROT_ITEM(8327),
    POTATO_ITEM(8328),
    BAKED_POTATO(8329),
    POISONOUS_POTATO(8330),
    EMPTY_MAP(8331),
    GOLDEN_CARROT(8332),
    SKULL_ITEM(8333),
    CARROT_STICK(8334, 1, 25),
    NETHER_STAR(8335),
    PUMPKIN_PIE(8336),
    FIREWORK(8337),
    FIREWORK_CHARGE(8338),
    ENCHANTED_BOOK(8339, 1),
    REDSTONE_COMPARATOR(8340),
    NETHER_BRICK_ITEM(8341),
    QUARTZ(8342),
    EXPLOSIVE_MINECART(8343, 1),
    HOPPER_MINECART(8344, 1),
    GOLD_RECORD(10192, 1),
    GREEN_RECORD(10193, 1),
    RECORD_3(10194, 1),
    RECORD_4(10195, 1),
    RECORD_5(10196, 1),
    RECORD_6(10197, 1),
    RECORD_7(10198, 1),
    RECORD_8(10199, 1),
    RECORD_9(10200, 1),
    RECORD_10(10201, 1),
    RECORD_11(10202, 1),
    RECORD_12(10203, 1),

    /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    CUIVRE(8692),
    CITRINE(8693),
    EMERAUDE(8694),
    SAPHIR(8695),
    RUBIS(8696),
    BATONFER(8697),
    
    HELMETCUIVRE(8698, 1, Item.HELMETCUIVRE.getMaxDurability()),
    PLATECUIVRE(8699, 1, Item.PLATECUIVRE.getMaxDurability()),
    LEGSCUIVRE(8700, 1, Item.LEGSCUIVRE.getMaxDurability()),
    BOOTSCUIVRE(8701, 1, Item.BOOTSCUIVRE.getMaxDurability()),
    
    HELMETCITRINE(8702, 1, Item.HELMETCITRINE.getMaxDurability()),
    PLATECITRINE(8703, 1, Item.PLATECITRINE.getMaxDurability()),
    LEGSCITRINE(8704, 1, Item.LEGSCITRINE.getMaxDurability()),
    BOOTSCITRINE(8705, 1, Item.BOOTSCITRINE.getMaxDurability()),
    
    HELMETEMERAUDE(8706, 1, Item.HELMETEMERAUDE.getMaxDurability()),
    PLATEEMERAUDE(8707, 1, Item.PLATEEMERAUDE.getMaxDurability()),
    LEGSEMERAUDE(8708, 1, Item.LEGSEMERAUDE.getMaxDurability()),
    BOOTSEMERAUDE(8709, 1, Item.BOOTSEMERAUDE.getMaxDurability()),
    
    HELMETSAPHIR(8710, 1, Item.HELMETSAPHIR.getMaxDurability()),
    PLATESAPHIR(8711, 1, Item.PLATESAPHIR.getMaxDurability()),
    LEGSSAPHIR(8712, 1, Item.LEGSSAPHIR.getMaxDurability()),
    BOOTSSAPHIR(8713, 1, Item.BOOTSSAPHIR.getMaxDurability()),
    
    HELMETRUBIS(8714, 1, Item.HELMETRUBIS.getMaxDurability()),
    PLATERUBIS(8715, 1, Item.PLATERUBIS.getMaxDurability()),
    LEGSRUBIS(8716, 1, Item.LEGSRUBIS.getMaxDurability()),
    BOOTSRUBIS(8717, 1, Item.BOOTSRUBIS.getMaxDurability()),
    
    HELMETDIABLE(8718, 1, Item.HELMETDIABLE.getMaxDurability()),
    PLATEDIABLE(8719, 1, Item.PLATEDIABLE.getMaxDurability()),
    LEGSDIABLE(8720, 1, Item.LEGSDIABLE.getMaxDurability()),
    BOOTSDIABLE(8721, 1, Item.BOOTSDIABLE.getMaxDurability()),
    
    HELMETLEGENDAIRE(8722, 1, Item.HELMETLEGENDAIRE.getMaxDurability()),
    PLATELEGENDAIRE(8723, 1, Item.PLATELEGENDAIRE.getMaxDurability()),
    LEGSLEGENDAIRE(8724, 1, Item.LEGSLEGENDAIRE.getMaxDurability()),
    BOOTSLEGENDAIRE(8725, 1, Item.BOOTSLEGENDAIRE.getMaxDurability()),
    
    SWORDCUIVRE(8726, 1, Item.SWORDCUIVRE.getMaxDurability()),
    SHOVELCUIVRE(8727, 1, Item.SHOVELCUIVRE.getMaxDurability()),
    PICKAXECUIVRE(8728, 1, Item.PICKAXECUIVRE.getMaxDurability()),
    AXECUIVRE(8729, 1, Item.AXECUIVRE.getMaxDurability()),
    HOECUIVRE(8730, 1, Item.HOECUIVRE.getMaxDurability()),
        
    SWORDCITRINE(8731, 1, Item.SWORDCITRINE.getMaxDurability()),
    SHOVELCITRINE(8732, 1, Item.SHOVELCITRINE.getMaxDurability()),
    PICKAXECITRINE(8733, 1, Item.PICKAXECITRINE.getMaxDurability()),
    AXECITRINE(8734, 1, Item.AXECITRINE.getMaxDurability()),
    HOECITRINE(8735, 1, Item.HOECITRINE.getMaxDurability()),
        
    SWORDEMERAUDE(8736, 1, Item.SWORDEMERAUDE.getMaxDurability()),
    SHOVELEMERAUDE(8737, 1, Item.SHOVELEMERAUDE.getMaxDurability()),
    PICKAXEEMERAUDE(8738, 1, Item.PICKAXEEMERAUDE.getMaxDurability()),
    AXEEMERAUDE(8739, 1, Item.AXEEMERAUDE.getMaxDurability()),
    HOEEMERAUDE(8740, 1, Item.HOEEMERAUDE.getMaxDurability()),
        
    SWORDSAPHIR(8741, 1, Item.SWORDSAPHIR.getMaxDurability()),
    SHOVELSAPHIR(8742, 1, Item.SHOVELSAPHIR.getMaxDurability()),
    PICKAXESAPHIR(8743, 1, Item.PICKAXESAPHIR.getMaxDurability()),
    AXESAPHIR(8744, 1, Item.AXESAPHIR.getMaxDurability()),
    HOESAPHIR(8745, 1, Item.HOESAPHIR.getMaxDurability()),
        
    SWORDRUBIS(8746, 1, Item.SWORDRUBIS.getMaxDurability()),
    SHOVELRUBIS(8747, 1, Item.SHOVELRUBIS.getMaxDurability()),
    PICKAXERUBIS(8748, 1, Item.PICKAXERUBIS.getMaxDurability()),
    AXERUBIS(8749, 1, Item.AXERUBIS.getMaxDurability()),
    HOERUBIS(8750, 1, Item.HOERUBIS.getMaxDurability()),
        
    SWORDDIABLE(8751, 1, Item.SWORDDIABLE.getMaxDurability()),
    SHOVELDIABLE(8752, 1, Item.SHOVELDIABLE.getMaxDurability()),
    PICKAXEDIABLE(8753, 1, Item.PICKAXEDIABLE.getMaxDurability()),
    AXEDIABLE(8754, 1, Item.AXEDIABLE.getMaxDurability()),
    HOEDIABLE(8755, 1, Item.HOEDIABLE.getMaxDurability()),
    
    SWORDLEGENDAIRE(8756, 1, Item.SWORDLEGENDAIRE.getMaxDurability()),
    SHOVELLEGENDAIRE(8757, 1, Item.SHOVELLEGENDAIRE.getMaxDurability()),
    PICKAXELEGENDAIRE(8758, 1, Item.PICKAXELEGENDAIRE.getMaxDurability()),
    AXELEGENDAIRE(8759, 1, Item.AXELEGENDAIRE.getMaxDurability()),
    HOELEGENDAIRE(8760, 1, Item.HOELEGENDAIRE.getMaxDurability()),

    BIEREVIDE(8992),
    BIEREPLEINE(8993, 1),
    FRAGMENTLEGENDAIRE(9092),
    FRAGMENTDIABLE(9093);
    /**-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    
    private final int id;
    private final Constructor<? extends MaterialData> ctor;
    private static Material[] byId = new Material[383];
    private final static Map<String, Material> BY_NAME = Maps.newHashMap();
    private final int maxStack;
    private final short durability;

    private Material(final int id) {
        this(id, 64);
    }

    private Material(final int id, final int stack) {
        this(id, stack, MaterialData.class);
    }

    private Material(final int id, final int stack, final int durability) {
        this(id, stack, durability, MaterialData.class);
    }

    private Material(final int id, final Class<? extends MaterialData> data) {
        this(id, 64, data);
    }

    private Material(final int id, final int stack, final Class<? extends MaterialData> data) {
        this(id, stack, 0, data);
    }

    private Material(final int id, final int stack, final int durability, final Class<? extends MaterialData> data) {
        this.id = id;
        this.durability = (short) durability;
        this.maxStack = stack;
        // try to cache the constructor for this material
        try {
            this.ctor = data.getConstructor(int.class, byte.class);
        } catch (NoSuchMethodException ex) {
            throw new AssertionError(ex);
        } catch (SecurityException ex) {
            throw new AssertionError(ex);
        }
    }

    /**
     * Gets the item ID or block ID of this Material
     *
     * @return ID of this material
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the maximum amount of this material that can be held in a stack
     *
     * @return Maximum stack size for this material
     */
    public int getMaxStackSize() {
        return maxStack;
    }

    /**
     * Gets the maximum durability of this material
     *
     * @return Maximum durability for this material
     */
    public short getMaxDurability() {
        return durability;
    }

    /**
     * Gets the MaterialData class associated with this Material
     *
     * @return MaterialData associated with this Material
     */
    public Class<? extends MaterialData> getData() {
        return ctor.getDeclaringClass();
    }

    /**
     * Constructs a new MaterialData relevant for this Material, with the given
     * initial data
     *
     * @param raw Initial data to construct the MaterialData with
     * @return New MaterialData with the given data
     */
    public MaterialData getNewData(final byte raw) {
        try {
            return ctor.newInstance(id, raw);
        } catch (InstantiationException ex) {
            final Throwable t = ex.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
            throw new AssertionError(t);
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    /**
     * Checks if this Material is a placable block
     *
     * @return true if this material is a block
     */
    public boolean isBlock() {
        return id < 8192;
    }

    /**
     * Checks if this Material is edible.
     *
     * @return true if this Material is edible.
     */
    public boolean isEdible() {
        switch (this) {
            case BREAD:
            case CARROT_ITEM:
            case BAKED_POTATO:
            case POTATO_ITEM:
            case POISONOUS_POTATO:
            case GOLDEN_CARROT:
            case PUMPKIN_PIE:
            case COOKIE:
            case MELON:
            case MUSHROOM_SOUP:
            case RAW_CHICKEN:
            case COOKED_CHICKEN:
            case RAW_BEEF:
            case COOKED_BEEF:
            case RAW_FISH:
            case COOKED_FISH:
            case PORK:
            case GRILLED_PORK:
            case APPLE:
            case GOLDEN_APPLE:
            case ROTTEN_FLESH:
            case SPIDER_EYE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Attempts to get the Material with the given ID
     *
     * @param id ID of the material to get
     * @return Material if found, or null
     */
    public static Material getMaterial(final int id) {
        if (byId.length > id && id >= 0) {
            return byId[id];
        } else {
            return null;
        }
    }

    /**
     * Attempts to get the Material with the given name.
     * This is a normal lookup, names must be the precise name they are given
     * in the enum.
     *
     * @param name Name of the material to get
     * @return Material if found, or null
     */
    public static Material getMaterial(final String name) {
        return BY_NAME.get(name);
    }

    /**
     * Attempts to match the Material with the given name.
     * This is a match lookup; names will be converted to uppercase, then stripped
     * of special characters in an attempt to format it like the enum
     *
     * @param name Name of the material to get
     * @return Material if found, or null
     */
    public static Material matchMaterial(final String name) {
        Validate.notNull(name, "Name cannot be null");

        Material result = null;

        try {
            result = getMaterial(Integer.parseInt(name));
        } catch (NumberFormatException ex) {}

        if (result == null) {
            String filtered = name.toUpperCase();

            filtered = filtered.replaceAll("\\s+", "_").replaceAll("\\W", "");
            result = BY_NAME.get(filtered);
        }

        return result;
    }

    static {
        for (Material material : values()) {
            if (byId.length > material.id) {
                byId[material.id] = material;
            } else {
                byId = Java15Compat.Arrays_copyOfRange(byId, 0, material.id + 2);
                byId[material.id] = material;
            }
            BY_NAME.put(material.name(), material);
        }
    }

    /**
     * @return True if this material represents a playable music disk.
     */
    public boolean isRecord() {
        return id >= GOLD_RECORD.id && id <= RECORD_12.id;
    }

    /**
     * Check if the material is a block and solid (cannot be passed through by a player)
     *
     * @return True if this material is a block and solid
     */
    public boolean isSolid() {
        if (!isBlock() || id == 0) {
            return false;
        }
        switch (this) {
            case STONE:
            case GRASS:
            case DIRT:
            case COBBLESTONE:
            case WOOD:
            case BEDROCK:
            case SAND:
            case GRAVEL:
            case GOLD_ORE:
            case IRON_ORE:
            case COAL_ORE:
            case LOG:
            case LEAVES:
            case SPONGE:
            case GLASS:
            case LAPIS_ORE:
            case LAPIS_BLOCK:
            case DISPENSER:
            case SANDSTONE:
            case NOTE_BLOCK:
            case BED_BLOCK:
            case PISTON_STICKY_BASE:
            case PISTON_BASE:
            case PISTON_EXTENSION:
            case WOOL:
            case PISTON_MOVING_PIECE:
            case GOLD_BLOCK:
            case IRON_BLOCK:
            case DOUBLE_STEP:
            case STEP:
            case BRICK:
            case TNT:
            case BOOKSHELF:
            case MOSSY_COBBLESTONE:
            case OBSIDIAN:
            case MOB_SPAWNER:
            case WOOD_STAIRS:
            case CHEST:
            case DIAMOND_ORE:
            case DIAMOND_BLOCK:
            case WORKBENCH:
            case SOIL:
            case FURNACE:
            case BURNING_FURNACE:
            case SIGN_POST:
            case WOODEN_DOOR:
            case COBBLESTONE_STAIRS:
            case WALL_SIGN:
            case STONE_PLATE:
            case IRON_DOOR_BLOCK:
            case WOOD_PLATE:
            case REDSTONE_ORE:
            case GLOWING_REDSTONE_ORE:
            case ICE:
            case SNOW_BLOCK:
            case CACTUS:
            case CLAY:
            case JUKEBOX:
            case FENCE:
            case PUMPKIN:
            case NETHERRACK:
            case SOUL_SAND:
            case GLOWSTONE:
            case JACK_O_LANTERN:
            case CAKE_BLOCK:
            case LOCKED_CHEST:
            case TRAP_DOOR:
            case TRAPPEACIER:
            case MONSTER_EGGS:
            case SMOOTH_BRICK:
            case HUGE_MUSHROOM_1:
            case HUGE_MUSHROOM_2:
            case IRON_FENCE:
            case THIN_GLASS:
            case MELON_BLOCK:
            case FENCE_GATE:
            case BRICK_STAIRS:
            case SMOOTH_STAIRS:
            case MYCEL:
            case NETHER_BRICK:
            case NETHER_FENCE:
            case NETHER_BRICK_STAIRS:
            case ENCHANTMENT_TABLE:
            case BREWING_STAND:
            case CAULDRON:
            case ENDER_PORTAL_FRAME:
            case ENDER_STONE:
            case DRAGON_EGG:
            case REDSTONE_LAMP_OFF:
            case REDSTONE_LAMP_ON:
            case WOOD_DOUBLE_STEP:
            case WOOD_STEP:
            case SANDSTONE_STAIRS:
            case EMERALD_ORE:
            case ENDER_CHEST:
            case EMERALD_BLOCK:
            case SPRUCE_WOOD_STAIRS:
            case BIRCH_WOOD_STAIRS:
            case JUNGLE_WOOD_STAIRS:
            case COMMAND:
            case BEACON:
            case COBBLE_WALL:
            case ANVIL:
            case TRAPPED_CHEST:
            case GOLD_PLATE:
            case IRON_PLATE:
            case DAYLIGHT_DETECTOR:
            case REDSTONE_BLOCK:
            case QUARTZ_ORE:
            case HOPPER:
            case QUARTZ_BLOCK:
            case QUARTZ_STAIRS:
            case DROPPER:
              
            case BLOCKCUIVRE:
            case BLOCKCITRINE:
            case BLOCKSAPHIR:
            case BLOCKRUBIS:
            case BLOCKEMERAUDE:
            case ORECUIVRE:
            case ORECITRINE:
            case OREEMERAUDE:
            case ORESAPHIR:
            case ORERUBIS:
            case BLOCKVERRECOLORED:
            case TAPISLAINE:
            case TAPISVERRE:

            case STAIRSVERREWHITE:
            case STAIRSVERREORANGE:
            case STAIRSVERREMAGENTA:
            case STAIRSVERRESKYBLUE:
            case STAIRSVERREYELLOW:
            case STAIRSVERREGREEN:
            case STAIRSVERREPINK:
            case STAIRSVERREDARKGREY:
            case STAIRSVERRELIGHTGREY:
            case STAIRSVERRECYAN:
            case STAIRSVERREPURPLE:
            case STAIRSVERREDARKBLUE:
            case STAIRSVERREBROWN:
            case STAIRSVERREDARKGREEN:
            case STAIRSVERRERED:
            case STAIRSVERREBLACK:
                
            case STAIRSLAINEWHITE:
            case STAIRSLAINEORANGE:
            case STAIRSLAINEMAGENTA:
            case STAIRSLAINESKYBLUE:
            case STAIRSLAINEYELLOW:
            case STAIRSLAINEGREEN:
            case STAIRSLAINEPINK:
            case STAIRSLAINEDARKGREY:
            case STAIRSLAINELIGHTGREY:
            case STAIRSLAINECYAN:
            case STAIRSLAINEPURPLE:
            case STAIRSLAINEDARKBLUE:
            case STAIRSLAINEBROWN:
            case STAIRSLAINEDARKGREEN:
            case STAIRSLAINERED:
            case STAIRSLAINEBLACK:
            	
            case LANTERNE1:
            case LANTERNE2:
            case LANTERNE3:
            case LANTERNE4:
            case LANTERNE5:
            case LANTERNE6:
            case LANTERNE7:
            case LANTERNE8:
            	
            case STAIRSSTONE:
            case STAIRSDIRT:
            case STAIRSBEDROCK:
            case STAIRSLOG:
            case STAIRSBLOCKGOLD:
            case STAIRSBLOCKIRON:
            case STAIRSCOBBLESTONEMOSSY:
            case STAIRSOBSIDIAN:
            case STAIRSBLOCKDIAMOND:
            case STAIRSBLOCKSNOW:
            case STAIRSBLOCKCLAY:
            case STAIRSSLOWSAND:
            case STAIRSBLOCKEMERALD:
            case STAIRSBLOCKCUIVRE:
            case STAIRSBLOCKCITRINE:
            case STAIRSBLOCKEMERAUDE:
            case STAIRSBLOCKSAPHIR:
            case STAIRSBLOCKRUBIS:
            case CAISSEBOIS:
            case STONEBRICK2:
            case STONEBRICK3:
            	
            case BIBLIOTHEQUES1:
            case BIBLIOTHEQUES2:
            case BIBLIOTHEQUES3:
            case BIBLIOTHEQUES4:
            case BIBLIOTHEQUES5:
            case BIBLIOTHEQUES6:
            case BIBLIOTHEQUES7:
            case BIBLIOTHEQUES8:
            case BIBLIOTHEQUES9:
            case BIBLIOTHEQUES10:
            case BIBLIOTHEQUES11:
            case BIBLIOTHEQUES12:
            case BIBLIOTHEQUES13:
            case BIBLIOTHEQUES14:
            case BIBLIOTHEQUES15:
            case BIBLIOTHEQUES16:
            case BIBLIOTHEQUES17:
            case BIBLIOTHEQUES18:
            case BIBLIOTHEQUES19:
            case BIBLIOTHEQUES20:
            case BIBLIOTHEQUES21:
            case BIBLIOTHEQUES22:
            case BIBLIOTHEQUES23:
            case BIBLIOTHEQUES24:
            case BIBLIOTHEQUES25:
            case BIBLIOTHEQUES26:
            case BIBLIOTHEQUES27:
            case BIBLIOTHEQUES28:
            case BIBLIOTHEQUES29:
            case BIBLIOTHEQUES30:
            case BIBLIOTHEQUES31:
            case BIBLIOTHEQUES32:
            case BIBLIOTHEQUES33:
            case BIBLIOTHEQUES34:
            case BIBLIOTHEQUES35:
            case BIBLIOTHEQUES36:
            case BIBLIOTHEQUES37:
            case BIBLIOTHEQUES38:
            case BIBLIOTHEQUES39:
            case BIBLIOTHEQUES40:
            case BIBLIOTHEQUES41:
            case BIBLIOTHEQUES42:
            case BIBLIOTHEQUES43:
            case BIBLIOTHEQUES44:
            case BIBLIOTHEQUES45:
            case BIBLIOTHEQUES46:
            case BIBLIOTHEQUES47:
            case BIBLIOTHEQUES48:
            case BIBLIOTHEQUES49:
            case BIBLIOTHEQUES50:
            case BIBLIOTHEQUES51:
            case BIBLIOTHEQUES52:
            case BIBLIOTHEQUES53:
            case BIBLIOTHEQUES54:
            case BIBLIOTHEQUES55:
            case BIBLIOTHEQUES56:
            case BIBLIOTHEQUES57:
            case BIBLIOTHEQUES58:
            case BIBLIOTHEQUES59:
            case BIBLIOTHEQUES60:

            case WOOD1:
            case WOOD2:
            case WOOD3:
            	
            case CHAIR:
            case BANK:
            case TABLE:
            	
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and does not block any light
     *
     * @return True if this material is a block and does not block any light
     */
    public boolean isTransparent() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            case AIR:
            case SAPLING:
            case POWERED_RAIL:
            case DETECTOR_RAIL:
            case LONG_GRASS:
            case DEAD_BUSH:
            case YELLOW_FLOWER:
            case RED_ROSE:
            case BROWN_MUSHROOM:
            case RED_MUSHROOM:
            case TORCH:
            case FIRE:
            case REDSTONE_WIRE:
            case CROPS:
            case LADDER:
            case RAILS:
            case LEVER:
            case REDSTONE_TORCH_OFF:
            case REDSTONE_TORCH_ON:
            case STONE_BUTTON:
            case SNOW:
            case SUGAR_CANE_BLOCK:
            case PORTAL:
            case DIODE_BLOCK_OFF:
            case DIODE_BLOCK_ON:
            case PUMPKIN_STEM:
            case MELON_STEM:
            case VINE:
            case WATER_LILY:
            case NETHER_WARTS:
            case ENDER_PORTAL:
            case COCOA:
            case TRIPWIRE_HOOK:
            case TRIPWIRE:
            case FLOWER_POT:
            case CARROT:
            case POTATO:
            case WOOD_BUTTON:
            case SKULL:
            case REDSTONE_COMPARATOR_OFF:
            case REDSTONE_COMPARATOR_ON:
            case ACTIVATOR_RAIL:
            case BLOCKPARTICULES1:
            case BLOCKPARTICULES2:
            case BLOCKPARTICULES3:
            case BLOCKPARTICULES4:
            case BLOCKPARTICULES5:
            case BLOCKPARTICULES6:
            case BLOCKPARTICULES7:
            case BLOCKPARTICULES8:
            case BLOCKPARTICULES9:
            case BLOCKPARTICULES10:
            case BLOCKPARTICULES11:
            case BLOCKPARTICULES12:
            case BLOCKPARTICULES13:
            case BLOCKPARTICULES14:
            case BLOCKPARTICULES15:
            case BLOCKPARTICULES16:
            case BLOCKPARTICULES17:
            case BLOCKPARTICULES18:
            case BLOCKPARTICULES19:
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and can catch fire
     *
     * @return True if this material is a block and can catch fire
     */
    public boolean isFlammable() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            case WOOD:
            case LOG:
            case LEAVES:
            case NOTE_BLOCK:
            case BED_BLOCK:
            case LONG_GRASS:
            case DEAD_BUSH:
            case WOOL:
            case TNT:
            case BOOKSHELF:
            case WOOD_STAIRS:
            case CHEST:
            case WORKBENCH:
            case SIGN_POST:
            case WOODEN_DOOR:
            case WALL_SIGN:
            case WOOD_PLATE:
            case JUKEBOX:
            case FENCE:
            case LOCKED_CHEST:
            case TRAP_DOOR:
            case HUGE_MUSHROOM_1:
            case HUGE_MUSHROOM_2:
            case VINE:
            case FENCE_GATE:
            case WOOD_DOUBLE_STEP:
            case WOOD_STEP:
            case SPRUCE_WOOD_STAIRS:
            case BIRCH_WOOD_STAIRS:
            case JUNGLE_WOOD_STAIRS:
            case TRAPPED_CHEST:
            case DAYLIGHT_DETECTOR:
            case STAIRSLAINEWHITE:
            case STAIRSLAINEORANGE:
            case STAIRSLAINEMAGENTA:
            case STAIRSLAINESKYBLUE:
            case STAIRSLAINEYELLOW:
            case STAIRSLAINEGREEN:
            case STAIRSLAINEPINK:
            case STAIRSLAINEDARKGREY:
            case STAIRSLAINELIGHTGREY:
            case STAIRSLAINECYAN:
            case STAIRSLAINEPURPLE:
            case STAIRSLAINEDARKBLUE:
            case STAIRSLAINEBROWN:
            case STAIRSLAINEDARKGREEN:
            case STAIRSLAINERED:
            case STAIRSLAINEBLACK:
            case TAPISLAINE:
            case LANTERNE3:
            case LANTERNE4:
            case STAIRSLOG:
            case CAISSEBOIS:
            	
            case BIBLIOTHEQUES1:
            case BIBLIOTHEQUES2:
            case BIBLIOTHEQUES3:
            case BIBLIOTHEQUES4:
            case BIBLIOTHEQUES5:
            case BIBLIOTHEQUES6:
            case BIBLIOTHEQUES7:
            case BIBLIOTHEQUES8:
            case BIBLIOTHEQUES9:
            case BIBLIOTHEQUES10:
            case BIBLIOTHEQUES11:
            case BIBLIOTHEQUES12:
            case BIBLIOTHEQUES13:
            case BIBLIOTHEQUES14:
            case BIBLIOTHEQUES15:
            case BIBLIOTHEQUES16:
            case BIBLIOTHEQUES17:
            case BIBLIOTHEQUES18:
            case BIBLIOTHEQUES19:
            case BIBLIOTHEQUES20:
            case BIBLIOTHEQUES21:
            case BIBLIOTHEQUES22:
            case BIBLIOTHEQUES23:
            case BIBLIOTHEQUES24:
            case BIBLIOTHEQUES25:
            case BIBLIOTHEQUES26:
            case BIBLIOTHEQUES27:
            case BIBLIOTHEQUES28:
            case BIBLIOTHEQUES29:
            case BIBLIOTHEQUES30:
            case BIBLIOTHEQUES31:
            case BIBLIOTHEQUES32:
            case BIBLIOTHEQUES33:
            case BIBLIOTHEQUES34:
            case BIBLIOTHEQUES35:
            case BIBLIOTHEQUES36:
            case BIBLIOTHEQUES37:
            case BIBLIOTHEQUES38:
            case BIBLIOTHEQUES39:
            case BIBLIOTHEQUES40:
            case BIBLIOTHEQUES41:
            case BIBLIOTHEQUES42:
            case BIBLIOTHEQUES43:
            case BIBLIOTHEQUES44:
            case BIBLIOTHEQUES45:
            case BIBLIOTHEQUES46:
            case BIBLIOTHEQUES47:
            case BIBLIOTHEQUES48:
            case BIBLIOTHEQUES49:
            case BIBLIOTHEQUES50:
            case BIBLIOTHEQUES51:
            case BIBLIOTHEQUES52:
            case BIBLIOTHEQUES53:
            case BIBLIOTHEQUES54:
            case BIBLIOTHEQUES55:
            case BIBLIOTHEQUES56:
            case BIBLIOTHEQUES57:
            case BIBLIOTHEQUES58:
            case BIBLIOTHEQUES59:
            case BIBLIOTHEQUES60:

            case WOOD1:
            case WOOD2:
            case WOOD3:
            	
            case CHAIR:
            case BANK:
            case TABLE:
            	
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and can burn away
     *
     * @return True if this material is a block and can burn away
     */
    public boolean isBurnable() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            case WOOD:
            case LOG:
            case LEAVES:
            case LONG_GRASS:
            case WOOL:
            case TNT:
            case BOOKSHELF:
            case WOOD_STAIRS:
            case FENCE:
            case VINE:
            case WOOD_DOUBLE_STEP:
            case WOOD_STEP:
            case SPRUCE_WOOD_STAIRS:
            case BIRCH_WOOD_STAIRS:
            case JUNGLE_WOOD_STAIRS:
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and completely blocks vision
     *
     * @return True if this material is a block and completely blocks vision
     */
    public boolean isOccluding() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            case STONE:
            case GRASS:
            case DIRT:
            case COBBLESTONE:
            case WOOD:
            case BEDROCK:
            case SAND:
            case GRAVEL:
            case GOLD_ORE:
            case IRON_ORE:
            case COAL_ORE:
            case LOG:
            case SPONGE:
            case LAPIS_ORE:
            case LAPIS_BLOCK:
            case DISPENSER:
            case SANDSTONE:
            case NOTE_BLOCK:
            case WOOL:
            case GOLD_BLOCK:
            case IRON_BLOCK:
            case DOUBLE_STEP:
            case BRICK:
            case BOOKSHELF:
            case MOSSY_COBBLESTONE:
            case OBSIDIAN:
            case MOB_SPAWNER:
            case DIAMOND_ORE:
            case DIAMOND_BLOCK:
            case WORKBENCH:
            case FURNACE:
            case BURNING_FURNACE:
            case REDSTONE_ORE:
            case GLOWING_REDSTONE_ORE:
            case SNOW_BLOCK:
            case CLAY:
            case JUKEBOX:
            case PUMPKIN:
            case NETHERRACK:
            case SOUL_SAND:
            case JACK_O_LANTERN:
            case LOCKED_CHEST:
            case MONSTER_EGGS:
            case SMOOTH_BRICK:
            case HUGE_MUSHROOM_1:
            case HUGE_MUSHROOM_2:
            case MELON_BLOCK:
            case MYCEL:
            case NETHER_BRICK:
            case ENDER_PORTAL_FRAME:
            case ENDER_STONE:
            case REDSTONE_LAMP_OFF:
            case REDSTONE_LAMP_ON:
            case WOOD_DOUBLE_STEP:
            case EMERALD_ORE:
            case EMERALD_BLOCK:
            case COMMAND:
            case QUARTZ_ORE:
            case QUARTZ_BLOCK:
            case DROPPER:
            case BLOCKCUIVRE:
            case BLOCKCITRINE:
            case BLOCKSAPHIR:
            case BLOCKRUBIS:
            case BLOCKEMERAUDE:
            case ORECUIVRE:
            case ORECITRINE:
            case OREEMERAUDE:
            case ORESAPHIR:
            case ORERUBIS:
            case LANTERNE3:
            case LANTERNE4:
            case LANTERNE5:
            case LANTERNE6:
            case LANTERNE7:
            case LANTERNE8:
            	
            case BIBLIOTHEQUES1:
            case BIBLIOTHEQUES2:
            case BIBLIOTHEQUES3:
            case BIBLIOTHEQUES4:
            case BIBLIOTHEQUES5:
            case BIBLIOTHEQUES6:
            case BIBLIOTHEQUES7:
            case BIBLIOTHEQUES8:
            case BIBLIOTHEQUES9:
            case BIBLIOTHEQUES10:
            case BIBLIOTHEQUES11:
            case BIBLIOTHEQUES12:
            case BIBLIOTHEQUES13:
            case BIBLIOTHEQUES14:
            case BIBLIOTHEQUES15:
            case BIBLIOTHEQUES16:
            case BIBLIOTHEQUES17:
            case BIBLIOTHEQUES18:
            case BIBLIOTHEQUES19:
            case BIBLIOTHEQUES20:
            case BIBLIOTHEQUES21:
            case BIBLIOTHEQUES22:
            case BIBLIOTHEQUES23:
            case BIBLIOTHEQUES24:
            case BIBLIOTHEQUES25:
            case BIBLIOTHEQUES26:
            case BIBLIOTHEQUES27:
            case BIBLIOTHEQUES28:
            case BIBLIOTHEQUES29:
            case BIBLIOTHEQUES30:
            case BIBLIOTHEQUES31:
            case BIBLIOTHEQUES32:
            case BIBLIOTHEQUES33:
            case BIBLIOTHEQUES34:
            case BIBLIOTHEQUES35:
            case BIBLIOTHEQUES36:
            case BIBLIOTHEQUES37:
            case BIBLIOTHEQUES38:
            case BIBLIOTHEQUES39:
            case BIBLIOTHEQUES40:
            case BIBLIOTHEQUES41:
            case BIBLIOTHEQUES42:
            case BIBLIOTHEQUES43:
            case BIBLIOTHEQUES44:
            case BIBLIOTHEQUES45:
            case BIBLIOTHEQUES46:
            case BIBLIOTHEQUES47:
            case BIBLIOTHEQUES48:
            case BIBLIOTHEQUES49:
            case BIBLIOTHEQUES50:
            case BIBLIOTHEQUES51:
            case BIBLIOTHEQUES52:
            case BIBLIOTHEQUES53:
            case BIBLIOTHEQUES54:
            case BIBLIOTHEQUES55:
            case BIBLIOTHEQUES56:
            case BIBLIOTHEQUES57:
            case BIBLIOTHEQUES58:
            case BIBLIOTHEQUES59:
            case BIBLIOTHEQUES60:

            case WOOD1:
            case WOOD2:
            case WOOD3:
            	
                return true;
            default:
                return false;
        }
    }

    /**
     * @return True if this material is affected by gravity.
     */
    public boolean hasGravity() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            case SAND:
            case GRAVEL:
            case ANVIL:
                return true;
            default:
                return false;
        }
    }
}
