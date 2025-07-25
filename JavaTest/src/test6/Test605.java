package test6;

public class Test605 {
    public static void main(String[] args) {
        boolean sign = false;
        double pi = 0;

        for (int i = 1; i <= 10000000; i += 2) {
            if (!sign) {
                pi += 1.0 / i;
            } else {
                pi -= 1.0 / i;
            }
            sign = !sign;

            if (i % 1000000 == 1) // 출력이 너무 많아 적절히 줄임
                System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
        }
    }
}