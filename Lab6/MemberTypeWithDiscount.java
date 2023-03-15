package Lab6;

public enum MemberTypeWithDiscount {
    None(0, 0), SILVER(0.5, 0.5), GOLD(1.0, 2.0), PREMIUM(3.0, 4.5);

    private double product;
    private double service;

    private MemberTypeWithDiscount(final double product , final double service){
        this.product = product;
        this.service = service;
    }

    public double getProductDiscount(){
        return product*10;
    }

    public double getServiceDiscount(){
        return service*10;
    }
}
