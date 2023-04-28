package Structure.Heap;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

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

        Comparator<Integer> comparator = Integer::compareTo;

        if (this.rootNode == null) {
            this.rootNode = new Node(data);
            return true;
        } else{
            Queue<Node> nodeQueue = new LinkedList<>();

            nodeQueue.add(this.rootNode);


            while (!nodeQueue.isEmpty()) {

                Node pollNode = nodeQueue.poll();

                if (pollNode.left == null) {
                    pollNode.left = new Node(data);
                    pollNode.left.parent = pollNode;

                    Node originNode = pollNode.left;
                    Node verseNode = originNode.parent;

                    while (verseNode != null) {
                        int originValue = originNode.value;
                        int verseValue = verseNode.value;

                        if(originNode.value > verseNode.value){
                            verseNode.value = originValue;
                            originNode.value = verseValue;
                            
                        } else{
                            break;
                        }
                        originNode = verseNode;
                        verseNode = originNode.parent;
                    }
                    return true;
                } else if (pollNode.right == null) {
                    pollNode.right = new Node(data);
                    pollNode.right.parent = pollNode;

                    Node originNode = pollNode.right;
                    Node verseNode = originNode.parent;

                    while (verseNode != null) {
                        int originValue = originNode.value;
                        int verseValue = verseNode.value;

                        if(originNode.value > verseNode.value){
                            verseNode.value = originValue;
                            originNode.value = verseValue;
                        } else{
                            break;
                        }
                        originNode = verseNode;
                        verseNode = originNode.parent;
                    }

                    return true;
                } else{
                    if (pollNode.left != null) {
                        nodeQueue.add(pollNode.left);
                    }
                    if (pollNode.right != null) {
                        nodeQueue.add(pollNode.right);
                    }
                }
            }
        }
        return false;
    }

    public void getAllData() {
        Node node = this.rootNode;

        Queue<Node> nodeQueue = new LinkedList<>();

        nodeQueue.add(node);

        while (!nodeQueue.isEmpty()) {
            Node pollNode = nodeQueue.poll();

            System.out.println(pollNode.value);

            if (pollNode.left != null) {
                nodeQueue.add(pollNode.left);
            }

            if (pollNode.right != null) {
                nodeQueue.add(pollNode.right);
            }
        }
    }

    public Node getMaxHeap() {
        return this.rootNode;
    }
}
