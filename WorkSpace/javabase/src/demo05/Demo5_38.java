package demo05;

public class Demo5_38 {
    public static void main(String[] args) {
        String str1="hello";
        System.out.println("fun()方法调用之前："+str1);
        fun(str1);
        System.out.println("fun()方法调用之前："+str1);

    }
    public static void fun(String str2){
        str2="world";
    }
}
