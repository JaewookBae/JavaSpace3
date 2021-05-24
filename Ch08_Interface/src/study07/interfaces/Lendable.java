package study07.interfaces;

public interface Lendable {

		//대출
		public void checkOut(String borrower, String date);

		// 반납
		public void checkIn();
}
