package org.example;

/**
 * 4星武器
 * 1-7 6 8-10 60
 */
public class Weapon_4 {
    static int total = 0;
    public static boolean draw() {
        boolean random = false;
        if (total > 0 && total < 7) {
            random = RandomUtil.Random(6);
        } else {
            random = RandomUtil.Random(6 + (total - 7) * 60);
        }
        if (random) {
            total = 0;
        }
        return random;
    }
}
