package sio.devoirsio1b.Model.Exo1;



    public class Projet implements Comparable<sio.devoirsio1b.Model.Exo1.Projet>
    {
        private int idProjet;
        private String nomProjet;
        private int duree;
        private double tauxHoraire;

        public Projet(int idProjet, String nomProjet, int duree, double tauxHoraire) {
            this.idProjet = idProjet;
            this.nomProjet = nomProjet;
            this.duree = duree;
            this.tauxHoraire = tauxHoraire;
        }

        public String getInfos()
        {
            return "Numero : " + idProjet + " Nom : " + nomProjet + " Duree : " + duree + " Taux horaire : " + tauxHoraire;
        }
        public double calculerMontant()
        {
            double montant = 0 ;

            montant = duree * tauxHoraire * 8 ;

            return montant;
        }

        public int compareTo(sio.devoirsio1b.Model.Exo1.Projet o) {
            {
                return Double.compare( o.calculerMontant(),this.calculerMontant());
            }
        }
    }






