/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonLazybones_ThreadSafeBlock {
    private static SingletonLazybones_ThreadSafeBlock instance;

    private SingletonLazybones_ThreadSafeBlock(){}

    public static  SingletonLazybones_ThreadSafeBlock getInstance(){
        if (instance == null){
            synchronized (SingletonLazybones_ThreadSafeBlock.class){
                instance = new SingletonLazybones_ThreadSafeBlock();
            }
        }
        return instance;
    }
}
