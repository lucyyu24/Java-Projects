public class ICSStack
{

    // Attributes
    private ListItem firstItem;  // Reference to the first item in the list.
    private int numItems;  // Number of items currently in the list.


    // Constructor, used to set attribute values for an empty list.
    public ICSStack ()
    {
	firstItem = null;
	numItems = 0;
    }


    // Method to add an item to the tail of the list.
    public void push (ListItem itemToPush)
    {
	itemToPush.setNext(firstItem);
	firstItem = itemToPush;
	numItems++;
    } // end addToTail


    // Remove and return the item at the tail of the list.
    public ListItem pop ()
    {
	ListItem first = firstItem;
	firstItem = firstItem.getNext();

	first.setNext(null);
	numItems -= 1;
	return first;
    } // end removeFromTail


    // Display the items in the list (from head to tail).
    public void displayList ()
    {
	if (numItems == 0)
	{
	    System.out.println ("null");
	}
	else
	{
	    ListItem temp = firstItem;
	    while (temp != null)
	    {
		System.out.println (temp.getFirstName ());
		System.out.println (temp.getLastName ());
		System.out.println (temp);
		temp = temp.getNext ();
	    }
	}
	System.out.println (" ");

    } // end displayList


    public ListItem peek ()
    {
	return firstItem;
    }
}
