package com.jinhogate.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TpStream {
    public static void main(String[] args) throws IOException {
        String line = "one two three four";
        System.out.println("Get la 1ere chaine de caractere de longueur trois");
        Pattern pattern = Pattern.compile(" ");
        Stream<String> stringStream = pattern.splitAsStream(line);
        String res = stringStream.filter(s -> s.length() > 2).findFirst().orElseThrow();
        System.out.println("Res = " + res);

        System.out.println("La longueur maximale");
        Stream<String> streamStrings = Stream.of("one", "two", "three", "four");
        Integer maxLlength = streamStrings.map(String::length)
                .max(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println("Max lenght = " + maxLlength);

        Stream<String> streamStrings2 = Stream.of("one", "two", "three", "four");
        int maxLength = streamStrings2.mapToInt(String::length)
                .max()
                .orElseThrow();
        System.out.println("Max lenght = " + maxLlength);

        System.out.println("Trouver la chaine de caractère qui a longueur max");
        Stream<String> streamStrings3 = Stream.of("one", "two", "three", "four");
        String chainePlusLongue = streamStrings3.max(Comparator.comparingInt(String::length))
                .orElseThrow();
        System.out.println("Chaine plus longue = " + chainePlusLongue);

        System.out.println("Extraction des lines dans un fichier");
        Path path = Path.of("files/file.txt");
        Stream<String> lines = Files.lines(path);
        long count = lines.count();
        System.out.println(count);

        System.out.println("Transformer les lignes en stream de strings");
        Function<String, Stream<String>> mapToStream = l -> Pattern.compile(" ").splitAsStream(l);
        Stream<String> lines2 = Files.lines(path);
        Stream<String> stringStream1 = lines2.flatMap(mapToStream);
        System.out.println(stringStream1.count());

        System.out.println("\nTransformation d'un mot en caractères");
        String eleven = "eleven";
        List<Character> list = eleven.chars().mapToObj(c -> (char) c).toList();
        list.forEach(System.out::println);
    }
}
