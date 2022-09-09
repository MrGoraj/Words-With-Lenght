import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringUtils {

    /**
     *
     * @param text Text with words to verify
     * @param wordLength How long can be words from text
     * @return Words no longer than specified in the parameters
     */
    public List<String> getWordsWithLength(String text, int wordLength) {
        String[] words = text.split(" ");
        List <String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);
        wordList.removeIf(s -> s.length() != wordLength);
        return wordList;
    }
}
