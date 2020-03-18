public class MyTriangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3){
    }

    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }


    @Override
    public String toString (){
        return "MyTriangle{"+
                "v1="+v1+
                ", v2="+v2+
                ", v3="+v3+
                '}';
    }


    public double getPerimeter (){
        double line1=v1.distanceToMyPoint (v2);
        double line2=v2.distanceToMyPoint (v3);
        double line3=v3.distanceToMyPoint (v1);
        return line1+line2+line3;
    }

    public String getType (){
        double line1=v1.distanceToMyPoint (v2);
        double line2=v2.distanceToMyPoint (v3);
        double line3=v3.distanceToMyPoint (v1);

        return (line1 == line2 && line2 == line3 && line1 == line3) ?
                "Equilateral" : (line1 == line2 || line2 == line3 || line1 == line3) ? "Isosceles" : "Scalene";
    }
}

