package ru.job4j.control_task;
// Массив, который должен получиться [2, 5, 23, 46, 84, 92, 128, 256, 344, 376, 567, 835]
public class Task {
	
	public int[] mass(int[] arrayOne, int[] arrayTwo) {
		
		int pos1 = 0;
		int pos2 = 0;
		
		int[] bigArray = new int[arrayOne.length + arrayTwo.length];
		
		for(int i = 0; i < bigArray.length; i++) {
			
			if(pos1 >= arrayOne.length || pos2 < arrayTwo.length && arrayOne[pos1] > arrayTwo[pos2]) {
				bigArray[i] = arrayTwo[pos2];
				pos2++;
			} else {
				bigArray[i] = arrayOne[pos1];
				pos1++;
			}
		}
		return bigArray;
	}
	
	
	/*
	public int[] mass(int[] arrayOne, int[] arrayTwo, int[] bigArray) {

		//private int[] arrayOne = {23, 46, 84, 92, 376, 835};
		//private int[] arrayTwo = {2, 5, 128, 256, 344, 567};
		//private int[] BIGarray = new int[12];
		
		
		int position = 0;
		int counter = 0;		

		for(int i = 0; i < arrayOne.length; i++) {
			
			for(int j = counter; j < arrayTwo.length; j++) {
				
				if(arrayOne[i] > arrayTwo[j]) {
					bigArray[position++] = arrayTwo[j];
					counter++;
					continue;
					
				} else {
					bigArray[position++] = arrayOne[i];
					break;
				}
			}
		}
		
		return bigArray;
	}
	*/
}
