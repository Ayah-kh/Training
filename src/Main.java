import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put(null,"fff");
        System.out.println("map = " + map);
        map.put(null,"aaaa");
        System.out.println("map = " + map);
    }
}