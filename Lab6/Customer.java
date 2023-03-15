package Lab6;

public class Customer implements CanPay {
    private String name;
    private MemberType memberType;

    public Customer(String name){
        this.name = name;
        this.memberType = MemberType.None;
    }

    private void promoteMembertype(){
        switch (memberType){
            case None: memberType = MemberType.SILVER;
            break;
            case SILVER: memberType = MemberType.GOLD;
            break;
            case GOLD: memberType = MemberType.PREMIUM;
            break;
        }
    }

    private void demoteMembertype(){
        switch (memberType){
            case PREMIUM: memberType = MemberType.GOLD;
            break;
            case GOLD: memberType = MemberType.SILVER;
            break;
            case SILVER:
            break;
        }
    }

    public void showMembershipStatus(){
        System.out.println("You are now " + memberType);
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
