//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Implementing TRIE data structure");

        Trie trie = new Trie();

        String [] strings = new String[]{"abc","abcd","abcd","abcde"};

        for (String s : strings){
            trie.insertWord(s);
        }




       trie.displayWords();
        System.out.println(trie.isPrefix("ghi")); ;
    }
}