package kuzmina;

import java.util.ArrayList;

public class Sorevi {
    private String name;
    private int age;
    public void setName(String im) {
        name = im;
    }
    public void setAge(int vozr) {
        age = vozr;
    }
    public String getName() {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public Sorevi(String im, int vozr)
    {
        name = im;
        age = vozr;
    }
}

class Komand extends Sorevi{
    public Komand(String im, int vozr) {
        super(im, vozr);
    }
    public String toString()
    {
        return getName() + " " + getAge();
    }
}

class Lichka extends Sorevi{
    public Lichka(String im, int vozr) {
        super(im, vozr);
    }
    public String toString()
    {
        return getName() + " " + getAge();
    }
}

class Champ
    {
        private ArrayList<Sorevi> participants = new ArrayList<Sorevi>();
        public void addSorevi(Sorevi x)
        {
            participants.add(x);
        }
        public void CLearner(ArrayList<Sorevi> n)
        {
            participants = n;
        }
        public void printChamp()
        {
            System.out.println("В чемпионате: ");
            for(Sorevi a:participants)
            {
                System.out.println("\t"+a.toString());
            }
        }
        public void countingKomand() {
            int n = 0;
            for (Sorevi a : participants) {
                if (a instanceof Komand) {
                    n++;
                }
            }
            System.out.println(n + " участников в командном");
        }
        public void countingLichka() {
            int k = 0;
            for (Sorevi a : participants) {
                if (a instanceof Lichka) {
                    k++;
                }
            }
            System.out.println(k + " участников в личном");
        }
    }


