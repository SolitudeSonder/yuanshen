package org.example;

public class RandomUtil {
    static public boolean Random(double n){
        //n：概率，按百分比
        //生成[0,100]之间的随机数
        double v = Math.random() * (100 + 1);
        //如果产生的随机数小于概率 即为中奖
        if (v <= n){
            return true;
        }
        return false;
    }
}
