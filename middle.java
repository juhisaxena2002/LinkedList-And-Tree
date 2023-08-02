public class middle {
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
}
