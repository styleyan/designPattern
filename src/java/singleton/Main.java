package singleton;

/**
 * 单例模式
 * 想确保任何情况下都绝对只有一个实例的模式被称作 Singleton 模式
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1 与 obj2 是相同的实例");
        } else {
            System.out.println("obj1 与 obj2 是不同的实例");
        }

        System.out.println("End.");
    }
}
