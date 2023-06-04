public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 70, 60, 100, 80);
        Gryffindor ronWesley = new Gryffindor("Ron Wesley", 50, 60, 70, 55, 70);

        Hufflepuf zahariaSmith = new Hufflepuf("Zaharia Smith", 60, 55,80, 95, 55);
        Hufflepuf cedricDiggory = new Hufflepuf("Сedric Diggory", 40, 70, 65, 80, 90);
        Hufflepuf jastinFlinchFletclie = new Hufflepuf("Jastin-Flinch-Fletclie", 50, 45, 70, 80, 90);

        Ravenclaw choChang = new Ravenclaw("Сho Chang", 70, 40, 80, 65, 54, 66);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 50, 60, 70, 80,90, 100);
        Ravenclaw marcusBalbie = new Ravenclaw("Marcus Balbie", 90, 80, 70, 60, 50, 40);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 90, 90, 90, 90, 90, 90, 90);
        Slytherin grahanMontague = new Slytherin("Grahan Montague", 50, 60, 40, 50, 60, 70, 60);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 60, 70, 55, 60, 65, 70, 80);

        hermioneGranger.compareByGeneral(dracoMalfoy);
        hermioneGranger.compareBySpecific(harryPotter);




    }
}