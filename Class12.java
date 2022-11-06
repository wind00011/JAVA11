package Java11;

interface Data1 {
	public void best(); // 判斷那一科成績較高

	public void failed(); // 判斷那一科成績低於 60 分
}

interface Test1 extends Data1 {
	public void showData(); // 顯示學生的資料及平均成績

	public double average(); // 計算數學和英文的平均成績
}

class CStu1 implements Test1 {
	protected String name; // 姓名
	protected int math; // 數學成績

	protected int english; // 英文成績

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
		System.out.println("姓名:" + name);
		System.out.println("數學成績:" + math);
		System.out.println("英文成績:" + english);
		System.out.println("平均成績:" + average());
	}

	public void best() {
		if (math > english)
			System.out.println(name + "的數學比英文好");
		else if (math < english)
			System.out.println(name + "的英文比數學好");
		else
			System.out.println(name + "的數學和英文一樣好");
	}

	public void failed() {
		if (math < 60)
			System.out.println(name + "的數學當掉了");
		if (english < 60)
			System.out.println(name + "的英文當掉了");
		if (math >= 60 && english >= 60)
			System.out.println(name + "的數學和英文都及格");
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