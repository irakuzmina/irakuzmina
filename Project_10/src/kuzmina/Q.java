package kuzmina;

public class Q {
    public static void main(String[] args) {
        Cat murzik = new Cat ("Barsic",4);
        System.out.println(murzik.getName() + " is running 250m -> " + murzik.run(150));
        System.out.println(murzik.getName() + " is swimming 20m -> " + murzik.swim(-10));
        System.out.println(murzik.getName() + " is jumping 10m -> " + murzik.jump(5));

        Dog sharik = new Dog ("Yuki", 2);
        System.out.println(sharik.getName() + " is running 250m -> " + sharik.run(250));
        System.out.println(sharik.getName() + " is swimming 5m -> " + sharik.swim(5));
        System.out.println(sharik.getName() + " is jumping 0.3m -> " + sharik.jump(0.3));
    }
}
