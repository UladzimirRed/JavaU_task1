package by.epam.task1.parser;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileParser {
    private static final String SEPARATOR = "\\D+";
    private static final String DIGITS = "\\d+";

    public List<Integer> parser (List<String> Strings) {
        Stream<String> fileStream = Strings.stream();
        return fileStream
                .flatMap(Pattern.compile(SEPARATOR)::splitAsStream)
                .filter(Pattern.compile(DIGITS).asPredicate())
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}