public class ListItem {

    // Attributes
    private String firstName;
    private String lastName;
    private ListItem next;  // Reference to the next item in the list.

    
    // Constructor
    public ListItem(String fname, String lname) {
	firstName = fname;
	lastName = lname;
	next = null;
    }
    
    
    public String getFirstName() {
	return (firstName);
    }
    
    public String getLastName() {
	return (lastName);
    }
    
    public ListItem getNext() {
	return (next);
    }
    
    public void setFirstName(String fname) {
	firstName = fname;
    }
    
    public void setLastName(String lname) {
	lastName = lname;
    }
    
    public void setNext(ListItem itemToBecomeNext) {
	next = itemToBecomeNext;
    }

}
