package 行为型模式.职责链模式;

public class Client {
    public static void main(String[] args) {
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        Approver president = new President();
        Approver congress = new Congress();
        PurchaseRequest request = new PurchaseRequest(1, 100001);

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        director.processRequest(request);
    }
}
