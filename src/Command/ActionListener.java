package Command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Command 구현
class PrintCommand implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked! Command executed.");
    }
}

class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Command Pattern Example");
        JButton button = new JButton("Click Me");

        // Command를 버튼에 설정
        button.addActionListener(new PrintCommand());

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}