package main.com.zhengyu.domian;

public class Inner {
    private int age = 1;
    private String name ="张三";
    //内部接口
    public interface InnerInterface{
        void getName();
    }
    //内部类实现内部接口
    public class InnerTest1 implements InnerInterface{

        @Override
        public void getName() {
            System.out.println("名字叫：" + Inner.this.name);
        }
    }
    //内部类可以访问该类的所有属性（包扩私有属性）
    public class InnerTest {
        //内部类可以多嵌套
        public class InnerTestIn{}
        //内部类不能定义static元素
//        private static String sex;
        private int age = 2;
        private String name;
        public void print(){
            System.out.println("InnerTest的age:"+age);
            System.out.println("InnerTest的age:"+this.age);
            System.out.println("Inner的age:"+Inner.this.age);
        }
    }

    public class InnerTest3{
        public InnerCustomer getCust(){
            int age2 = 3;
            //方法体内的内部类
            class Cust extends InnerCustomer{
                @Override
                public void print(){
                    super.print();
                    System.out.println("该Cust年龄" + Inner.this.age);
                    //从内部类中访问方法内变量age2，需要将变量声明为最终类型
                    System.out.println(age2);
                }
            }
            return new Cust();
        }

    }

    class InnerCustomer{
        public void print(){
            System.out.println("该InnerCustomer年龄" + Inner.this.age);
        }

    }
    //静态内部类
    public static class InnerTest4 implements InnerInterface{
        public static void print(){
            System.out.println("静态内部类");
        }

        @Override
        public void getName() {
            System.out.println("内部接口自动具备静态属性");
        }
    }

    public static void main(String[] args){
        Inner inner = new Inner();
        Inner.InnerTest innerTest = inner.new InnerTest();
        Inner.InnerTest1 innerTest1 = inner.new InnerTest1();
        Inner.InnerTest3 innerTest3 = inner.new InnerTest3();
        innerTest3.getCust().print();
//        Inner.InnerTest4 innerTest4 = new InnerTest4();
//        innerTest1.getName();
//        innerTest.print();
    }
}
