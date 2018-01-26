
public class OrderByDesc {
	
	public static void main(String[] args) {
		int[] array = generateArray(100, 500);

		array = orderByDesc(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " pos = " + i);
		}
		
	}
	
	public static int[] generateArray(int lenght, int range) {
		int[] array = new int[lenght];
		for(int i = 0; i < lenght; i++) {
			array[i] = (int) Math.floor(Math.random() * range); 
		}
		return array;
	}
	public static int[] orderByDesc(int[] array) {
		int[] result = new int[array.length];
		int[] temp = array;
		int count = 0;
		while(temp.length != 0) {
			int maxPos = getMaxPos(temp);
			result[count] = temp[maxPos];
			count++;
			temp = removeAtPos(temp, maxPos);
		}
		return result;
	}
	public static int[] removeAtPos(int[] array, int posToRemove) {
		int[] result = new int[array.length-1];
		int current = 0;
		for(int i = 0; i < array.length; i++) {
			if(i == posToRemove) continue;
			result[current] = array[i];
			current++;
		}
		return result;	
	}
	public static int getMaxPos(int[] array) {
		int result = 0;
		for(int i = 0; i < array.length; i++) {		
			if(array[i] > array[result]) result = i;
		}
		return result;
	}
}
