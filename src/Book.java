import java.util.List;

public class Book{
    private String name;
    private Author[] authors=new Author[0];
    private double price;
    private int qty=0;


    public Book (String name, Author[] authors, double price){
    }

    public Book (String name, Author[] authors, double price, int qty){
    }

    public String getName (){
        return name;
    }

    public Author getAuthors (){
        return authors[0];
    }

    public double getPrice (){
        return price;
    }

    public void setPrice (double price){
        this.price=price;
    }

    public int getQty (){
        return qty;
    }

    public void setQty (int qty){
        this.qty=qty;
    }

    @Override
    public String toString (){
        return "Book{"+
                "name='"+name+'\''+
                ", authors="+authors+
                ", price="+price+
                ", qty="+qty+
                '}';
    }
    public String getAuthorNames(){
        return authors[0].toString ();
    }
}