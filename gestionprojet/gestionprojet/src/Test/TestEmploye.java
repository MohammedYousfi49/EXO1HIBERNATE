/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entities.Employe;
import service.EmployeService;

/**
 *
 * @author PC
 */
public class TestEmploye {
    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        es.create(new Employe("simo", "ayoub", "0699417788"));
         es.create(new Employe("wail", "embari", "069941799"));
          es.create(new Employe("walid", "hifdi", "0625887756"));
           es.create(new Employe("mustapha", "hafid", "0658442288"));
           
    }
    
}
