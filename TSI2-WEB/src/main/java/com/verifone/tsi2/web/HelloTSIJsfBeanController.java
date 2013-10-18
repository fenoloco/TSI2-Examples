/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.tsi2.web;

import com.verifone.tsi2.ejb.EJBHelloTSILocal;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author MauricioF1
 */
@ManagedBean
@RequestScoped
public class HelloTSIJsfBeanController {

    
    @EJB(lookup = "java:global/TSI2-EJB/EJBHelloTSI")
    EJBHelloTSILocal ejb;
    
    public HelloTSIJsfBeanController() {
    }
    
    public String getHello(){
       return ejb.sayHello();
    }
}
