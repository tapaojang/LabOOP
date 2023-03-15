package packA;

public class Salesperson extends Employee implements SalesRoles {
    private int target;

    public Salesperson(String name, int exp){
        
    }

    public Salesperson(String name, int sal, int exp, int assignedTarget){
        super.name = name;
        super.experience = exp;
        super.salary = salary;
        setTarget(assignedTarget);
    }

    public void setTarget(int target){
        this.target=target;
    }

    public int getTarget(){
        return target;
    }

    public void setSalary(){
        this.salary*=1.1;
    }

    public void setSalary(int increaseAmount){
        this.salary = salary + increaseAmount;
    }
    
    public String makeQuotation(){
        int total = (int)(Math.random()*1000)+1;
        return String.format("Dear value customer, %d is my best offer" , total);
    }

    public String toString(){
        return String.format("Saleperson [target=%d %s]" , target, super.toString());
    }
}