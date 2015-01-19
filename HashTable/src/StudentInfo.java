/*Name: Lucy Yu
 * Student Number: 721112
 */
public class StudentInfo
{
	private String firstName;
	private int studentNumber;
	
	public StudentInfo (int sNum, String fName)
	{
		firstName = fName;
		studentNumber = sNum;
	}
	
	public int getStudentNumber()
	{
		return studentNumber;
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	
	public void setStudentNumber (int num)
	{
		studentNumber = num;
	}
	
	public void setFirstName (String fname)
	{
		firstName = fname;
	}
	
}