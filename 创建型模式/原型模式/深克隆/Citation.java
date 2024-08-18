package 创建型模式.原型模式.深克隆;

import java.io.*;

//具体原型类
//创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，
//仍指向原有属性所指向的对象的内存地址
public class Citation implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = -110039494266659755L;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @Override
    public Citation clone() {
//        ByteArrayOutputStream bos = null;
//        try {
//            bos = new ByteArrayOutputStream();
//            new ObjectOutputStream(bos).writeObject(this);
//
//            return (Citation) new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                bos.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化对象
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化对象
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (Citation) ois.readObject();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

