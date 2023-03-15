package packA;

public class Accountant extends EmpTmp {
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;

    public Accountant(String name, int superExp, int experience, int sal, String talent){
        super(name, superExp, sal);
        this.experience = experience;
        this.specialty = talent;

    }

    public void setSpecialty(String newSpecialty){
        this.specialty = newSpecialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setAccountExperience(int exp){
        this.experience = exp;
    }

    public int getAccountExperience(){
        return experience;
    }

    public String tellProfit(){
        int total = (int)(Math.random()*1000)+1;
        return String.format("%s's profit is %d. My salary is %d" , companyName, total, salary);
    }

    public String toString(){
        return String.format("Accountant [experience=%d, specialty=%s]", experience, specialty);
    }

    @Override
    public void sayHi(){
        System.out.println(getName() + " says hello");
    }

    public static String tellMyRole(){
        return String.format("I am an accountant at %s" , companyName);
    }
}
