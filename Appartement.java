package data;//package data;

import java.awt.*;
import java.util.ArrayList;

public class Appartement{

    private int identifiant;
    private String titre;
    private String description;

    private int loyerMensuel;

    private String statut;

    private Endroit endroit;

    public Appartement(int identifiant, String titre, String description, int loyerMensuel, String statut, Endroit endroit) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }

    public Appartement() {
    }


    public int nbrAppart (List lc, Endroit endroit)
    {
        int cpt = 0;
        while(lc!=null){
            if(this.endroit!=null){
                cpt++;
            }
        }
        return cpt;
    }
}