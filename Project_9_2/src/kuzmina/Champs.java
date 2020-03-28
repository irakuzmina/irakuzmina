package kuzmina;

public class Champs {
    public static void main(String[] args) {
        Lichka lichka = new Lichka("Ira",  20);
        Komand komand1 = new Komand("Aydin", 24);
        Komand komand2 = new Komand("Ivan", 22);
        Champ champ= new Champ();
        champ.addSorevi(lichka);
        champ.addSorevi(komand1);
        champ.addSorevi(komand2);
        champ.countingKomand();
        champ.countingLichka();
        champ.printChamp();
    }
}
