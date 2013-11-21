package lambdasinaction.chap4;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

import static lambdasinaction.chap4.Dish.menu;

public class StreamBasic {

    public static void main(String...args){
        List<String> names = menu.stream()
                                 .filter(d -> d.getCalories() > 300)
                                 .map(Dish::getName)
                                 .limit(3)
                                 .collect(toList());              
        System.out.println(names);
    }
}
