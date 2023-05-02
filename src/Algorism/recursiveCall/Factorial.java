package Algorism.recursiveCall;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Factorial {

    public static Integer Factorial(Integer a) {

        if (a > 0) {
            return a * Factorial(a - 1);
        } else{
            return 1;
        }
    }

    public int factorialFunc(ArrayList<Integer> dataList) {
        if (dataList.size() == 0) {
            return 0;
        }

        return dataList.get(dataList.size()-1) + factorialFunc(new ArrayList<>(dataList.subList(0,dataList.size()-1)));
    }

    public int hanoiProblem(Integer n) {

        if (n >= 4) {
            return hanoiProblem(n - 1) + hanoiProblem(n - 2) + hanoiProblem(n - 3);
        } else if (n == 3) {
            return 4;
        } else if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }

        return 0;
    }
}
