import java.util.ArrayList;
import java.util.List;

/**
 * 2019/3/24
 * 创建人￥Jack
 */
public class Prototypetest {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("prototype");
        List hobbies = new ArrayList<String>();
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);
        //创建Client对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototype concretePrototypeClone = (ConcretePrototype) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值："+ concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值："+ concretePrototype.getHobbies());
        System.out.println("对象地址比较："+ (concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));
        ConcretePrototype   concretePrototypeDeepClone = (ConcretePrototype) client.startDeepClone(concretePrototype);
        System.out.println(concretePrototypeDeepClone);
        System.out.println("对象地址比较："+ (concretePrototype.getHobbies() == concretePrototypeDeepClone.getHobbies()));
    }
}
