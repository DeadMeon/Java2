public class Objets {
    private int id;
    private int poids;

    //Constructeur

    public Objets() {
    }

    public Objets(int id, int poids) {
        this.id = id;
        this.poids = poids;
    }

    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
