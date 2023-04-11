import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //배열 -> 대부분의 언어에서 지원하고 있고, 별도로 클래스를 구현할 필요가 없음

        /**
         *배열은 왜 필요할까?
         *같은 종류의 데이터를 효율적으로 관리하기 위해 사용
         *같은 종류의 데이터를 순차적으로 저장
         *
         * 장점 : 빠른 접근 가능 -> 첫 데이터의 위치에서 상대적인 위치로 데이터 접근(인덱스 번호로 접근)
         * 단점: 데이터의 추가/삭제의 어려움 -> 미리 최대 길이를 지정해야 함
         *
         * 참고 : Primitive 자료형과 Wrapper 클래스 본 강의에서는 Wrapper 클래스를 주로 사용하기로 함
         * -null처리 용이
         * -ArrayList등 객체만을 핸들링 하는 기능을 이용하기 위해
         */

        //new 키워드로 배열을 미리 선언하고, 데이터를 넣을 수도 있음
        Integer[] data_list = new Integer[10];
        data_list[0] = 1;

        //직접 배열 데이터 선언시 넣을 수도 있음
        Integer data_list1[] = {5, 4, 3, 2, 1};

        //Collection패키지에서 제공
        System.out.println(Arrays.toString(data_list));

        //Java에서 배열을 보다 손쉽게 다루기 위한 ArrayList 클래스 -> 가변 길이의 배열 자료구조를 다룰 수 있는 기능 제공
        ArrayList<Integer> list1 = new ArrayList<>();
    }
}