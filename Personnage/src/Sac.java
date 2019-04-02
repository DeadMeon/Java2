public class Sac {
    private int tailleSac;
    private Objets[] sac;

    //Constructeur

    public Sac(int tailleSac) {
        this.tailleSac = tailleSac;
        this.sac = new Objets[tailleSac];
    }

    //Getter & Setter

    public int getTailleSac() {
        return tailleSac;
    }

    public Objets[] getSac() {
        return sac;
    }

    public Objets getSac(int i){
        return sac[i];
    }

    public void setTailleSac(int tailleSac) {
        if (getTailleSac() > tailleSac || poidsTotal() > tailleSac){

        } else {
            this.tailleSac = tailleSac;
            Objets[] sacTmp = new Objets[tailleSac];
            for (int i = 0; i < getTailleSac(); i++) {
                sacTmp[i] = sac[i];
            }
            sac = sacTmp;
        }
    }

    public void setSac(int i, Objets objet){
        this.sac[i] = objet;
    }

    public void setSac(Objets[] sac) {
        if (getTailleSac() > tailleSac || poidsTotal() > tailleSac){

        } else {
            this.sac = sac;
        }
    }

    //Methodes

    public int poidsTotal(){
        int poids = 0;
        for (Objets obj: getSac()) {
            poids += obj.getPoids();
        }
        return poids;
    }
}
