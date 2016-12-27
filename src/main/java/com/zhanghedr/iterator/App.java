package com.zhanghedr.iterator;


public class App {

    public static void main(String[] args) {
    	Items items = createItems();
        ItemIterator iterator = items.itemIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("---------------------");

        ItemGroupIterator groupIterator = items.itemGroupIterator(2);
        while (groupIterator.hasNextInGroup())
            System.out.println(groupIterator.nextInGroup());
    }

    private static Items createItems() {
    	Items items = new ItemsImpl();
        items.addItem(new Item(1, "val1"));
        items.addItem(new Item(2, "val2"));
        items.addItem(new Item(3, "val3"));
        items.addItem(new Item(4, "val4"));
        items.addItem(new Item(2, "val22"));
        items.addItem(new Item(5, "val5"));
        items.addItem(new Item(2, "val222"));
        items.addItem(new Item(6, "val6"));
        items.addItem(new Item(2, "val2222"));
        return items;
    }

}
