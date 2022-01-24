import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyHashTable {

    Bucket[] data;

    MyHashTable(int capacity){
        this.data = new Bucket[capacity];
        for(int i = 0; i < capacity; i++){
            data[i] = new Bucket();
        };
    };

    private Integer hash(String key){
        int hash = 0;
        for(int i = 0; i < key.length(); i++){
            hash = (hash + key.codePointAt(i) * i) % this.data.length;
        };
        return hash;
    };

    void set(String key, Object value){
        int hash = this.hash(key);
        Bucket bucket = this.data[hash];
        bucket.addKeyValue(key, value);
    };

    Object get(String key){
        int hash = this.hash(key);
        Bucket bucket = this.data[hash];
        return bucket.getValue(key);
    };

    ArrayList<String> keys(){
        ArrayList<String> keysArray = new ArrayList<String>();
        for (int i = 0; i  < this.data.length; i++){
            for (int j = 0; j < this.data[i].size(); j++){
                keysArray.add(this.data[i].get(j).getKey());
            };
        };
        return keysArray;
    };

    ArrayList<Object> values(){
        ArrayList<Object> valuesArray = new ArrayList<Object>();
        for (int i = 0; i  < this.data.length; i++){
            for (int j = 0; j < this.data[i].size(); j++){
                valuesArray.add(this.data[i].get(j).getValue());
            };
        };
        return valuesArray;
    };  
    
};