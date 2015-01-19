/*  Name: Lucy Yu
    Student Number: 721112
*/
public class TreeItem
{
    private TreeItem left;
    private TreeItem right;
    private int studentNumber;
    private String firstName;
    private String lastName;

    public TreeItem (int sNumber, String fName, String lName, TreeItem l, TreeItem r)
    {
	studentNumber = sNumber;
	firstName = fName;
	lastName = lName;
	left = l;
	right = r;
    }


    public int getStudentNumber ()
    {
	return (studentNumber);
    }


    public String getFirstName ()
    {
	return (firstName);
    }


    public String getLastName ()
    {
	return (lastName);
    }


    public TreeItem getLeft ()
    {
	return (left);
    }


    public TreeItem getRight ()
    {
	return (right);
    }


    public void setStudentNumber (int sNumber)
    {
	studentNumber = sNumber;
    }


    public void setFirstName (String fName)
    {
	firstName = fName;
    }


    public void setLastName (String lName)
    {
	lastName = lName;
    }


    public void setLeft (TreeItem itemToSetLeft)
    {
	left = itemToSetLeft;
    }


    public void setRight (TreeItem itemToSetRight)
    {
	right = itemToSetRight;
    }
}
