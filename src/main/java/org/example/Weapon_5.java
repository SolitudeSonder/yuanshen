package org.example;

/**
 * 4星武器
 * 1-62 0.7 63-90 7
 */
public class Weapon_5 {
    static int total = 0;
    public static boolean draw() {
        boolean random = false;
        if (total > 0 && total < 62) {
            random = RandomUtil.Random(0.7);
        } else {
            random = RandomUtil.Random(0.7 + (total - 62) * 7);
        }
        if (random) {
            total = 0;
        }
        return random;
    }
}
