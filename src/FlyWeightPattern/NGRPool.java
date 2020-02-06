package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class NGRPool {
    public static Map<String, NGR> repository = new HashMap<>();
    public static NGR getInstance(String nationality, String gender, String religion) {
        String key = nationality + gender + religion;
        if (!repository.containsKey(key)) {
            repository.put(key, new NGR(nationality, gender, religion));
        }
        return repository.get(key);
    }
}
