package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer value : sourceList
        ) {
            if (value % 2 == 0) {
                linkedList.addLast(value);
            } else {
                linkedList.addFirst(value);
            }
        }
        return linkedList;
    }
}
