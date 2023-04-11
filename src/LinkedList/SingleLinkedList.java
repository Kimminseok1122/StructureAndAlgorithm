package LinkedList;

public class SingleLinkedList<T> {

    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else{
            //head가 null이 아니면 계속 node의 포인터가 바뀌게 됨
            //while로 포인터를 계속 바꾸는 개념
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }

            node.next = new Node<>(data);
        }
    }

    public void seeAllNode() {
        if (head == null) {
            System.out.println(head.data);
        } else{
            Node<T> Node = this.head;
            System.out.println(Node.data);
            while (Node.next != null) {
                System.out.println(Node.next.data);
                Node = Node.next;
            }
        }
    }

    public void addNodeInsisde(T data, T isData) {
        Node<T> searchedNode = searchNode(isData);
        if (searchedNode == null) {
            addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public Node<T> searchNode(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data.equals(isData)) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public T MyDelNode(T data) {
        if (head != null) {
            Node<T> firstNode = this.head;

            if (firstNode.data.equals(data)) {
                this.head = firstNode.next;
                return firstNode.data;
            } else{
                while (firstNode.next != null) {
                    if (firstNode.next.data.equals(data)) {
                        T removedData = firstNode.next.data;
                        firstNode.next = firstNode.next.next;
                        return removedData;
                    }
                    firstNode = firstNode.next;
                }
            }
        }
        return null;
    }
}
