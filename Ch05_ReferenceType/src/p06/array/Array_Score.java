package p06.array;

public class Array_Score {

	public static void main(String[] args) {
		//95, 71, 84, 93,,,87
		
		int sum = 0;
		int arr[] = {95,71,84,93,87};
		for(int s : arr)
			sum += s;
		System.out.println("점수 총합: " + sum);

		double avg = sum/arr.length;
		System.out.println("점수 평균: " + avg);
		
		
		
		System.out.println("----메소드 호출을 통한 평균,총점구하기------------");
		
		Array_Score as = new Array_Score();
		int[] arr2 = {95,71,84,93,87};
		int sum2 = as.add(arr2);
		System.out.println("점수 총합2: "+ sum2);
		double avg2 = as.avg(arr2);
		System.out.println("점수 평균2: " + avg2);
	}
	
	public int add(int []arr) {
		int sum = 0;
		for(int s : arr)
			sum += s; 
		
		return sum;
	}
	public double avg(int []arr) {
		double avg2 = add(arr)/arr.length;
		 
		return avg2;
 
	}
}
