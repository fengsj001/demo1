/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonLazybones_ThreadSafe {
    private static  SingletonLazybones_ThreadSafe instance;

    private SingletonLazybones_ThreadSafe(){}

    public static synchronized SingletonLazybones_ThreadSafe getInstance(){
        if (instance == null){
            instance = new SingletonLazybones_ThreadSafe();
        }
        return instance;
    }
}
