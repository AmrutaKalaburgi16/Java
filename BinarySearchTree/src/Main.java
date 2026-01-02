public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.Inorder();
        tree.Preorder();
        tree.Postorder();


    }


}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
class BinarySearchTree {
    Node root;
    public void insert(int data){
        root=insertRec(root,data);
    }
    private Node insertRec(Node root,int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (root.data < data) {
            root.right = insertRec(root.right, data);
        } else if (root.data > data) {
            root.left = insertRec(root.left, data);
        }
    return root;
    }

    public void Inorder(){
        InorderRec(root);


    }

    private void InorderRec(Node root) {
        if(root!=null){
            InorderRec(root.left);
            System.out.print(root.data+" ");
            InorderRec(root.right);
        }
    }
    public void Preorder(){
        PreorderRec(root);


    }

    private void PreorderRec(Node root) {
        if(root!=null){

            System.out.print(root.data+" ");
            PreorderRec(root.left);
            PreorderRec(root.right);
        }
    }

    public void Postorder() {
        PostorderRec(root);
    }

    private void PostorderRec(Node root) {
        if(root!=null){
            PostorderRec(root.left);
            PostorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
}