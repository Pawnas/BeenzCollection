package UnitTests;

import java.util.Vector;


import CollectingBeenz.Employee;

public interface ExtranetSystemImp {

	int RegisterEmployee(String name, String pass, int beenz);
	void PostArticle(String eName, String text);
	public void Employee();
	public Vector<Employee> getEmployees();
	public void setEmployees(Vector<Employee> employees);
}
