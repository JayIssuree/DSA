import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        MyHashTable hashTable = new MyHashTable(10);
        
        hashTable.set("Grapes", 5);
        System.out.println(hashTable.get("Grapes"));
        hashTable.set("Grapes", 100);
        hashTable.set("Banana", 8);
        hashTable.set("Orages", 4);
        hashTable.set("Peaches", 14);
        hashTable.set("A", 1);
        hashTable.set("B", 2);
        hashTable.set("C", 3);
        System.out.println(hashTable.get("Grapes"));
        System.out.println(Arrays.deepToString(hashTable.data));
        System.out.println(hashTable.keys());
        System.out.println(hashTable.values());
    };

};