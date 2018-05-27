package CollectingBeenz;

import xml.XMLOutput;

public class Employee extends Unique {

	private String name;

	private String password;

	private int beenz = 0;

	public Employee() {

	}

	// Employee constructor
	public Employee(String name, String password, int beenz) {
		super();
		this.name = name;
		this.password = password;
		this.beenz = beenz;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", beenz=" + beenz + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	public int getBeenz() {

		return beenz;
	}

	public void setBeenz(int beenz) {
		this.beenz = beenz;
	}

	public void increment() {
		setBeenz(getBeenz() + 1);
	}

	public void xml(XMLOutput out) {
		out.openElement("Employee");
		out.addAttribute("id", getId());
		out.addAttribute("Name", getName());
		out.addAttribute("Password", getPassword());
		out.addAttribute("Beenz", getBeenz());
		out.closeElement();
	}

}
