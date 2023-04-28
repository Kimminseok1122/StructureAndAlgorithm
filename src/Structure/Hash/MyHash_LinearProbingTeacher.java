package Structure.Hash;

import java.util.Arrays;
import java.util.Objects;

public class MyHash_LinearProbingTeacher<V> {

    private Slot<V>[] hashTable;


    public MyHash_LinearProbingTeacher(Integer size) {
        this.hashTable = new Slot[size];
    }

    //이제는 내 Key에 따른 슬롯이 정확한 데이터라는 보장이 없음 따라서 Key, Value 다 저장해야함
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
            if (this.hashTable[location].key == key) {
                this.hashTable[location].value = value;
            } else {
                Integer newLocation = location + 1;
                while (this.hashTable[newLocation] != null) {
                    if (this.hashTable[newLocation].key == key) {
                        this.hashTable[newLocation].value = value;
                    } else {
                        newLocation++;
                        if (newLocation >= this.hashTable.length) return;
                    }
                }
                this.hashTable[newLocation] = new Slot<>(key, value);
            }
        } else {
            this.hashTable[location] = new Slot<>(key, value);
        }
    }

    public void printAllSlot() {
        Arrays.stream(this.hashTable).filter(Objects::nonNull).map(s -> s.value + " - " + this.hashFunction(s.key)).forEach(System.out::println);
    }

    public V getData(String key) {
        Integer location = this.hashFunction(key);

        if (this.hashTable[location] != null) {
            if (this.hashTable[location].key == key) {
                return this.hashTable[location].value;
            } else {
                Integer newLocation = location + 1;
                while (this.hashTable[newLocation] != null) {
                    if (this.hashTable[newLocation].key == key) {
                        return this.hashTable[newLocation].value;
                    } else {
                        newLocation++;
                        if (newLocation >= this.hashTable.length) return null;
                    }
                }
            }
        }
        return null;
    }
}
