/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.tsi2.ejb;

import javax.ejb.Local;

/**
 *
 * @author MauricioF1
 */
@Local
public interface EJBHelloTSILocal {

    public String sayHello();
    
}
