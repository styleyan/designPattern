package templateMethod;

/**
 * 模板功能模式 (将集体处理交给子类)
 * 在父类中定义处理流程的框架，在子类中实现具体处理的模式
 * 优点: 由于在父类的模板方法中编写了算法，因此无需在每个子类中在编写算法
 *
 * 父类与子类要保持一致性
 * 优点: 即使没有用 instanceof 等制定子类的种类，程序也能正常工作，这种原则称为
 * 里氏替换原则(LSP: The Liskov Substitution Principle)
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 生成一个特有 'H' 的 CharDisplay 类的实例
         */
        AbstractDisplay d1 = new CharDisplay('H');

        /**
         * 生成一个特有 "Hello, word." 的 StringDisplay 类的实例
         */
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        /**
         * 生成一个持有 "你好，世界" 的 StringDisplay 类的实例
         */
        AbstractDisplay d3 = new StringDisplay("你好，世界");

        d1.display();
        d2.display();
        d3.display();
    }
}
