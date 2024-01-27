public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    //สร้างAttributes
    public Customer(){
    }
    public Customer(String id , String firstName , String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //เป็นConstruct ของ class Customer
    public String getId(){
        return this.id;
    }
    //เป็น Getter เพื่อใช้ return id
    public String getFirstName(){
        return this.firstName;
    }
    //เป็น Getter เพื่อใช้ return firstName
    public String getLastName(){
        return this.lastName;
    }
    //เป็น Getter เพื่อใช้ return item lastName
}
