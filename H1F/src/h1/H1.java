package h1;

import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

import java.util.Date;
import java.util.List;
import ma.projet.util.HibernateUtil;

public class H1 {

    public static void main(String[] args) {
        // HibernateUtil.getSessionFactory().openSession();

        ProduitService ps = new ProduitService();
         // Modifier les informations du produit dont l'id = 1
       Produit produit1 = ps.findById(1);
        if (produit1 != null) {
            produit1.setMarque("Adidas");
            produit1.setReference("XYZ456");
            produit1.setPrix(120.0);
            produit1.setDesignation("Nouveaux Chaussures de sport");
            ps.update(produit1);
           System.out.println("Produit avec ID 1 modifié.");
        } else {
            System.out.println("Produit avec ID 1 non trouvé.");
        }

    }
}

//        ProduitService ps = new ProduitService();
//        //Creation de 5 produits
//        ps.create(new Produit("nike", "AAB1", 1200.00, "chaussuredesport"));
//        ps.create(new Produit("adidas", "AAB2", 1200.00, "casquette"));
//        ps.create(new Produit("puma", "AAB1", 1200.00, "short"));
//        ps.create(new Produit("under", "AAB1", 1200.00, "survette"));
//        ps.create(new Produit("nike", "AAB1", 1200.00, "ballon"));
//
//        //afficher la liste des produits
//        List<Produit> produits = ps.findAll();
//        for (Produit p : produits) {
//            System.out.println(p);
//        }
//
//        //afficher les informations du produit dont id = 2
//        Produit produit2 = ps.findById(2);
//        if (produit2 != null) {
//            System.out.println("Produit avec ID 2 : " + produit2);
//        } else {
//            System.out.println("Produit avec ID 2 non trouvé.");
//        }
//
//        // Supprimer le produit dont l'id = 3
//        Produit produit3 = ps.findById(3);
//        if (produit3 != null) {
//            ps.delete(produit3);
//            System.out.println("Produit avec ID 3 supprimé.");
//        } else {
//            System.out.println("Produit avec ID 3 non trouvé.");
//        }
//
//        // Modifier les informations du produit dont l'id = 1
//        Produit produit1 = ps.findById(1);
//        if (produit1 != null) {
//            produit1.setMarque("Adidas");
//            produit1.setReference("XYZ456");
//            produit1.setPrix(120.0);
//            produit1.setDesignation("Nouveaux Chaussures de sport");
//            ps.update(produit1);
//            System.out.println("Produit avec ID 1 modifié.");
//        } else {
//            System.out.println("Produit avec ID 1 non trouvé.");
//        }
//
//    }

