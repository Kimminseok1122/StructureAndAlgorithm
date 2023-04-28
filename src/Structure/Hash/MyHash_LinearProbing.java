package Structure.Hash;

import java.util.Arrays;
import java.util.Objects;

public class MyHash_LinearProbing<V> {

    private Slot<V>[] hashTable;


    public MyHash_LinearProbing(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot<V> {
        String key;
        V value;

        public Slot(String key, V value) {
            this.key = key;
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
            while (this.hashTable[location] != null) {
                location++;
                if (location == this.hashTable.length) return;
            }
        }

        this.hashTable[location] = new Slot<>(key, value);
    }

    public void printAllSlot() {
        Arrays.stream(this.hashTable).filter(Objects::nonNull).map(s -> s.value + " - " + this.hashFunction(s.key)).forEach(System.out::println);
    }

    public V getData(String key) {
        Integer location = this.hashFunction(key);

        if (this.hashTable[location] == null) {
            return null;
        } else {
            if(this.hashTable[location].key != key){
                System.out.println(location);
                while(location != this.hashTable.length){
                    if(this.hashTable[location].key == key) return this.hashTable[location].value;
                    location++;
                }
            } else{
                return this.hashTable[location].value;
            }
        }
        return null;
    }
}
