package com.company;

import java.util.LinkedList;

public class LinkedListMain{

    public static void main(String[] args) {

        LinkedList<String> food = new LinkedList<String>();

        food.add("Apple");
        food.add("Fish");
        food.addLast("Pineapple");
        food.addFirst("Beef");
        food.add(1, "Eggs");

        System.out.printf(" -> Below list with %d elements <- ", food.size());
        System.out.println(food.get(1));
        food.set(1, "Carrot");

        for(String curfood : food) {
            System.out.println(curfood);
        }

        if(food.contains("Fish")){
            System.out.println("-> List has Fish <- ");
        }

        food.remove("Fish");
        food.removeFirst();
        food.removeLast();

        System.out.println();
        System.out.println(" -> List with Gadgets <- ");

        LinkedList<Gadget> item = new LinkedList<Gadget>();
        item.add(new Gadget("PC"));
        item.addFirst(new Gadget("Laptop"));
        item.addLast(new Gadget("Smartphone"));
        item.remove(1);

        for(Gadget p : item){
            System.out.println(p.getName());
        }

        Gadget first = item.getFirst();
        System.out.println(first.getName());
    }
}

class Gadget{

    private String name;

    public Gadget(String value){
        name=value;
    }

    public String getName() {
        return name;
    }
}