package 行为型模式.解释器模式;

public class Client {
    public static void main(String[] args) {
        InstructionHandler instructionHandler = new InstructionHandler();
        instructionHandler.handle("up move 5 and down run 10 and left move 5");
        System.out.println(instructionHandler.output());
    }
}
