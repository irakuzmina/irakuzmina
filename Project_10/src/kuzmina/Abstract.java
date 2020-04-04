package kuzmina;

interface Ira{
    boolean run(double distance);
    boolean swim(double distance);
    boolean jump(double high);
}

public abstract class Abstract implements Ira{
    protected String name;
    protected int age;
    protected double valueRun;
    protected double valueSwim;
    protected double valueJump;
    public void setName(String klich){
        name = klich;
    }
    public void setAge (int vozr){
        age = vozr;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Abstract(String klich, int vozr, double valueRun, double valueSwim, double valueJump){
        this.name = klich;
        this.age = vozr;
        this.valueRun = valueRun;
        this.valueSwim = valueSwim;
        this.valueJump = valueJump;
    }

    public boolean run(double distance) {
        return (valueRun>=distance);
    }

    public boolean swim(double distance) {
        return (valueSwim>=distance);
    }

    public boolean jump(double high) {
        return (valueJump>=high);
    }
}

class Cat extends Abstract {
    public Cat(String klich, int vozr) {
        super(klich, vozr, 200, 0, 2);

    }
    @Override
    public boolean swim(double distance) {
        return false;
    }
}

class Dog extends Abstract{
    public Dog(String klich, int vozr) {
        super(klich, vozr, 500, 10, 0.5);
    }
}
