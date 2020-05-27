import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class st1 {
    Stack<Integer> prices;
    Stack<Integer> weights;

    public st1() {
        prices = new Stack<>();
        weights = new Stack();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            w += weights.pop();
        }
        prices.push(price);
        weights.push(w);
        return w;
    }

    public static void main(String[] args) {

    }

    public class TestObj {
        public  int evalRPN(String[] tokens) {
            Stack<Integer> numStack = new Stack<>();
            Integer op1, op2;
            for (String s : tokens) {
                switch (s) {
                    case "+":
                        op2 = numStack.pop();
                        op1 = numStack.pop();
                        numStack.push(op1 + op2);
                        break;
                    case "-":
                        op2 = numStack.pop();
                        op1 = numStack.pop();
                        numStack.push(op1 - op2);
                        break;
                    case "*":
                        op2 = numStack.pop();
                        op1 = numStack.pop();
                        numStack.push(op1 * op2);
                        break;
                    case "/":
                        op2 = numStack.pop();
                        op1 = numStack.pop();
                        numStack.push(op1 / op2);
                        break;
                    default:
                        numStack.push(Integer.valueOf(s));
                        break;
                }
            }
            return numStack.pop();
        }

        public void main1(String[] args) {
            Object o = new Object() {
                public boolean equals(Object obj) {
                    return true;
                }
            };
            System.out.println(o.equals("Fred"));
        }
    }
}
