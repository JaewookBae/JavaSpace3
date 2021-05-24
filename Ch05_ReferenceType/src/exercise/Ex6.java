package exercise;

public class Ex6 {

	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
	
		};

		int[][] array2 = new int[3][];
		
		System.out.println(array.length); // 3
		System.out.println(array[0].length);// 2
		System.out.println(array[1].length);// 3
		System.out.println(array[2].length);// 5
	
		for(int i=0;i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				System.out.println("array["+i+"]["+j+"] ="+array[i][j]);	
	}

}
