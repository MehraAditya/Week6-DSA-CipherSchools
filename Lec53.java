class node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST
{
    BSTNode root;
    BST()
    {  
        root = null;
    }
    
    BST(int data)
    {
        this.root = new BSTNode(data);
    }

    BSTNode search(BSTNode root, int data)
    {
        if(root == null) return null;
        if(root.data == data) return root;
        if(data<root.data)
        {
            return search(root.left, data);
        }
        else
        {
            return search(root.right, int data);
        }
    }

    boolean searchItr(BSTNode root,int data)
    {
        if(root == null) return false;

        while(root != null)
    }

    void preOrder(BSTNode root)
    {
        if(root == null) return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(BSTNode root)
    {
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    boolean isMirror(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return root1.data == root2.data && isMirror(root1.left, root2.left) && isMirror(root1.right, root2.right);
    }

    void toMirror(Node root){
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        toMirror(root.left);
        toMirror(root.right);
    }

    boolean isSymmetric(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return isSymmetric(root1.left, root2.left) && isSymmetric(root1.right, root2.right);
    }

    void bfsRec(Node root)
    {
        int levels = height(root) + 1;
        for(int i=0;i<levels;i++)
        {
            printAtLevelHelper(root, i);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        BinaryTree bst = new BinaryTree(2);
        bst.root.left = new Node(3);
        bst.root.right = new Node(5);
        bst.root.left.right = new Node(9);
        bst.root.right.left = new Node(7);
        BinaryTree bst2 = new BinaryTree(2);
        bst.root.left = new Node(3);
        bst.root.right = new Node(5);
        bst.root.left.right = new Node(9);
        bst.root.right.left = new Node(7);
        BinaryTree bst3 = new BinaryTree(2);
        bst.root.left = new Node(3);
        bst.root.right = new Node(5);
        bst.root.left.right = new Node(9);
        bst.root.left.left = new Node(8);
        bst.root.right.left = new Node(7);
        System.out.println(bst.treeSum(bst.root));
        System.out.println(bst.countNodes(bst.root));
        System.out.println(bst.leafNodes(bst.root));
        System.out.println(bst.height(bst.root));
        bst.printAtLevel(bst.root, 0);
        bst.printAtLevel(bst.root, 1);
        bst.printAtLevel(bst.root, 2);
        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();
        System.out.println(bst.isIdentical(bst.root, bst2.root));
        System.out.println(bst.isIdentical(bst.root, bst3.root));
        System.out.println(bst.isMirror(bst.root, bst4.root));
        System.out.println(bst.isMirror(bst.root, bst2.root));
        System.out.println(bst.isSymmetric(bst.root, bst2.root));
        System.out.println(bst.isSymmetric(bst.root, bst3.root));
        System.out.println(res);
        System.out.println(bst.searchItr(bst.root, 12));
        System.out.println(bst.searchItr(bst.root, 25));
        System.out.println(bst.searchItr(bst.root, 37));
        System.out.println(bst.getMin(bst.root));
        System.out.println(bst.getMax(bst.root));
    }
}
