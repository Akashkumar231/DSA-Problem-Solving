public class TrieNode {
    TrieNode [] character;
    boolean isEndOfWord;
    TrieNode(){
        character = new TrieNode[26];
        isEndOfWord  = false;
    }
}
