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
public class DrinkItem extends Menu{
    private String DrinkType;
    private String DrinkDescription;
    private float DrinkCost;

    public DrinkItem(String DrinkType, String DrinkDescription, float DrinkCost, int ItemID, String ItemType, FoodItem foodItem, DrinkItem drinkItem) {
        super(ItemID, ItemType, foodItem, drinkItem);
        this.DrinkType = DrinkType;
        this.DrinkDescription = DrinkDescription;
        this.DrinkCost = DrinkCost;
    }

    public String getDrinkType() {
        return DrinkType;
    }

    public void setDrinkType(String DrinkType) {
        this.DrinkType = DrinkType;
    }

    public String getDrinkDescription() {
        return DrinkDescription;
    }

    public void setDrinkDescription(String DrinkDescription) {
        this.DrinkDescription = DrinkDescription;
    }

    public float getDrinkCost() {
        return DrinkCost;
    }

    public void setDrinkCost(float DrinkCost) {
        this.DrinkCost = DrinkCost;
    }
    
    
}
