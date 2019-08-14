package ie.sanshou.kata.trie;

public class Trie {

    private String word;

    public void insert(String word) {
        this.word = word;
    }

    public boolean search(String word) {
        return this.word.equals(word);
    }
}
