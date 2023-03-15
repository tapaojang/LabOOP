package packA;

public class ProgrammerManager extends Programmer implements ManagerRoles{
    public ProgrammerManager(String n, int exp, int salary){
        super(n,exp,salary);
    }
    public void sayHi(){
        System.out.println("Coding in [solidity , typescript]");
    }

    public String coding(){
        return "coding";
    }

    public int evaluate(Programmer p){
        return p.salary += p.salary*15/100;
    }

    @Override
    public String toString() {
        return String.format("ManagerProgrammer [name=%s, salary=%d, experience=%d]", name, salary, experience);
    }
}