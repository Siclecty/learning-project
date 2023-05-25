package com.learning.arraylist;

import java.util.ArrayList;
//某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100
//现在需要先把成绩低于80分以下的数据去掉。
public class ArrayListDele {
    public static void main(String[] args) {
        ArrayList scores=new ArrayList();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        for (int i = scores.size()-1; i >=0 ; i--) {
            int score=(int)scores.get(i);
            if (score<80){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
