import java.util.*;

public class TableCompare {

	public static void main(String[] args) {
		ArrayList<Temp> tabname1 = new ArrayList<Temp>();
		tabname1.add(new Temp("name"));
		tabname1.add(new Temp("roy"));
		tabname1.add(new Temp("joy"));
		tabname1.add(new Temp("noy"));
		System.out.println("============="+tabname1.get(0));
		
		ArrayList<Temp1> tabage1 = new ArrayList<Temp1>();
		tabage1.add(new Temp1("age"));
		tabage1.add(new Temp1("30"));
		tabage1.add(new Temp1("40"));
		tabage1.add(new Temp1("50"));
		
		ArrayList<Temp2> tabaddress = new ArrayList<Temp2>();
		tabaddress.add(new Temp2("address"));
		tabaddress.add(new Temp2("kolkata"));
		tabaddress.add(new Temp2("dumdum"));
		tabaddress.add(new Temp2("airport"));
		
		ArrayList<Temp> tabname2 = new ArrayList<Temp>();
		tabname2.add(new Temp("name"));
		tabname2.add(new Temp("roy"));
		tabname2.add(new Temp("joy"));
		tabname2.add(new Temp("Soy"));
		
		ArrayList<Temp1> tabage2 = new ArrayList<Temp1>();
		tabage2.add(new Temp1("age"));
		tabage2.add(new Temp1("30"));
		tabage2.add(new Temp1("45"));
		tabage2.add(new Temp1("50"));
		
		for (int i = 0; i < tabname1.size(); i++)
        {
			HashMap<String,Temp1> age1 = new HashMap<String, Temp1>();
			for(Map.Entry m : age1.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }
			//System.out.println("============="+tabname1.get(i));
        }
		  

	}

}
