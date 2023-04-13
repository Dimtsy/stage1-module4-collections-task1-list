package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {

    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 1;
        for (String element : sourceList) {
            if (i % 3 == 0) {
                arrayList.add(element);
                arrayList.add(element);
            }
            i++;
        }
        return arrayList;
    }
}
