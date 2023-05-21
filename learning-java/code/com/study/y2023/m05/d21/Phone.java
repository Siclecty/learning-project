package com.learning.object;
//定义一个手机类 (Phone)
//	属性: (品牌 brand，颜色 color, 价格 price)
//	行为:
//		打电话 (call)
//			- 输出给 xxx 打电话
//		发短信 (sendMessage)
//			- 输出群发短信
//编写一个手机测试类 (PhoneTest)
//	创建两个手机对象,  并给属性赋值
//		1. 小米,  白色,  4999
//		2. 华为,  黑色,  6999
//	赋值之后, 校验自己有没有赋值成功,  使用打印语句校验, 调用两个对象各自的成员方法
public class Phone {
        String brand;
        String color;
        int price;
        public void call(){
            System.out.println("输出给 xxx 打电话");
        }
        public void sendMessage(){
            System.out.println("输出群发短信");
        }
}
class PhoneTest{
    public static void main(String[] args) {
        Phone ph1=new Phone();
        ph1.brand="小米";
        ph1.color="白色";
        ph1.price=4999;
        Phone ph2=new Phone();
        ph2.brand="华为";
        ph2.color="黑色";
        ph2.price=6999;
        System.out.println(ph1.brand+"\t"+ph1.color+"\t"+ph1.price);
        System.out.println(ph2.brand+"\t"+ph2.color+"\t"+ph2.price);
        ph1.call();
        ph1.sendMessage();
        ph2.call();
        ph2.sendMessage();
    }
}