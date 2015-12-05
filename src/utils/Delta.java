package utils;
interface Foo {
}

class Alpha implements Foo {
}

class Beta extends Alpha {
}

class Delta extends Beta {
	public static void main(String[] args) {
		Beta x = new Beta();
		Alpha a = x;
		Foo f = (Delta) x;
		Foo d = (Alpha) x;
		Beta b = (Beta)(Alpha)x;
	}
}