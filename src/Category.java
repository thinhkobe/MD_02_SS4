public class Category {
    int id;
    String categoryName ;
    public Category(int id,String name){
        this.id=id;
        this.categoryName=name;
    }
    public void display(){
        System.out.println("categoryID :" +id+
                "categoryName :"+categoryName);
    }
}
