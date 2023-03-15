
import packA.*;
import java.util.ArrayList;

public class Lab3Polymorphism {
    public static void main(String[] args) {
        q1();
    }
    static void q1(){
        ArrayList<EmpTmp> alist = new ArrayList<>();
        alist.add(new Accountant("goodAtmyJob",7,6 , 390, "sing"));
        alist.add(new Accountant("canRap",4,9,480,"rap"));
        alist.add(new Salesperson("mr.salesperson",5,150,5000));
        alist.add(new Salesperson("mr.kayan",3,260,9000));
        alist.add(new Programmer("Keng",2,300));
        alist.add(new EmpTmp("invisible",9,120));
    
        System.out.println("Upcasting");
    
        for(EmpTmp e : alist){
            e.sayHi();
        }

        System.out.println("Downcastring");

        for(EmpTmp e : alist){
            String str = "";
            if(e instanceof Programmer){
                Programmer p = (Programmer)e;
                str = p.coding();
            }
            else if(e instanceof Salesperson){
                Salesperson s = (Salesperson)e;
                str = s.makeQuotation();
            }
            else if(e instanceof Accountant){
                Accountant a = (Accountant)e;
                str = a.tellProfit();
            }
            
            System.out.println(str);
        }
    }
}
