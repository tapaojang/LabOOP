package Lab6;

public class Client implements CanPay{
    private String name;
    private MemberTypeWithDiscount memberType;

    public Client(String name) {
        this.name = name;
        this.memberType = MemberTypeWithDiscount.None;
    }

    private void promoteMembertype(){
        switch (memberType){
            case None: memberType = MemberTypeWithDiscount.SILVER;
            break;
            case SILVER: memberType = MemberTypeWithDiscount.GOLD;
            break;
            case GOLD: memberType = MemberTypeWithDiscount.PREMIUM;
            break;
        }
    }

    private void demoteMembertype(){
        switch (memberType){
            case PREMIUM: memberType = MemberTypeWithDiscount.GOLD;
            break;
            case GOLD: memberType = MemberTypeWithDiscount.SILVER;
            break;
            case SILVER: memberType = MemberTypeWithDiscount.SILVER;
            break;
        }
    }
    
    
    public void showMembershipStatus(){
        System.out.println("You are now " + memberType +" " + (int)memberType.getProductDiscount() +"% discount on Product " +(int)memberType.getServiceDiscount()+  "% on service.");
    }

    @Override
    public void spend(int direction) {
        if(direction < 0){
            demoteMembertype();
        } else{
            promoteMembertype();
        }
    }
}