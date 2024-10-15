/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Categorie;
import service.ProduitService;
import entities.Produit;
import java.util.Date;
import service.CategorieService;
import sun.security.krb5.internal.APReq;

/**
 *
 * @author PC
 */
public class TestProduit {

    public static void main(String[] args) {
        ProduitService ps = new ProduitService();
        CategorieService cs = new CategorieService();
        ps.create(new Produit("Nike", "SPORT001", new Date(), 100, "Chaussures de course", cs.findById(1)));
        ps.create(new Produit("Adidas","SPORT002", new Date(), 75.99, "Ballon de football", cs.findById(1)));
        ps.create(new Produit("Wilson","SPORT003" , new Date(), 120.50, "Raquette de tennis", cs.findById(1)));
        ps.create(new Produit("Under Armour", "SPORT004", new Date(), 50.00,"T-shirt de sport" , cs.findById(2)));
        ps.create(new Produit("Puma", "SPORT005", new Date(), 35.99,"Casquette de sport" , cs.findById(2)));
       
     
        ps.create(new Produit("puma", "SPORT006", new Date("2023/10/12"), 100.00, "Ballon de football", cs.findById(1)));
        
        
        
      

    }
}
