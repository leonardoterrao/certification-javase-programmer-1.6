package practice.exams.java.chapter3.question13;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Salinger extends Author{

	private void write(int x) {}
	protected void write(long x) throws FileNotFoundException {}
	protected void write(boolean x) throws Exception {}
	protected int write(short x) { return 7;}
	public void write() {};
	
}

class Author {
	protected void write() throws IOException {}
}