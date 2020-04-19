import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }
    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }
    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法!");
        }
    }
    //在POS位置添加元素
    public void add(int pos, int data) {
        //this.elem.length = 2 * this.elem.length;
        //while (pos >= 0 && pos <= usedSize) {
//        if (pos < 0 && pos > usedSize) {
//            return;
         //}
        checkPos(pos);
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }
    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素并返回下标
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }
    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    //获取POS位置元素
    public int getPos(int pos) {
       if(isEmpty()){
           throw new RuntimeException("顺序表为空！");//手动抛出异常
       }
        checkPos(pos);
        return this.elem[pos];
    }
    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    //删除某个元素
    public void remove(int toremove) {
        //for (int i = 0; i < this.elem.length; i++) {
            //if (toremove == this.elem[i]) {
            //  int index = i;
            int index = search(toremove);
            if (index == -1) {
                System.out.println("没有要删除的数字");
                return;
            }
            for (int j = index; j < this.usedSize - 1; j++) {
                this.elem[j] = this.elem[j + 1];
            }
            this.usedSize--;
    }
    //给POS位置元素设置为val
    public void    setPos(int pos, int val){
        this.elem[pos] = val;
     }
        //清空顺序表
     public void clear(){
        this.usedSize = 0;
     }
}