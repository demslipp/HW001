public class MyPoint{
    private int x=0;
    private int y=0;

    public MyPoint (){

    }

    public MyPoint (int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX (){
        return x;
    }

    public void setX (int x){
        this.x=x;
    }

    public int getY (){
        return y;
    }

    public void setY (int y){
        this.y=y;
    }

    public int[] getXY (){
        return new int[]{x, y};
    }

    public void setXY (int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString (){
        return "MyPoint{"+
                "x="+x+
                ", y="+y+
                '}';
    }

    public double distanceToGiven (int x, int y){
        return Math.sqrt (Math.pow (x-this.x, 2)+(Math.pow (y-this.y, 2)));
    }

    public double distanceToMyPoint (MyPoint myPoint){
        return Math.sqrt (Math.pow (myPoint.x-this.x, 2)+(Math.pow (myPoint.y-this.y, 2)));
    }

    public double distanceToZero (){
        return Math.sqrt (Math.pow (this.x-0, 2)+(Math.pow (this.y-0, 2)));
    }
}
