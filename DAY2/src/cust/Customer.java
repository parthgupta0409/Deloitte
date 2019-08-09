package cust;

public class Customer {
	int custid;
	String custname;
	String custadd;
	int custbill;
	
	public Customer() {
		custid=0;
		custname="na";
		custadd="nad";
		custbill=0;
	}
	public Customer(int custid, String custname, String custadd, int custbill) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custadd = custadd;
		this.custbill = custbill;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custadd == null) ? 0 : custadd.hashCode());
		result = prime * result + custbill;
		result = prime * result + custid;
		result = prime * result + ((custname == null) ? 0 : custname.hashCode());
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
		Customer other = (Customer) obj;
		if (custadd == null) {
			if (other.custadd != null)
				return false;
		} else if (!custadd.equals(other.custadd))
			return false;
		if (custbill != other.custbill)
			return false;
		if (custid != other.custid)
			return false;
		if (custname == null) {
			if (other.custname != null)
				return false;
		} else if (!custname.equals(other.custname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custadd=" + custadd + ", custbill="
				+ custbill + "]";
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setCustadd(String custadd) {
		this.custadd = custadd;
	}
	public void setCustbill(int custbill) {
		this.custbill = custbill;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public String getCustadd() {
		return custadd;
	}
	public int getCustbill() {
		return custbill;
	}
}
