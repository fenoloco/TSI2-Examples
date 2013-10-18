/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.tsi2.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author MauricioF1
 */
@Stateless
public class EJBHelloTSI implements EJBHelloTSILocal {

    @Override
    public String sayHello(){
        return "Hello TSI 2";
    }
}
