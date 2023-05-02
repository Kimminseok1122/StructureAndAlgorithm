package Algorism.DynamicProgrammingAndDivde;

public class DynamicAndDivide {
    public static int fibonacci(Integer n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return n;
        }
    }

    public int dynamicFunc(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index = 2; index < data + 1; index++) {
            cache[index] = cache[index - 1] + cache[index - 2];
        }
        return cache[data];
    }
}
