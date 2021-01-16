/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import Classes.Order;


/**
 *
 * @author BUE
 */
public interface State {
    public void Handle(Order order);
}
