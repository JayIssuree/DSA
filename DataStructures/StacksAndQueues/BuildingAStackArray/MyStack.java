import java.util.ArrayList;

class MyStack {

    private ArrayList<Object> data;

    MyStack(){
        this.data = new ArrayList<Object>();
    };

    Object peek(){
        return this.data.get(this.data.size() - 1);
    };

    void push(Object value){
        this.data.add(value);
    };

    void pop(){
        if(!this.isEmpty()){
            this.data.remove(this.data.size() - 1);
        };
    };

    Boolean isEmpty(){
        return this.data.isEmpty();
    };

    void printAllValues(){
        for (int i = this.data.size(); i > 0; i--){
            System.out.println(this.data.get(i - 1));
        };
    };

};