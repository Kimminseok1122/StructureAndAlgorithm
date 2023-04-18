package Tree;

public class Main {
    public static void main(String[] args) {
        /**
         * 알아둘 용어
         * - Node : 트리에서 데이터를 저장하는 기본 요소 (데이터와 다른 연결된 노드에 대한 Branch 정보 포함)
         * - Root Node : 트리 맨 위에 있는 노드
         * - Level : 최상위 노드를 Level 0 으로 하였을 때, 하위 Branch로 연결된 노드의 깊이를 나타냄
         * - Parent Node : 어떤 노드의 다음 레벨에 연결된 노드
         * - Child Node : 어떤 노드의 상위 레벨에 연결된 노드
         * - Leaf Node (Terminal Node) : Child Node가 하나도 없는 노드
         * - Sibling (Brother Node) : 동일한 Parent Node를 가진 노드
         * - Depth : 트리에서 Node가 가질 수 있는 최대 Level
         *
         * 트리 (Tree) 구조 란? => Node와 Branch를 이용해서, 사이클을 이루지 않도록 구성한 데이터 구조
         *
         * 이진 트리 : 노드의 최대 Branch가 2인 트리
         * 이진 탐색 트리 (Binary Search Tree, BST) : 이진 트리에 다음과 같은 추가적인 조건이 있는 트리
         * 왼쪽 노드는 해당 노드보다 작은값, 오른쪽 노드는 해당노드보다 큰 값을 가지고 있음
         *
         * 이진 탐색 트리가 많이 쓰임
         * - 장점 : 탐색속도가 빠르다. 데이터 크기가 클수록 이점이 커진다.
         * - 이진 탐색 트리는 데이터를 삽입할때 자동으로 정렬된 상태로 저장된다. 따라서 정렬된 데이터를 저장하는데 유용함
         * - 이진 탐색 트리는 한번의 탐색으로 찾으려는 값을 찾을 수 있고, 탐색범위를 제한할 수 있다.
         *
         * - 단점 : 데이터가 삽입되는 순서에 따라  이진 탐색 트리가 불균형한 상태가 될 수 있음, 최악은 연결리스트와 같은 성능
         * - 노드를 삭제할때 삭제 대상 노드의 자식 노드를 재배치 해야기 때문에 데이터 삭제가 어렵다.
         * - 이진 탐색 트리에서 모든 노드가 한쪽으로 치우친다면 탐색 속도가 연결리스트와 같게되고 장점 무의미
         *
         *  이진탐색트리는 평균적으로 O(logn)의 시간복잡도를 가지며 최악의 경우 링크드 리스트와 같은 O(n)을 가짐
         *
         */

        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(1);
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(5);

        System.out.println(myTree.removeNode(5));
        System.out.println(myTree.findNode(5));
    }
}
