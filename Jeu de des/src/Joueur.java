public class Joueur {
    public String Nom;  //2 attributs pour la classe joueur
    public int Score;

    //Constructeur
    public void constructor(String Nom) {
        this.Nom = Nom;
        this.Score = 0;
    }

    //Nous avons 4 Méthodes
    //get_nom() : renvoie le nom du joueur
    //get_score() : renvoie le score du joueur
    //jouer(gobelet) : prend en paramètre le gobelet de la partie, lance le gobelet, met à
    //jour le score du joueur en fonction du résultat du lancé
    //afficher_score() : affiche en console le score du joueur

    public String get_nom() {
        return Nom;
    }
    public int get_Score() {
        return Score;
    }

    public void jouer(Gobelet) {
        //cette methode va aussi appeler la méthode lancer() à partir de la classe Gobelet
        //Mettre un 'this' pour pouvoir prendre en compte le parametre Gobelet dans la méthode lancer()
        Gobelet.lancer();
        Score = Gobelet.TableauDé[0];
    }

    public void afficher_score() {
        System.out.println("Voici votre score " + Score);
    }
//Mon erreur est que Score devrait representer le score des 3 tirages successif, or cette attribut retourne le score de seulement 1 tirage

}


