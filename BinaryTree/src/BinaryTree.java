/*
    Name: Lucy Yu
    Student Number: 721112
*/
public class BinaryTree
{
    // Attributes
    private TreeItem root;

    // Constructor
    public BinaryTree ()
    {
	root = null;
    }


    public void setRoot (TreeItem r)
    {
	root = r;
    }


    public TreeItem getRoot ()
    {
	return (root);
    }


    // Insert item to the tree
    public void insert (TreeItem currentRoot, TreeItem itemToInsert)
    {
	if (root == null)
	{
	    root = itemToInsert;
	    return;
	}


	else
	{
	    if (currentRoot.getStudentNumber () > itemToInsert.getStudentNumber ())
	    {
		if (currentRoot.getLeft () == null)
		{
		    currentRoot.setLeft (itemToInsert);
		    return;
		}
		this.insert (currentRoot.getLeft (), itemToInsert);
		return;
	    }

	    else
	    {
		if (currentRoot.getRight () == null)
		{
		    currentRoot.setRight (itemToInsert);
		    return;
		}
		this.insert (currentRoot.getRight (), itemToInsert);
		return;
	    }
	}
    }


    // Preorder Traversal
    public void preOrder (TreeItem currentRoot)
    {
	if (currentRoot != null)
	{
	    System.out.println (currentRoot.getStudentNumber () + " " + currentRoot.getFirstName () + " " + currentRoot.getLastName ());
	    this.preOrder (currentRoot.getLeft ());
	    this.preOrder (currentRoot.getRight ());
	}
	return;
    }


    // In-order Traversal
    public void inOrder (TreeItem currentRoot)
    {
	if (currentRoot != null)
	{
	    this.inOrder (currentRoot.getLeft ());
	    System.out.println (currentRoot.getStudentNumber () + " " + currentRoot.getFirstName () + " " + currentRoot.getLastName ());
	    this.inOrder (currentRoot.getRight ());
	}
	return;
    }


    // Post-order Traversal
    public void postOrder (TreeItem currentRoot)
    {
	if (currentRoot != null)
	{
	    this.postOrder (currentRoot.getLeft ());
	    this.postOrder (currentRoot.getRight ());
	    System.out.println (currentRoot.getStudentNumber () + " " + currentRoot.getFirstName () + " " + currentRoot.getLastName ());
	}
	return;
    }


    // Search if item exists, return true/false
    public void search (TreeItem currentRoot, int searchNumber)
    {
	if (searchNumber == currentRoot.getStudentNumber ())
	{
	    System.out.println ("true");
	    return;
	}

	else
	{
	    if (currentRoot.getStudentNumber () > searchNumber)
	    {
		if (currentRoot.getLeft () == null)
		{
		    System.out.println("false");
		    return;
		}

		this.search (currentRoot.getLeft (), searchNumber);
		return;

	    }

	    else
	    {
		if (currentRoot.getRight () == null)
		{
		    System.out.println("false");
		    return;
		}

		this.search (currentRoot.getRight (), searchNumber);
		return;
	    }
	}

    }

}
