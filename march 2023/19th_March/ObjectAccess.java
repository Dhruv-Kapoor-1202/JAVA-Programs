class ObjectAccess {
	private static int x = 10;
	public static void main(String args[]) {
		ObjectAccess obj = new ObjectAccess();

		obj.x = 20;
		System.out.println(x); // Prints 20
	}
}

