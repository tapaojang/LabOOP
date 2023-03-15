package packA;

public class Programmer {
    private String name;
    protected int salary;
    private int experience;

    public Programmer() {
    }

    public Programmer(String name, int exp) {
        this.name = name;
        this.experience = exp;
    }

    public Programmer(String name, int exp, int sal) {
        this.experience = exp;
        this.salary = sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    public int getSalary() {
        return salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void sayHi() {
        System.out.println("hi from " + name);
    }

    public String toString() {
        return String.format("Programmer [name=%s, salary=%d, experience=%d]", name, salary, experience);
    }
}