package CollectingBeenz;

public abstract class Unique2 {

	// A unique element is one with a globally unique identifier. The identifier
	// is a number that is allocated when the element is created by incrementing
	// a counter. The counter is declared 'static' and is therefore shared
	// between
	// all unique elements...

	public static int counter = 0;

	public static int id = counter++;

	public static int getId2() {
		return id;
	}

}
