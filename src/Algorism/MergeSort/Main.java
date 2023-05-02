package Algorism.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         *
         */

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(6, 76, 35, 46, 65, 16));

        ArrayList<Integer> arrayList1 = mergeSort.mergeSort(arrayList);

        System.out.println(arrayList1.toString());
    }
}
