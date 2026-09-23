package lab1;

public class EmployeeCalculator {

	// 1. Static Variable
	static int employeeCount = 0;

	// 2. Programmer-Defined Method
	static double calculateAverageSalary(double[] salaries) {
		double total = 0;

		for (double s : salaries) {
			total += s;
		}

		return total / salaries.length;
	}

	// 3. Static Method (10% bonus)
	static double calculateBonus(double salary) {
		return salary * 0.10;
	}

	// 4. Method Overloading (percentage bonus)
	static double calculateBonus(double salary, double percentage) {
		return salary * (percentage / 100);
	}

	public static void main(String[] args) {

		// 5. Arrays
		double[] salaries = {
				55000,
				62000,
				71000,
				48000,
				85000
		};

		// Increase employeeCount for each employee
		for (int i = 0; i < salaries.length; i++) {
			employeeCount++;
		}

		// Display salaries
		System.out.println("Employee Salaries:");
		for (double s : salaries) {
			System.out.println(s);
		}

		// Average salary
		double avg = calculateAverageSalary(salaries);
		System.out.println("\nAverage Salary: " + avg);

		// Bonus using 10% method
		double tenPercentBonus = calculateBonus(salaries[0]);
		System.out.println("\n10% Bonus: " + tenPercentBonus);

		// Bonus using overloaded method (15%)
		double fifteenPercentBonus = calculateBonus(salaries[1], 15);
		System.out.println("\n15% Bonus: " + fifteenPercentBonus);

		// Total employees
		System.out.println("\nTotal Employees: " + employeeCount);
	}
}
