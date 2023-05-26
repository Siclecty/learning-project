package com.learning.mextend;

public class ExtendsDemo1 {
    public static void main(String[] args) {

        Students students=new Students("math","strive");
        System.out.println(students.getKnowledge());
        System.out.println(students.getMethod());
    }
}
class Teach{
    private String Knowledge;
    private String method;

    public Teach() {
    }

    public Teach(String knowledge,String method) {
        Knowledge = knowledge;
        this.method = method;
    }

    public String getKnowledge() {
        return Knowledge;
    }

    public void setKnowledge(String knowledge) {
        Knowledge = knowledge;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
class Students extends Teach {
    public Students(String knowledge,String method){
        super(knowledge,method);
    }
}