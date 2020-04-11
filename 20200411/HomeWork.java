import java.util.*;

public class HomeWork{
	public static void main(String[] args) {
		int j = 1;
		double sum = 0;
		for(double i = 1.0;i <= 100;i++){
     		sum +=(1/i) * j;
     		j = -j;
		}
		System.out.println(sum);
	}
	public static void main4(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n <= 18){
			System.out.println("这个人是少年");
		}if(19 <= n&& n <= 28){
			System.out.println("这个人是青年");
		}if(29 <= n&& n <= 55){
			System.out.println("这个人是中年");
		}if(56 <= n){
			System.out.println("这个人是老年");
		}
}
	public static void main3(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		for(; i <= n; i++){
				if(n % i == 0&&i != n){
				System.out.println(n+"不是素数");
				break;
				}else if(i == n){
					System.out.println(n+"是素数");
				}
	}
}
	public static void main2(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		for(i = 1000;i <= n;i++){
			if(i % 100 != 0 && i % 4 ==0 || i % 400 == 0){
					System.out.println(i);
		}
	}
}
	public static void main1(String[] args) {
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 10 == 9){
				count++;
			}if(i / 10 ==9){
				count++;
			}
		}
		System.out.println(count);
	}
}