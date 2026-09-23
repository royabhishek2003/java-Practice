import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonMatrix {

    JButton[][] buttons = new JButton[3][3];
    int count = 0;

    // Constructor
    public ButtonMatrix() {

        // Frame
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // 3x3 grid
        JPanel gridPanel = new JPanel(new GridLayout(3, 3, 5, 5));

        // Padding around grid
        gridPanel.setBorder(
            BorderFactory.createEmptyBorder(100, 100, 100, 100)
        );

        // Create buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                buttons[i][j] = new JButton();

                buttons[i][j].setFont(
                    new Font("Arial", Font.BOLD, 40)
                );

                // Button click
                buttons[i][j].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton clickedButton = (JButton) e.getSource();

                        // Don't allow clicking an already filled button
                        if (!clickedButton.getText().equals("")) {
                            return;
                        }

                        // Even count -> X
                        // Odd count -> O
                        if (count % 2 == 0) {
                            clickedButton.setText("X");
                        } else {
                            clickedButton.setText("O");
                        }

                        count++;

                        // Check winner
                        String winner = checkWinner();

                        if (!winner.equals("")) {

                            JOptionPane.showMessageDialog(
                                frame,
                                winner + " wins!"
                            );

                            disableButtons();
                        }
                        // Check draw
                        else if (count == 9) {

                            JOptionPane.showMessageDialog(
                                frame,
                                "Draw!"
                            );

                            disableButtons();
                        }
                    }
                });

                gridPanel.add(buttons[i][j]);
            }
        }

        mainPanel.add(gridPanel, BorderLayout.CENTER);

        frame.add(mainPanel);

        frame.setVisible(true);
    }

    // Check winner
    public String checkWinner() {

        // Check rows
        for (int i = 0; i < 3; i++) {

            if (!buttons[i][0].getText().equals("") &&
                buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText())) {

                return buttons[i][0].getText();
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {

            if (!buttons[0][j].getText().equals("") &&
                buttons[0][j].getText().equals(buttons[1][j].getText()) &&
                buttons[1][j].getText().equals(buttons[2][j].getText())) {

                return buttons[0][j].getText();
            }
        }

        // Check first diagonal
        if (!buttons[0][0].getText().equals("") &&
            buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText())) {

            return buttons[0][0].getText();
        }

        // Check second diagonal
        if (!buttons[0][2].getText().equals("") &&
            buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText())) {

            return buttons[0][2].getText();
        }

        // No winner
        return "";
    }

    // Disable all buttons
    public void disableButtons() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        new ButtonMatrix();
    }
}