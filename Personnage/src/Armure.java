public class Armure extends Objets {
    private int protection;
    private int etat;

    //Constructeur

    public Armure(int id, int poids, int protection) {
        super(id, poids);
        this.protection = protection;
    }

    public Armure(int id, int poids, int protection, int etat) {
        super(id, poids);
        this.protection = protection;
        this.etat = etat;
    }

    //Getter & Setter

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
