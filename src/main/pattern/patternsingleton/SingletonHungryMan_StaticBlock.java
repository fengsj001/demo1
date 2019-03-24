/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonHungryMan_StaticBlock {
    private final static SingletonHungryMan_StaticBlock instance ;

    static{
        instance = new SingletonHungryMan_StaticBlock();
    }

    private SingletonHungryMan_StaticBlock(){}

    public static SingletonHungryMan_StaticBlock getInstance(){
        return instance;
    }
}
