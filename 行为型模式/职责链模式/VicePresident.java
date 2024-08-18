package 行为型模式.职责链模式;

public class VicePresident extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getTotalAmount() < 10000) {
            System.out.println("VicePresident处理了采购请求" + request.getId());
        } else {
            successor.processRequest(request);
        }
    }
}
