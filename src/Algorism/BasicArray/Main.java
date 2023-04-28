package Algorism.BasicArray;

import Structure.Algorisms.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /**
         *  알고리즘 연습 방법
         *
         *  1. 연습장과 펜을 준비합니다.
         *  2. 알고리즘 문제를 읽고 분석한 후에,
         *  3. 간단하게 테스트용으로 매우 간단한 경우부터 복잡한 경우 순서대로 생각해보면서 생각
         *  4. 가능한 알고리즘이 보인다면, 구현할 알고리즘을 세부 항목으로 나누고, 문장으로 세부 항목을 나누어서 적음
         *  5. 코드화 하기위해, 데이터 구조 또는 사용할 변수를 정리하고,
         *  6. 각 문장을 코드 레벨로 적습니다.
         *  7. 변수가 코드에 따라 어떻게 변하는지 손으로 적으면서, 임의 데이터로 검증
         *
         *
         */

        ArrayList<Integer> test = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            test.add((int)(Math.random()*100));
        }

        SelectionSort.sort(test);

    }
}
