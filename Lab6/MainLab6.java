package Lab6;


import java.util.Arrays;

public class MainLab6 {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }

    static void q1(){
        int[] monthly = {1, 1, 1, 1, 1, -1, -1 , 1, -1};
        Customer yindee = new Customer("yindee");
        int i = 0;
        for(; i < monthly.length ; i++){
            yindee.spend(monthly[i]);
            yindee.showMembershipStatus();
        }

        System.out.println("---------------");
    }

    static void q2(){
        int[] monthly = {1, 1, 1, 1, 1, -1, -1 , 1, -1};
        Client preeda = new Client("preeda");
        int i = 0;
        for(; i < monthly.length ; i++){
            preeda.spend(monthly[i]);
            preeda.showMembershipStatus();
        }

        System.out.println("---------------");
    }

    static void q3(){
        MemberTypeWithDiscount p = MemberTypeWithDiscount.GOLD;
        MemberTypeWithDiscount q = MemberTypeWithDiscount.GOLD;
        System.out.println(p == q);
    }
}
