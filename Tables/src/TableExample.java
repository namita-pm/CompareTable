import java.text.*;
import java.util.*;

public class TableExample {

	public static void main(String[] args) {
		
		ArrayList Table1 = new ArrayList();
		Table1.add("Name");
		Table1.add("Ages");
		Table1.add("DOB");
		Table1.add("SalAmt");
		Table1.add("JoiningDate");
		Table1.add("Status");
		Table1.add("Sam");
		Table1.add(30);
		Table1.add("2010-04-15");
		Table1.add(false);
		Table1.add(170.03);
		Table1.add("Ramu");
		Table1.add(40);
		Table1.add("2015-04-15");
		Table1.add(171.03);
		Table1.add("Roy");
		Table1.add(77);
		Table1.add("2017-04-15");
		Table1.add(172.03);
		Table1.add("2012.10.24 20:20:45");
        
		ArrayList Table2 = new ArrayList();
		Table2.add("Name");
		Table2.add("Age");
		Table2.add("DOB");
		Table2.add("SalAmt");
		Table2.add("JoiningDate");
		Table2.add("Status");
		Table2.add("Sam ");
		Table2.add(30);
		Table2.add("2010-04-15");
		Table2.add(true);
		Table2.add(170.03);
		Table2.add("Ramu");
		Table2.add(40);
		Table2.add("2015-04-12");
		Table2.add(175.03);
		Table2.add("Royi");
		Table2.add(71);
		Table2.add("2017/04/17");
		Table2.add(172.03);
		Table2.add("2012.10.23 20:20:45");
		
		Integer[] inner = { 1, 2, 3 };
		Integer[] outer = { 1, 2, 5 };
		
//		if (compare(Table1, Table2, "yyyy-mm-dd", "yyyy/mm/dd")) {
//            System.out.printf("Both tables are equal");
//        }
//        else {
//            System.out.printf("Both tables are not equal");
//        }
//		
		//System.out.println("^^^^^^^^^^^^^"+checkDate("20-01-2014", "dd-mm-yyyy"));
		//System.out.println("^^^^^^^^^^^^^"+checkDate("a-b", "dd-mm-yyyy"));
		//System.out.println("^^^^^^^^^^^^^"+linearIn(outer, inner));
		//String string = "FullName";
		//String substring = "name";
		//System.out.println(string.contains(substring));
		
		String[][] names1 = { {"Name", "Age","Address"}, 
				{"Robert", "35","Dum"}, 
				{"James", "40", "kol"}, };
		String[][] names2 = { {"Name", "Age"}, 
				{"Rob", "30"}, 
				{"James", "40"}, };
		
		//compare(names1,names2);
		compareCol(names1,names2,3,3,2,3);
		
//		Collection<String> listOne = new ArrayList(Arrays.asList("Name", "Age","Address","Robert", "35","Dum","James", "40", "kol"));
//	    Collection<String> listTwo = new ArrayList(Arrays.asList("Name", "Age","Rob", "30","James", "40"));
//
//
//	    List<String> sourceList = new ArrayList<String>(listOne);
//	    List<String> destinationList = new ArrayList<String>(listTwo);
//
//
//	    sourceList.removeAll( listTwo );
//	    destinationList.removeAll( listOne );
//
//
//
//	    System.out.println( sourceList );
//	    System.out.println( destinationList );
		
		
		
		
	}	
	
//	public String trimElement(String inputData) throws ParseException {
//
//		if(inputData!=null) {
//			String newString = inputData.trim();
//			return newString;
//		}
//
//		else {
//
//			return "null";
//		}
//
//	}
	
	 private static void check(int[] arr, int toCheckValue)
	    {
	        // check if the specified element
	        // is present in the array or not
	        // using Linear Search method
	        boolean test = false;
	        for (int element : arr) {
	            if (element == toCheckValue) {
	                test = true;
	                break;
	            }
	        }
	 
	        // Print the result
	        System.out.println("Is " + toCheckValue
	                           + " present in the array: " + test);
	    }
	
