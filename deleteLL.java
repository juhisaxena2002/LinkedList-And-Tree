class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}

public class deleteLL{
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

        //traverse(head);
        //insert(head, 110, 3);
        //delete(head, 4);
        //mid(head);
        // int res = mid(head);
        // System.out.println(res);
        //traverse(head);
        //node res = reverse(head);
        // node res = detect_cycle(head);
        // System.out.println(res.data);
        deletenth(head, 2);

    }

    public static void traverse(node head){
        node temp = head;
        while(temp!=null){
            System.out.println( temp.data);
            temp = temp.next;
        }
    }
    public static void insert(node head, int data, int pos){
        node toAdd = new node(data);
        if(pos==0){
            toAdd.next = head;
            head = toAdd;
            return;
        }
        node prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }
    public static void delete(node head, int pos){
        if(pos == 0){
            head = head.next;
            return;
        }
        node prev = head;
         for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

    }
    public static int mid(node head){
        int count = 0;
        node curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        node temp=head;
        for (int i = 0; i < count/2; i++) {
            temp = temp.next;
        }
        return temp.data;

    }
    public static node reverse(node head){
        node curr = head;
        node prev = null;
        while(curr!=null){
            node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static node is_cycle(node head){
        node fast = head;
        node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) return fast;
        }
        return null;
    
    }
    public static node detect_cycle(node head){
        node meet = detect_cycle(head);
        node start = head;
        while(start!=meet){
            start = start.next;
            meet = meet.next;
        }
        return start;

    }

    public static void deletenth(node head, int pos){
    
        node rev_node = reverse(head);
        delete(head,2);
        reverse(head);
        

    }
    
}