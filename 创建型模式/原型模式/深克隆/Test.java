package 创建型模式.原型模式.深克隆;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("小明");
        citation.setStudent(student);

        Citation citation1 = citation.clone();

        System.out.println(citation == citation1);
        System.out.println(citation.getStudent() == citation1.getStudent());
        //这里两个对象的name属性在堆中是两个完全不同的字符串对象，所以不相等
        System.out.println(citation.getStudent().getName() == citation1.getStudent().getName());
        //但他们的value值其实都是指向常量池中的同一个字符串对象
        System.out.println(citation.getStudent().getName());
        System.out.println(citation1.getStudent().getName());
    }
}

