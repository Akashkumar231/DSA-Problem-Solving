public class Trie {

    TrieNode root;

    Trie(){
        root = new TrieNode();
    }

    // Inserting a word
    public void insertWord(String word){

        TrieNode current = this.root;

        for (char ch : word.toCharArray()){

            int index = ch - 'a';

            if (current.character[index]==null){

                TrieNode node = new TrieNode();
                current.character[index]=node;
            }

            current = current.character[index];

        }

        current.isEndOfWord = true;
    }

    public boolean isWordPresent(String word){

        TrieNode curr = root;

        for (char ch : word.toCharArray()){

            int index = ch - 'a';

            if (curr.character[index]== null){
                return false;
            }

            curr = curr.character[index];

        }
        return curr.isEndOfWord;
    }

    public boolean isPrefix(String word){
        TrieNode curr = root;

        for (char ch : word.toCharArray()){

            int index = ch - 'a';

            if (curr.character[index]== null){
                return false;
            }

            curr = curr.character[index];

        }
        return true;
    }

    public void displayWords() {

        StringBuilder word = new StringBuilder();

        dfs(root, word);
    }

    /*
        DFS Traversal
    */
    private void dfs(TrieNode node, StringBuilder word) {

        /*
            If word completed
            print it
        */
        if (node.isEndOfWord) {

            System.out.println(word.toString());
        }

        /*
            Traverse all children
        */
        for (int i = 0; i < 26; i++) {

            if (node.character[i] != null) {

                /*
                    Convert index -> character
                */
                char ch = (char)(i + 'a');

                /*
                    Add character
                */
                word.append(ch);

                /*
                    Go deeper
                */
                dfs(node.character[i], word);

                /*
                    BACKTRACK
                    remove last character
                */
                word.deleteCharAt(word.length() - 1);
            }
        }
    }

}
