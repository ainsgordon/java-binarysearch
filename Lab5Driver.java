import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Driver {
	
	public static void main (String[] args){
		ArrayList<Students> students = new ArrayList<Students>();

		students.add(new Students("Sky Silver", "Ed", 45));
		students.add(new Students("Billy Bob", "EE", 50));
		students.add(new Students("Jenny Jobs", "EE", 69));
		students.add(new Students("Stan Smiley", "CS", 72));
		students.add(new Students("Seth Smith", "CS", 74));
		students.add(new Students("Amber Anniston", "CS", 77));
		students.add(new Students("Debra Denton", "ME", 78));
		students.add(new Students("John Jenson", "CS", 81));
		students.add(new Students("Mike Moore", "CS", 83));
		students.add(new Students("Ian Imlay", "CS", 86));
		students.add(new Students("Stan Lee", "CS", 89));
		students.add(new Students("Neil Nelson", "CS", 90));
		students.add(new Students("Pual Pounds", "CS", 93));
		students.add(new Students("Dan Brown", "CS", 95));
		students.add(new Students("Bob Jones", "EE", 99));
		students.add(new Students("Susan Smith", "CS", 100));
		

		// TODO create a Scanner object
		Scanner keyboard = new Scanner(System.in);



		System.out.println("Welcome to the grade finder!");
		System.out.println();
		System.out.println("Enter a grade to search for or -1 to exit");

		// TODO create the variable and get the users input
		System.out.println("Search for a grade: ");
		int searchInput = keyboard.nextInt();



		// TODO add the while loop and required code
		while(searchInput != -1) {
			if(binarySearch(students, searchInput) == -1) {
				System.out.println("Grade not found");
			} else {
				System.out.println("Grade found");
				System.out.println(students.get(binarySearch(students, searchInput)).toString());
			}
			System.out.println("Enter another grade to search for or enter -1 to quit: ");
			searchInput = keyboard.nextInt();
		}
		

		System.out.println("Thank you for using the grade finder");
	}

	//add a binary search method
	public static int binarySearch(ArrayList<Students> students, int x) {
		int left = 0, right = students.size() - 1;

		while (left <= right)
		{
			int mid = left + (right - left) / 2;

			// Check if x is present at mid
			if (students.get(mid).getGrade() == x)
				return mid;

			// If x greater, ignore left half
			if (students.get(mid).getGrade() < x)
				left = mid + 1;

				// If x is smaller, ignore right half
			else
				right = mid - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}
}