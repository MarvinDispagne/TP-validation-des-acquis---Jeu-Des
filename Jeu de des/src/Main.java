public class Main {
    public static void main(String[]  args){
        //Création de 3 joueurs via constructeur surchargé
        Joueur Joueur1 = new Joueur(String Nom, int score);
        Joueur Joueur2 = new Joueur(String Nom, int score);
        Joueur Joueur3 = new Joueur(String Nom, int score);
        }
        //Sur la classe main, il faut appeler les methodes que l'on a défini dans les différentes classe pour pouvoir lancer le jeu

        initialiser();
        Lancer();
        afficher_gagnant();

    }

