package Structure.LinkedList;

public class Node<T> {

    //데이터
    T data;
    //포인터
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

}
