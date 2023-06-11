package SwapNumber;
import java.util.*;
public class EMP1 {

	    public static void main(String[] args) {
	        List<Integer> salaries = new ArrayList<>();
	        Map<String, Integer> deptSalaries = new HashMap<>();
	        List<List<Object>> empList = Arrays.asList(
	            Arrays.asList(100, "chad", 50000, "acct"),
	            Arrays.asList(190, "Bill", 10000, "mkt"),
	            Arrays.asList(170, "sam", 30000, "acct"),
	            Arrays.asList(180, "Alex", 15000, "mkt"),
	            Arrays.asList(110, "Ruth", 90000, "eng")
	        );
	        List<List<String>> deptList = Arrays.asList(
	            Arrays.asList("acct", "accounting"),
	            Arrays.asList("mkt", "marketing"),
	            Arrays.asList("eng", "engineering")
	        );

	        // Compute salaries for each department
	        for (List<Object> emp : empList) {
	            int salary = (int) emp.get(2);
	            String deptCode = (String) emp.get(3);
	            salaries.add(salary);
	            deptSalaries.put(deptCode, deptSalaries.getOrDefault(deptCode, 0) + salary);
	        }

	        // Map department codes to department names
	        Map<String, String> deptNames = new HashMap<>();
	        for (List<String> dept : deptList) {
	            deptNames.put(dept.get(0), dept.get(1));
	        }

	        // Compute total salaries for each department
	        List<List<Object>> result = new ArrayList<>();
	        for (Map.Entry<String, Integer> entry : deptSalaries.entrySet()) {
	            String deptCode = entry.getKey();
	            int totalSalary = entry.getValue();
	            String deptName = deptNames.get(deptCode);
	            result.add(Arrays.asList(deptName, totalSalary));
	        }

	        System.out.println(result);
	    }
	
	
}
