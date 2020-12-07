import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Test {
    public static void main(String[] args) {
        int x = 20, y = 30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.print(b);
    }
}
