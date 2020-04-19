
 import java.util.*;

public class HomeWork{
	public static void main3(String[] args) {
		for(int n = 1;n <= 9999999;n++){
			int count = 0;
			int tem = n;
			while(tem != 0){
				tem = tem/10;
				count++;
			} 
			tem = n;
			int sum = 0;
			while(tem !=0){
				sum += Math.pow(tem%10,count);
				tem = tem/10;
			}
			if(sum == n){
				System.out.println(sum);
			}
		}
	}
	public static void main2(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r= new Random();
		int randNum = r.nextInt(1000);
		while (true) {
			System.out.println("随机数字范围0到999，请输入你要猜的数字：");
			int num = s.nextInt();
			if(num < randNum) {
				System.out.println("你猜的数字小了！");
			}else if(num == randNum) {
				System.out.println("你猜的数字对了！");
				break;
			}else  {
				System.out.println("你猜的数字大了！");
			}
		}
	}
	public static void main1(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 2; i <= n; i++){
        	 int j = 2;
        	for(;j <= i;j++){
        		   if(i % j == 0&&i != j){
                System.out.println(i+"不是素数");
                break;
        	}
        	if(i == j){
                    System.out.println(i+"是素数");
                }
            }
    	}
	}
}