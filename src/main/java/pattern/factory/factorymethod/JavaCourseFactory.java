package pattern.factory.factorymethod;

import pattern.factory.ICourse;
import pattern.factory.JavaCourse;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
