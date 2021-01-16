/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DesignPatterns.State;


/**
 *
 * @author BUE
 */
public class Order {
    private State state;
    private int OrderID;
    private String[] OrderItems;
    private boolean HavePromocode;
    private Restaurant restaurant;
    private DeliveryDriver deliveryDriver;
    private float DeliveryCost;

    public Order(State state, int OrderID, String[] OrderItems, boolean HavePromocode, Restaurant restaurant, DeliveryDriver deliveryDriver, float DeliveryCost) {
        this.state = null;
        this.OrderID = OrderID;
        this.OrderItems = OrderItems;
        this.HavePromocode = HavePromocode;
        this.restaurant = restaurant;
        this.deliveryDriver = deliveryDriver;
        this.DeliveryCost = DeliveryCost;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String[] getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(String[] OrderItems) {
        this.OrderItems = OrderItems;
    }

    public boolean isHavePromocode() {
        return HavePromocode;
    }

    public void setHavePromocode(boolean HavePromocode) {
        this.HavePromocode = HavePromocode;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public DeliveryDriver getDeliveryDriver() {
        return deliveryDriver;
    }

    public void setDeliveryDriver(DeliveryDriver deliveryDriver) {
        this.deliveryDriver = deliveryDriver;
    }

    public float getDeliveryCost() {
        return DeliveryCost;
    }

    public void setDeliveryCost(float DeliveryCost) {
        this.DeliveryCost = DeliveryCost;
    }
    
    private void CalculateTotalPrice(){
        
    }
}
