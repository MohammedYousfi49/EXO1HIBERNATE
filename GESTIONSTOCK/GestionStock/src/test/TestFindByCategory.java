/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import service.CategorieService;
import service.ProduitService;

/**
 *
 * @author PC
 */
public class TestFindByCategory {
    public static void main(String[] args) {
       
        CategorieService cs = new CategorieService();
        ProduitService ps = new ProduitService();
         System.out.println("\n---------------les produit du categorie 1----------------------------------------\n");
         ps.findByCategorie(cs.findById(1));
    }
    
}
