/**
 * 2019/3/23
 * 创建人￥Jack
 */
public class SingletonLazybones_StaticInnerClass {

    private SingletonLazybones_StaticInnerClass(){}

    private static class  SingletonInstance{
        private static final SingletonLazybones_StaticInnerClass INSTANCE = new SingletonLazybones_StaticInnerClass();
    }

    public static SingletonLazybones_StaticInnerClass getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
