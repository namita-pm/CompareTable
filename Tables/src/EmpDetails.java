import java.util.List;

public class EmpDetails {
	private String name;
	  private String age;
	   private String dept;
	   public EmpDetails(String name, String age, String dept) {
	    super();
	    this.name = name;
	    this.age = age;
	    this.dept = dept;
	   }


	@Override
	public boolean equals(Object obj) {
	    // TODO Auto-generated method stub
	    Boolean response=false;
	    if(obj!=null && obj instanceof EmpDetails)
	    {
	        EmpDetails objParam=(EmpDetails)obj;

	        if(objParam.name.equalsIgnoreCase(this.name) && objParam.age.equalsIgnoreCase(this.age) && objParam.dept.equalsIgnoreCase(this.dept))
	        {
	            response=true;
	        }
	    }
	    return response;
	  }
	
	
//	@Override
//	public boolean contains(Object[] A,Object obj) {
//		Boolean response=false;
//		if(contains(A, obj) && obj!=null && obj instanceof EmpDetails){
//			 EmpDetails objParam=(EmpDetails)obj;
//
//		        if(objParam.name.equalsIgnoreCase(this.name) && objParam.age.equalsIgnoreCase(this.age) && objParam.dept.equalsIgnoreCase(this.dept))
//		        {
//		            response=true;
//		        }
//		        else {
//		        	System.out.println("Extra values");
//		        	response=false;
//		        }
//		}
//		return response;
//	}
	
	
	
}
