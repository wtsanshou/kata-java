package ie.sanshou.kata.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

    @Test
    public void trieCanInsertOneWord() {
        Trie trie = new Trie();
        trie.insert("test");
        assertTrue(trie.search("test"));
    }

    @Test
    public void trieCanInsertTwoWord() {
        Trie trie = new Trie();
        trie.insert("test1");
        trie.insert("test2");
        assertTrue(trie.search("test1"));
        assertTrue(trie.search("test2"));
    }

    @Test
    public void trieShouldNotFindWordsWhichAreNotInsertedIntoTheTrie() {
        Trie trie = new Trie();
        trie.insert("test1");
        trie.insert("test2");
        assertFalse(trie.search("test"));
    }
}
