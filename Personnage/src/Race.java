public abstract class Race {
    private Language langue;
    private Competence comp;
    private int ageMax;
    private int age;
    private int poids;
    private int taille;

    public Race(Language langue, Competence comp, int ageMax, int age, int poids, int taille) {
        this.langue = langue;
        this.comp = comp;
        this.ageMax = ageMax;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
    }

    public Race() {
    }

    public Language getLangue() {
        return langue;
    }

    public void setLangue(Language langue) {
        this.langue = langue;
    }

    public Competence getComp() {
        return comp;
    }

    public void setComp(Competence comp) {
        this.comp = comp;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
