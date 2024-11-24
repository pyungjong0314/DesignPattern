package Factory.AbstractFactoryMethod;

import java.util.*;

interface ComponentAbstractFactoryMethod {
    // 서브 클래스에서 구현할 팩토리 메서드들
    Button createButton();
    CheckBox createCheckBox();
    TextEdit createTextEdit();

    // 팩토리 템플릿
    default List<Component> createOperation() {
        Button btn = createButton();
        CheckBox chkbox = createCheckBox();
        TextEdit txtEdt = createTextEdit();

        return new ArrayList<Component>(Arrays.asList(btn, chkbox, txtEdt));
    }
}

// 추상 팩토리
class WindowFactoryMethod implements ComponentAbstractFactoryMethod {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }

    @Override
    public TextEdit createTextEdit() {
        return new WindowTextEdit();
    }
}
