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

//        MyHash<String> myHash = new MyHash<>(3);
//        myHash.addHash("Minseok", "Power");
//        myHash.addHash("HwaYoung", "Over");
//        myHash.addHash("ChangHee", "Well");
//
//        myHash.printAllSlot();

        /**
         * 해시테이블의 장단점
         * 장점 : 데이터 저장/읽기 속도가 빠르다. (검색 속도가 빠르다.), 해시는 키에 대한 데이터가 있는지(중복) 확인이 쉬움
         * 단점 : 일반적으로 저장공간이 좀더 많이 필요하다.
         *     :  (가장 중요) 특정 키에 대해서 주소가 동일할 경우 충돌을 해결하기 위한 별도의 자료구조가 필요함
         * 주요 용도 : 검색이 많이 필요한 경우, 저장 삭제 읽기가 빈번한 경우, 캐쉬 구현시(중복 확인이 쉽기 때문)
         *
         * 그렇다면 이 충돌(Collision)을 어떻게 해결할까?
         *
         * Chaining 기법 : 충돌이 일어나는 공간 뒤에 또 다른 Linked List를 만듬 -> Close Addressing 방식에 속함
         * Linear Probing 기법 : 충돌 발생시 추가 공간을 만드는것이 아닌 다른 빈 슬롯을 규칙에 따라 찾아서 저장  Open Addressing 방식
         * 로드팩터 -> 테이블의 크기에 대한 데이터갯수의 비율 -> 비율이 높으면 Collision이 자주발생 즉, 적절한 비율이 중요
         * 상대적으로 Open Addressing에서 이 비율이 강조됨 로드팩터에 따라 성능의 영향이 크기 때문에
         * 클러스터링은 해시 테이블에서 충돌이 이어나면, 연속적으로 슬롯에 데이터가 쌓이는 현상 -> 탐색시간을 증가시킬수 있음
         *
         * 시간복잡도는 일반적으로 Collision이 없는경우 O(1)
         * 최악의 경우 O(n)
         */

//        MyHash_Chaining<String> myHash = new MyHash_Chaining<>(10);

//        myHash.addHash("Minseok", "Power");
//        myHash.addHash("HwaYoung", "Over");
//        myHash.addHash("ChangHee", "Well");
//        //충돌을 해결하지 못함, 우리가 구현한 HashFunction은 앞글자만 따왔기때문에
//        myHash.addHash("Minsex", "SexKing");
//
//        System.out.println(myHash.getData("Minseok"));

        MyHash_LinearProbing<String> myHash = new MyHash_LinearProbing<>(5);

        myHash.addHash("Minseok", "Power");
        myHash.addHash("KwaYoung", "Over");
        myHash.addHash("ZhangHee", "Well");
        //충돌을 해결하지 못함, 우리가 구현한 HashFunction은 앞글자만 따왔기때문에
        myHash.addHash("Minsex", "SexKing");

        System.out.println(myHash.getData("Minsex"));
        myHash.printAllSlot();

    }
}
