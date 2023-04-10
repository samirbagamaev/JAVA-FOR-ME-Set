//LINKED HASH SET
///////////////////////////////////////////////////////////////////////////////////

/*LinkedHashSet в отличие от HashSet не упорядочевает элементы
а выводит их в первозданном порядке
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(544);
        set.add(4);
        set.add(5);
        set.add(69);

        for (int x : set)
            System.out.print(x + " ");
        System.out.println();
    }
}

//ОТВЕТ: 1 2 3 544 4 5 69