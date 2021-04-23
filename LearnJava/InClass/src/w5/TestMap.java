package w5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();

        map.put("To1", 20);
        map.put("To2", 35);
        map.put("To3", 30);
        map.put(null, 25);
        map.put("To1", 25); // 2 cái key trùng nhau sẽ cập nhật cái vào cuối cùng
        System.out.println(map);
        Set<String> keys = map.keySet();
        for(String key : keys) // có thể thay keys = map.keySet()
        {
            System.out.println(map.get(key)+" ");
        }
        System.out.println();
        Iterator<String> iter = keys.iterator(); // có thể thay keys = map.keySet()
        while (iter.hasNext())
        {
            System.out.println(map.get(iter.next())+" ");
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries)
        {
            System.out.println(entry.getKey()+" "+ entry.getValue()+" ");
        }
    }
}
