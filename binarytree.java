public class binarytree {
    Node root;
    class Node{
        int data;
        Node left,right;
        Node(int val){
            data=val;
            left=right=null;
        }
    }
    binarytree(int d){
        root = new Node(d);
    }
    void insertleft(Node r,int val){
        Node newNode = new Node(val);
        r.left=newNode;
    }
    void insertright(Node r,int val){
        Node newNode = new Node(val);
        r.right=newNode;
    }
    public static void preorder(Node root){
        if(root!=null){
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);}
    }
    public static void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);}
    }
    public static void postorder(Node root){
        if(root!=null){
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        binarytree bt =new binarytree(10);
        bt.insertleft(bt.root, 5);
        bt.insertright(bt.root, 15);
        bt.insertleft(bt.root.left, 3);
        bt.insertright(bt.root.left, 8);
        bt.insertleft(bt.root.right, 12);
        binarytree.preorder(bt.root);
        System.out.println();
        binarytree.inorder(bt.root);
        System.out.println();
        binarytree.postorder(bt.root);
    }    
}
