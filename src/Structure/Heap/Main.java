package Structure.Heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * 힙이란? -> 데이터에서 최대값과 최소값을 빠르게 찾기 위해 고안된 완전 이진 트리를 기반으로함
         * 완전이진트리란? -> 마지막레벨을 제외한 모든 레벨이 완전히 채워진상태로 존재하는 상태
         * 배열에서  최대,최소를 찾으려면 O(n)이 걸림
         * 이에 반해 힙에 데이터를 넣고 최대,최솟값을 찾으면 O(logn)이 걸림
         *
         * 우선순위 큐(특정 조건에 따라 우선순위가 정해진 요소들을 저장하는 추상적인 자료구조)와 같이 최대값 또는 최솟값을
         * 빠르게 찾아야 하는 자료구조 및 알고리즘 구현 등에 활용됨
         *
         * 힙은 최대값을 구하기 위한 구조 (최대 힙, Max Structure.Heap)와 , 최소값을 구하기 위한 구조 (최소 힙, Min Structure.Heap)로 분류할 수 있다.
         * 힙은 다음과 같이 두가지 조건을 가지고 있다.
         * - 1. 각 노드의 값은 해당 노드의 자식 노드가 가진 값보다 크거나 같다.(최대 힙의 경우)
         *   ㄴ 최소 힙의 경우는 각 노드의 값은 해당 노드의 자식 노드가 가진 값보다 같거나 작음
         * - 2.
         */

        MyMaxHeap myMaxHeap = new MyMaxHeap();
        myMaxHeap.insertNode(1);
        myMaxHeap.insertNode(2);
        myMaxHeap.insertNode(3);
        myMaxHeap.insertNode(4);
        myMaxHeap.insertNode(5);

        //myMaxHeap.getAllData();

        MyMaxHeap_Teacher myMaxHeapTeacher = new MyMaxHeap_Teacher(1);

        myMaxHeapTeacher.insert(2);
        myMaxHeapTeacher.insert(3);
        myMaxHeapTeacher.insert(4);
        myMaxHeapTeacher.insert(5);

        System.out.println(Arrays.toString(myMaxHeapTeacher.heapArray.toArray()));
    }
}
