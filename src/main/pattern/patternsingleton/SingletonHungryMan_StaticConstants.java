/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonHungryMan_StaticConstants {
    private final static SingletonHungryMan_StaticConstants instance = new SingletonHungryMan_StaticConstants();

    private SingletonHungryMan_StaticConstants(){}
    public static SingletonHungryMan_StaticConstants getInstance(){
        return instance;
    }
}
