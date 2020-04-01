package view;

import javax.swing.*;
import java.awt.*;

public abstract class View extends JFrame {
    public View(String title) throws HeadlessException {
        super(title);
    }
}
