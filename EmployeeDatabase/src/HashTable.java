/*Name: Lucy Yu
 * Student Number: 721112
 */
import java.util.*;

public class HashTable 
{
	private ArrayList<Employee>[] Buckets;
	private int numBuckets;
	
	public HashTable (int num)
	{
		numBuckets = num;
		if (numBuckets > 0)
		{
			Buckets = new ArrayList [numBuckets];
			for (int i=0; i<numBuckets; i++)
			{
				Buckets [i] = new ArrayList<Employee>();
			}
		}
	}

	public boolean insert (Employee itemToAdd)
	{
		 int bucketNum = itemToAdd.getEmpNumber() % numBuckets;
		 boolean status = Buckets [bucketNum].add (itemToAdd);
		 return status;
	}
	
	
	public void display ()
	{
		for (int i=0; i<numBuckets;i++)
		{
			for (int j=0; j<Buckets[i].size(); j++)
			{
				System.out.println (Buckets[i].get(j).getEmpNumber());
			}
		}
	}
	
	public boolean search (int keyValue)
	{
		boolean result = false;
		int i = keyValue % numBuckets;
		for (int j = 0; j<Buckets[i].size(); j++)
		{
			if (keyValue == Buckets[i].get(j).getEmpNumber())
			{
				result = true;
			}
		}
		return result; 
	}
	
	
	public void remove (int keyValue)
	{
		int i = keyValue % numBuckets;
		for (int j=0; j<Buckets[i].size(); j++)
		{
			if (keyValue == Buckets[i].get(j).getEmpNumber())
			{
				Buckets[i].remove(j);
			}
		}
	}
}