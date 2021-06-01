package study12;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {

		MemberSetData msd = new MemberSetData();
		MemberPrint mp = new MemberPrint();
		
		mp.printData(msd.setData());
		System.out.println();
		
		List<MemberBean> list = msd.setDatas();
		mp.printDatas(list);
		System.out.println();
		
		mp.printDataGeneric(list);

	}

}
