/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author BUE
 */
public class Menu {
    private int ItemID;
    private String ItemType;
    private FoodItem foodItem;
    private DrinkItem drinkItem;

    public Menu(int ItemID, String ItemType, FoodItem foodItem, DrinkItem drinkItem) {
        this.ItemID = ItemID;
        this.ItemType = ItemType;
        this.foodItem = foodItem;
        this.drinkItem = drinkItem;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public DrinkItem getDrinkItem() {
        return drinkItem;
    }

    public void setDrinkItem(DrinkItem drinkItem) {
        this.drinkItem = drinkItem;
    }
    
    private void ShowMenu(FoodItem FI, DrinkItem DI){
        
    }
    private void AddItemToOrder(int itemID){
        
    }
}