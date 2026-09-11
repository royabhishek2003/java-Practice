import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficSignal extends JFrame implements ActionListener {

    JLabel signalLabel;
    JRadioButton redButton, yellowButton, greenButton;
    JButton resetButton;
    ButtonGroup buttonGroup;

    public TrafficSignal() {

        // Frame
        setTitle("Traffic Signal");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label
        signalLabel = new JLabel("Select a Signal");
        signalLabel.setFont(new Font("Arial", Font.BOLD, 24));
        signalLabel.setForeground(Color.BLACK);

        // Radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // ButtonGroup - only one signal can be selected
        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        // Reset button
        resetButton = new JButton("Reset");

        // Add listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Add components
        add(signalLabel);
        add(redButton);
        add(yellowButton);
        add(greenButton);
        add(resetButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Red selected
        if (e.getSource() == redButton) {
            signalLabel.setText("STOP");
            signalLabel.setForeground(Color.RED);
        }

        // Yellow selected
        else if (e.getSource() == yellowButton) {
            signalLabel.setText("READY");
            signalLabel.setForeground(Color.YELLOW);
        }

        // Green selected
        else if (e.getSource() == greenButton) {
            signalLabel.setText("GO");
            signalLabel.setForeground(Color.GREEN);
        }

        // Reset selected
        else if (e.getSource() == resetButton) {
            buttonGroup.clearSelection();
            signalLabel.setText("Select a Signal");
            signalLabel.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new TrafficSignal();
    }
}