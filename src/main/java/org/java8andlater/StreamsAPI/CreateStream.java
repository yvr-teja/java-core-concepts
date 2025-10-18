package org.java8andlater.StreamsAPI;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //1  Stream.of
        Stream<String> streamOfString =
                Stream.of("Ravi","Sai","Gayathri","Janaki","YedlapalliSrinivasa");
        Stream<Integer> streamOfInt=Stream.of(1,2,3,4,5,6,7);
        Integer[] arr = {1,2,3,4,5,6,7};
        Stream<Integer> streamOfIntFromArr= Stream.of(arr);

        //2  Arrays.stream
        String array[]=new String[]{"a","b","c","d"};
        Stream<String> stream1= Arrays.stream(array);

        //3  Stream.builder
        Stream.Builder<String> builder= Stream.<String>builder();
        builder.add("Ravi").add("Teja").add("Sai").add("Santosh").add("Gayathri")
                .build().forEach(System.out::println);

        //4  Stream.empty()
        Stream<String> stream =Stream.empty();

        //5  Stream.generate()
        Random random=new Random();
        Supplier<Integer> randomSupplier =()->random.nextInt(9999);
        Stream<Integer> randomStreamInt=Stream.generate(randomSupplier).limit(1);
        randomStreamInt.forEach(System.out::println);

        //6  Stream.iterate
        Stream<Integer> streamEven = Stream.iterate(2,x->x+2).limit(100);
        streamEven.forEach(System.out::println);
        Stream<Integer> streamOdd = Stream.iterate(1,x->x+2).limit(100);
        streamOdd.forEach(System.out::println);

    }
}
