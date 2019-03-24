/**
 * 2019/3/23
 * 创建人￥Jack
 * 懒汉式（线程不安全）【不可用】
 */
public class SingletonLazybones_ThreadUnsafe {
    private static SingletonLazybones_ThreadUnsafe instance;

    private SingletonLazybones_ThreadUnsafe(){}

    public static SingletonLazybones_ThreadUnsafe getInstance(){
        if(instance == null){
            instance = new SingletonLazybones_ThreadUnsafe();
        }
        return instance;
    }
}
