/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class HasStatic {
    private static int x = 100;

    public static void main1(String[] args) {
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1 = new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println("x=" + x);
    }

    public static class Main {
            static int cnt = 6;
            static {
                cnt += 9;
            }

            public static void main(String[] args) {
                System.out.println("cnt =" + cnt);
            }
                 static {
                    cnt /= 3;
                }
            }
        }
