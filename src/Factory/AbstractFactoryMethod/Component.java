package Factory.AbstractFactoryMethod;

interface Component {
    void render(); // 요소 그리기
}

abstract class Button implements Component {
}

class WindowButton extends Button {
    @Override
    public void render() {
        System.out.println("윈도우 버튼 생성 완료");
    }
}

class MacButton extends Button {
    @Override
    public void render() {
        System.out.println("맥 버튼 생성 완료");
    }
}

abstract class CheckBox implements Component {
}

class WindowCheckBox extends CheckBox {
    @Override
    public void render() {
        System.out.println("윈도우 체크박스 생성 완료");
    }
}

class MacCheckBox extends CheckBox {
    @Override
    public void render() {
        System.out.println("맥 체크박스 생성 완료");
    }
}

abstract class TextEdit implements Component {
}

class WindowTextEdit extends TextEdit {
    @Override
    public void render() {
        System.out.println("윈도우 텍스트박스 생성 완료");
    }
}

class MacTextEdit extends TextEdit {
    @Override
    public void render() {
        System.out.println("맥 텍스트박스 생성 완료");
    }
}