package Collection.List.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("Durga");
        l.add(30);
        l.add("null");
        l.add("Durga");//[Durga,30,null,Durga]
        l.set(0,"Software");//[Software,30,null,Durga]
        l.add(0,"venky");//[venky,Software,30,null,Durga]
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);//[CCC,venky,Software,30,null]

    }
}
