public class Product {
    int id;
    String name;
    float price;
    Category category;

    public Product(){};
    public  Product(int id,String name,float price,Category categoryName){
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=categoryName;
    }
    public void display (){
        System.out.println("Ma SP" +id+"\n"+
                "Ten SP" +name+
                "Gia" +price+
                "Danh muc"+category.categoryName);
    }
}
