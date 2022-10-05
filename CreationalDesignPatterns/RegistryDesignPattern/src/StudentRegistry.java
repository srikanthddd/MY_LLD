import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentmap = new HashMap<>();

    public void register(String key, Student student) {
        studentmap.put(key, student);
    }

    public  Student get(String key){
        return studentmap.get(key);
    }

}
