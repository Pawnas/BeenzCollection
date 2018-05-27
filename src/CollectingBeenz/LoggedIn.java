package CollectingBeenz;

import xml.XMLOutput;

public class LoggedIn extends Employee {

	public LoggedIn(String name, String password, int beenz) {
		super(name, password, beenz);

	}

	public void xml(XMLOutput out) {
		out.openElement("Employee");
		out.addAttribute("id", Unique2.getId2());
		out.addAttribute("Name", getName());
		out.addAttribute("Password", getPassword());
		// out.addAttribute("Beenz", getBeenz());
		out.closeElement();
	}

}
