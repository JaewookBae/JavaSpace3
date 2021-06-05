package p07.synchronizeds;
// p.771
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//List 계열
		//Vector: 동기화 메소드 사용, 속도가 느림
		//ArrayList: 비동기화 메소드 사용, 속도 빠름 => Collections.synchronizedList()를 사용한 동기화 구현
public class SynchronizeEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		List<String> syn = Collections.synchronizedList(list2);
		syn.add("hong");
		syn.add("Alphago");
		syn.add("Bae");
		
		synchronized (syn) {
			//iterator() 출력하기
			Iterator<String> it = syn.iterator();
			while(it.hasNext())
			System.out.println(it.next());
		}
	}
}
