import book.BookList;
import user.User;

import java.util.Scanner;
import user.Admin;
import user.NormalUser;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestMain {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1--》管理员，2-》普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        //登录
        User user = login();
        while (true) {
            int choice = user.meue();
            //选择是几 就对应那种方法
            user.doOperation(bookList, choice);
        }
    }
}