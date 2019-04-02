public class Armes extends Objets{
    private int degats;
    private int categorie;
    private int etat;

    //Constructeur

    public Armes(int id, int poids, int degats, int categorie) {
        super(id, poids);
        this.degats = degats;
        this.categorie = categorie;
    }

    public Armes(int id, int poids, int degats, int categorie, int etat) {
        super(id, poids);
        this.degats = degats;
        this.categorie = categorie;
        this.etat = etat;
    }

    //Getter & Setter

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }
}
