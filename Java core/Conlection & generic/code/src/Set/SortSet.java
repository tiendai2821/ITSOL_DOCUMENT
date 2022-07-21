package Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortSet {
    public static void main(String[] args) {
        SortedSet<String> sortedSetString = new TreeSet<String>();

        // thêm các phần tử vào trong sortedSetString
        sortedSetString.add("Monday");
        sortedSetString.add("Tuesday");
        sortedSetString.add("Wednesday");
        sortedSetString.add("Thursday");
        sortedSetString.add("Saturday");
        sortedSetString.add("Sunday");

        // hiển thị sortedSetString ở dạng mảng
        // các phần tử được sắp xếp tăng dần theo chữ cái đầu tiên
        System.out.println("Các phần tử có trong sortedSetString: ");
        System.out.println(sortedSetString);


        //It can not be instantiated as it is a sub-Interface.

       // SortedSet<Integer> sortedSet = new SortSet<Integer>();

        SortedSet<Integer> sortNumber = new TreeSet<Integer>();
        sortNumber.add(5);
        sortNumber.add(4);
        sortNumber.add(6);
        sortNumber.add(9);
        sortNumber.add(1);

        Iterator<Integer> ite = sortNumber.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

    }
}
