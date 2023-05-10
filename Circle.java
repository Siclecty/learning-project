public class Circle {
private int r;
public Circle(){}
    public Circle(int r){
    this.r=r;
    }
    public void setR(int r){
    this.r=r;
    }
    public void getArea(){
    double area=Math.PI*r*r;
    System.out.println("圆的面积为："+area);
    }
    public void getPerimeter(){
    double zc=Math.PI*2*r;
    System.out.println("圆的周长为："+zc);
    }
}
class TestCircle{
    public static void main(String[] args){
        Circle c=new Circle(5);
        c.getArea();
        c.getPerimeter();
    }
}