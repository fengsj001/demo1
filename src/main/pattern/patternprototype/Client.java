/**
 * 2019/3/24
 * 创建人￥Jack
 */
public class Client {
    private Prototype prototype;
    Client(Prototype prototype){
        this.prototype=prototype;
    }
    public Prototype startClone(Prototype concretePrototype) {
        return (Prototype)concretePrototype.clone();
    }
    public Prototype startDeepClone(Prototype concretePrototype) {
        return (Prototype)concretePrototype.deepClone();
    }
}
