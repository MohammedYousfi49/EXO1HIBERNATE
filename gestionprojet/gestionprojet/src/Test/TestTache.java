/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entities.Tache;
import java.util.Date;
import service.ProjetService;
import service.TacheService;

/**
 *
 * @author PC
 */
public class TestTache {
    public static void main(String[] args) {
        TacheService ts = new TacheService();
        ProjetService ps = new ProjetService();
       ts.create(new Tache("finaliser l'application", new Date(), new Date("2022/20/01"),
               1000, ps.findById(1)));
       
      
        
    }
}
