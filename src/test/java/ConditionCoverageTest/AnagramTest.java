package ConditionCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Anagram;

public class AnagramTest {
    @Test
    void shouldReturnFalseIfTheLengthOfTheTwoWordsIsDifferent(){
        Assertions.assertFalse(Anagram.isAnagram("chien","nich"));
    }

    @Test
    void shouldReturnTrueTheWordsAreAnagram(){
        Assertions.assertTrue(Anagram.isAnagram("chien","niche"));
    }

    @Test
    void shouldReturnExceptionIfTheStringISNull(){
        String s = null;
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(s," "));
    }

    @Test
    void shouldReturnFalseIfTheWordsAreTheSameLengthButAreNotAnagram(){
        Assertions.assertFalse(Anagram.isAnagram("niche","nicha"));
    }
}
