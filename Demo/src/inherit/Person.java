package inherit;

public class Person {
    String name;  //默认访问权限是protected，所以在包inherit之外无法访问该属性
    public int age;
    //默认构造器
     Person(){
        System.out.println( "in person" );
        this.name = "base";
    }
    //自定义带参数构造器
     Person( String name){
        this.name = name;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println( "in person custom" );
    }
}
