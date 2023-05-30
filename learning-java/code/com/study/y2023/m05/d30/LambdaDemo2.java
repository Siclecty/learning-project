package com.learning.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {

        useStringHandle(new StringHandle() {
            @Override
            public void show(String smg) {
                System.out.println("输出字符串"+smg);
            }
        });
        useStringHandle(smg->System.out.println("输出字符串"+smg));
    }
    public static void useStringHandle(StringHandle interB){
        interB.show("asddfv");
    }
}
interface StringHandle {
    void show(String smg);
}