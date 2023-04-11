package stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        /**
         * 스택 : 가장 나중에 쌓은 데이터를 가장 먼저 빼낼 수 있는 데이터 구조
         * 장점 : 구조가 단순해서, 구현이 쉽다. 데이터 저장/읽기 속도가 빠르다.(상황마다 다름 참고만)
         * 단점 : 최대 스택 사이즈를 미리 지정해야함
         */

        MyStack<Integer> ms = new MyStack<>();
        ms.push(1);
        ms.push(2);

    }
}
