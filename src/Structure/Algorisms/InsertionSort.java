package Structure.Algorisms;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    public void sort(ArrayList<Integer> dataList) {
        for (int i = 0; i < dataList.size(); i++) {
            for (int k = i; k > 0; k--) {
                if (dataList.get(k) > dataList.get(i)) {
                    Collections.swap(dataList, k , k-1);
                } else{
                    break;
                }
            }
        }
    }
}
