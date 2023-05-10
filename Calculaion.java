public class Calculaion{
    private double a;
    private double b;
    public Calculaion(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println("a加b ："+(a+b));
    }
    public void sub(){
        System.out.println("a减b ："+(a-b));
    }
    public void times(){
        System.out.println("a乘b ："+(a*b));
    }
    public void div(){
        System.out.println("a除以b ："+(a/b));
    }
    public static void main(String[] args){
        Calculaion c=new Calculaion(4.0,3.0);
        c.add();
        c.sub();
        c.div();
        c.times();
    }
}