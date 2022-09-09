import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtils {

    /**
     *
     * @param text Text with words to verify
     * @param wordLength How long can be words from text
     * @return Words no longer than specified in the parameters
     */
    public List<String> getWordsWithLength(String text, int wordLength) {
        List<String> words = List.of(text.split(" "));
        Stream<String> valid = words.stream().filter(s -> s.length() == wordLength);
        return valid.collect(Collectors.toList());
    }
}
