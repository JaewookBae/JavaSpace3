package study12;

import java.util.ArrayList;
import java.util.List;

public class MemberSetData {

	public MemberBean setData() {
		
		MemberBean b = new MemberBean();
		b.setId("hong");
		b.setPw("1234");
		b.setName("홍길동");
		
		return b;
	}

	// List<MemberBean> list = new ArrayList<MemberBean>();
	public List<MemberBean> setDatas() {
		
		List<MemberBean> list = new ArrayList<MemberBean>();
		
		MemberBean b1 = new MemberBean();
		b1.setId("abcd");
		b1.setPw("2345");
		b1.setName("알파고");
		list.add(b1);
		
		MemberBean b2 = new MemberBean();
		b2.setId("admin");
		b2.setPw("3456");
		b2.setName("베타고");
		list.add(b2);
		
		return list;
	}
}
