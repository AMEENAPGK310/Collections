package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashmapstudent {

	public static void main(String[] args)
	{
		int regno;
		String name;
		String phno;
		String college;
		String address;
		int mark;
		int year;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		Student[] st=new Student[n];
		for(int i=0;i<n;i++)
		{
			name=s.next();
			phno=s.next();
			college=s.next();
			address=s.next();
			mark=s.nextInt();
			year=s.nextInt();
			st[i]=new Student();
			st[i].setName(name);
			st[i].setPhno(phno);
			st[i].setCollege(college);
			st[i].setAddress(address);
			st[i].setMark(mark);
			st[i].setYear(year);
			map.put(i,st[i]);
		}
		for(Map.Entry<Integer, Student>str:map.entrySet())
		{
			regno=str.getKey();
			Student su=str.getValue();
			System.out.println(regno+" "+su.getName()+" "+su.getPhno()+" "+su.getCollege()+" "+su.getAddress()+" "+su.getMark()+" "+su.getYear());
		}
		
	}

}
