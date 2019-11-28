package Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arraylistencapsulation {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		ArrayList a=new ArrayList();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("enter the age");
			int age=s.nextInt();
			System.out.println("enter the qualification");
			String quali=s.next();
			System.out.println("enter the department");
			String dep=s.next();
			e[i]=new Employee();
			e[i].setName(name);
			e[i].setAge(age);
			e[i].setQuali(quali);
			e[i].setDep(dep);
			a.add(e[i]);
		}
		Iterator<Employee> itr=a.iterator();
		while(itr.hasNext())
		{
			Employee em=itr.next();
			System.out.println(em.getName()+" "+em.getAge()+" "+em.getQuali()+" "+em.getDep());
		}
	}

}