import java.util.Scanner;
public class createTree{
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        node root = create();	
        // System.out.println("IN-ORDER PRINT  -> ");
        // inorder(root);
        // System.out.println("PRE-ORDER PRINT  -> ");
        // preorder(root);
        // System.out.println("POST-ORDER PRINT  -> ");
        // postorder(root);
        //int res = height(root);
        //System.out.println(res);
        // int ans = size(root);
        // System.out.println(ans);
        // int min = mini(root);
        // System.out.println(min);
        // int maxi = maxi(root);
        // System.out.println(maxi);
        levelorder(root, 3);
        

    }
     static node create(){
        node root = null;
        System.out.println("enter data");
        int data =  sc.nextInt();
        if(data == -1) return null;
        root = new node(data);
        System.out.println("enter left data" + data);
        root.left = create();
        System.out.println("enter right data"+ data);
        root.right = create();
        return root;
    }
    static void inorder(node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
    static void preorder(node root){ 
        if(root == null) return;
        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data +" ");
    }
    public static int height(node root){
        if(root==null) return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }
    public static int size(node root){
        if(root == null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static int maxi(node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maxi(root.left), maxi(root.right)));
    }
    public static int mini(node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(mini(root.left), mini(root.right)));
    }
    public static void levelorder(node root, int level){
        if(root == null) return;
        if(level == 1){ System.out.println (root.data);}
        else if(level > 1){
            levelorder(root.left, level-1);
            levelorder(root.right, level-1);
        }
    }
}
class node{
    node left,right;
    int data;
    node(int data){
        this.data = data;
    }
}

