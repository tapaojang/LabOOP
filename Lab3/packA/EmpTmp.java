package packA;
public class EmpTmp {
    protected String name;
    protected int salary;
    protected int experience;
    
    public EmpTmp(){

    }
    public EmpTmp(String name){
        this.name = name;
    }
    public EmpTmp(String name, int experience, int salary){
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public int getExperience(){
        return experience;
    }
    @Override
    public String toString() {
        return "EmpTmp [name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
    }
    public void sayHi(){
        System.out.println("hi hi form EmpTmp");
    }

    
}