package kuzmina;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Triangle.run();
        Rectangle.run();
        Massiv.run();
    }
}
class Triangle{
    private int x;
    private int y;
    private int z;
    Triangle(){
        this.x=4;
        this.y=5;
        this.z=6;
    }
    private static Triangle P=new Triangle();
    private static void Dlina(){
        System.out.println(P.x);
        System.out.println(P.y);
        System.out.println(P.z);
    }
    private static void NaitiPl() {
        int Pl = P.x + P.y + P.z;
        System.out.println("Pl(P)=" + Pl);
    }
    private static  void NaitiS(){
        double Pl=(P.x + P.y + P.z)/2.0;
        double S=Math.sqrt(Pl*(Pl-3)*(Pl-3)*(Pl-3));
        System.out.println("S(P)= "+S);
    }
    public static void run(){
        System.out.println(("Triangle"));
        Dlina();
        NaitiPl();
        NaitiS();
        System.out.println("Выполнено");
        System.out.println(" ");
    }
}
class Rectangle{
    private int x,y;

    Rectangle(){
        this.x=4;
        this.y=5;
    }
    private static Rectangle U=new Rectangle();

    private static void Dlina(){
        System.out.println((U.x));
        System.out.println((U.y));

    }
    private static void NaitiPl(){
       int Pl=(U.x+U.y)*2;
       System.out.println("Pl(U)= "+Pl);
    }
    private static void NaitiS(){
        int S=U.x*U.y;
        System.out.println("S(U)= "+S);
    }
    public static void run(){
        System.out.println("Rectangle");
        Dlina();
        NaitiPl();
        NaitiS();
        System.out.println("Выполнено");
        System.out.println(" ");
    }

}
class Massiv{
    private int[] intMassiv;
    static private int n;

    Massiv(int n){
        this.intMassiv=new int[n];
    }
    private static Scanner sc= new Scanner(System.in);

    private static Massiv create(){
        System.out.println("create Massiv");
        System.out.println("Dlina= ");
        n= sc.nextInt();
        Massiv M=new Massiv(n);
        for(int i=0; i<n;i++){
            System.out.println("Massiv["+i+"]=");
            M.intMassiv[i]=sc.nextInt();
        }
        return M;
    }
    static private Massiv M=create();

    private static void view(){
        System.out.println("view()");
        for (int i=0;i<n;i++){
            System.out.println("Massiv["+i+"]= ");
            System.out.println(M.intMassiv[i]);
        }
    }
    private static void sort(){
        System.out.println("sort() done");
        int y;
        for (int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(M.intMassiv[k]>M.intMassiv[i]){
                    y=M.intMassiv[k];
                    M.intMassiv[k]=M.intMassiv[i];
                    M.intMassiv[i]=y;
                }
            }
        }
    }
    public static void run(){
        System.out.println("Massiv");
        view();
        sort();
        view();
        System.out.println("Выполнено");
        System.out.println(" ");
    }
}



