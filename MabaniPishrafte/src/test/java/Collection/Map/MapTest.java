package Collection.Map;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    @Test
    void should_be_uniq_keys_and_duplicated_values() {
        Map<String, String> geometrics = new HashMap<>();
        geometrics.put("mosallas","ghermez");
        geometrics.put("mostatil","zard");
        geometrics.put("chandzeli","sabz");
        geometrics.put("moraba","ghermez");

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key is : "+key +", and value is : "+ value);
        }
    }
}
