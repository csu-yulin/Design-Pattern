package 创建型模式.工厂模式.抽象工厂模式;

public class AppleElectronicFactory implements ElectronicFactory {
    @Override
    public Computer makeComputer() {
        return new AppleComputer();
    }

    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }
}
