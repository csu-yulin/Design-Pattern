package 行为型模式.访问者模式;

//具体访问类:财务部
public class FADepartment extends Department {
    @Override
    void visit(FulltimeEmployee employee) {
        double weekWage = employee.getWeekWage();
        int workTime = employee.getWorkTime();
        double actualWage;
        if (workTime >= 40) {
            actualWage = weekWage + (workTime - 40) * 100;
        } else {
            actualWage = weekWage - (40 - workTime) * 80;
            if (actualWage < 0) {
                actualWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "本周实际工资为:" + actualWage);
    }

    @Override
    void visit(ParttimeEmployee employee) {
        double hourWage = employee.getHourWage();
        int workTime = employee.getWorkTime();
        System.out.println("临时员工" + employee.getName() + "本周实际工资为:" + hourWage * workTime);
    }
}
