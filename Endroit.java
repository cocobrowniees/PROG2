package data;
public class Endroit {

    protected String identifiant;

    protected String nom;


    public Endroit() {
    }

    public Endroit (String identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



}
