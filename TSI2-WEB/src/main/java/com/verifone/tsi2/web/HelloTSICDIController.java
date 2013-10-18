/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.tsi2.web;

import com.verifone.tsi2.ejb.EJBHelloTSILocal;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author MauricioF1
 */
@Named
@RequestScoped
public class HelloTSICDIController {
    
    @EJB(lookup = "java:global/TSI2-EJB/EJBHelloTSI")
    EJBHelloTSILocal ejb;
    
      public String getHello(){
        return ejb.sayHello();
    }
}
