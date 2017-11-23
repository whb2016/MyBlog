# Code
a code repository
你好啊，我叫赛利亚，一定要记得我啊
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = DBOp.showAllStu();
		for (Student student : list) {
			System.out.println(student.toString());
		}
		BigDecimal a = new BigDecimal(28.0);
		BigDecimal b = new BigDecimal(3);
		BigDecimal c = a.divide(b, 10,1);
		System.out.println(c);
	}
