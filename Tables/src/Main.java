import java.util.*;
public class Main {
	
	
//	public static <S, T> boolean isPresent(Map<String, EmpDetails> table1, String empIdTable2) {
//
//	    for (T b: table1)
//	    {
//	        if (empIdTable2.equals(b)) {
//	        	//System.out.println(s+"=============="+b);
//	            return true;
//	        } 
//	    }
//		return false;
//	}
	public static void main(String[] args) {
	    Map<String,EmpDetails> table1=new HashMap<String,EmpDetails>();
	    Map<String,EmpDetails> table2=new HashMap<String,EmpDetails>();

	    EmpDetails emp1=new EmpDetails("John", "30", "Ops");
	    table1.put("123",emp1);

	    EmpDetails emp2=new EmpDetails("John", "30", "Ops");
	    table2.put("123",emp2);

	    EmpDetails emp3=new EmpDetails("Amy", "30", "Ops");
	    table1.put("127",emp3);

	    EmpDetails emp4=new EmpDetails("Rachel", "30", "Ops");
	    table2.put("127",emp4);
	    
	    EmpDetails emp5=new EmpDetails("Amy", "30", "Ops");
	    table1.put("789",emp5);

	    EmpDetails emp6=new EmpDetails("Rachel", "30", "Ops");
	    table2.put("879",emp6);
	    
	    EmpDetails emp7=new EmpDetails("Amy", "30", "Ops");
	    table1.put("769",emp7);

	    EmpDetails emp8=new EmpDetails("Rachel", "30", "Ops");
	    table2.put("679",emp8);

	    List<String> match = new ArrayList<String>();
	    List< String> mismatch = new ArrayList<String>();
	    List< String> extratable1 = new ArrayList<String>();
	    List< String> extratable2 = new ArrayList<String>();
	    List<String> table1keys = new ArrayList<String>(table1.keySet());
	    List<String> table2keys = new ArrayList<String>(table2.keySet());
	    for(int l=0; l < table1keys.size(); l++) 
		{
	    	if(!table1keys.contains(table2keys.get(l))) {
	    		extratable2.add(table2keys.get(l));
	    	}
		}
	    
	    for(int l=0; l < table2keys.size(); l++) 
		{
	    	if(!table2keys.contains(table1keys.get(l))) {
	    		extratable1.add(table1keys.get(l));
	    	}
		}
	    
	    for(String empIdTable1:table1.keySet())
	    {
	        EmpDetails tempemp1;
	        EmpDetails tempemp2;
	        for(String empIdTable2:table2.keySet())
	        {
	            if(empIdTable1.equalsIgnoreCase(empIdTable2))
	            {
	                tempemp1=table1.get(empIdTable1);
	                tempemp2=table2.get(empIdTable2);
	                
	                //System.out.println("*********"+tempemp2);
	                if(tempemp1.equals(tempemp2))
	                {
	                    match.add(empIdTable1);
	                    break;
	                }
	                else{
	                	mismatch.add(empIdTable1);
	                }
	            }
	        }

	    }
	    System.out.println(" Match :"+match);
	    System.out.println(" Mismatch :"+mismatch);
	    System.out.println(" Table1 Extra :"+extratable1+" "+" Table2 Extra:"+extratable2);

	}
	
	
	
}


