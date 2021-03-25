package test;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "Madam";
		StringBuilder two = new StringBuilder();
		
		for(int i = one.length()-1;i >=0 ;i--)
		{
			two.append(one.charAt(i));
		}
		
		if(one.equalsIgnoreCase(two.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
