package comj.java.study;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyList {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello ");
        list.add("my name is doget");
        for (String d : list) {
            System.out.println(list.get(1));
            System.out.println("d = " + d);
        }

        // map就是键值对形式储存数据，在特定的时候使用

        Map<String, String> map = new HashMap<>();

        map.put("496", "Lpf");
        map.put("412", "lyt");
        for (int i = 0; i <map.size() ; i++) {
            System.out.println(map.get("496"));
        }
    }
}
