package user;

import operation.IOperation;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public abstract class User {
    public String name;
    protected IOperation[] operations;
    public User(String name) {
        this.name = name;
    }
}
