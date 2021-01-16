/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import Classes.Order;
import Classes.Order;


/**
 *
 * @author BUE
 */
public class Delivered implements State{
    @Override
        public void Handle(Order order){
            order.setState(this);
        }
}
