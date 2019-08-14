package ie.sanshou.kata.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private List<String> words;

    public Trie() {
        words = new ArrayList<>();
    }

    public void insert(String word) {
        this.words.add(word);
    }

    public boolean search(String word) {
        return words.stream().anyMatch(w -> w.equals(word));
    }
}
