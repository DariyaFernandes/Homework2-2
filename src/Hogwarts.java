public abstract class Hogwarts {
    private String nane;
    private int powerOfMagic;
    private int transgressionDistance;

    public String getNane() {
        return nane;
    }

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.nane = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    private int calculateGeneralScore () {
        return powerOfMagic + transgressionDistance;
    }
    public abstract int calculateSpecificScore();

    public void compareBySpecific (Hogwarts hogwarts){
        int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
        int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("%s сильнее чем %s", this.nane, hogwarts.getNane()));
        } else if (thisScore < otherScore) {
            System.out.println((String.format("%s сильнее чем %s", hogwarts.getNane(), this.nane)));

        }
    }

    public void compareByGeneral (Hogwarts hogwarts){
        int thisScore = this.calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("%s сильнее чем %s", this.nane, hogwarts.getNane()));
        } else if (thisScore < otherScore) {
            System.out.println((String.format("%s сильнее чем %s", hogwarts.getNane(), this.nane)));

        }
    }


}
