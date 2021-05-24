package study07.interfaces;

public class SeperateVolume implements Lendable {

	String requestNo;// 청구 번호
	String bookTitle;// 책제목
	String writer;// 저자
	String borrower;// 대여자
	String checkOutDate;// 대출일
	byte state;// 0: 대출하지않은 상태,1: 대출상태

	public SeperateVolume(String requestNo, String bookTitle, String writer) {

		this.requestNo = requestNo;// "86738개", "개미", "베르베르"
		this.bookTitle = bookTitle;// "개미"
		this.writer = writer;// "베르베르"
	}

	// 인터페이스의 메소드를 구현시 반드시 public
	// 대출
	@Override
	public void checkOut(String borrower, String date) {// "홍길동","20180611"
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;

		System.out.println("* " + bookTitle + "이(가) 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + date);
	}

	// 인터페이스의 메소드를 구현시 반드시 public
	// 반납
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* " + bookTitle + "이(가) 반납되었습니다.");
	}
}
