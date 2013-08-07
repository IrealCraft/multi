package net.minecraft.server;

public class RecipesArmor2 {

    private String[][] a = new String[][] { { "XXX", "X X"}, { "X X", "XXX", "XXX"}, { "XXX", "X X", "X X"}, { "X X", "X X"}};
    private Object[][] b;

    public RecipesArmor2() {
        this.b = new Object[][] { {Item.CUIVRE, Item.CITRINE, Item.EMERAUDE, Item.SAPHIR, Item.RUBIS}, {Item.HELMETCUIVRE, Item.HELMETCITRINE, Item.HELMETEMERAUDE, Item.HELMETSAPHIR, Item.HELMETRUBIS}, {Item.PLATECUIVRE, Item.PLATECITRINE, Item.PLATEEMERAUDE, Item.PLATESAPHIR, Item.PLATERUBIS}, {Item.LEGSCUIVRE, Item.LEGSCITRINE, Item.LEGSEMERAUDE, Item.LEGSSAPHIR, Item.LEGSRUBIS}, {Item.BOOTSCUIVRE, Item.BOOTSCITRINE, Item.BOOTSEMERAUDE, Item.BOOTSSAPHIR, Item.BOOTSRUBIS}};
    }

    public void a(CraftingManager craftingmanager) {
        for (int i = 0; i < this.b[0].length; ++i) {
            Object object = this.b[0][i];

            for (int j = 0; j < this.b.length - 4; ++j) {
                Item item = (Item) this.b[j + 1][i];

                craftingmanager.registerShapedRecipe(new ItemStack(item), new Object[] { this.a[j], Character.valueOf('X'), object});
            }
        }
    }
}
