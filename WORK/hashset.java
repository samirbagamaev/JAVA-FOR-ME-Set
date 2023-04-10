//HASH SET
///////////////////////////////////////////////////////////////////////////////////

import java.util.HashSet;
import java.util.Set;

/**
 * hashset
 */
public class hashset {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(69);
        System.out.println(set);
    }
}

//ОТВЕТ: [1, 2, 3, 4, 5, 69]

///////////////////////////////////////////////////////////////////////////////////

/*
HashSet любит только уникальные элементы, если например добавлены 5 
одинаковых элементов, то он все равно выведет только один

И еще  HashSet иногда может упорядочить элементы
*/

import java.util.HashSet;
import java.util.Set;

/**
 * hashset
 */
public class hashset {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(69);

        for (int x : set)
            System.out.print(x + " ");
        System.out.println();
    }

}

//ОТВЕТ: 1 2 3 4 5 69 