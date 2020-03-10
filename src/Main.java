import java.util.List;

public class Main{
    public static void main (String[] args){

        Circle circle=new Circle ();
        System.out.println (circle.getArea ());
        System.out.println (circle.toString ());

        Rectangle rectangle=new Rectangle ();
        System.out.println (rectangle.getArea ()+", "+rectangle.getPerimeter ());
        System.out.println (rectangle.toString ());

        Employee employee=new Employee (1, "Evgeny", "Krotov", 45000);
        System.out.println (employee.getName ()+", "+employee.getAnnualSalary ()+", "+employee.raiseSalary (30));
        System.out.println (employee.toString ());

        Book book = new Book ("asd", 0, 123);
        //System.out.println ();


    }
}
