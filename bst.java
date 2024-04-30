public class bst {
    Node root;
    class Node{
        int key;
        Node left,right;
        Node(int val){
            key=val;
            left=right=null;
        }
    }
    bst(int val){
        root=new Node(val);
    }
    bst(){
        root=null;
    }
    void insert(int val){
        insert(root,val);
    }
    Node insert(Node root,int val){
        if(root==null)
        return new Node(val);
        if(val<root.key)
        root.left=insert(root.left,val);
        else
        root.right=insert(root.right,val);
        return root;
    }
    public static void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);}
    }
    Node search(Node root,int val){
        if(root==null || root.key==val)
            return root; 
        if(val<root.key)
        return search(root.left,val);
        return search(root.right,val);
    }
    Node delete(Node root,int val){
        if(root==null)
        return root;
        if(val<root.key)
            root.left=delete(root.left, val);
        else if(val>root.key)
            root.right=delete(root.right,val);
        else{
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
            root.key=min(root.right);
            root.right=delete(root.right, root.key);
        }
        return root;
    }
    int min(Node root){
        int minval=root.key;
        while(root.left!=null){
            minval = root.left.key;
            root=root.left;
        }
        return minval;
    }
    public static void main(String[] args){
        bst b = new bst(50);
        b.insert(20);
        b.insert(70);
        b.insert(10);
        b.insert(25);
        b.insert(60);
        b.insert(90);
        b.inorder(b.root);
        System.out.println();
        if(b.search(b.root,35)==null){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }
        b.delete(b.root, 50);
        b.inorder(b.root);

    }
    
}