package Programa;

import java.util.ArrayList;
import java.util.HashMap;

public class TesteHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> num1 = new HashMap();
        HashMap<String,Integer>num2 = new HashMap<>();
        HashMap<String, HashMap>union = new HashMap<>();
//        -------------------------

        num1.put("Edi",123);
        num2.put("Lu",456);
        union.put("num1",num1);
        union.put("num2",num2);

        System.out.println(union);
    }
}
