package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
        System.out.println(sourceList);

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        if ((5 * Math.pow(aInt, 2) + 3) < (5 * Math.pow(bInt, 2) + 3)) {
            return -1;
        }
        if ((5 * Math.pow(aInt, 2) + 3) > (5 * Math.pow(bInt, 2) + 3)) {
            return 1;
        }
        if ((5 * Math.pow(aInt, 2) + 3) == (5 * Math.pow(bInt, 2) + 3)) {
            if (aInt > bInt) {
                return 1;
            }
            if (aInt < bInt) {
                return -1;
            }
            return 0;
        }
        return 0;
    }
}
