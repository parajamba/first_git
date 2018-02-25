package first_git;

class Person 

{
	int Age;
	String Fullname;
	Adress Adress;
}

class Student extends Person

{
	int Grade;
	String SchoolName;
}

class Adress

{
	int HouseNum;
	String City;
	String Country;
}




public class main 

{
	
	
public static void main(String[] args) 

{
	Student Boyeeeeeeeeeeee = new Student();
	Boyeeeeeeeeeeee.Fullname = "Jimmy Neutron";
	Boyeeeeeeeeeeee.Age = 10;
	Boyeeeeeeeeeeee.Grade = 10000;
	Boyeeeeeeeeeeee.SchoolName = "Oxford";
	Boyeeeeeeeeeeee.Adress.HouseNum = 420 ;
	Boyeeeeeeeeeeee.Adress.City = "California" ;
	Boyeeeeeeeeeeee.Adress.Country = "United States of Democracy" ; 
}
}
