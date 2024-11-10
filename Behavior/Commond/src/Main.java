public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        RemoteControl remote = new RemoteControl();

        // 执行一系列操作
        remote.pressButton(turnOnTVCommand); // TV is now on
        remote.pressButton(turnOffTVCommand); // TV is now off
        remote.pressButton(turnOnTVCommand); // TV is now on

        // 撤销操作
        remote.undoButton(); // TV is now off
        remote.undoButton(); // TV is now on

        // 重做操作
        remote.redoButton(); // TV is now off

        // 再次撤销
        remote.undoButton(); // TV is now on


        //command模式将请求封装成对象，使得其操作与接受者分离，这样既有利于对请求进行操作（例如撤销重做以及日志等），又符合OCP原则
        //也可以对命令进行宏操作，用List数据结构来对其进行实现
    }
}