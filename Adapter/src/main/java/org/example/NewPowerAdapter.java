package org.example;

//适配器继承新电池类（装配类）
public class NewPowerAdapter implements NewPowerSocket{
    //内部成员 旧电池类（被装配类）
    private OldPowerSocket oldPowerSocket;
    //构造方法中引入外部实例
    public NewPowerAdapter(OldPowerSocket oldPowerSocket) {
        this.oldPowerSocket = oldPowerSocket;
    }

    @Override
    public void plugIn() {
        this.oldPowerSocket.connection();
    }
}
