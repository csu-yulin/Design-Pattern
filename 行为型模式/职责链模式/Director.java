package 行为型模式.职责链模式;

public class Director extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getTotalAmount() < 5000) {
            System.out.println("Director处理了采购请求" + request.getId());
        } else {
            successor.processRequest(request);
        }
    }
}
