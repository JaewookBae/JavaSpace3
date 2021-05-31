package study12;

import java.util.List;

public class MemberPrint {

	public void printData(MemberBean bean) {
		System.out.println("ID: " + bean.getId());
		System.out.println("PW: " + bean.getPw());
		System.out.println("NAME: " + bean.getName());
	}

	// List<MemberBean> list = new ArrayList<MemberBean>();
	// List<MemberBean> list = new ArrayList<MemberBean>();
	public void printDatas(List<MemberBean> list) {// for
		System.out.println(" * printDatas * ");
		for (int i = 0; i < list.size(); i++)
			printData(list.get(i));
	}

	public void printDataGeneric(List<MemberBean> list) {// Advanced for
		System.out.println(" * printDataGeneric * ");
		for (MemberBean b : list)
			printData(b);
	}
}
