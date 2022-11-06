package Java11;

interface Data1 {
	public void best(); // �P�_���@�즨�Z����

	public void failed(); // �P�_���@�즨�Z�C�� 60 ��
}

interface Test1 extends Data1 {
	public void showData(); // ��ܾǥͪ���ƤΥ������Z

	public double average(); // �p��ƾǩM�^�媺�������Z
}

class CStu1 implements Test1 {
	protected String name; // �m�W
	protected int math; // �ƾǦ��Z

	protected int english; // �^�妨�Z

	public CStu1(String s, int m, int eng) {
		name = s;
		math = m;
		english = eng;
	}

	public void show() {
		showData();
		best();
		failed();
	}

	public void showData() {
		System.out.println("�m�W:" + name);
		System.out.println("�ƾǦ��Z:" + math);
		System.out.println("�^�妨�Z:" + english);
		System.out.println("�������Z:" + average());
	}

	public void best() {
		if (math > english)
			System.out.println(name + "���ƾǤ�^��n");
		else if (math < english)
			System.out.println(name + "���^���ƾǦn");
		else
			System.out.println(name + "���ƾǩM�^��@�˦n");
	}

	public void failed() {
		if (math < 60)
			System.out.println(name + "���ƾǷ��F");
		if (english < 60)
			System.out.println(name + "���^����F");
		if (math >= 60 && english >= 60)
			System.out.println(name + "���ƾǩM�^�峣�ή�");
	}

	public double average() {
		return (math + english) / 2.0;

	}
}

public class Class12 {
	public static void main(String args[]) {
		CStu1 stu = new CStu1("Judy", 58, 91);
		stu.show();
	}
}