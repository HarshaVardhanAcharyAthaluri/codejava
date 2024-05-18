package codejava;

public class SubStringOccurrence {
	
	public static int subStringCount(String item,String subString) {
		int count=0;
		int endIndex = subString.length();
		for(int i=0;i<item.length();i++) {
			if(endIndex<=item.length()) {
				String itemSubString= item.substring(i, endIndex);
				if(itemSubString.equalsIgnoreCase(subString)) {
				count++;
				}
			}
			endIndex++;
		}
		
		return count;
	}

}
