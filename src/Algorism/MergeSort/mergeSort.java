package Algorism.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeSort {
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        ArrayList<Integer> left = new ArrayList<>(list.subList(0, list.size() / 2));
        ArrayList<Integer> right = new ArrayList<>(list.subList(list.size() / 2, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> left,ArrayList<Integer> right) {

        ArrayList<Integer> list = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) > right.get(rightIndex)) {
                list.add(right.get(rightIndex));
                rightIndex++;
            } else {
                list.add(left.get(leftIndex));
                leftIndex++;
            }
        }

        while (leftIndex < left.size()) {
            list.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            list.add(right.get(rightIndex));
            rightIndex++;
        }

        return list;
    }
}
