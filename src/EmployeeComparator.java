import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
		public int compare(Employee e1, Employee e2) {
		
		
		return Integer.valueOf(e1.getAge()).compareTo(Integer.valueOf(e2.getAge()));
		
	}
}
