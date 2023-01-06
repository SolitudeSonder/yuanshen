package org.example;

/**
 * 4星角色
 * 在[1,8]抽时,每次出四星角色的概率为5.1%, 在[9,10]抽每次抽卡概率比上次高51%.
 */

public class Role_4 {
    static int total = 0;
    public static boolean draw(){
        boolean random = false;
        if (total > 0 && total < 8){
            random = RandomUtil.Random(5.1);
        }else {
            random = RandomUtil.Random(5.1 + (total - 8) * 51);
        }
        if (random){
            total = 0;
        }
        return random;
    }
}
