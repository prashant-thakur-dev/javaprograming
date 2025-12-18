package src.practic.LinkedLst;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.printList();
        int count = list.countNode();
        System.out.println("Number of node: "+count);
        boolean flag = list.searchValue(60);
        if (flag)
            System.out.println("available");
        else
            System.out.println("not available ");

        list.insertAtBeginning(300);
        list.printList();
        int count1 = list.countNode();
        System.out.println("Number of node: "+count1);

        System.out.println("First Node Value: "+list.firstNodeValue());
        System.out.println("Last Node Value: "+list.lastNodeValue());

        list.removeFirstNode();
        list.printList();
        int count2 = list.countNode();
        System.out.println("Number of node: "+count2);
        list.removeLastNode();
        list.printList();
        int count3 = list.countNode();
        System.out.println("Number of node: "+count3);
    }
}
