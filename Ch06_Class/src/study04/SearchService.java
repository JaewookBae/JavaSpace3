package study04;

public class SearchService {

//	int[] arr = new int[5];
//	arr[0] = new Integer("90");
//	arr[0] = 90;

	Member[] m = new Member[5];

	public SearchService() {
		m[0] = new Member("홍길동", 167, 77, "대한민국");
		m[1] = new Member("James", 187, 67, "미국");
		m[2] = new Member("다나까", 166, 57, "일본");
		m[3] = new Member("마윈", 177, 80, "중국");
		m[4] = new Member("인도인", 199, 77, "인도");
	}

	boolean searchMember(String name) {// name: scanner 입력
		boolean searchResult = false;//true
		for (int i = 0; i < m.length; i++)//5
			if (m[i].getName().equals(name)) {//배열(홍길동) ==스캐너(홍길동)
				printInfo(m[i]);//m[0]: 주소값
				searchResult = true;
			}
		return searchResult;//true
	}

	// 찾은배열 내용 출력
	private void printInfo(Member m) {//m: 주소값
		System.out.println(m.getName() + "으로 찾은 결과");
		System.out.println("이름: " + m.getName());
		System.out.println("신장: " + m.getHeight());
		System.out.println("몸무게: " + m.getWeight());
		System.out.println("국가: " + m.getNation());

	}
}
