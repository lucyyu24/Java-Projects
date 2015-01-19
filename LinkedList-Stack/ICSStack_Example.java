
//import java.awt.*;

public class ICSStack_Example
{
   
    public static void main (String[] args)
    {
       
	ICSStack myLL = new ICSStack();  // Instantiate the linked list.
	myLL.displayList();

	ListItem tempListItem;  // Object var to hold reference to data for a list item.
	
	tempListItem = new ListItem("Bugs", "Bunny");        
	myLL.push(tempListItem);
	myLL.displayList();

	tempListItem = new ListItem("Daffy", "Duck");        
	myLL.push(tempListItem);

	tempListItem = new ListItem("Elmer", "Fudd");
	myLL.push(tempListItem);
	
	tempListItem = new ListItem("Foghorn", "Leghorn");
	myLL.push(tempListItem);
	 
	tempListItem = new ListItem("Marvin", "Martian");
	myLL.push(tempListItem);
      
	myLL.displayList();
	
	myLL.pop();
	
	myLL.displayList();

    } // main method
    
} // LinkedList_Example class
