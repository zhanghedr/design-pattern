package com.zhanghedr.iterator;

public interface ItemCollection {

    boolean addItem(Item item);

    Item removeItem(int index);

    ItemIterator itemIterator();

    ItemGroupIterator itemGroupIterator(int group);

}
