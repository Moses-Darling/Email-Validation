import java.util.*;
public class Validation {
	boolean validateEmail(String em) {
		
		String[] sp=em.split("@");
		if(sp.length!=2)
			return false;
		char firstCh=em.charAt(0);
		char[] ch=sp[0].toCharArray();
		if(Character.isLetter(firstCh)||!Character.isUpperCase(firstCh)){
			for(char c:ch) {
				if(Character.isUpperCase(c)||(!Character.isLetter(c)&&!Character.isDigit(c)&&(c!='.'&&c!='_')))
					return false;
			}
			String[] sp1=sp[1].split("\\.");
			if(sp1.length!=0)
			{
				return false;
			}
			if(sp1[0].length()<2 ||sp1[0].length()>6)
				return false;
			else {
				char[] ch1=sp1[0].toCharArray(); 
				for(char c1:ch1) {
					if(!Character.isLetter(c1)|| Character.isUpperCase(c1))
						return false;
				}
				
				if(sp1[1].length()<3 || sp1[1].length()>3)
					return false;
				else {
					char[] ch2=sp1[1].toCharArray(); 
					
					for(char c2:ch2) {
						if(!Character.isLetter(c2)|| Character.isUpperCase(c2))
							return false;
					}
				}
			}
		}
		else 
			return false;
		return true;
	}	
	public static void main(String[] args) {
		Validation v=new Validation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email ID");
		String em=sc.next();
		if(v.validateEmail(em))
		{
			System.out.println("Email is Valid");
			
		}
		else
			System.out.println("Email is Invalid");
	}


}
