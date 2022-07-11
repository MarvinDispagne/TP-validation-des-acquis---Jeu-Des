import java.util.Random;
import java.util.Scanner;

public class Partie {
    public static String joueurs[] = new String[3];
    //à ne pas initialiser de base car cela est à faire via la méthode initialiser
    joueurs[0]="";
    joueurs[1]="";
    joueurs[2]="";

    //joueurs[0]="Marvin";
    //joueurs[1]="Kyrie";
    //joueurs[2]="Bryan";

    //Tableau de joueurs Dans dans lequel on y rentre seulement 3 participants
    public int nb_tours;
    public static int [] TableauDéV2 = new int [] {0,0,0}; //Nouveau Gobelet de dé

//Constructeur
    public int constructor(int nb_tours, int nb_des){
        this.nb_tours = nb_tours;
        return nb_des;
    }

//3 Méthodes
    //initialiser() : permet d'inscrire des joueurs dans la partie
    //lancer() : lance la partie : chaque joueur joue à tour de rôle pendant les n tours.
    //Une fois la partie terminée, affiche le gagnant.
    //afficher_gagnant() : compare les scores des joueurs et affiche le gagnant.

    public void initialiser(){
        Scanner NouveauNom = new Scanner(System.in);
        System.out.println("Veuillez renseigner votre nom");
        String NomParticipant = NouveauNom.next();
    }

    public void lancer(){

        int nb_tours = 3; //on estime avoir 3 tours

        for (int i =0; i <= nb_tours; i = i + 1){

            int min = 1;
            int max = 6;
            Random alea1 = new Random(); //objet alea qui nous permet de générer une valeur aleatoire entre une plage d'entier
            Gobelet.TableauDé[i] = alea1.nextInt(max + min) + min;
            //Pour un joueur créer dans la classe main, lorque que l'on va lancer la methode lancer(), les valeurs de son tableau de dé sera initié
        }

    }



    public void afficher_gagnant(){
        //Boucle if, le Score le Plus Elevée sera par defaut le score du premier joueur, il suffit ensuite de comparer les scores, si le score du joueur2 est plus elevée que le score du joueur1,
        //alors l'attribut ScoreLePlusElevée prends la valeurs du score du joueur2
    int ScoreLePlusElevée = Gobelet.TableauDé[1] + Gobelet.TableauDé[2] + Gobelet.TableauDé[3];
    // Il me manque la boucle car je ne sais plus comment avoir un tableau de dés differents pour chaque joueur !!!
        System.out.println("Le gagnant est " + Joueur.Nom + " avec un score de " + ScoreLePlusElevée);
    }
}
