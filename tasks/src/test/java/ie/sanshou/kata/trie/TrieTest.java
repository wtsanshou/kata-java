package ie.sanshou.kata.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

    @Test
    public void trieCanInsertWord() {
        Trie trie = new Trie();
        trie.insert("test");
        assertTrue(trie.search("test"));
    }
}
