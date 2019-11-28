package Map;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class Hashmap1 {

	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Map<Integer,Employees> map=new HashMap<Integer,Employees>();
		Employees[] emp=new Employees[n];
		for(int i=0;i<n;i++)
		{
			name=s.next();
			age=s.nextInt();
			emp[i]=new Employees();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i, emp[i]);
			
		}
		for(Map.Entry<Integer, Employees>en:map.entrySet())
		{
			int key=en.getKey();
			Employees e=en.getValue();
			System.out.println(key+e.getName()+e.getAge());
		}

	}

}
