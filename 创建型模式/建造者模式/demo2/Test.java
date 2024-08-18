package 创建型模式.建造者模式.demo2;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .CPU("i7")
                .hardDisk("1T")
                .keyboard("cherry")
                .memory("16G")
                .mouse("logitech")
                .build();
        
        System.out.println(computer);
    }
}
