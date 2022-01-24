public class KeyValue {

    private String key;
    private Object value;
    
    KeyValue(String key, Object value){
        this.key = key;
        this.value = value;
    };

    String getKey(){
        return this.key;
    };

    Object getValue(){
        return this.value;
    };

    void updateValue(Object value){
        this.value = value;
    };

};