package String;

public class reverseStr {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		reverseStr s= new reverseStr(); 
	    s.stringReverse(); 
	}

	public void stringReverse()  {
		// TODO Auto-generated method stub
	    String str = "geeksforgeeks"; 
	    int length = str.length(); 
	    StringBuffer revString = new StringBuffer(); 
	    for (int i = length - 1;  i >= 0; i--)  
	    { 
	        revString.append(str.charAt(i)); 
	    } 
	    System.out.println(revString);  
	}

}
