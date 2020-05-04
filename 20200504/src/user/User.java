package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public abstract class User {
    protected String name;

    protected IOperation[]  operations;

    public User(String name) {
        this.name = name;
    }

    public abstract  int meue();

    public void doOperation(BookList bookList, int choice) {
        this.operations[choice].work(bookList);
    }
}
