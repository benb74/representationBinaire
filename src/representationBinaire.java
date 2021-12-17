import java.util.Scanner;

public class representationBinaire {

    /**
     * @author Benoit
     */
    public class RepresentationBinaire {

        /**
         * @param args
         */
        public static void main(String[] args) {
            // Message d'accueil
            System.out.println("************************************************");
            System.out.println("********    TP REPRESENTATION BINAIRE    *******");
            System.out.println("************************************************");
            System.out.println();

            // Variables
            int nombreSaisi = -1;
            String nombreBinaire = "";
            Scanner sc = new Scanner(System.in);

            // Vérification de la saisie. Doit être comprise entre 0 et 256
            while (nombreSaisi < 0 || nombreSaisi > 256) {
                System.out.println("Saisir un nombre entre 0 et 256");
                nombreSaisi = sc.nextInt();
            }

            do {
                int reste = nombreSaisi % 2;
                nombreBinaire = reste + nombreBinaire;
                nombreSaisi = (nombreSaisi - reste) / 2;
                /*
                 *L'algorithme présenté ici repose sur la division par la base voulue.
                 *Dans le cas d'une représentation binaire, la base est 2
                 *Le binaire s'obtient par la récupération du modulo
                 *Une fois récupéré, le nombreSaisi est divisé par 2
                 *Et l'opération recommence.
                 *Voici un exemple :
                 *Si le nombreSaisi = 2
                 *Alors le reste sera de 0 (nombreSaisi % 2). Il composera la fin de la chaine de caractères de 'nombreBinaire'
                 *nombreSaisi est ensuite divisé par 2. Le résultat donne 1. Puis le module vaut 1. Il est ajouté 'devant' le 0.
                 *La représentation binaire est de 10.
                 *nombreSaisi - reste vaut 0. La boucle se finit.
                 * */
            } while (nombreSaisi != 0);

            System.out.println("La représentation binaire est : " + nombreBinaire);

            //Fermeture du scanner
            sc.close();

        }
    }
}

