package 行为型模式.模板方法模式;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/bean.properties"));
        Class<?> clazz = Class.forName(properties.getProperty("SaveAccount"));
        Account account = (Account) clazz.getDeclaredConstructor().newInstance();
        account.handle("lp", "123456");
    }

}
