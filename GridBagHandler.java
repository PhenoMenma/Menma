import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JPanel;


public class GridBagHandler {

    
    public static void addComponent(JPanel theAdder, JComponent theAdded) {

        addComponent(theAdder, theAdded, GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE);

    }

    
    public static void addComponent(JPanel theAdder, JComponent theAdded, int iColumn, int iRow) {

        addComponent(theAdder, theAdded, iColumn, iRow, 1, 1);

    }

   
    public static void addComponent(JPanel theAdder, JComponent theAdded, int iColumn, int iRow, int iColumnSpan, int iRowSpan) {

        GridBagConstraints theConstraints = new GridBagConstraints();

        theConstraints.weightx = 100;
        theConstraints.weighty = 100;

        theConstraints.anchor = GridBagConstraints.NORTHWEST;
        theConstraints.fill = GridBagConstraints.BOTH;

        theConstraints.gridx = iColumn;
        theConstraints.gridy = iRow;

        theConstraints.gridwidth = iColumnSpan;
        theConstraints.gridheight = iRowSpan;

        theConstraints.insets = new Insets(0, 0, 0, 0);

        theAdder.add(theAdded, theConstraints);

    }

}