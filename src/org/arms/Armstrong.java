package org.arms;

public class Armstrong {
	
	public static void main(String[]args) {
		
		int num = 152, res = 0;
		int ar = num;
		
		while(num>0) {
			int rem = num%10;
			res = (res*10)+rem;
			//res = res+(rem*rem*rem);
			num/=10;
		}
		 if(ar==res) {System.out.println("Armstrong");
		 
		 }
		 else {System.out.println("not");
	}

}
}
