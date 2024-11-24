package Decorate.Synchronize;

// 장식자 클래스(동기화 기능)
class SynchronizedDecorator extends MyDataDecorator {

    SynchronizedDecorator(IData mydataObj) {
        super(mydataObj);
    }

    public void setData(int data) {
        synchronized (this) {
            System.out.println("동기화된 data 처리 시작");
            super.setData(data);
            System.out.println("동기화된 data를 처리 완료");
        }
    }

    public int getData() {
        synchronized (this) {
            System.out.println("동기화된 data 처리 시작");
            int result = super.getData();
            System.out.println("동기화된 data를 처리 완료");
            return result;
        }
    }
}