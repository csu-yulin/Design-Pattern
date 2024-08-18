package 行为型模式.访问者模式;

public class HRDepartment extends Department {
    @Override
    void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "本周实际工作时间是:" + workTime);
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "本周加班了:" + (workTime - 40));
        } else {
            System.out.println("正式员工" + employee.getName() + "请假了:" + (40 - workTime));
        }

        //也可以调用具体元素的业务方法来进行处理
        employee.operation();
    }

    @Override
    void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时员工" + employee.getName() + "本周实际工作时间是:" + workTime);
    }
}
