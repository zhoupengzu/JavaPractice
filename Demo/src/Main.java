import inherit.Student;

public class Main {

    public static void main(String[] args) {
//        Array2D_01.countHourglass();  //时间漏斗统计
        Student stu = new Student();   //如果子类实现了某个构造器，那么，必须实现默认构造器
//        stu.name  //因为该属性是protected类型的
//        Student stu1 = new Student("");  //有参数的构造器不能被子类自动继承，子类也不能直接使用
        Student stu2 = new Student("haha",20);
    }
}
