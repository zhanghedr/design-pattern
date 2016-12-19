package com.zhanghedr.iterator;

public interface Items {

    boolean addItem(Item item);

    Item removeItem(int index);

    ItemIterator itemIterator();

    ItemGroupIterator itemGroupIterator(int group);

}
