package ie.sanshou.kata.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private Map<Character, Trie> words;
    private boolean isWord;

    public Trie() {
        words = new HashMap<>();
    }

    public void insert(String word) {
        Trie currentNode = this;
        for (char c : word.toCharArray()) {
            if (!currentNode.words.containsKey(c))
                currentNode.words.put(c, new Trie());
            currentNode = currentNode.words.get(c);
        }
        currentNode.isWord = true;
    }

    public boolean search(String word) {
        Trie currentNode = find(word);
        return currentNode != null && currentNode.isWord;
    }

    public boolean startsWith(String word) {
        return find(word) != null;
    }

    private Trie find(String word) {
        Trie currentNode = this;
        for (char c : word.toCharArray()) {
            if (currentNode.words.containsKey(c))
                currentNode = currentNode.words.get(c);
            else
                return null;
        }
        return currentNode;
    }
}
