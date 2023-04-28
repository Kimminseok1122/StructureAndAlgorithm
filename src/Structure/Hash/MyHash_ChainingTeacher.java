package Structure.Hash;

import java.util.Arrays;
import java.util.Objects;

public class MyHash_ChainingTeacher<V> {

    private Slot<V>[] hashTable;

    public MyHash_ChainingTeacher(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot<V> {
        String key;
        V value;
        Slot<V> next;

        public Slot(String key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
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
            Slot<V> findSlot = this.hashTable[location];
            Slot<V> prevSlot = this.hashTable[location];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
                this.hashTable[location].value = value;
            }
            prevSlot.next = new Slot<>(key, value);
        } else {
            this.hashTable[location] = new Slot<>(key, value);
        }
    }

    public void printAllSlot() {
        Arrays.stream(this.hashTable).filter(Objects::nonNull).map(s -> s.value).forEach(System.out::println);
    }

    public V getData(String key) {
        Integer location = this.hashFunction(key);
        if (hashTable[location] != null) {
            Slot<V> findSlot = this.hashTable[location];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
        }
        return null;
    }
}
