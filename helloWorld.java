package hello;

import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		System.out.println("请输入年份:"+year);
		if(year%4==0 && year%100!=0)
		{
			System.out.println(year+"是闰年");
		}else {
		    System.out.println(year+"不是闰年");
		}
	}

}
