import java.util.Random;

public class Dé {
    //Attribut
    public int Valeur; // un nombre représentant la valeur d'un lancer de dé

//Constructeur sans arguments, qui initialise la valeur du dé à 0

    public Dé() {
      this.Valeur = 0;
    }
//Méthodes
    //get_valeur(): qui renvoie la valeur du dé
    //lancer(): change la valeur du dé -> cette valeur doit être un nombre généré
    //aléatoirement entre 1 et 6

    public int get_Valeur(){
      return Valeur;
    }

    public int lancer(){
        int min = 1;
        int max = 6;
        Random alea = new Random(); //objet alea qui nous permet de générer une valeur aleatoire entre une plage d'entier
        this.Valeur = alea.nextInt(max + min) + min;
        return Valeur;
    }

}
