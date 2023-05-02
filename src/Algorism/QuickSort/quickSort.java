package Algorism.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list ) {
        if (list.size() < 2) {
            return list;
        }

        Integer pivot = list.get(0);

        List<Integer> outerList = list.subList(1, list.size());

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (Integer output : outerList) {

            if (output > pivot) {
                right.add(output);
            } else{
                left.add(output);
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        return merge(left, pivot, right);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> left, Integer pivot, ArrayList<Integer> right) {
        left.add(pivot);
        left.addAll(right);

        return left;
    }
}
