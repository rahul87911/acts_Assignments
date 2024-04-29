package pen_project;

import java.util.Map;

public class FindMyAccount {
 public static PenAccount findPen(int id, Map<Integer, PenAccount> stockList)throws ErrorMain{
	 PenAccount a=stockList.get(id);
	 if(a==null) {
		 throw new ErrorMain("Invalid Name");
	 }
	 else
		 return a;
 }
}
