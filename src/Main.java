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

        Author[] authors=new Author[5];

        for (int i=0; i<5; i++){
            Author author=new Author ("Author "+(i+1), "example@books.ru", 'm');
            authors[i]=author;
        }
        Book book=new Book ("asd", authors, 123);
        System.out.println (book.toString ());
        System.out.println (book.getAuthorNames ()+"\n");

        MyPoint myPoint=new MyPoint (7, 5);
        MyPoint myPoint1=new MyPoint (1, 1);
        System.out.println (myPoint.toString ());
        System.out.println (myPoint.distanceToGiven (1, 3));
        System.out.println (myPoint.distanceToMyPoint (myPoint1));
        System.out.println (myPoint.distanceToZero ()+"\n");

        MyTriangle myTriangle=new MyTriangle (new MyPoint (0, 0), new MyPoint (0, 5), new MyPoint (5, 0));
        System.out.println (myTriangle.toString ());
        System.out.println (myTriangle.getPerimeter ());
        System.out.println (myTriangle.getType ());
    }
}
