package Tree;


import java.util.Map;
import java.util.TreeMap;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }
}

class Words {
    TrieNode head;
    StringBuffer prefix;

    Words() {
        prefix = new StringBuffer();
        head = new TrieNode();
    }

    void insert(String str) {
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';

        }
    }
}


public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.lastKey();
    }
}
