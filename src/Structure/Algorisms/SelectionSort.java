package Structure.Algorisms;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public static void sort(ArrayList<Integer> dataList) {

        for (int i = 0; i < dataList.size(); i++) {
            int minInt = dataList.get(i);
            for (int k = i+1; k < dataList.size(); k++) {
                if (minInt > dataList.get(k)) {
                    minInt = dataList.get(k);
                    Collections.swap(dataList, i , k);
                }
            }
        }

        System.out.println(dataList);
    }
}
