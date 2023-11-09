package list_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class IncreaseSalaey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Emplyoee #"+i+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
		}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		for(Employee imp : list) {
			System.out.println(imp);
		}
		
		
		
		sc.close();
	}

		private static boolean hasId(List<Employee> list, int id) {
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
			}
}
