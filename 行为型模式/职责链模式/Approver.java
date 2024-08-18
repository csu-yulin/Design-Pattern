package 行为型模式.职责链模式;

public abstract class Approver {
    protected Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
