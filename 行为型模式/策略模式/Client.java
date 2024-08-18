package 行为型模式.策略模式;

public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(60);
        movieTicket.setDiscount(new ChildrenDiscount());
        System.out.println(movieTicket.getPrice());
    }
}
