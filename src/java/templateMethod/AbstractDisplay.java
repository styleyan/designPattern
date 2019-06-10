package templateMethod;

/**
 * 定义抽象类 AbstractDisplay
 */
public abstract class AbstractDisplay {
    /**
     * 交给子类去实现的抽象方法 open
     */
    public abstract void open();
    /**
     * 交给子类去实现的抽象方法 print
     */
    public abstract void print();
    /**
     * 交给子类去实现的抽象方法 close
     */
    public abstract void close();

    /**
     * 本抽象类中实现的 display 方法
     */
    public final void display() {
        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
