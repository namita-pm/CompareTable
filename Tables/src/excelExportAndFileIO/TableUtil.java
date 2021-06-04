package excelExportAndFileIO;

import java.util.*;

public class TableUtil {
	
	// generic method 
   public static < T1, T2> void compare1( T1[] Table1,  T2[] Table2) {
      
	   int MatchCount = 0;
	   int MissingCount = 0;
      for(T1 element1 : Table1) {
    	  if (isPresent(Table2, element1) == true)
	    	  {
	    		  MatchCount++;
	    	  } else {
	    		  MissingCount++;
	    	  }
      }
      
      System.out.println("Match Count " +MatchCount);
      System.out.println("Missing Count " +MissingCount);
      
      
   }
   
	// Generic method to check if an object array contains a particular value
	
	
	public static <R, S extends R, T extends R> void compare2(List<S> l1, List<T> l2) {
		
		//return l1.filter(function(item) { return l2.indexOf(item) >= 0; });
		//Object missing = l1.filter((i => a => a !== l2[i] || !++i)(0));
		//var absent = l1.filter(e=>!l2.includes(e));
		//var res = l1.filter( function(n) { return !this.has(n) }, new Set(l2) );
		//console.log(res);
//        
//        	myList = {l1.get(0),l1.get(1),l1.get(2)};
//        	System.out.println(myList);
//		int[] src = new int[] {1, 2, 3, 4, 5};
//        int b1[] = Arrays.copyOfRange(src, 0, 2);
//        System.out.println(b1);
        
		int mismatchCount = 0;
	    int MatchCount = 0;
	    int MissingCount = 0;
	    for (int i = 0; i < l2.size(); i++) {
	    	if (isPresent(l2, l1.get(i)) == true) {
			    	if(stringTest(l1.get(i)) == true && stringTest(l2.get(i)) == true)
					{
			        		String str1 = ((String) l1.get(i)).trim();
			        		String str2 = ((String) l2.get(i)).trim();
			        		if((!str1.equalsIgnoreCase(str2)) && (!str1.contains(str2)) ) {
			        			System.out.println("Mismatched String Set "+str1+"============"+str2);
			        		}
					}
			    	else if (!(l1.get(i)).equals(l2.get(i))) {
		            	//System.out.println("Mismatched Integer Data Set "+l2.get(i)+"============"+l1.get(i));
		            	mismatchCount++;
		                //return false;
		            }
			    	 	
			   MatchCount++;
	    	  } else {
	    		  //System.out.println("ELSE MISSING ==============");
	    		  MissingCount++;
	    	  } 	
	    }
	    
	    System.out.println("Match Count " +MatchCount);
	    System.out.println("Missing Count " +MissingCount);
	}
	
	private static <S, T> boolean isPresent(List<T> a, S s) {

	    for (T b: a)
	    {
	        if (s.equals(b)) {
	        	//System.out.println(s+"=============="+b);
	            return true;
	        } 
	    }
		return false;
	}

	public static<T> boolean isPresent(T[] a, T target)
	{
	    for (T s: a)
	    {
	        if (target.equals(s)) {
	            return true;
	        } 
	    }
	    return false;
	}
	
	public static<T> boolean stringTest(T any)
	{  
	   return any instanceof String;

	}
	
	
	
//	public static <R, S extends R, T extends R> List<R> listeMischen(List<S> l1, List<T> l2) {
//	    List<R> newList = new ArrayList<>(l1.size() + l2.size());
//	    int sizeOfLargerList = Math.max(l1.size(), l2.size());
//	    for (int i = 0; i < sizeOfLargerList; i++) {
//	        if (i < l1.size())
//	            newList.add(l1.get(i));
//	        if (i < l2.size())
//	            newList.add(l2.get(i));
//	    }
//	    return newList;
//	}

	public static void main(String[] args) {
//		Integer[] Table1 = { 1, 2, 5 };
//		Integer[] Table2 = { 1, 2, 3 };
//		
//		compare1(Table1,  Table2);
		
		ArrayList Table1 = new ArrayList();
		Table1.add("Name");
		Table1.add("Age");
		Table1.add("Address");
		Table1.add("Sam");
		Table1.add(23);
		Table1.add("DumDum");
		Table1.add("Ram");
		Table1.add(20);
		Table1.add("Kolkata");
		Table1.add("Jam");
		Table1.add(30);
		Table1.add("Nalta");
		
		ArrayList Table2 = new ArrayList();
		Table2.add("A");
		Table2.add("B");
		Table2.add(1);
		Table2.add(1);
		Table2.add(1);
		Table2.add(2);
		Table2.add(1);
		Table2.add(5);
		
		compare2(Table1, Table2);
		
		
		
	}

}
