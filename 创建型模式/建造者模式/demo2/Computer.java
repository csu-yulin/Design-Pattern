package 创建型模式.建造者模式.demo2;

public class Computer {
    private final String CPU;
    private final String memory;
    private final String hardDisk;
    private final String keyboard;
    private final String mouse;

    private Computer(ComputerBuilder builder) {
        CPU = builder.CPU;
        memory = builder.memory;
        hardDisk = builder.hardDisk;
        keyboard = builder.keyboard;
        mouse = builder.mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }

    public static final class ComputerBuilder {
        private String CPU;
        private String memory;
        private String hardDisk;
        private String keyboard;
        private String mouse;

        public ComputerBuilder CPU(String value) {
            CPU = value;
            return this;
        }

        public ComputerBuilder memory(String value) {
            memory = value;
            return this;
        }

        public ComputerBuilder hardDisk(String value) {
            hardDisk = value;
            return this;
        }

        public ComputerBuilder keyboard(String value) {
            keyboard = value;
            return this;
        }

        public ComputerBuilder mouse(String value) {
            mouse = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
