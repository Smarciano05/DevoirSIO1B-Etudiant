package sio.devoirsio1b.Model.Exo1;




    public class ProjetWeb extends  Projet
    {
        private boolean responsives;
        private int nbPages;


        public ProjetWeb(int idProjet, String nomProjet, int duree, double tauxHoraire , int nbPages , boolean responsives) {
            super(idProjet, nomProjet, duree, tauxHoraire);
            this.responsives = responsives;
            this.nbPages = nbPages;
        }
        public String getInfos()
        {
            return super.getInfos() + " Nb pages : " + nbPages + " Responsives : " + responsives;
        }
        public double calculerMontant()
        {
            double montant = 0 ;

            if(responsives)
            {
                montant = super.calculerMontant() + (nbPages * 100) + 500;
            }
            else
            {
                montant = super.calculerMontant() + (nbPages * 100);
            }
            return montant;
        }


    }
