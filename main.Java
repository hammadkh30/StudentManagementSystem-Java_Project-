package FirstProgram;

import java.util.Scanner;
import java.util.Random;
class Student
{
	double total;
	double percentage;
	void display_info(String name)
	{
		System.out.println("Student Name: "+name);
		
	}
	Void calculate_marks(double eng,double math,double comp,double phy,double che)
	{
		total=eng+math+comp+phy+che;
		System.out.println("Total Marks "+total);
		percentage=(total/500)*100;
		System.out.println("Percentage: "+percentage);
		return null;
	}
}

public class Main 
{

    public static void main(String[] args)
    {
    	System.out.println("================================");
    	System.out.println("Welcome to Student Management System");
    	System.out.println("================================");
    	Scanner sc=new Scanner(System.in);
      	Student obj1=new Student();
    	int choice=0;
    	
    	while(choice!=2)
    	{
        	System.out.println("Press 1 to Check Student Details");
        	System.out.println("Press 2 Exit");
    		choice=sc.nextInt();
    		sc.nextLine();
    		
    	if(choice==1)
    	{
    		System.out.println("Please Enters Your Name");
    		String name=sc.nextLine();
    		
    		System.out.println("Enter English Marks");
    		double eng = sc.nextDouble();

    		while (eng < 0 || eng > 100)
    		{
    		    System.out.println("Invalid Marks! Enter 0 to 100:");
    		    eng = sc.nextDouble();
    		}

    		System.out.println("Enter Math Marks");
    		double math = sc.nextDouble();

    		while (math < 0 || math > 100)
    		{
    		    System.out.println("Invalid Marks! Enter 0 to 100:");
    		    math = sc.nextDouble();
    		}

    		System.out.println("Enter Computer Marks");
    		double comp = sc.nextDouble();

    		while (comp < 0 || comp > 100)
    		{
    		    System.out.println("Invalid Marks! Enter 0 to 100:");
    		    comp = sc.nextDouble();
    		}

    		System.out.println("Enter Physics Marks");
    		double phy = sc.nextDouble();

    		while (phy < 0 || phy > 100)
    		{
    		    System.out.println("Invalid Marks! Enter 0 to 100:");
    		    phy = sc.nextDouble();
    		}

    		System.out.println("Enter Chemistry Marks");
    		double che = sc.nextDouble();

    		while (che < 0 || che > 100)
    		{
    		    System.out.println("Invalid Marks! Enter 0 to 100:");
    		    che = sc.nextDouble();
    		}
    		
    		obj1.display_info(name);
    		obj1.calculate_marks(eng, math, comp, phy, che);
    	}
    	else if(choice==2)
    	{
    		System.out.println("Thank You for using Student Management System");
    		break;
    	}
    	else
    	{
    		System.out.println("Invalid Choice");
    	}
   
    }
    }
    	
}
