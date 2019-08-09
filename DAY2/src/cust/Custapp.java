package cust;

public class Custapp extends Customer{

	public static void main(String[] args) {
		Customer c1= new Customer(100,"neha","kota",10000);
		Customer c2= new Customer(100,"neha","kota",10000);
	
		System.out.println(c1.equals(c2));
System.out.println(c1.hashCode());
System.out.println(c2.hashCode());

System.out.println(c2.custid);
System.out.println(c2.custname);
System.out.println(c2.custadd);
System.out.println(c2.custbill);
c1.setCustname("pragati");
c1.setCustadd("amritsar");
System.out.println(c1);
System.out.println(c2);

Customer c[]= new Customer[7]; 
for(int i=0; i<c.length ; i++)
{
c[i]= new Customer();
	}
c[0].setCustname("Nitin");
c[1].setCustname("pankaj");
c[2].setCustname("pinak");
c[3].setCustname("prabhav");
c[4].setCustname("joshi");
c[5].setCustname("bobo");
c[6].setCustname("gunnu");
System.out.println(c[0]);
System.out.println(c[1]);
System.out.println(c[2]);
System.out.println(c[3]);
System.out.println(c[4]);
System.out.println(c[5]);
System.out.println(c[6]);
	}

}
