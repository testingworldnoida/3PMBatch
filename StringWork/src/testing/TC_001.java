package testing;

public class TC_001 {

	public static void main(String[] args) {
		
		String s="Malayalam";
		String s1="";
		
		System.out.println("***********************************************");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1= s1 + s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("Palendrome");
		}
		else
		{
			System.out.println("Not Palendrome");
		}
		
	}
	
	
}
