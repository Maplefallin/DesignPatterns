public interface Approver {
    void setNextApprover(Approver approver);
    void processRequest(Request request);
}
