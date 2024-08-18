package 行为型模式.职责链模式;

public class PurchaseRequest {
    private int id;
    private double totalAmount;

    public PurchaseRequest(int id, double totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    //省略具体采购项

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
