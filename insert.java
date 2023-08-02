public class insert {
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
}
