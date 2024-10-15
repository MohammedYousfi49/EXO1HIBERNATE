package ma.projet.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "marque")
    private String marque;

    @Column(name = "reference")
    private String reference;

    @Column(name = "dateAchat")
    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @Column(name = "prix")
    private double prix;

    @Column(name = "designation")
    private String designation;

    public Produit() {
    }

    public Produit(String marque, String reference, Date dateAchat, double prix, String designation) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.designation = designation;
    }

    public Produit(String marque, String reference, double prix, String designation) {
        this.marque = marque;
        this.reference = reference;
        this.prix = prix;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", reference=" + reference + ", prix=" + prix + ", designation=" + designation + '}';
    }

}
