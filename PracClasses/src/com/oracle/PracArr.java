package com.oracle;

public class PracArr {

	public static void main(String[] args) {
		int arrNum[] = new int[10] ;
		
//		System.out.println(arrNum.length);
		for (int cnt = 0; cnt < arrNum.length; cnt++) {
			arrNum[cnt] = cnt * cnt;
			
		}
		
		for (int cnt = 0; cnt < arrNum.length; cnt++) {
			System.out.println(arrNum[cnt]);
		}
			
		
		
//		arrNum[0] = 0;
//		arrNum[1] = 1;
//		
//		
//		System.out.println(arrNum[1]);

	}

}
