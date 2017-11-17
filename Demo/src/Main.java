import inherit.Student;
import queue_stack.MyStack;
import queue_stack.Solution;
import sort.BubbleSort;

public class Main {

    public static void main(String[] args) {
//        Array2D_01.countHourglass();  //时间漏斗统计
//        Student stu = new Student();   //如果子类实现了某个构造器，那么，必须实现默认构造器
//        stu.name  //因为该属性是protected类型的
//        Student stu1 = new Student("");  //有参数的构造器不能被子类自动继承，子类也不能直接使用
//        Student stu2 = new Student("haha",20);
//        MyStack mySta = new MyStack();
//        mySta.operationStack();
//        String str = "HelloWorld";
//        char[] charArr = str.toCharArray();
//        Solution solution = new Solution();
//        for (int i = 0;i < charArr.length;i++){
//            solution.enqueueCharacter( charArr[i] );
//            solution.pushCharacter( charArr[i] );
//        }
//        solution.printListInfo();
//        solution.printStackInfo();
        BubbleSort sort = new BubbleSort();
        sort.sortArrayWithBubble();
    }
    int power(int n, int p) throws Exception{
        throw new Exception( "hahha" );
    }
}
