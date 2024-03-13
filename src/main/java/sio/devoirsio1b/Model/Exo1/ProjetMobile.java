package sio.devoirsio1b.Model.Exo1;



public class ProjetMobile extends Projet {

    private int nbEcrans;


    public ProjetMobile(int idProjet, String nomProjet, int duree, double tauxHoraire, int nbEcrans) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbEcrans = nbEcrans;
    }

    public String getInfos() {
        return super.getInfos() + " Nb ecrans : " + nbEcrans;
    }

    public double calculerMontant() {
        double montant = 0;

        montant = super.calculerMontant() + nbEcrans * 200;

        return montant;

    }
}
