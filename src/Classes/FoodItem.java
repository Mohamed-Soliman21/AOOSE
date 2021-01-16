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
public class FoodItem extends Menu{
    private String FoodType;
    private String FoodDescription;
    private float FoodCost;

    public FoodItem(String FoodType, String FoodDescription, float FoodCost, int ItemID, String ItemType, FoodItem foodItem, DrinkItem drinkItem) {
        super(ItemID, ItemType, foodItem, drinkItem);
        this.FoodType = FoodType;
        this.FoodDescription = FoodDescription;
        this.FoodCost = FoodCost;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }

    public String getFoodDescription() {
        return FoodDescription;
    }

    public void setFoodDescription(String FoodDescription) {
        this.FoodDescription = FoodDescription;
    }

    public float getFoodCost() {
        return FoodCost;
    }

    public void setFoodCost(float FoodCost) {
        this.FoodCost = FoodCost;
    }

    
    
    
}
