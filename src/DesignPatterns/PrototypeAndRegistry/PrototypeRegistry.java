package DesignPatterns.PrototypeAndRegistry;

import java.util.Map;

public class PrototypeRegistry {
    Map<String, Prototype<Student>> registry;

    void register(String key,Student obj){
        registry.put(key, obj);
    }

    Student get(String key){
        return registry.get(key).copy();
    }

}
