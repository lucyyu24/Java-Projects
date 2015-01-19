public class Queue
{
    // Attributes of Queue.
    private ListItem head;
    private ListItem tail;
    private int numItems;

    // Constructor.
    public Queue ()
    {
	head = null;
	tail = null;
	numItems = 0;
    }


    // Add a ListItem to the end.
    public void enqueue (ListItem itemToAdd)
    {
	if (numItems == 0)
	{
	    head = itemToAdd;
	}
	else
	{
	    tail.setNext (itemToAdd);
	}
	tail = itemToAdd;
	numItems++;
    }


    // Removes and returns the first item.
    public ListItem dequeue ()
    {
	if (numItems == 0)
	{
	    return null;
	}

	else if (numItems == 1)
	{
	    tail = null;
	}

	// Storing head into a ListItem 'first'. 
	ListItem first = head;
	// Setting the head as its next item; head is now the second item. 
	head = head.getNext ();
	// ListItem 'first' is pointing at the original head, and setting its next item as null. 
	first.setNext (null);

	numItems--;
	return first;
    }


    // Return the first item in the list.
    public ListItem peek ()
    {
	return head;
    }


    // Display the items in the list (from first to last).
    public void displayQueue ()
    {
	if (numItems == 0)
	{
	    System.out.println ("null");
	}
	else
	{
	    ListItem temp = head;
	    while (temp!= null)
	    {
		System.out.println (temp.getFirstName ());
		System.out.println (temp.getLastName ());
		System.out.println (temp);
		temp = temp.getNext ();
	    }
	}
	System.out.println (" ");
    }
}
