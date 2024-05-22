package CollectionsArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new Vector<>();  //List is an interface and Vector, ArrayList, LinkedList are the
//                                              classes implements the List Interface allows to Loose Coupling
//
//        list.add(15);
//        list.add(18);
//        list.add(17);
//        list.add(19);
//        list.add(10);
//        list.add(9);
//        list.add(9);
//
//        System.out.println(list.size());
//
//        for(Integer integer : list){
//            System.out.println(integer);
//        }

        Set<String> set = new LinkedHashSet<>();

        set.add("Pavan");
        set.add("Mahesh");
        set.add("Radha");
        set.add("germany");
        set.add("Uma");
        set.add("banu");
        set.add("Pallu");
        set.add("Pallu");

        System.out.println(set.size());

        for(String string : set){
            System.out.print(string + " ");
        }

    }
}
