package packA;

public class Programmer extends EmpTmp {
    private String name;
    protected int salary;
    private int experience;

    public Programmer(String name, int exp, int sal){
        this.name = name;
        this.experience = exp;
        this.salary = sal;
    }
    public Programmer(String name2, int exp) {
    }
    @Override
    public void sayHi(){
        System.out.println("hi from " + name);
    }

    public String toString(){
        return String.format("Programmer [name=%s, salary=%d, experience=%d]", name, salary, experience);
    }
    public String coding(){
        return "coding";
    }
}