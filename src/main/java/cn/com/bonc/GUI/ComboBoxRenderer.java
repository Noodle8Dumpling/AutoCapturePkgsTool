package cn.com.bonc.GUI;

import javax.swing.*;
import java.awt.*;

class ComboBoxRenderer extends JLabel
        implements ListCellRenderer {
    private String[] comboValue;

    public ComboBoxRenderer(String[] comboValue) {
        this.comboValue = comboValue;
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    /*
     * This method finds the image and text corresponding
     * to the selected value and returns the label, set up
     * to display the text and image.
     */
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        int selectedIndex = ((Integer) value).intValue();

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        setText(comboValue[selectedIndex]);
        setToolTipText(comboValue[selectedIndex]);

        return this;
    }

}
