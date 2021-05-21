package post;

import javax.swing.*;

public class DisplayFrame extends JFrame {

    private JTextArea textArea;

    public DisplayFrame() {
        this.textArea = new JTextArea(280, 180);
        this.setSize(300,200);
        this.add(textArea);
        this.setVisible(true);
    }

    public void display(String data) {
        textArea.append(data + "\n");
    }
}
