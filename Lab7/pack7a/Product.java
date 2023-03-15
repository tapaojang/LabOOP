package pack7a;

public abstract class Product {
    protected String pName;
    protected String desc;

    public Product(String n, String d) {
        pName = n;
        desc = d;
    }

    // public Product(String n){
    //     this.pName = n;
    // }

    public String getpName() {
        return pName;
    }

    public String getDesc() {
        return desc;
    }
}
