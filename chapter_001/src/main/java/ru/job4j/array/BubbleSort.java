package ru.job4j.array;

public class BubbleSort {
	public static void sort(int[] mass) {
		
		int temp;
		
		for(int i = 0; i < mass.length; i++) {
			
			for(int j = 0; j < mass.length - 1; j++) {
				
				if(mass[j] > mass[j + 1]) {
					
					temp = mass[j];
					mass[j] = mass[j + 1];
					mass[j + 1] = temp;
				}
			}
		}
	}
}

