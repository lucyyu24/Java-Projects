public class TestBinaryTree {

	public static void main(String[] args) {

		System.out.println("Binary Tree test program.\n\n");

		BinaryTree myBT = new BinaryTree();

		TreeItem tempNode = new TreeItem(77, "Bugs", "Bunny", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(99, "Daffy", "Duck", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(11, "Elmer", "Fudd", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(88, "Foghorn","Leghorn", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(100, "Marvin", "Martian", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(95, "Fred", "Flinstone", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(2, "Wilma", "Flinstone", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(17, "Barney", "Dinosaur", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(55, "Betty", "Boop",null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		myBT.inOrder(myBT.getRoot());

		tempNode = new TreeItem(0, "Dino", "Dan", null, null);
		myBT.insert(myBT.getRoot(), tempNode);

		System.out.println("\n");
		System.out.println("\nINORDER TRAVERSAL");
		myBT.inOrder(myBT.getRoot());

		System.out.println("\nPREORDER TRAVERSAL");
		System.out.println("\n"); myBT.preOrder(myBT.getRoot());
		
		System.out.println("\nPOSTORDER TRAVERSAL");
		System.out.println("\n"); myBT.postOrder(myBT.getRoot());
		
		System.out.println("\nSearching for Number 100");
		myBT.search(myBT.getRoot(), 100); 
		
		System.out.println("\nSearching for Number 33");
		myBT.search(myBT.getRoot(), 33);
		
		System.out.println("\n\nGoodbye!");

	} // end main method

} // end TestBinaryTree
