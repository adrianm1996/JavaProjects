import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;


public class test {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(10000, true);

        JOptionPane.showMessageDialog(null, "Zamknac program?");
        System.exit(0);
    }
}

class TalkingClock{
    public void start(int interval, boolean beep){
//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Kiedy usłyszysz dzwiek bedzie godzina " + new Date());
//                if (beep) Toolkit.getDefaultToolkit().beep();
//            }
//        };
        Timer t = new Timer(interval, e ->
        {
            System.out.println("Kiedy usłyszysz dzwiek bedzie godzina " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        });
        t.start();
    }
}
