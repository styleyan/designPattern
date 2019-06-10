package adapter;

/**
 * (适配器/包装器(wrapper)) 模式
 *
 * 在程序世界中，经常会存在现有的程序无法直接使用，需要做适当的变换之后才能使用的情况，
 * 这种用于填补 "现有的程序" 和 "所需的程序" 之间差异的设计模式就是 Adapter 模式。
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("适配器模式");

        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
