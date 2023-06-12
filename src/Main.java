import sun.awt.image.ImageWatched;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //creation of List
        ArrayList<Integer> listOfNumbers = new ArrayList<>(100);

        //filling in ArrayList of numbers with random numbers
        for (int i = 1; i <= 100; i++) {
            listOfNumbers.add((int) (Math.random() * 50));
        }

        //First realization of duplication removing
        //creation of object setOfNumbers with type Set via constructor of LinkedHashSet
        //LinkedHashSet will remove all duplicates and leave an initial order of numbers
        Set<Integer> setOfNumbers = new LinkedHashSet<>(listOfNumbers);

        System.out.println(listOfNumbers);
        System.out.println("Via Set: ");
        System.out.println(setOfNumbers);



        //Second realization of duplication removing via array[]
        Integer[] arrayOfNumbers2 = listOfNumbers.toArray(new Integer[listOfNumbers.size()]);
        List<Integer> listOfNotDuplNumbers = new ArrayList<>(100);

        for (int i = 0; i < arrayOfNumbers2.length; i++) {
            if (!listOfNotDuplNumbers.contains(arrayOfNumbers2[i])) {
                listOfNotDuplNumbers.add(arrayOfNumbers2[i]);
            }
        }
        System.out.println("Via Array: ");
        System.out.println(listOfNotDuplNumbers);



        //Third realization of duplication removing via ListIterator
        List<Integer> listOfNotDuplNumbers2 = new ArrayList<>(100);
        ListIterator<Integer> listIterator = listOfNumbers.listIterator();

        while (listIterator.hasNext()) {
            if (!listOfNotDuplNumbers2.contains(listIterator.next())) {
                listOfNotDuplNumbers2.add(listIterator.previous());
            }
        }
        System.out.println("Via ListIterator: ");
        System.out.println(listOfNotDuplNumbers2);
    }
}