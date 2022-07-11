import java.util.Random;
import java.util.Scanner;

public class Gobelet {  //2 Attributs
    public int ValeurGobelet;
    public int nbdes;
    public static int [] TableauDé = new int [] {0,0,0}; //Dans cette exemple j'ai initialisé le tableau
                              // dans le int[] il faut mettre la variable     //  Il y a 3 dés, initié à 0 car pas encore lancé
//Constructeur avec un argument qui initialise la valeur du gobelet à 0, génère le nombre de dés nécessaires à la partie et les ajoutes au tableau

    public void constructor(int nbdes){
        ValeurGobelet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez renseigner un nombre de dés avant de commencer la partie");
        nbdes = scanner.nextInt();
        this.nbdes = nbdes;
    }

//3 Méthodes
    //get_valeur() : renvoie la valeur du gobelet
    //lancer() : change la valeur des dés du gobelet ; met à jour la valeur du gobelet
    //afficher_score() : affiche en console le score du dernier lancé de gobelet

    public int get_valeur() {
        return ValeurGobelet;
    }

    public static void lancer() {


        for (int i =0; i <= 2; i = i + 1){//Boucle for qui va donner une valeur entre 1 et 6 à chaque indice du tableau

        int min = 1;
        int max = 6;
        Random alea1 = new Random(); //objet alea qui nous permet de générer une valeur aleatoire entre une plage d'entier
        TableauDé[i] = alea1.nextInt(max + min) + min;

        }
        // Un nombre aleatoire entre 1 et 6 est générer pour chaque indice du tableau
    }


    public void afficher_score(){

        int x = 0;
        int resultat = TableauDé[x] + TableauDé[x+1] + TableauDé[x+2];
        System.out.println("Voici le score du lancer de gobelet "+ resultat);
    }


}
