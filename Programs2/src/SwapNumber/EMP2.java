package SwapNumber;
import java.util.*;
public class EMP2 {

	    public static void main(String[] args) {
	    
	    	//creating Emp_List and Dept
	    	List<List<Object>> emplList= Arrays.asList(
	    			Arrays.asList(100,"Chad",50000,"act"),
	    			Arrays.asList(190, "Bill", 10000, "mkt"),
		            Arrays.asList(170, "sam", 30000, "act"),
		            Arrays.asList(180, "Alex", 15000, "mkt"),
		            Arrays.asList(110, "Ruth", 90000, "eng"), 
		            Arrays.asList(150, "euth", 80000, "eng"),
		            Arrays.asList(120, "Buth", 9000, "mkt"),
		            Arrays.asList(130, "Raj", 20000, "act") 
	    			);
	    	//System.out.println(emplList);
	    	List<List<String>> departList= Arrays.asList(
	    			Arrays.asList("act","accounting"),
	    			Arrays.asList("mkt", "marketing"),
	    			Arrays.asList("eng","engineer")
	    			);
	    	//System.out.println(departList);
	    	
	    	//Adding dept Salaries
	    	Map<String,Integer> deptSalaries=new HashMap<>();
	    	for(List<Object> emp: emplList) {
	    		int salary =(int) emp.get(2);
	    		String deptcode=(String) emp.get(3);
	    		deptSalaries.put(deptcode, deptSalaries.getOrDefault(deptcode, 0)+salary);
	    	}
	    	//System.out.println(deptSalaries);
	    	
	    	//Adding Deptartments
	    	Map<String,String> deptNames= new HashMap<>();
	    	for(List<String> dList:departList) {
	    		deptNames.put(dList.get(0), dList.get(1));
	    	}
	    	//System.out.println(deptNames);
	    	
	    	
	    	//Adding Department Along With There Salaries
	    	List<List<Object>> dSalaries= new ArrayList<>();
	    	
	    	for(Map.Entry<String, Integer> entry:deptSalaries.entrySet()){
	    		
	    		String dept = entry.getKey();
	    		String deptName = deptNames.get(dept);
	    		int sal = entry.getValue();
	    		dSalaries.add(Arrays.asList(deptName,sal));	    		
	    	}
	    	System.out.println(dSalaries);  	
	    
	    }	
}
