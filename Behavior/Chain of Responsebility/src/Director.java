public class Director implements Approver{
    private Approver nextApprover;
    private int threshold;

    public Director(int threshold){
        this.threshold = threshold;
    }

    @Override
    public void setNextApprover(Approver approver) {
        nextApprover = approver;
    }

    @Override
    public void processRequest(Request request) {
        if(request.getAmount() <= threshold){
            System.out.println("Director: Approving request "+request.getDescription());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }else {
            System.out.println("Request is not approved yet");
        }
    }
}
