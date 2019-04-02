public class Competence {
    private int comp1;
    private int comp2;



    public Competence() {
    }



    public int getComp1() {
        return comp1;
    }

    public void setComp1(int comp1) {
        this.comp1 = comp1;
    }

    public int getComp2() {
        return comp2;
    }

    public void setComp2(int comp2) {
        this.comp2 = comp2;
    }


    @Override
    public String toString() {
        return "\nCompetence" +
                "\n\tcomp1 = " + comp1 +
                "\n\tcomp2 = " + comp2;
    }
}
