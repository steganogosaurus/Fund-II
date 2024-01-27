
public class Product{
    private String id;
    private String name;
    private double price;
    //สร้างAttributes
    public Product(String id, String name,double price){
        this.id = id;
        this.name = name;
        if(price < 0 ){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }
    //เป็นConstruct ของ class Product
    public String getId(){
        return this.id;
    }
    //เป็น Getter เพื่อใช้ return ID
    public String getName(){
        return this.name;
    }
    //เป็น Getter เพื่อใช้ return name
    public void setPrice(double price){
        if(price < 0){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }
    //เป็น Setter ไว้กำหนดค่าของสินค้า
    public double getPrice(){
        return this.price;
    }
    //เป็น Getter เพื่อใช้ return ราคาสินค้า
}
