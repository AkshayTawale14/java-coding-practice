package com.akshay.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListAsc_Desc3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(90);
        list.add(70);
        list.add(50);
        list.add(30);
        list.add(20);

        Collections.sort(list);

        System.out.println("Sorted list in ascending :"+list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Sorted list in descending :"+list);
    }
}
