package com.oracle;

public class PracArr2 {

	public static void main(String[] args) {
		int cntOdd = 0;
		int cntEven = 0;
		int arrEx[] = {11,26,53,94,52,16,87,68,29,13};
		for (int cnt = 0; cnt < arrEx.length; cnt++) {
			System.out.println(arrEx[cnt]);
		}
		for (int cnt = 0; cnt < arrEx.length; cnt++) {
			if (arrEx[cnt]%2 == 0) {
				cntEven++;
			} else {
				cntOdd++;

			}
		}
		
		
		
		System.out.println("Count for Even numbers is "+cntEven);
		System.out.println("Count for Odd numbers is "+cntOdd);

	}

}
