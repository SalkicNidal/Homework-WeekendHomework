package ba.bitcamp.homework.task3;

public class main {

	/**
	 * Get the youngest director from array of school
	 * 
	 * @param schools
	 *            - array of school
	 * @return Name of school which director is youngest
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {

		int min = schools[0].director.yearOfBIrth;
		School young = schools[0];
		for (int i = 0; i < schools.length; i++) {
			if (schools[i].director.yearOfBIrth > min) {
				min = schools[i].director.yearOfBIrth;
				young = schools[i];
			}
		}
		return young;

	}

	/**
	 * Finding the school with more student
	 * 
	 * @param s1
	 *            - school one
	 * @param s2
	 *            - school two
	 * @return - name of school with more students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < s1.classes.length; i++) {
			sum1 += s1.classes[i].numberOfStudents;
		}
		for (int i = 0; i < s2.classes.length; i++) {
			sum2 += s2.classes[i].numberOfStudents;
		}
		if (sum1 > sum2)
			return s1.name;
		else
			return s2.name;
	}

	/**
	 * Finding the class at school with the most students
	 * 
	 * @param s
	 *            - checking school
	 * @return - name of class
	 */
	public static String getNameOfClassWithTheMostStudents(School s) {
		String line = " ";
		int max = s.classes[0].numberOfStudents;
		line += s.classes[0].name;
		for (int i = 0; i < s.classes.length; i++) {
			if (s.classes[i].numberOfStudents > max) {
				max = s.classes[i].numberOfStudents;
				line = (s.classes[i].name);
			}
		}
		return line;
	}

	public static void main(String[] args) {

		// Declaration director of school
		Directors d1 = new Directors("Tom C.", 1967);
		// Declaration array of classes at school
		Classes[] c1 = new Classes[5];
		c1[0] = new Classes("A1", 32);
		c1[1] = new Classes("A2", 30);
		c1[2] = new Classes("A3", 32);
		c1[3] = new Classes("A4", 27);
		c1[4] = new Classes("A5", 32);
		// Declaration school
		School s1 = new School("IUS", d1, c1);

		// Declaration director of school
		Directors d2 = new Directors("Hennry K.", 1969);
		// Declaration array of classes at school
		Classes[] c2 = new Classes[5];
		c2[0] = new Classes("B1", 40);
		c2[1] = new Classes("B2", 32);
		c2[2] = new Classes("B3", 35);
		c2[3] = new Classes("B4", 20);
		c2[4] = new Classes("B5", 37);
		// Declaration school
		School s2 = new School("IBU", d2, c2);

		// Declaration director of school
		Directors d11 = new Directors("Kevin R.", 1960);
		// Declaration array of classes at school
		Classes[] c11 = new Classes[5];
		c11[0] = new Classes("C1", 30);
		c11[1] = new Classes("C2", 30);
		c11[2] = new Classes("C3", 30);
		c11[3] = new Classes("C4", 50);
		c11[4] = new Classes("C5", 50);
		// Declaration school
		School s11 = new School("College of Knowledge", d11, c11);

		// Declaration director of school
		Directors d22 = new Directors("David H.", 1955);
		// Declaration array of classes at school
		Classes[] c22 = new Classes[5];
		c22[0] = new Classes("D1", 32);
		c22[1] = new Classes("D2", 32);
		c22[2] = new Classes("D3", 32);
		c22[3] = new Classes("D4", 50);
		c22[4] = new Classes("D5", 50);
		// Declaration school
		School s22 = new School("Faculty of Sciences", d22, c22);

		School[] University = new School[4];
		University[0] = s1;
		University[1] = s2;
		University[2] = s11;
		University[3] = s22;

		// Finding and printing name of class with the most students with method
		System.out.print("Class with the most students at school is: ");
		System.out.println(getNameOfClassWithTheMostStudents(s2));

		// Checking which school have more students with method
		System.out.print("School with more students is: ");
		System.out.println(getNameOfSchoolWithMoreStudents(s11, s1));

		// Finding school with youngest director
		System.out.print("~School with youngest director~");
		System.out.println(getSchoolWithYoungestDirector(University));

	}

}
