package study07.interfaces;

public class AppCDInfo extends CDInfo implements Lendable {

	String borrower;
	String checkOutDate;
	byte state;

	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
//		this.registerNo = registerNo;
//		this.title = title;

	}

	// 대출
	@Override
	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;// 대출일
		this.checkOutDate = date;// 대출상태
		this.state = 1;

		System.out.println("* " + title + "CD가 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + date);
	}

	// 반납
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* " + title + "CD가 반납되었습니다.");
	}
}
