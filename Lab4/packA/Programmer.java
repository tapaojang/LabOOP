package packA;
import java.util.ArrayList;

public class Programmer extends Employee {
    private ArrayList<String> skills ;

    public Programmer(String n, int exp, int sal){
        name = n;
        experience = exp;
        salary = sal;
    }
    public Programmer(String name, int exp) {
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
