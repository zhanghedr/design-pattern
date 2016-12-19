package com.zhanghedr.iterator;

public class Item {

    private int group;
    private String name;

    public Item(int group, String name) {
        this.group = group;
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("group: %s, name: %s", group, name);
    }

}
