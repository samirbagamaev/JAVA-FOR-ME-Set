//TREE SET
///////////////////////////////////////////////////////////////////////////////////

//*С помощью TreeSet можно гарантировано упорядочить элементы

import java.util.Set;
import java.util.TreeSet;

/**
 * treeset
 */
public class treeset {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(69);
        set.add(6969);
        set.add(05);
        set.add(100);

        for(int x : set)
        System.out.print(x + " ");
        System.out.println();

    }
}

//ОТВЕТ: 3 5 69 100 6969 

///////////////////////////////////////////////////////////////////////////////////

//*С помощью TreeSet можно упорядочить элементы и в порядке убывания

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * treeset
 */
public class treeset {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        set.add(5);
        set.add(3);
        set.add(69);
        set.add(6969);
        set.add(100);

        for (int x : set)
            System.out.print(x + " ");
        System.out.println();

    }
}

// ОТВЕТ: 6969 100 69 5 3 



///////////////////////////////////////////////////////////////////////////////////

//*С помощью TreeSet можно упорядочить элементы и в порядке возрастания

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * treeset
 */
public class treeset {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        set.add(5);
        set.add(3);
        set.add(69);
        set.add(6969);
        set.add(100);

        for (int x : set)
            System.out.print(x + " ");
        System.out.println();

    }
}

// ОТВЕТ: 3 5 69 100 6969 