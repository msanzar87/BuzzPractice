package com.msanzar87.practice.inventory;

import com.msanzar87.practice.Inventory;
import org.junit.Assert;
import org.junit.Test;

public class InventoryAdd {


    @Test
    public void test0() {
        test("");
    }

    @Test
    public void test1() {
        test("Lamp", "Lamp", "Shade", "Lightbulb");
    }

    @Test
    public void test2() {
        test("Lamp", "Lamp", "Shade", "Lightbulb", "Lightbulb");
    }

    @Test
    public void test3() {
        test("Lamp", "Lamp", "Shade", "Shade");
    }

    private void test(String... itemsToAddToInventory) {
        Inventory inventory = new Inventory();
        for(String item : itemsToAddToInventory) {
            int preAddQuantity = inventory.getItemQuantity(item);
            int postAddQuantity = preAddQuantity + 1;
            int expected = postAddQuantity;
            inventory.addItemToInventory(item);
            int actual = inventory.getItemQuantity(item);

            Assert.assertEquals(expected, actual);
        }
    }
}
