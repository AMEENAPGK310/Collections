package Arraylist;
import java.util.ArrayList;
import java.util.*;


public class Arraylist1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();//create arraylist object 
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("enter the age");
			int age=s.nextInt();
			list.add(name);
			list.add(age);
		}
		//System.out.println(list.get(0));
		ArrayList list1=(ArrayList) list.clone();//duplicate values
		System.out.println("clone value:"+list1.get(0)+" ");
		list1.remove(0);
		System.out.println("removed value:"+list1.get(0));
		System.out.println("enter the string");
		String a=s.next();
		list.set(1, a);
		//list.clear();// no output
		list.removeAll(list);//remove all values
		System.out.println("list values");
		Iterator itr=(Iterator) list.iterator();//instead of for loop
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
