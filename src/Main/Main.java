package Main;

import CollectingBeenz.Console;
import CollectingBeenz.ExtranetSystem;
import xml.XMLOutput;

public class Main {

	public static void main(String[] args) {

		// Create a target for xml outputs
		XMLOutput xml = new XMLOutput();
		XMLOutput xml2 = new XMLOutput();
		XMLOutput xml3 = new XMLOutput();
		XMLOutput xml4 = new XMLOutput();
		XMLOutput xml5 = new XMLOutput();

		// Create new Extranet system

		ExtranetSystem extranetSystem = new ExtranetSystem();
		// Show the empty system...
		extranetSystem.xml(xml);
		System.out.println("nothing definet yet... \n" + xml);

		// create some employees for the system
		extranetSystem.RegisterEmployee("David", "123", 0);
		extranetSystem.RegisterEmployee("John", "123", 0);
		extranetSystem.RegisterEmployee("Jane", "123", 0);

		// show existing employees
		extranetSystem.xml(xml);
		System.out.println("user defined... \n" + xml);
		// calling the login function
		extranetSystem.EmployeeLogin();
		// showing logged in person
		extranetSystem.xml2(xml2);
		System.out.println("after login.... \n" + "\n \n" + xml2);

		System.out.println("Please select a category for your contribution of article: ");
		// while / switch case statement

		int SelectTopic = 0;

		while (SelectTopic != 4) {
			SelectTopic = Console.askInt(" 1: Geographics \n 2: Weather \n 3: Local News \n 4: exit");
			String nickName;
			String ExtraString;
			String Article;

			switch (SelectTopic) {

			case 1:
				ExtraString = "Geographics";
				System.out.println("you have selected Geographics page");
				// nickName = Console.askString("enter your NickName for this article\n\n");
				Article = (Console.askString("Type in your Article \n \n"));
				extranetSystem.PostArticle(extranetSystem.getCurrentUser(), Article);
				extranetSystem.GiveBeenz();

				extranetSystem.xml3(xml3);
				System.out.println("after posting an article... \n\n" + xml3);

				extranetSystem.xml(xml);
				System.out.println("after posting an article... \n" + xml);

				break;
			case 2:
				ExtraString = "Weather";
				System.out.println("you have selected Weather page");
				Article = (Console.askString("Type in your Article \n \n"));
				extranetSystem.PostArticle2(extranetSystem.getCurrentUser(), Article);
				extranetSystem.GiveBeenz();

				extranetSystem.xml4(xml4);
				System.out.println("after posting an article... \n\n" + xml4);

				extranetSystem.xml(xml);
				System.out.println("after posting an article... \n" + xml);

				break;
			case 3:
				ExtraString = "Local news";

				System.out.println("you have selected Local news page");
				Article = (Console.askString("Type in your Article \n \n"));
				extranetSystem.PostArticle3(extranetSystem.getCurrentUser(), Article);
				extranetSystem.GiveBeenz();

				extranetSystem.xml5(xml5);
				System.out.println("after posting an article... \n\n" + xml5);

				extranetSystem.xml(xml);
				System.out.println("after posting an article... \n" + xml);
				break;
			case 4:
				ExtraString = "Exit";
				System.out.println("thanks for using Extranet");
				break;
			}
		}

		extranetSystem.xml(xml);
		System.out.println("updated users.... \n" + xml);

	}

}
