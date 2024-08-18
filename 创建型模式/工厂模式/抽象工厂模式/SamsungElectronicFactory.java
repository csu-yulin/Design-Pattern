package 创建型模式.工厂模式.抽象工厂模式;

public class SamsungElectronicFactory implements ElectronicFactory {
    @Override
    public Computer makeComputer() {
        return new SamsungComputer();
    }

    @Override
    public Phone makePhone() {
        return new SamsungPhone();
    }
}
