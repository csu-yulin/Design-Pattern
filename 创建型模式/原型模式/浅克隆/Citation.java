package 创建型模式.原型模式.浅克隆;

//具体原型类
//创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，
//仍指向原有属性所指向的对象的内存地址
public class Citation implements Cloneable {
    private String name;
    private Object object;

    public Citation() {
        System.out.println("克隆方法并不是调用了构造方法来创建新对象的");
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() {
        try {
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
