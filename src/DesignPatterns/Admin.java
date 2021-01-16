/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import Classes.*;

/**
 *
 * @author BUE
 */
public class Admin {
    private Admin Onlyinstance;
    private String FirstName;
    private String LastName;
    private String PhoneNum;
    protected String password;
    private String email;
    private String address;

    private Admin(Admin Onlyinstance, String FirstName, String LastName, String PhoneNum, String password, String email, String address) {
        this.Onlyinstance = Onlyinstance;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNum = PhoneNum;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public Admin getOnlyinstance() {
        return Onlyinstance;
    }

    public void setOnlyinstance(Admin Onlyinstance) {
        this.Onlyinstance = Onlyinstance;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    private void Login(){
        
    }
    private void AddUser(){
        
    }
    private void AddDeliveryDriver(){
        
    }
    private void AddRestaurant(){
        
    }
    private void DeleteUser(){
        
    }
    private void DeleteRestaurant(){
        
    }
    private void DeleteDeliveryDriver(){
        
    }
    private void BanUser(){
        
    }
    private void EditProfile(){
        
    }
}
