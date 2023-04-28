package Structure.Algorisms;

public class Main {

    /**
     * 알고리즘 복잡도 계산이 필요한 이유 -> 하나의 문제를 푸는 알고리즘은 다양함
     * 어떤 알고리즘이 더 좋은지를 분석하기 위해, 복잡도를 정의하고 계산함
     * <p>
     * 시간 복잡도 : 알고리즘 실행 속도
     * 공간 복잡도 : 알고리즘이 사용하는 메모리 사이즈 ->단, 요즘은 컴퓨터의 성능이 좋기때문에 시간복잡도로 평가하는 경우가 많음
     * <p>
     * 시간 복잡도의 주요 요소 -> 결과적으로 반복문이 지배한다. 입력의 크기가 커지면 커질수록 반복문의 영향이 커진다.
     * 알고리즘 성능 표기법
     * -Big O 표기법 : O(N) 가장많이 사용, 최악의 상황이라도 이정도 성능 보장한다는 의미
     * 입력 n에 따라 결정되는 시간 복잡도 함수
     * O(1) < O(logN) < O(n) < O(nlogN) < O(N^2) < O(2^n) < O(n!)
     * 표현식에 가장 큰 영향을 미치는 n의 단위로 표기한다.
     */

    public static void main(String[] args) {

        int n = 11;

        // 1번(상수) 실행 -> O(1)
        if (n > 10) {
            System.out.println(n);
        }

        // 3 * n 번 실행 -> O(n)
        for (int num = 0; num < 3; num++) {
            for (int index = 0; index < n; index++) {
                System.out.println(index);
            }
        }

        // 3 * n * n 번 실행 -> O(n^2)
        for (int i = 0; i < 3; i++) {
            for (int num = 0; num < n; num++) {
                for (int index = 0; index < n; index++) {
                    System.out.println(index);
                }
            }
        }
    }

    //n에 따라 n번 반복 -> O(n)
    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    //n이 증가해도 횟수는 고정 -> O(1)
    public int sum2(int n) {
        return n * (n + 1) / 2;
    }
}
