package buoi2.bai2;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapJava {
    private Map<String, Integer> chuoi = new HashMap<>();

    public static void main(String[] args) {
        MapJava maps = new MapJava();
        System.out.println(maps.findSubstrings("abc123123", 3));
        maps.countSubstrings("abc123123", 3);
    }

    public List<String> findSubstrings(String input, int length) {
        List<String> find = new ArrayList<>();
        if (input.length() > length) {
            for (int i = 0; i <= input.length() - length; i++) {
                find.add(input.toLowerCase().trim().substring(i, i + length));
            }
        }
        return find;
    }

    public void countSubstrings(String input, int length) {
        List<String> find = findSubstrings(input, length);
        for(String fi:find){
            if (chuoi.containsKey(fi)) {
                chuoi.put(fi, chuoi.get(fi) + 1);
            } else {
                chuoi.put(fi, 1);
            }
        }
        System.out.println(chuoi);
    }

}

