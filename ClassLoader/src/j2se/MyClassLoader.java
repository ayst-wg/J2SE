package j2se;

/**
 * @ClassName : MyClassLoader
 * @Description : MyClassLoader
 * @Author : wanggang
 * @Date: 2020-10-30 18:59
 * @Version 1.0
 **/
public class MyClassLoader {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.print("object.getClass().getClassLoader() = ");
        System.out.println(object.getClass().getClassLoader());
        MyClassLoader myClassLoader = new MyClassLoader();
        System.out.print("myClassLoader.getClass().getClassLoader() = ");
        System.out.println(myClassLoader.getClass().getClassLoader());
        System.out.print("myClassLoader.getClass().getClassLoader().getParent() = ");
        System.out.println(myClassLoader.getClass().getClassLoader().getParent());
        System.out.print("myClassLoader.getClass().getClassLoader().getParent().getParent() = ");
        System.out.println(myClassLoader.getClass().getClassLoader().getParent().getParent());
    }
}
