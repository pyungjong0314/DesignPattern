package Decorate.Synchronize;

interface IData{
    void setData(int data);
    int getData();
}

class MyData implements IData{
    private int data;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

abstract class MyDataDecorator implements IData {
    // 장식할 원본 객체
    private IData mydataObj;

    MyDataDecorator(IData mydataObj) {
        this.mydataObj = mydataObj;
    }

    public void setData(int data) {
        this.mydataObj.setData(data);
    }

    public int getData() {
        return mydataObj.getData();
    }
}