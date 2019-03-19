public static void countS(String s) {
char ch[] = s.toCharArray(); // 将字符串逐个存到字符数组中

		int count1 = 0;
		for (char i = 'a'; i < 'z'; i++) {
			count1 = 0;// 每执行一次循环让计数器重新归零，否则会进行累加
			for (int j = 0; j < ch.length; j++) {// 遍历字符串数组并进行判断
				if (i == ch[j]) { // 如果为小写字母，计数器加1
					count1++;
				}
			}
			if (count1 != 0) {// 如果当前循环计数器不为0，打印这个字母及它的个数
				System.out.println("字符串中小写字母" + i + "有" + count1 + "个!");
			}
		}
		System.out.println("\n");

	public static void main(String[] args) {
		System.out.println("请输入一个字符串:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		countS(s);
}