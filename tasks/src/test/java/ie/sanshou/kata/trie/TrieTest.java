package ie.sanshou.kata.trie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

    private static Trie trie;

    @BeforeAll
    public static void setup() {
        trie = new Trie();
        trie.insert("test1");
        trie.insert("test2");
    }

    @Test
    public void trieCanInsertTwoWord() {
        assertTrue(trie.search("test1"));
        assertTrue(trie.search("test2"));
    }

    @Test
    public void trieShouldNotFindWordsWhichAreNotInsertedIntoTheTrie() {
        assertFalse(trie.search("test"));
    }

    @Test
    public void trieCanSearchPrefix() {
        assertTrue(trie.startsWith("test"));
        assertFalse(trie.startsWith("tset"));
    }
}
