package ba.bitcamp.homework.task3;

import java.util.Arrays;

public class School {

	public String name;
	public Directors director;
	public Classes[] classes;

	// Declaration of constructor
	public School(String name, Directors director, Classes[] classes) {
		super();
		this.name = name;
		this.director = director;
		this.classes = classes;
	}

	// Declaration method toString
	public String toString() {
		String line = " ";
	     line += "\n " +  name + "\n  Director of school is " + director +"\n  Classes at school are: "+ "";
			for ( int i = 0; i<classes.length; i++){
				line+=  classes[i].name + " with " + classes[i].numberOfStudents+ " students - ";
			}
			return line;
	}
	

}
