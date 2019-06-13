package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;

/**
 * 工厂模式
 * 在 Factory Method模式中，父类决定实例的生成方式，但并不决定所要生成的具体的类，具体的处理全部
 * 交给子类负责。
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小鸣");
        Product card2 = factory.create("小黄");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
