class Index {
    int index = 0;
}
class BtTobst
{
    
    int count(Node node) {
     if(node == null)    
         return 0;
                    
            return 1+count(node.left)+count(node.right);        
    }
    
    void Inorder(Node root,Index i,int arr[]) {
        if(root == null)
            return ;
            
        Inorder(root.left,i,arr);
        arr[i.index] = root.data;
        i.index = i.index+1;
        Inorder(root.right,i,arr);
    }
    
    void Construct(Node root,Index i,int arr[]) {
        if(root == null)
            return;
        
        Construct(root.left,i,arr);
        root.data = arr[i.index];
        i.index = i.index+1;
        Construct(root.right,i,arr);
    }
    /* You are required to complete below method */
    Node binaryTreeToBST(Node root)
    {
	   // Your code here
	   Index i = new Index();
	   int n = count(root);
	   int a[] = new int[n];
	   Inorder(root,i,a);
	   Index p = new Index();
	   Arrays.sort(a);
	   Construct(root,p,a);
	   return root;
    }
    
    
}

