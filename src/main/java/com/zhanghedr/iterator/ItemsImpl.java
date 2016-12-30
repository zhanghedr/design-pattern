package com.zhanghedr.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ItemsImpl implements Items {

    private List<Item> items;

    public ItemsImpl() {
        items = new ArrayList<>();
    }

    @Override
    public boolean addItem(Item item) {
        return items.add(item);
    }

    @Override
    public Item removeItem(int index) {
        return items.remove(index);
    }

    @Override
    public ItemIterator itemIterator() {
        return new ItemIteratorImpl();
    }

    @Override
    public ItemGroupIterator itemGroupIterator(final int group) {
        return new ItemGroupIteratorImpl(group);
    }

    private class ItemIteratorImpl implements ItemIterator {
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != items.size();
        }

        @Override
        public Item next() {
            if (cursor >= items.size())
                throw new NoSuchElementException("Cursor: " + cursor);
            return items.get(cursor++);
        }
    }

    private class ItemGroupIteratorImpl extends ItemIteratorImpl implements
            ItemGroupIterator {
        int group;

        ItemGroupIteratorImpl(int group) {
            super();
            this.group = group;
        }

        @Override
        public boolean hasNextInGroup() {
            int i = cursor;
            while (i < items.size()) {
                if (items.get(i).getGroup() == group)
                    return true;
                i++;
            }
            return false;
        }

        @Override
        public Item nextInGroup() {
            while (cursor < items.size()) {
                Item item = items.get(cursor);
                cursor++;
                if (item.getGroup() == group)
                    return item;
            }
            throw new NoSuchElementException("Cursor: " + cursor);
        }
    }

}
