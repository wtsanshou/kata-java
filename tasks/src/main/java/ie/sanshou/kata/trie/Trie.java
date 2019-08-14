package ie.sanshou.kata.trie;

import java.util.HashSet;
import java.util.Set;

public class Trie {

    private Set<String> words;

    public Trie() {
        words = new HashSet<>();
    }

    public void insert(String word) {
        this.words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }
}
