package arraysClass;

import java.util.List;
import java.util.ArrayList;

public class ArraysClass {
	
	public int[] returnArray(int... arr) {
		List<Integer>arrayValues = new ArrayList<>();
		for (int values : arr) {
			arrayValues.add(values);
			System.out.println(values);

		}
		
		for (int i = 0; i < arr.length; i++) {
			int newValue = arr[i] * 10;
			arrayValues.add(newValue);
			System.out.println(newValue);
		}
		return arr;
		
	}

}
