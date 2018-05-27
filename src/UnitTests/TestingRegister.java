package UnitTests;

import org.junit.*;

import CollectingBeenz.Employee;
import static org.junit.Assert.*;

import CollectingBeenz.ExtranetSystem;

public class TestingRegister {

	@SuppressWarnings("static-access")
	@Test
	public void TestRegister() {
		Employee employee = new Employee("Name", "123", 0);

		assertEquals(employee.getName(), "Name");
		assertEquals(employee.getPassword(), "123");
		assertEquals(employee.getBeenz(), 0);

		ExtranetSystem extranetSystem = new ExtranetSystem();

		extranetSystem.employees.add(employee);

		assertEquals(extranetSystem.getEmployees().isEmpty(), false);

		// testing the Register employee method
		extranetSystem.RegisterEmployee("David", "123", 0);
		assertEquals(extranetSystem.getEmployees().size(), 2);

		// Testing the PostArticle method
		extranetSystem.PostArticle("David", "blablabla");
		assertEquals(extranetSystem.getGeography().isEmpty(), false);

	}

	@SuppressWarnings("static-access")
	@Test
	public void TestBeenz() {
		// new Test for adding employee to the vector
		ExtranetSystem extra = new ExtranetSystem();
		Employee emp = new Employee("Dom", "123", 0);
		ExtranetSystem.employees.add(emp);
		assertEquals(extra.employees.contains(emp), true);

		extra.setCurrentUser("Dom");

		// testing GiveBeenz method for current user "Dom" with employee id 2
		extra.GiveBeenz();
		assertEquals(extra.getEmployee(2).getBeenz(), 1);

	}

}
