/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author BUE
 */
public class User {
    private int ID;
    private String FirstName;
    private String Lastname;
    private String PhoneNum;
    protected String password;
    private String email;
    private String address;

    public User(int ID, String FirstName, String Lastname, String PhoneNum, String password, String email, String address) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.Lastname = Lastname;
        this.PhoneNum = PhoneNum;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
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
    
    private boolean Login(String email, String password){
        Scanner input = new Scanner(System.in);

        email = input.next();
        password = input.next();

        password = input.next();
        if(email.equals(this.email) && password.equals(this.password)){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void EditProfile(){
        
    }
    private void ReportProblem(){
        
    }
}
