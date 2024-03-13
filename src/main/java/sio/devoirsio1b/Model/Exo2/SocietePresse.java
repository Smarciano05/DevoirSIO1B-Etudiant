package sio.devoirsio1b.Model.Exo2;

import java.util.ArrayList;

public class SocietePresse
{
    private String nomSociete;
    private ArrayList<Pigiste> lesPigistes;

    public SocietePresse(String nomSociete) {
        this.nomSociete = nomSociete;
        this.lesPigistes = new ArrayList<>();
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public ArrayList<Pigiste> getLesPigistes() {
        return lesPigistes;
    }

    public void ajouterPigiste(Pigiste pigiste)
    {
        lesPigistes.add(pigiste);
    }
    // Cette méthode calcule le chiffre d'affaires
    // total de la société de presse
    // ca = CA PIGISTE ?
    public double calculerCA()
    {
        double CATotal= 0 ;




        return 0;
    }

    // Cette méthode retourne le meilleur pigiste
    // Le meilleur pigiste est celui qui a écrit
    // le plus grand nombre d'articles
    // S'il y a des ex aequo, on retourne toujours le premier
    public Pigiste getBestPigiste()
    {
        Pigiste best= null ;

        //if plus grand nombre
        for(Pigiste pigiste : lesPigistes)
        {
            for(Article article : pigiste.getLesArticles())
            {

                { //SI MEILLEUR
                    //   if(article.getNbPages() > )
                    {
                        //   best.getIdPigiste();
                    }
                    //SI EX AEQUOI
                    //   else if(best.getIdPigiste() == be)
                }
            }
        }


        return null;
    }

}
