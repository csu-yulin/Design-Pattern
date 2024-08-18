package 行为型模式.模板方法模式;

public abstract class Account {
    //基本方法-钩子方法
    public boolean validate(String account, String password) {
        return "lp".equals(account) && "123456".equals(password);
    }

    //基本方法-抽象方法:由具体子类实现
    public abstract void calculateInterest();

    //基本方法-具体方法
    public void display() {
        System.out.println("显示利息");
    }

    //模板方法:确定算法骨架,按照某种次序调用基本方法
    //可以为模板方法加上final,防止被子类恶意覆盖
    public final void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账号或者密码错误!!");
            return;
        }
        calculateInterest();
        display();
    }
}
