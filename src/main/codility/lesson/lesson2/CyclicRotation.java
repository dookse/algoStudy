package codility.lesson.lesson2;

import java.util.LinkedList;
import java.util.Objects;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.IntStream.of;

public class CyclicRotation {

    public int[] solution(int[] a, int k) {

        LinkedList<Integer> list = getLinkedListFrom(a);

        for (int i = 0; i < k; i++) {
            list.push(list.pollLast());
        }

        return getIntArrayFrom(list);
    }

    private LinkedList<Integer> getLinkedListFrom(final int[] intArray) {
        return of(intArray)
            .boxed()
            .collect(toCollection(LinkedList::new));
    }

    private int[] getIntArrayFrom(final LinkedList<Integer> list) {
        return list
            .stream()
            .filter(Objects::nonNull)
            .mapToInt(i -> i)
            .toArray();
    }

}
