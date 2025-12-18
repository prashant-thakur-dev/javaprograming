package src.practic.LinkedLst;

public class MyLinkedList {
    Node head;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public int firstNodeValue(){
        return head.data;
    }
    public void removeFirstNode(){
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }

    public int lastNodeValue(){
        Node temp = head;
        int val = 0;
        while(temp.next != null){
            val = temp.data;
            temp = temp.next;
        }
        return val;
    }
    public void removeLastNode(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int countNode(){
        Node curr = head;
        int count = 0;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public boolean searchValue(int val){
        Node curr = head;
        while(curr.next != null){
            if (curr.data == val){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
