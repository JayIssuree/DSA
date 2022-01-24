import java.util.ArrayList;

public class Bucket extends ArrayList<KeyValue>{

    Boolean ifContainsKeyUpdateValue(String key, Object value){
        for(int i = 0; i < this.size(); i++){
            if(this.get(i).getKey() == key){
                this.get(i).updateValue(value);
                return true;
            };
        };
        return false;
    };

    void addKeyValue(String key, Object value){
        if (!this.ifContainsKeyUpdateValue(key, value)){
            this.add(new KeyValue(key, value));
        };
    };

    Object getValue(String key){
        for(int i = 0; i < this.size(); i++){
            if (this.get(i).getKey() == key){
                return this.get(i).getValue();
            };
        };
        return null;
    };

};