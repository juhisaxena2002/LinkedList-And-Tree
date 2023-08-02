class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}

public class traverseLL{
    public static void main(String[] args) {
        node n1 = new node(4);
        node n2 = new node(5);
        node n3 = new node(6);
        node n4 = new node(7);

        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        traverse(head);
    
    }

    public static void traverse(node head){
        node temp = head;
        while(temp!=null){
            System.out.println( temp.data);
            temp = temp.next;
        }
    }
}