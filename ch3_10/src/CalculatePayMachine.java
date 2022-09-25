import javax.swing.*;
import java.awt.*;

public class CalculatePayMachine extends Frame {
    // 1. GUI 변경되는 경우
    // 2. Logic 변경되는 경우
    private JLabel workingHoursLabel = new JLabel("Working Hours = ", Label.RIGHT);
    private JLabel overTimeHOursLabel = new JLabel("Overtime Hours = ", Label.LEFT);
    private JLabel payAmountLabel = new JLabel("Pay     Amount = ", Label.RIGHT);
    private JTextField tfWorkingHours = new JTextField();
    private JTextField tfOverTimeHours = new JTextField();
    private JTextField tfResult = new JTextField();
    private JButton calcButton = new JButton("Calculate");
    private JButton resetButton = new JButton("Reset");
    private JButton end = new JButton("Stop");
    public CalculatePayMachine() {
        super("Payment Calculation");
        this.init();
        this.start();
        this.setSize(500, 250);
        this.setVisible(true);
    }

    public void init() {
        this.setLayout(new GridLayout(5, 1));
        Panel p = new Panel(new BorderLayout());
        p.add("West", workingHoursLabel);
        p.add("Center", tfWorkingHours);
        this.add(p);

        Panel p1 = new Panel(new BorderLayout());
        p1.add("West", overTimeHOursLabel);
        p1.add("Center", tfOverTimeHours);
    }
}
