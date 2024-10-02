package data;

import data.Appartement;
import data.Endroit;

import javax.lang.model.type.NullType;

public class Quartier<appart> extends Endroit
{
    private String ensembleimmeubles;

    public Quartier(String ensembleimmeubles) {
        this.ensembleimmeubles = ensembleimmeubles;
    }

    public Quartier(String identifiant, String nom, String ensembleimmeubles) {
        super(identifiant, nom);
        this.ensembleimmeubles = ensembleimmeubles;
    }

    public String getEnsembleimmeubles() {
        return ensembleimmeubles;
    }

    public void setEnsembleimmeubles(String ensembleimmeubles) {
        this.ensembleimmeubles = ensembleimmeubles;
    }

    Appartement appart = new Appartement();
    public void existenceAppartement(Appartement appart){

        if(appart.getEndroit() != null){
            System.out.println("L'appartement existe dans le quartier");
        }
        else{
            System.out.println("L'appartement n'existe pas");
        }
        }
}
