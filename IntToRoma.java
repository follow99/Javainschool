package ie.dit.www.dt265;

import java.io.InputStream;
import java.util.Scanner;

public class IntToRoma {
	String[][] Romachar={
						{"","I","II","III","IV","V","VI","VII","VIII","IX"},
						{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
						{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
						{"","M","MM","MMM","Mv","v","vM","vMM","vMM","vMMM","Mx"}
						};
	
	public String intToRoma(int num){

		return 	Romachar[3][num/1000]
						+
				Romachar[2][num%1000/100]
						+
				Romachar[1][num%100/10]
						+
				Romachar[0][num%10];
		
	}
	
	

	public static void main(String[] args) {
		IntToRoma roma=new IntToRoma();
		Scanner myScanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int input=myScanner.nextInt();
		String result=roma.intToRoma(input);
		System.out.println(result);
		myScanner.close();


	}

}
