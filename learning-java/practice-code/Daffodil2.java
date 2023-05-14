package com.learning.flot;
/*在控制台输出所有的“水仙花数”，
水仙花数是一个三位数;
水仙花数的个位、十位、百位的数字立方和等于原数;
记录水仙花个数；
 */
public class Daffodil2 {
    public static void main(String[] args) {
        int count=0;
        for (int i=100;i<=999;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println("水仙花数个数："+count);
    }
}
