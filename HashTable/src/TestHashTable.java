/*Name: Lucy Yu
 * Student Number: 721112
 */

public class TestHashTable 
{
	public static final int NUMBUCKETS = 2;
	
	public static void main (String[] args)
	{
		StudentInfo someStudent;
		
		MyHashTable theHashTable = new MyHashTable (NUMBUCKETS);
		theHashTable.display();
		System.out.println("");
		
		someStudent = new StudentInfo (333333, "Foghorn");
		if (theHashTable.insert(someStudent))
		{
			System.out.println("Sucessfully added the student!\n");
		}
		
		someStudent = new StudentInfo (555555, "Bugs");
		if (theHashTable.insert(someStudent))
		{
			System.out.println("Sucessfully added the student!\n");
		}
		
		someStudent = new StudentInfo(444444, "Daffy");
		if (theHashTable.insert(someStudent))
		{
			System.out.println("Sucessfully added the student!\n");
		}
		
		theHashTable.display();
		System.out.println(" ");
		
		theHashTable.remove(444444);
		System.out.println("Removed student with number 444444");
		System.out.println(" ");
		
		theHashTable.display();
		
		System.out.println(" ");
		
		System.out.println("Searching student with number 555555");
		System.out.println (theHashTable.search(555555));
		
		System.out.println(" ");
		
		System.out.println("Searching student with number 444444");
		System.out.println (theHashTable.search(444444));
	}
}