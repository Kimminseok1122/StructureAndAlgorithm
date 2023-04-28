package Structure.LinkedList;

public class DoubleLinkedList <T>{

    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else{
            this.tail.next = new Node<>(data);
            this.tail.next.prev = this.tail;
            this.tail = this.tail.next;
        }
    }

    public void seeAllNode() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public T searchFromHead(T isData) {
        Node<T> node = this.head;
        while (node != null) {
            if (node.data.equals(isData)) {
                return isData;
            }
            node = node.next;
        }
        return null;
    }

    public T searchFromTail(T isData) {
        Node<T> node = this.tail;
        while (node != null) {
            if (node.data.equals(isData)) {
                return isData;
            }
            node = node.prev;
        }
        return null;
    }

    public boolean insertBackNode(T findData, T insertData) {

        if (this.head == null) {
            this.head = new Node<>(insertData);
            this.tail = this.head;
            return true;
        }

        Node<T> prevNode = searchNode(findData);

        if (prevNode == null) {
            return false;
        }

        Node<T> nextNode = prevNode.next;

        prevNode.next = new Node<>(insertData);

        if (nextNode != null) {
            nextNode.prev = prevNode.next;
        } else{
            this.tail = prevNode.next;
        }

        prevNode.next.prev = prevNode;
        prevNode.next.next = nextNode;

        return true;
    }


    public Node<T> searchNode(T data) {
        Node<T> nodeFirst = this.head;
        Node<T> nodeFinal = this.tail;

        while (nodeFirst != null || nodeFinal != null) {
            if(nodeFirst.data.equals(data)){
                return nodeFirst;
            } else if (nodeFinal.data.equals(data)) {
                return nodeFinal;
            }

            nodeFirst = nodeFirst.next;
            nodeFinal = nodeFinal.prev;
        }

        return null;
    }

    public boolean insertFrontNode(T findData, T insertData) {

        if (this.head == null) {
            this.head = new Node<>(insertData);
            this.tail = this.head;
            return true;
        }

        Node<T> nextNode = searchNode(findData);

        if (nextNode == null) {
            return false;
        }

        Node<T> prevNode = nextNode.prev;

        nextNode.prev = new Node<>(insertData);

        if (prevNode != null) {
            prevNode.next = nextNode.prev;
        } else{
            this.head = nextNode.prev;
        }

        nextNode.prev.next = nextNode;
        nextNode.prev.prev = prevNode;

        return true;
    }

    public boolean insertToFront(T existed, T addData) {
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
        } else if (this.head.data == existed) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                Node<T> nodePrev = node.prev;

                nodePrev.next = new Node<>(addData);
                nodePrev.next.next = node;

                nodePrev.next.prev = nodePrev;
                node.prev = nodePrev.next;
                return true;
            }
        }
        return false;
    }
}
