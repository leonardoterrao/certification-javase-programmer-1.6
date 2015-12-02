package practice.exams.java.chapter5.question34;

class Holder {
	enum Gas { ARGON, HELIUM };
}

public class Exercise34 extends Holder {

	public static void main(String[] args) {
		short s = 7;
		long l = 9L;
		float f = 4.0f;
		int i = 3;
		char c = 'c';
		byte b = 5;

//		switch(s) {
//		switch(l) { LONG NAO
//		switch(f) { FLOAT NAO
//		switch(i) {
//		switch(c) {
//		switch(b) {
		switch(Gas.ARGON) {
			default: System.out.println("howdy");
		}
		
	}
	
}
