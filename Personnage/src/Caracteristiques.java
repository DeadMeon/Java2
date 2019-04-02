import static java.lang.Math.*;

public class Caracteristiques {
    private int intelligence;
    private int force;
    private int dexterite;
    private int constitution;
    private int sagesse;
    private int charisme;
    private int mana = 10;
    private int endurance = 10;



    public Caracteristiques(int intel, int force, int chari, int consti, int dext, int sage, int mana, int endurance) {
        this.intelligence = intel;
        this.force = force;
        this.charisme = chari;
        this.constitution = consti;
        this.dexterite = dext;
        this.sagesse = sage;
        this.mana = mana;
        this.endurance = endurance;
    }

    public Caracteristiques(int mana, int endurance) {
        this.intelligence = (int)(random()*20);
        this.force = (int)(random()*20);
        this.dexterite = (int)(random()*20);
        this.constitution = (int)(random()*20);
        this.sagesse = (int)(random()*20);
        this.charisme = (int)(random()*20);
        this.mana = mana;
        this.endurance = endurance;
    }



    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterite() {
        return dexterite;
    }

    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getSagesse() {
        return sagesse;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

    public int getCharisme() {
        return charisme;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
}
