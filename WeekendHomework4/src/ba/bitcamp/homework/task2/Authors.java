package ba.bitcamp.homework.task2;

import java.util.Arrays;

public class Authors {

	public String name;
	public Integer year;
	public Books[] book;

	// Declaration constructor of Authors
	public Authors(String name, Integer year, Books[] book) {
		super();
		this.name = name;
		this.year = year;
		this.book = book;
	}

	// Declaration of method toString
	public String toString() {
		String s = " ";
		s += " Authors name is: " + name + ". \n  Year of birth is: " + year
				+ ",\n  Book of author is: ";
		for (int i = 0; i < book.length; i++) {
			s += book[i].name + " ,";
		}
		return s;
	}

}
