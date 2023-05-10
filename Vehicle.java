public class Vehicle {
    private int size;
    private int speed;
    public static void main(String[] args){
        Vehicle Ve=new Vehicle();
        Ve.setSize(10);
        Ve.setSpeed(30);
        Ve.move();
        Ve.speedUp();
        Ve.speedDown();
    }
    public void move(){
        System.out.println("行进中......\"+speed+\"km/h");
    }
    public void setSpeed(int speed){
        this.speed=speed;
        System.out.println("初始速度设置为:\"+speed+\" km");
    }
    public void setSize(int size){
        this.size=size;
        System.out.println("初始体积设置为:\"+size+\" m^3");
    }
    public void speedUp(){
        this.speed+=20;
        System.out.println("速度增加20后为:\"+speed+\" km");
    }
    public void speedDown(){
        this.speed-=10;
        System.out.println("减速10后为:\"+speed+\" km");
    }
}