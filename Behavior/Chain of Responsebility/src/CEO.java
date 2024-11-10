public class CEO implements Approver{
    //最终决策权
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(Request request) {
        if (request.getAmount() <= 50000) {
            System.out.println("CEO approved request: " + request.getDescription());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        } else {
            System.out.println("Request was not approved by anyone.");
        }
    }
}
