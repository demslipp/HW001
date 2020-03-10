public class Rectangle{
    private float length=1;
    private float width=1;

    public Rectangle (){
    }

    public Rectangle (float length, float width){

    }

    public float getLength (){
        return length;
    }

    public void setLength (float length){
        this.length=length;
    }

    public float getWidth (){
        return width;
    }

    public void setWidth (float width){
        this.width=width;
    }

    public double getArea (){
        return this.length * this.width;
    }

    public double getPerimeter (){
        return 2 * (this.width+this.length);
    }

    @Override
    public String toString (){
        return "Rectangle {"+
                "length="+length+
                ", width="+width+
                "}\n";
    }
}


