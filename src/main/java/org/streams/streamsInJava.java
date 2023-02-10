package org.streams;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class streamsInJava {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; ++i) arrayList.add(i);

        // make another arraylist of squares

        // without streams
//        ArrayList<Integer> sqList = new ArrayList<>();
//        for (int item : arrayList) sqList.add(item * item);
//        System.out.println(sqList);

        // using streams
        // here x->x*x is a lambda function, similar to arrow function in javascript
        // .collect converts the stream back to a collection
        // List<Integer> sqList = arrayList.stream().map(x->x*x).collect(Collectors.toList());
        List<Integer> sqList = arrayList.stream().map(x -> x * x).toList(); // streams are better as the processor can execute single instruction very fast and also streams make use of multicore processors as well
        System.out.println(sqList);

        List<Integer> sortedList = sqList.stream().sorted().toList();
        System.out.println(sortedList);

        List<Integer> oddList = arrayList.stream().filter(x -> (x & 1) == 1).toList();
        System.out.println(oddList);

        oddList.forEach(x -> System.out.println("element is: " + x));

        // identity: an element that is the initial value of the reduction operation and the default result if the stream is empty
        // accumulator: a function that takes two parameters - a partial result of the reduction operation and the next element of the stream
        // combiner: a function used to combine the partial result of the reduction operation;
        //           when the reduction is parallelized or when there's a mismatch between the types of the accumulator arguments and types of the accumulator implementation
        int sum = oddList.stream().reduce(0, (ans, i) -> ans + i);
        System.out.println(sum);
    }
}
