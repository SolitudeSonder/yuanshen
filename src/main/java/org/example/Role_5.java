package org.example;

/**
 * 5星角色
 * 在[1,73]抽时,每次出五星角色的概率为0.6%, 在[74,90]抽每次抽卡概率比上次高6%.
 */

public class Role_5 {
    static int total = 0;
    public static boolean draw(){
        boolean random = false;
        if (total > 0 && total < 73){
            random = RandomUtil.Random(0.6);
        }else {
            random = RandomUtil.Random(0.6 + (total - 73) * 6);
        }
        if (random){
            total = 0;
        }
        return random;
    }
}
