package data;//package data;
public class Immeuble extends Endroit
{
    private int nbrEtage;

    public Immeuble(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }

    public Immeuble(String identifiant, String nom, int nbrEtage) {
        super(identifiant, nom);
        this.nbrEtage = nbrEtage;
    }


}
