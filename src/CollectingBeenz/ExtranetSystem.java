package CollectingBeenz;

import java.util.Vector;

import xml.XMLOutput;

public class ExtranetSystem implements RunExtranet {

	private String CurrentUser;

	public static Vector<Employee> employees = new Vector<Employee>();

	private Vector<LoggedIn> empLog = new Vector<LoggedIn>();

	private Vector<Geography> geography = new Vector<Geography>();

	private Vector<Weather> weathers = new Vector<Weather>();

	private Vector<LocalNews> localNew = new Vector<LocalNews>();

	public Vector<LocalNews> getLocalNews() {
		return localNew;
	}

	public void setWorkNew(Vector<LocalNews> localNew) {
		this.localNew = localNew;
	}

	public Vector<Weather> getWeathers() {
		return weathers;
	}

	public void setWeathers(Vector<Weather> weathers) {
		this.weathers = weathers;
	}

	public Vector<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Vector<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public int RegisterEmployee(String name, String pass, int beenz) {

		Employee employee = new Employee(name, pass, beenz);
		employees.add(employee);
		return employee.getId();

	}

	@Override
	public String PostArticle(String eName, String text) {
		Geography geograph = new Geography(eName, text);
		geography.addElement(geograph);
		return geograph.getText();

	}

	public String PostArticle2(String eName, String text) {
		Weather weather = new Weather(eName, text);
		weathers.addElement(weather);
		return weather.getText();
	}

	public String PostArticle3(String eName, String text) {
		LocalNews localNewz = new LocalNews(eName, text);
		localNew.addElement(localNewz);
		return localNewz.getText();
	}

	public Employee getEmployee(int employeeId) {
		for (Employee employee : employees)
			if (employee.getId() == employeeId)
				return employee;

		throw new Error("Cannot find employee: " + employeeId);

	}

	public void GiveBeenz() {

		for (Employee employee : employees) {
			if (employee.getName().equals(getCurrentUser())) {

				employee.increment();

			}

		}

	}

	public String getCurrentUser() {
		return CurrentUser;
	}

	public void setCurrentUser(String CurrentUser) {
		this.CurrentUser = CurrentUser;
	}

	public Vector<Geography> getGeography() {
		return geography;
	}

	public void setGeography(Vector<Geography> geography) {
		this.geography = geography;
	}

	public Vector<LoggedIn> getEmpLog() {
		return empLog;
	}

	public void setEmpLog(Vector<LoggedIn> empLog) {
		this.empLog = empLog;
	}

	public void EmployeeLogin() {
		String name = Console.askString("Enter your name please: \n");
		String pass = Console.askString("Enter your password: \n");
		for (Employee employee : employees)
			if (employee.getName().equals(name) && employee.getPassword().equals(pass)) {
				int r1 = employee.getId();
				r1 = LoggedIn(name, pass, r1);
				setCurrentUser(name);

				System.out.println("Welcome to Extranet");

			}
	}

	public int LoggedIn(String namecon, String passcon, int beenz) {

		LoggedIn loggedIn = new LoggedIn(namecon, passcon, beenz);
		empLog.addElement(loggedIn);
		return loggedIn.getId();

	}

	public void xml(XMLOutput out) {
		out.openElement("Cureent users in the system");
		for (Employee employee : employees)
			employee.xml(out);
		out.closeElement();
	}

	public void xml2(XMLOutput out) {
		out.openElement("Logged In users");
		for (LoggedIn loggedIn : empLog)
			loggedIn.xml(out);
		out.closeElement();

	}

	public void xml3(XMLOutput out) {
		out.openElement("Article for geography");
		for (Geography geograph : geography)
			geograph.xml(out);
		out.closeElement();
	}

	public void xml4(XMLOutput out) {
		out.openElement("Article for Weather");
		for (Weather weather : weathers)
			weather.xml(out);
		out.closeElement();

	}

	public void xml5(XMLOutput out) {
		out.openElement("Article for Work News");
		for (LocalNews localnews : localNew)
			localnews.xml(out);
		out.closeElement();

	}

}
