public class LineItem {
    private Product item;
    private int quantity;
    //สร้างAttributes
    public LineItem(Product product,int quantity){
        this.item = product;
        if(quantity < 0){
            this.quantity = 0;
        }else {
            this.quantity = quantity;
        }
    }
    //เป็นConstruct ของ class LineItem
    public Product getProduct(){
        return this.item;
    }
    //เป็น Getter เพื่อใช้ return item
    public int getQuantity(){
        return this.quantity;
    }
    //เป็น Getter เพื่อใช้ return quantity
    public double getTotalPrice(){
        return item.getPrice() * getQuantity();
    }
    //เป็น Getter เพื่อใช้ return TotalPrice
}
