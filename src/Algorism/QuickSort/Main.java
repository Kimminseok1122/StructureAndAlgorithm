package Algorism.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * 퀵 정렬 이란?
         * - 정렬 알고리즘의 꽃
         * - 기준점(pivot 이라고 부름) 을 정해서, 기준점보다 작은 데이터는 왼쪽(left), 큰 데이터는 오른족(right)으로 모으는 함수를 작성함
         * - 각 왼쪽, 오른쪽은 재귀용법을 사용해서 다시 동일 함수를 호출하여 위 작업을 반복함
         */

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(69,20,30,1,5,70,50));

        ArrayList<Integer> arrayList = quickSort.quickSort(A);
        System.out.println(arrayList.toString());
    }
}
