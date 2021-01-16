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
public class Restaurant {
    private int ID;
    private String Name;
    private String[] Addresses;
    private float Rating;

    public Restaurant(int ID, String Name, String[] Addresses, float Rating) {
        this.ID = ID;
        this.Name = Name;
        this.Addresses = Addresses;
        this.Rating = Rating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String[] getAddresses() {
        return Addresses;
    }

    public void setAddresses(String[] Addresses) {
        this.Addresses = Addresses;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float Rating) {
        this.Rating = Rating;
    }
    
    private void UpdateProfile(){
        
    }
    private void AddFoodItem(){
        
    }
    private void AddDrinkItem(){
        
    }
    private void DeleteFoodItem(){
        
    }
    private void DeleteDrinkItem(){
        
    }
    private void UpdateMenu(){
        
    }
    private void AddPromocode(){
        
    }
    private void PrepareOrder(){
        
    }
}
