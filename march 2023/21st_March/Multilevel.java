class First {
	public void m1() {
		System.out.println("I am in the First Class");
	}
}
class Second extends First {
        public void m2() {
                System.out.println("I am in the Second Class");
        }
}
class Third extends Second {
        public void m3() {
                System.out.println("I am in the Third Class");
        }

	public static void main(String args[]) {
		Third obj = new Third();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
