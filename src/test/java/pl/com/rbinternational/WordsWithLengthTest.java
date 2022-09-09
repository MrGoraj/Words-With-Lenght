package pl.com.rbinternational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.com.rbinternational.StringUtils;

import java.util.List;

public class WordsWithLengthTest {

    StringUtils utils = new StringUtils();

    @Test
    void wordLengthTest() {
        //given
        String testWords = "Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse consectetur purus sed semper bibendum. Aenean sit amet vestibulum magna. Donec ligula ex, malesuada venenatis libero in, gravida volutpat quam. Donec.";

        List<String> result;
        List<String> correct = List.of("Lorem", "Lorem", "ipsum", "dolor", "amet,", "elit.", "purus", "Donec", "quam.");

        result = utils.getWordsWithLength(testWords, 5);
        Assertions.assertEquals(correct, result);
    }

    @Test
    void uniqueWordsTest() {
        //given
        String testWords = "Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse consectetur purus sed semper bibendum. Aenean sit amet vestibulum magna. Donec ligula ex, malesuada venenatis libero in, gravida volutpat quam. Donec.";

        List<String> result;
        List<String> correct = List.of("Lorem", "ipsum", "dolor", "amet,", "elit.", "purus", "Donec", "quam.");

        result = utils.getUniqueWords(testWords, 5);
        Assertions.assertEquals(correct, result);
    }

    @Test
    void wordNotFoundTest() {
        String testWords = "Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse consectetur purus sed semper bibendum. Aenean sit amet vestibulum magna. Donec ligula ex, malesuada venenatis libero in, gravida volutpat quam. Donec.";

        List<String> result;
        List<String> correct = List.of();

        result = utils.getUniqueWords(testWords, 15);
        Assertions.assertEquals(correct, result);
    }
}