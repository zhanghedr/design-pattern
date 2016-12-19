package com.zhanghedr.iterator;

public interface ItemGroupIterator extends ItemIterator {

    boolean hasNextInGroup();

    Item nextInGroup();

}
