package Hash;

public class Main {
    public static void main(String[] args) {
        /**
         * 해쉬테이블 : Key : Value를 매핑할 수 있는 데이터 구조
         * Key를 해쉬 함수에 넣으면 이 키에 대한 값을 저장할 수 있는 주소를 반환
         * Hash Function : 임의의 데이터를 고정된 길이의값으로 리턴해주는 함수
         *
         * 그러면 왜 해시 테이블이 유리할까?
         * 예를 들어, 값을 배열에 저장한다고 했을때 index에 따라 하나씩 검사를 해야한다. 문제는 데이터양이 많아질수록 많이 걸린다.
         * 그러나 해시테이블은 Key에 따라 해당 주소를 바로 반환해주기 때문에 저장,탐색속도가 획기적으로 빨라진다.
         *
         * 해시테이블은 일반적으로 배열형태로 미리 데이터공간을 확보하고 저장한다 이 공간을 해쉬테이블이라고 하고, 실제로 저장되는 공간을 슬롯이라고 한다.
         */

        MyHash<String> myHash = new MyHash<>(3);
        myHash.addHash("Minseok", "Power");
        myHash.addHash("HwaYoung", "Over");
        myHash.addHash("ChangHee", "Well");

        myHash.printAllSlot();
    }
}
