public class Circle{
    private double radius=0.1;
    private String color="red";

    public Circle (){
    }

    public Circle (double radius){
    }

    public Circle (double radius, String color){

    }

    public double getRadius (){
        return radius;
    }

    public void setRadius (double radius){
        this.radius=radius;
    }

    public String getColor (String color){
        return color;
    }

    public void setColor (String color){
        this.color=color;
    }


    @Override
    public String toString (){
        return "Circle {"+
                "radius="+radius+
                ", color='"+color+'\''+
                "}\n";
    }

    public double getArea (){
        return Math.pow (this.radius, 2) * Math.PI;
    }
}
