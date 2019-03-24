package pattern.factory.factorymethod;

import pattern.factory.ICourse;
import pattern.factory.PythonCourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
