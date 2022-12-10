package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public abstract class Validasi extends javax.swing.JFrame {

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    abstract public boolean validasi();
}
