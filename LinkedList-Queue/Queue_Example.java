public class Queue_Example
{
   
    public static void main (String[] args)
    {
       
	// Instantiate Queue, and displays it. 
	Queue myQ = new Queue();
	  
	myQ.displayQueue();

	// Object variable to hold reference to data for a list item.
	ListItem tempListItem; 

	tempListItem = new ListItem("Bugs", "Bunny");        
	myQ.enqueue(tempListItem);
	
	myQ.displayQueue();
	
	// Dequeue from a list that only has one item at this point. 
	myQ.dequeue();
	
	myQ.displayQueue(); 
	
	// Dequeue from empty list. 
	myQ.dequeue();
	
	myQ.displayQueue(); 

	// Enqueue four items. 
	tempListItem = new ListItem("Daffy", "Duck");        
	myQ.enqueue(tempListItem);

	tempListItem = new ListItem("Elmer", "Fudd");
	myQ.enqueue(tempListItem);
	
	tempListItem = new ListItem("Foghorn", "Leghorn");
	myQ.enqueue(tempListItem);
	 
	tempListItem = new ListItem("Marvin", "Martian");
	myQ.enqueue(tempListItem);
      
	myQ.displayQueue();
	
	// Dequeue from a list of four items. 
	myQ.dequeue();
	
	myQ.displayQueue();

    }
    
}
