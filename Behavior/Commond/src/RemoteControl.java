import java.util.Stack;

public class RemoteControl {
    private Stack<Command> commandStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        commandStack.push(command);
        redoStack.clear();
    }

    public void undoButton() {
       if (!commandStack.isEmpty()) {
           Command command = commandStack.pop();
           command.undo();
           redoStack.push(command);
       }else{
           System.out.println("无法撤销");
       }
    }

    public void redoButton() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            commandStack.push(command);
        }else {
            System.out.println("无法重做");
        }
    }

}
