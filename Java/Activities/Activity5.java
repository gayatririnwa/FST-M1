package Activities;

abstract class Book{
    String title;
    public abstract void setTitle(String s);
    public String getTitle(){
        return this.title; 
    }

}
class Mybook extends Book{
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5{
    public static void main(String[] args) { 
        String title = "new book";
        Book obj = new Mybook();
        obj.setTitle(title);
        System.out.println("name of book"+ obj.getTitle());
    }
}
