package demos2;

public class Doctor {
static int docnum;
public Doctor()
{
	docnum=++docnum;
}
public void print()
{
	System.out.println(docnum);
}
public static void main(String[] args) {
	
	Doctor d1= new Doctor(); 
	Doctor d2= new Doctor(); 
	Doctor d3= new Doctor(); 
	Doctor d4= new Doctor(); 
	Doctor d5= new Doctor();
	d1.print();
}
}
