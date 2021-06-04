import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCases {

	public static void main(String[] args) {
		
		
		String[][] table1 = { {"a", "b","c"}, 
				{"1", "2","3"}, 
				{"2", "4", "6"}, {"3", "1", "2"} };
		String[][] table2 = { {"a", "b"}, 
				{"1", "1"}, 
				{"1", "2"}, {"1", "1"}};

		compareCol(table1,table2,3,3,3,2);

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
	
	public static void compareCol(String[][] table1,String[][] table2,int rowNum1,int colNum1,int rowNum2,int colNum2)
    {
		ArrayList <String>colarr1 = new ArrayList();
		ArrayList <String>colarr2 = new ArrayList();
		List<String> list = new ArrayList<String>();
		//String[][] data = new String[][];
		int colMatchedCount = 0;
		int MismatchedCount = 0;
		for (int i = 0; i < table1[0].length; i++)
        {
			colarr1.add(table1[0][i]);
        }
		
		for (int j = 0; j < table2[0].length; j++)
        {
			colarr2.add(table2[0][j]);
        }
		
		for (int u = 0; u < table1[0].length; u++)
        {
		if (isPresent(colarr2, colarr1.get(u)) == true) {
			colMatchedCount++;
			for(int l=0; l < table1.length; l++) 
			{
				for(int k=1; k < colMatchedCount; k++) 
				{
					//System.out.println("========="+table1[l][0]+"========="+table1[l][k]+"******"+colMatchedCount);
					//Collection<String> listOne = new ArrayList(Arrays.asList(table1[l][0],table1[l][k]));
					//sourceList = new ArrayList<String>(listOne);
					//List<String> sourceList = new ArrayList<String>(listOne);
					//Collections.addAll(list, table1[l][0],table1[l][k]);
					list = Arrays.asList(table1[l][0],table1[l][k]);
					//List<String> anotherList = Arrays.asList(table1[l][0],table1[l][k]);
					//System.out.println( anotherList );
				
				}
			}
			System.out.println( list );
			String flag = "matched";
			System.out.println(flag);
		} else {
			String flag = "extra";
			System.out.println(flag);
		}
    }
		
    }

}
