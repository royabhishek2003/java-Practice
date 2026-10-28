// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;

// public class DigitalClock {
//     public static void main(String args[]) throws InterruptedException {
//         DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
//         while (true) {
//             LocalTime now = LocalTime.now();
//             System.out.print("\r" + now.format(f));
//             Thread.sleep(1000);
//         }
//     }
// }   



import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClockGUI extends JFrame {

    private JLabel timeLabel;

    public DigitalClockGUI() {
        setTitle("Digital Clock");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 50));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setForeground(Color.RED);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(timeLabel);
        add(panel);

        // Update every second
        Timer timer = new Timer(1000, e -> {
            LocalTime now = LocalTime.now();
            timeLabel.setText(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        });
        timer.start();
    }

    public static void main(String[] args) {
        DigitalClockGUI clock = new DigitalClockGUI();
        clock.setVisible(true);
    }
}   