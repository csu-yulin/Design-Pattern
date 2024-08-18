package 行为型模式.职责链模式;

public class President extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getTotalAmount() < 50000) {
            System.out.println("President处理了采购请求" + request.getId());
        } else {
            successor.processRequest(request);
        }
    }
}
