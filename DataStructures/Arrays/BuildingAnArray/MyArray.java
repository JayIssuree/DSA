import java.util.Arrays;

public class MyArray {

    int length;
    Object[] data;

    MyArray(int capacity){
        this.length = 0;
        this.data = new Object[capacity];
    };

    Object get(int index){
        return this.data[index];
    };

    void push(Object item){
        this.data[this.length] = item;
        this.length++;
        this.printArray();
    };

    void pop(){
        Object lastItem = this.data[this.length - 1];
        this.data[this.length - 1] = null;
        this.length--;
        this.printArray();
    };

    void delete(int index){
        this.shiftItems(index);
        this.printArray();
    };

    void shiftItems(int index){
        for(int i = index; i < this.length - 1; i++){
            this.data[i] = this.data[i + 1];
        };
        this.data[this.length - 1] = null;
        this.length--;
    };

    void printArray(){
        System.out.println(Arrays.toString(this.data));
    };

    public static void main(String[] args){
        MyArray arr = new MyArray(5);
        arr.push("A");
        arr.push("B");
        arr.push("C");
        arr.push("D");
        arr.push("E");
        arr.delete(1);
        arr.pop();
    };

};