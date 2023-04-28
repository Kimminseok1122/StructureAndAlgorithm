package Structure.Hash;

import java.util.Arrays;
import java.util.Objects;

public class MyHash<V>{

    private Slot<V>[] hashTable;

    private Node<V> head = null;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot<V> {
        V value;

        public Slot(V value) {
            this.value = value;
        }

    }

    public class Node<V>{
        Slot<V> slot;
        Slot<V> next = null;

        public Node(Slot<V> slot) {
            this.slot = slot;
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
            this.hashTable[location].value = value;
        } else{
            this.hashTable[location] = new Slot<>(value);
        }
    }

    public void printAllSlot() {
        Arrays.stream(this.hashTable).filter(Objects::nonNull).map(s -> s.value).forEach(System.out::println);
    }

    public V getData(String key) {
        Integer location = this.hashFunction(key);
        if (hashTable[location] == null) {
            return null;
        }
        return hashTable[location].value;
    }
}
