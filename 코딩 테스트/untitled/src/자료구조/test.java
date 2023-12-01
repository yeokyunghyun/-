package 자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(10,5,3,7,9,11));

        ListIterator<Integer> arrIter = arr.listIterator();

        arrIter.add(4);

    }
}