	public static boolean linearIn(Integer[] outer, Integer[] inner) {

		   return Arrays.asList(outer).containsAll(Arrays.asList(inner));
		}
	
	public static boolean stringTest(Object any)
	{  
	   return any instanceof String;

	}
	
	
	public static boolean checkDate(String inDate,String inputDateFormat) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(inputDateFormat);
        dateFormat.setLenient(false);
        //System.out.println("^^^^^^^^^^"+inDate);
        try {
            dateFormat.parse(inDate);
            //System.out.println("-----------------"+inDate);
        } catch (ParseException pe) {
            return false;
            
        }
        
        return true;
	}
	
	public static boolean compare(ArrayList Table1, ArrayList Table2, String Table1DateFormat,String Table2DateFormat)
    {	
		int mismatchCount = 0;
		int Table1size = Table1.size();	
        for (int i = 0; i < Table1size; i++)
        {
        	if(stringTest(Table1.get(i)) == true && stringTest(Table2.get(i)) == true)
			{
	        		String str1 = ((String) Table1.get(i)).trim();
	        		String str2 = ((String) Table2.get(i)).trim();
	        		
	        		
	        		if(!str1.equals(str2)) {
	        			
	        		 if (checkDate(str1, Table1DateFormat) == true && checkDate(str2, Table2DateFormat) == true)
		        		{
		        			System.out.println("Mismatched DATE Set "+str1+"============"+str2);
		        		}
	        		 else {
	        			System.out.println("Mismatched String Set "+str1+"============"+str2);
	        		 	}
	        		}	
			} 
        	
        	else if (!(Table1.get(i)).equals(Table2.get(i))) {
            	System.out.println("Mismatched Integer Data Set "+Table2.get(i)+"============"+Table1.get(i));
            	mismatchCount++;
                //return false;
            }
        	
        }
        
        if(mismatchCount>0) {
        	return false;
        } else {;
        	return true;
        }
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
		
	public static void compare2(String[][] names1,String[][] names2)
    {
		ArrayList <String>arr1 = new ArrayList();
		ArrayList <String>arr2 = new ArrayList();
		ArrayList <String>arr3 = new ArrayList();
		ArrayList <String>arr4 = new ArrayList();
		ArrayList <String>arr5 = new ArrayList();
		ArrayList <String>arr6 = new ArrayList();
		ArrayList <String>arr7 = new ArrayList();
		ArrayList <String>arr8 = new ArrayList();
		int MatchedCount = 0;
		int MismatchedCount = 0;
		for (int i = 0; i < names1[0].length; i++)
        {
			//arr5.add(names1[i][2]);
			arr7.add(names1[0][i]);
			
        }
		
		for (int j = 0; j < names2[0].length; j++)
        {
			//arr6.add(names2[j][2]);
			arr8.add(names1[0][j]);
        }
		
		
		for (int k = 0; k < names1[0].length; k++)
        {
			arr1.add(names1[k][0]);
			arr3.add(names1[k][1]);
			arr2.add(names2[k][0]);
			arr4.add(names2[k][1]);
			//arr7.filter("name"=>!arr8.includes("name"));
			if (isPresent(arr8, arr7.get(k)) == true) {
				
				String flag = "matched";
				System.out.println(flag);
			} else {
				String flag = "extra";
				System.out.println(flag);
			}
			
			String str1 = ((String) arr1.get(k)).trim();
    		String str2 = ((String) arr2.get(k)).trim();
    		String str3 = ((String) arr3.get(k)).trim();
    		String str4 = ((String) arr4.get(k)).trim();
    		
			if((str1.equals(str2)) && (str3.equals(str4))) {
				MatchedCount++;
				System.out.println("Matched String Set "+str1+"============"+str2+"==========="+str3+"======"+str4+"======"+k);
    		} else {
    			System.out.println("Mismatched String Set "+str1+"============"+str2+"==========="+str3+"======"+str4+"======"+k);
    			MismatchedCount++;
    		}
			
        }
		System.out.println("============="+MatchedCount);
		System.out.println("============="+MismatchedCount);
		System.out.println(arr1);
		System.out.println(arr2);	
		System.out.println(arr3);
		System.out.println(arr4);
		//System.out.println(arr5);
		//System.out.println(arr6);
		System.out.println(arr7);
		System.out.println(arr8);
		
    }
	
	
	public static void compareCol(String[][] names1,String[][] names2,int rowNum1,int colNum1,int rowNum2,int colNum2)
    {
		ArrayList <String>arr7 = new ArrayList();
		ArrayList <String>arr8 = new ArrayList();
		int colMatchedCount = 0;
		
		for (int i = 0; i < names1[0].length; i++)
        {
			arr7.add(names1[0][i]);
        }
		
		for (int j = 0; j < names2[0].length; j++)
        {
			arr8.add(names1[0][j]);
        }
		for (int k = 0; k < names1[0].length; k++)
        {
			if (isPresent(arr8, arr7.get(k)) == true) {
				colMatchedCount++;
				String flag = "matched";
				System.out.println(arr7.get(k)+"=========="+flag+"=========="+k);
				HashMap<String,String> tab1key1=new HashMap<String,String>();
				HashMap<String,String> tab1key2=new HashMap<String,String>();
				HashMap<String,String> tab2key1=new HashMap<String,String>();
				HashMap<String,String> tab2key2=new HashMap<String,String>();
				for(int l=0; l < names1.length; l++) 
				{
					for(int u=1; u < colMatchedCount; u++) 
					{
						if(arr7.get(k).toString().equals("Name")) {
							   //Creating HashMap    
							   tab1key1.put(arr7.get(k),names1[l][0]); 
							   for(Map.Entry m : tab1key1.entrySet()){    
								    System.out.println(m.getKey()+" "+m.getValue());    
								   }
						   }
						   if(arr7.get(k) == arr8.get(k)) {
							   //Creating HashMap    
							   tab1key2.put(arr7.get(k),names1[l][1]);
							   for(Map.Entry m : tab1key2.entrySet()){    
								    System.out.println(m.getKey()+" "+m.getValue());    
								   }
						   }
				   
		     
				  if(arr8.get(k).toString().equals("Name")) {
					   //Creating HashMap    
					   tab2key1.put(arr7.get(k),names2[l][0]); 
					   for(Map.Entry m : tab2key1.entrySet()){    
						    System.out.println(m.getKey()+" "+m.getValue());    
						   }
				   }
				   if(arr8.get(k).toString().equals("Age")) {
					   //Creating HashMap    
					   tab2key2.put(arr7.get(k),names2[l][1]);
					   for(Map.Entry m : tab2key2.entrySet()){    
						    System.out.println(m.getKey()+" "+m.getValue());    
						   }
				   }
		        }
					}
						 
			 
        
//				if (!tab1key1.containsValue(tab2key2))
//				{
//					System.out.println("Mismatched String Set ============");
//					
//				}
//				
				
				
//				if((!str1.equalsIgnoreCase(str2)) && (!str1.contains(str2)) ) {
//        			System.out.println("Mismatched String Set "+str1+"============"+str2);
//        		}
//				
//				System.out.println( new HashSet<>( tab1key1.values() ).equals(new HashSet<>( tab2key1.values() )) );       //true
//				System.out.println( new HashSet<>( tab1key2.values() ).equals(new HashSet<>( tab2key2.values() )) );  
//				
			} else {
				String flag = "extra";
				System.out.println(arr7.get(k)+"=========="+flag);
			}
        
		
		System.out.println(arr7);
		System.out.println(arr8);
        }
		
		
    }	
		
		
    

	


}
