class BSTNode
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

public class BST{
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
            return search(root.left, data)
        }
        else
        {
            return search(root.right, data)  
        }
    }

    public static void main(String[] args)
    {
        BST bst = new BST(15);
        bst.root.left = new BSTNode(10);
        bst.root.left.left = new BSTNode(8);
        bst.root.left.right = new BSTNode(12);
        bst.root.right.left = new Node(7);
        bst.root.right.left = new BSTNode(17);
        bst.root.right.right = new BSTNode(25);
        BSTNode res = bst.search(bst.root, 21);
        System.out.println();
    }
}
