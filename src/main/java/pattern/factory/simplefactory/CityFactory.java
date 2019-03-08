package pattern.factory.simplefactory;

import pattern.factory.City;

public class CityFactory {
    public City create(Class<? extends City> clazz){
        try {
            if (null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
