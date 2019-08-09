package demos2;

public class Employee extends Object {
 int empid;
 String empname;
	public Employee(int Empid,String Empname)
	{	super();
		empid= Empid;
		empname=Empname;
	
	}
	

  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}


}

class Empdetails {

		public static void main(String[] args) {
		
			Employee c= new Employee(1,"g");
			Employee a= new Employee(1,"g");
			Employee b= c;
			System.out.println(c.equals(a));
			System.out.println(c.equals(b));
			System.out.println(c==a);
			System.out.println(c==b);
			
			System.out.println(c.hashCode());
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
		}

	
}
