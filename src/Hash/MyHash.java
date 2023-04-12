package Hash;

import java.util.Arrays;
import java.util.Objects;

public class MyHash<V>{

    private Slot<V>[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot<V> {
        V value;

        public Slot(V value) {
            this.value = value;
        }

    }

    public Integer hashFunction(String key) {
        //this 깜빡하지 말긔
        return Integer.valueOf(key.charAt(0)) % (this.hashTable.length);
    }

    //이건 패배 인정
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
