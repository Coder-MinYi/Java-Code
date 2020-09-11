/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//买卖股票的最佳时机
public class Main {
    public int maxProfit (int[] prices) {
        // write code here
        if (prices == null || prices.length == 0){
            return 0;
        }
        int buy = prices[0];
        int m = 0; //最大利润

        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy , prices[i]);
            m = Math.max(m , prices[i] - buy);
        }
        return m;
    }
}
