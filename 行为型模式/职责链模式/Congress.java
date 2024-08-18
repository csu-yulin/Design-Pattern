package 行为型模式.职责链模式;

public class Congress extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("Congress处理了采购请求" + request.getId());
    }
}
