/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectociber;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author salazarwalter
 */
public class IntegerFormatRenderer extends DefaultTableCellRenderer {
 private static Color color =new Color(225,150,200);
    public IntegerFormatRenderer() {
        setHorizontalAlignment(SwingConstants.RIGHT); 
        setBackground(color);
    }

    @Override
        public Component getTableCellRendererComponent(
    JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return super.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column );
    }
}
