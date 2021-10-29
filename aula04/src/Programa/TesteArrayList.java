package Programa;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer>num2 = new ArrayList<>();
        ArrayList<Integer>union = new ArrayList<>();
//        -------------------------

        num1.add(1);
        num2.add(33);
        union.addAll(num1);
        union.addAll(num2);

        System.out.println(union);

    }

}
