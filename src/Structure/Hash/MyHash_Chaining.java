package Structure.Hash;

import java.util.Arrays;
import java.util.Objects;

public class MyHash_Chaining<V>{

    private Slot<V>[] hashTable;

    public MyHash_Chaining(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot<V> {

        private Node<V> head = null;

        public static class Node<V>{
            Slot<V> slot;
            String key;
            Node<V> next = null;

            public Node(String key,V value) {
                this.key = key;
                this.slot = new Slot<>(value);
            }
        }

        V value;

        public Slot(V value) {
            this.value = value;
        }
    }




    public Integer hashFunction(String key) {
        //this 깜빡하지 말자
        return Integer.valueOf(key.charAt(0)) % (this.hashTable.length);
    }

    //Null 일때 고려 안했음, 또한 Slot을 인자로 받는것이 아닌 Type Parameter를 받아야했음
    public void addHash(String key, V value) {
        Integer location = this.hashFunction(key);
        if (this.hashTable[location] != null) {
            Slot.Node<V> node = this.hashTable[location].head;

            while (node.next != null) {
                node = node.next;
            }

            node.next = new Slot.Node<>(key,value);
        } else{
            this.hashTable[location] = new Slot<>(value);
            this.hashTable[location].head = new Slot.Node<>(key,value);
        }
    }

    public void printAllSlot() {
        Arrays.stream(this.hashTable).filter(Objects::nonNull).map(s -> s.value).forEach(System.out::println);
    }

    public void printAllLinkedSlot() {
        for (Slot<V> vSlot : hashTable) {
            if (vSlot !=null && vSlot.head != null) {
                Slot.Node<V> node = vSlot.head;

                while (node != null) {
                    System.out.println(node.slot.value);
                    node = node.next;
                }
            }
        }
    }

    public V getData(String key) {
        Integer location = this.hashFunction(key);
        Slot<V> findSlot = hashTable[location];
        if (findSlot != null) {
            if (findSlot.head.next != null) {
                Slot.Node<V> node = findSlot.head;
                while(node != null){
                    if(node.key.equals(key)){
                        return node.slot.value;
                    }
                    node = node.next;
                }
            } else{
                return findSlot.value;
            }
        }
        return null;
    }
}
