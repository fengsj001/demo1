/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonLazybones_DoubleCheck {
    private static SingletonLazybones_DoubleCheck instance;

    private SingletonLazybones_DoubleCheck(){}

    public static SingletonLazybones_DoubleCheck getInstance(){
        if (instance == null){
            synchronized (SingletonLazybones_DoubleCheck.class){
                if (instance == null){
                    instance = new SingletonLazybones_DoubleCheck();
                }
            }
        }
        return instance;
    }
}
