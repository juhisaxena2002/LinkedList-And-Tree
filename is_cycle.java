public class is_cycle {
    
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
}
