package p03_for_while_dowhile;

public class Loop_ContinueEx {

	public static void main(String[] args) {
		
		aaa: for(char c = 'A'; c <= 'C'; c++) {
			for(int x = 1; x <=3; x++) {
				if(x == 2) continue;
				if(c == 'B') continue aaa;
			System.out.println("c= " +c+", x= "+x);
			}
		}

	}

}
