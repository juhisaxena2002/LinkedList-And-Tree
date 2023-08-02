public class reverse {
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
}
