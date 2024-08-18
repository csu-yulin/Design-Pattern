package 行为型模式.访问者模式;

public class FulltimeEmployee implements Employee {
    private String name;
    private double weekWage;
    private int workTime;

    public FulltimeEmployee(String name, double weekWage, int workTime) {
        this.name = name;
        this.weekWage = weekWage;
        this.workTime = workTime;
    }

    public double getWeekWage() {
        return weekWage;
    }

    public void setWeekWage(double weekWage) {
        this.weekWage = weekWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }

    //定义自己的业务方法
    public void operation() {

    }
}
