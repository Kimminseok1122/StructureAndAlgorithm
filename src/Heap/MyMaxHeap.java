package Heap;

import java.util.function.BiFunction;

public class MyMaxHeap {

    Node rootNode = null;

    public class Node {
        Node left;
        Node right;
        Node parent;

        int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    public boolean insertNode(int data) {
        if (this.rootNode == null) {
            this.rootNode = new Node(data);
            return true;
        } else{
            Node node = this.rootNode;
            while (node != null) {

            }

        }
        return false;
    }

    //BFS(깊이 우선 탐색)으로 구현해보자 큐 이용하고
    public Node checkNode(Node nowNode) {
        BiFunction<Node,Node,Node> checkNull = (nL, nR) ->{
            if (nL == null || nR == null) {
                return null;
            } else{
                return nowNode;
            }
        };

        return checkNull.apply(nowNode.left,nowNode.right);
    }
}
