import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class DarkThemeGUI extends JFrame {
    private JTextField textField;
    private JButton button1;
    private JButton button2;

    public DarkThemeGUI() {
        // Set the look and feel to the system default dark theme
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the window to full screen by default
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle bounds = env.getMaximumWindowBounds();
        setSize(bounds.width, bounds.height);

        // Set the background color of the content pane
        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        setContentPane(contentPane);

        // Create and add the text field to the content pane
        textField = new JTextField();
        textField.setBackground(UIManager.getColor("TextField.dark"));
        textField.setForeground(UIManager.getColor("TextField.light"));
        textField.setCaretColor(UIManager.getColor("TextField.light"));
        // prefered size width bounds.width 75% and height bounds.height 75%
        textField.setPreferredSize(new Dimension(bounds.width * 3 / 4, bounds.height * 3 / 4));
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        contentPane.add(textField);

        // Create and add the buttons to the content pane
        button1 = new JButton("Load");
        button1.setPreferredSize(new Dimension(200, 50));
        contentPane.add(button1);

        button2 = new JButton("Save");
        button2.setPreferredSize(new Dimension(200, 50));
        contentPane.add(button2);

        // Add a component listener to resize the text field when the window is resized
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                Dimension size = getContentPane().getSize();
                textField.setPreferredSize(new Dimension(size.width / 2, 50));
            }
        });

        // Set the default close operation for the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the components and display the window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}