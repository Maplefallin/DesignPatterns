public class Main {
    public static void main(String[] args) {
        Request request1 = new Request(30000, "Conference");
        Request request2 = new Request(15000, "Team Lunch");

        Approver manager = new Manager(10000);
        Approver director = new Director(20000);
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        manager.processRequest(request1); // CEO should approve
        manager.processRequest(request2); // Director should approve
    }
}