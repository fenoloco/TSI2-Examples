/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.tsi2.web.service;

import com.verifone.tsi2.ejb.EJBHelloTSILocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author MauricioF1
 */
@Stateless
@Path("sayHello")
public class PruebaREST {

    @EJB(lookup = "java:global/TSI2-EJB/EJBHelloTSI")
    EJBHelloTSILocal ejb;
    
    public PruebaREST() {
    }

    @GET   
    @Produces({"application/json"})
    public String sayHello() {
        return "{ \"result\":\"" + ejb.sayHello() + "\" }";
    }
}
