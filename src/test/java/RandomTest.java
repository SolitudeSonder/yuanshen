import org.junit.Test;

/**
 * 随机类测试
 */

public class RandomTest {
    //产生0.6% 的随机数
    @Test
    public void test(){
        int n = 1000000;
        int i = 0;
        for (int j = 0; j < n; j++) {
            double v = Math.random() * (100 + 1);
            if (v < 0.6){
                i++;
            }
        }
        System.out.println((double) i/(double)n);
    }
}
