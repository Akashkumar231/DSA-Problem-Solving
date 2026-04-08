public class Main {
    public static void main(String[] args) {

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.insertHead(45);
        customLinkedList.insertHead(44);
        customLinkedList.insertHead(43);
        customLinkedList.insertHead(42);
        customLinkedList.insertHead(41);

        customLinkedList.traverseList();
    }
}