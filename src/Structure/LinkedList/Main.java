package Structure.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * 배열을 먼저 생각해보자. 배열은 메모리공간에 연결된 데이터 공간을 만드는것
         * 배열의 가장 큰 단점은 저장공간을 미리 할당을 해서 고정적이라는것 이것에 대한 해결책으로 고민한것이 링크드 리스트
         * 링크드리스트는 데이터 | 다음데이터주소 로 이루어진 공간을 두개 생성한다.
         *
         * 장점 : 공간을 미리 할당하지 않아도 됨
         * 단점 : 별도의 연결을 위한 공간을 필요로 하므로 효율이 높지 않음, 접근속도가 느림,
         * 중간데이터 삭제시 앞뒤 데이터 연결을 재구성 해야하는 부가적인 작업 필요
         */

        //Node와 Node연결하기
        Node<Integer> node1 = new Node<Integer>(3);
        Node<Integer> node2 = new Node<Integer>(4);

        //Node1에 Node2 주소 추가
        node1.next = node2;

        //헤드를 추가
        Node head = node1;

        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);



        /**
         * LinkedList는 중간에 끼워넣는 로직이 필요하다가 말했다. 이를 만들어보자
         */
//
//        MyLinkedList.addNodeInsisde(5,4);
//
//        System.out.println(MyLinkedList.MyDelNode(6));
//        MyLinkedList.seeAllNode();

        /**
         * 기존 링크드 리스트는 아쉬운게 head부터 데이터를 찾아가야 했음 케이스에따라 시간이 오래걸릴 수 있음
         * 그 단점을 보완하기 위해 더블 링크드 리스트가 파생됨 두개의 포인터가 존재
         */

        DoubleLinkedList<Integer> MyDoubleLinkedList = new DoubleLinkedList<>();

        MyDoubleLinkedList.addNode(1);
        MyDoubleLinkedList.addNode(2);
        MyDoubleLinkedList.addNode(3);
        MyDoubleLinkedList.addNode(4);
        MyDoubleLinkedList.addNode(5);

        MyDoubleLinkedList.insertBackNode(5,7);
        MyDoubleLinkedList.insertFrontNode(1, 8);
        MyDoubleLinkedList.seeAllNode();
    }
}
