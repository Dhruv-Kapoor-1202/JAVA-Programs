class Strings {
	public static void main(String args[]) {
		//String message = new String("Hello World");
		//or
		String message = "Hello World" + "!!!!";
		//message.startsWith("!!");
		//message.length();
		//message.indexOf();
		//message.replace("!", "*");  //This method doesn't change the original string
		//In JAVA, strings are immutable. Any method that modifies a string will return a new string object
		//message.toLowerCase();
		//message.toUpperCase();
		//message.trim(); //removes the unnecessary white spaces in the beginning or the ending of a string
		System.out.println(message.endsWith("!!"));

	}
}

