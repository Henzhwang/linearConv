/*
 * @HenryHuang
 * linearConv.java
 * April 30, 2018
 * This program is uses to convert value from two conversion methods.
 */

/**
 *
 * @author shhua8751
 */

import java.text.*;

public class FormLinearConv extends javax.swing.JFrame {

    /**
     * Creates new form FormLinearConv
     */
    public FormLinearConv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        linearLabel = new javax.swing.JLabel();
        methodLabel = new javax.swing.JLabel();
        methodBox = new javax.swing.JComboBox();
        valueLabel = new javax.swing.JLabel();
        valueInput = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();
        hintLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        linearLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        linearLabel.setText("Linear Conversion");

        methodLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        methodLabel.setText("Choose a conversion method:");

        methodBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a conversion method", "1.Inches to Centimetres", "2.Centimetres to Inches", "3.Feet to Centimetres", "4.Centimetres to Feet", "5.Yards to Metres", "6.Metres to Yards", "7.Miles to Kilometres", "8.Kilometres to Miles", " " }));
        methodBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodBoxActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setText("Enter the value to be converted:  ");

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(255, 51, 0));

        hintLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valueLabel)
                                    .addComponent(methodLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(methodBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valueInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convertButton)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(linearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(linearLabel)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(methodLabel)
                    .addComponent(methodBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(valueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convertButton)
                .addGap(18, 18, 18)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        //Listing all the variable will be use in the code.
        String method;
        String one;
        String two;
        String three;
        String four;
        String five;
        String six;
        String seven;
        String eight;
        double value;
        
        //To get the method which the user selected.
        method = (String) methodBox.getSelectedItem();
        
        //To convert all the selection to numbers in order to match with the method in the later codes.
        one    =   "1.Inches to Centimetres";
        two    =   "2.Centimetres to Inches";
        three  =   "3.Feet to Centimetres";
        four   =   "4.Centimetres to Feet";
        five   =   "5.Yards to Metres";     
        six    =   "6.Metres to Yards";
        seven  =   "7.Miles to Kilometres";
        eight  =   "8.Kilometres to Miles";
        
        //To get the value from the textfield in order to calculate.
        value = Double.parseDouble(valueInput.getText());
        
        //To set a decimal format for the numbers.
        DecimalFormat x = new DecimalFormat("###.##");

        
        /*
         * This code is uses to match up the method in order to do differnt calculations
         * and get the return value and message it out.
         */
        if (method == one)
        {
            outputLabel.setText(value + " Inches = " + x.format(inchesToCentimetres(value)) + " Centimetres.");
        }
        else if(method == two)
        {
            outputLabel.setText(value + " Centimetres = " + x.format(centimetresToInches(value)) + " Inches.");
        }
        else if(method == three)
        {
            outputLabel.setText(value + " Feet = " + x.format(feetToCentimetres(value)) + " Centimetres.");
        }
        else if(method == four)
        {
            outputLabel.setText(value + " Centimetres = " + x.format(centimetresToFeet(value)) + " Feet.");
        }
        else if(method == five)
        {
            outputLabel.setText(value + " Yards = " + x.format(yardsToMetres(value)) + " Metres.");
        }
        else if(method == six)
        {
            outputLabel.setText(value + " Metres = " + x.format(metresToYards(value)) + " Yards.");
        }
        else if (method == seven)
        {
            outputLabel.setText(value + " Miles = " + x.format(milesToKilometres(value)) + " Kilometres.");
        }
        else if (method == eight)
        {
           outputLabel.setText(value + " Kilometres = " + x.format(kilometresToMiles(value)) + " Miles.");
        }
        
        
    }//GEN-LAST:event_convertButtonActionPerformed

    private void methodBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodBoxActionPerformed
        /*
         * This is uses to when the user select the method of conversion 
         * and the hint Label under the enter the vaueLabel will be setText to the 
         * method of the user selected.
         */
        String conversion;
        conversion = (String)methodBox.getSelectedItem();
        if (conversion  == "1.Inches to Centimetres")
        {
            hintLabel.setText("Inches to Centimetres");
        }
        else if (conversion == "2.Centimetres to Inches")
        {
            hintLabel.setText("Centimetres to Inches");
        }
        else if (conversion == "3.Feet to Centimetres")
        {
            hintLabel.setText("Feet to Centimetres");
        }
        else if(conversion == "4.Centimetres to Feet")
        {
            hintLabel.setText("Centimetres to Feet");
        }
        else if(conversion == "5.Yards to Centimetres")
        {
            hintLabel.setText("Yards to Centimetres");
        }
        else if (conversion == "6.Centimetres to Yards")
        {
            hintLabel.setText("Centimetres to Yards");
        }
        else if (conversion == "7.Miles to Kilometres")
        {
            hintLabel.setText("Miles to Kilometres");
        }
        else if (conversion == "8. Kilometres to Miles")
        {
            hintLabel.setText("Kilometres to Miles");
        }
    }//GEN-LAST:event_methodBoxActionPerformed

    /**
     * This method is uses to convert value of inches to value of centimeters.
     * pre: x inches
     * post: x centimeters
     * Return the value of centimeters and message it out.
     * @param value 
     * @return 
     */
    
    private double inchesToCentimetres(double value)
    {
        double centimetres;
        
        centimetres = value * 2.54;
        
        return centimetres;         
    }
    
    /**
     * This method is uses to convert of centimeters to inches
     * pre: x centimeters
     * post: x inches
     * Return the value of inches and message it out.
     * @param value
     * @return 
     */
    private double centimetresToInches(double value)
    {
        double inches;
        
        inches = value * 0.39370;
        
        return inches;
    }
    
    
    /**
     * This method is uses to convert of feet to centimeters
     * pre: x feet
     * posy: x centimeters
     * Return the value of centimeters and message it out.
     * @param value
     * @return 
     */
     private double feetToCentimetres(double value)
    {
        double centimetres;
        
        centimetres = value * 30;
        
        return centimetres;
    }
    
     
     /**
      * This method is uses to convert centimeters to feet .
      * pre: x centimeters
      * post: x feet
      * Return the value of feet and message it out.
      * @param value
      * @return 
      */
      private double centimetresToFeet(double value)
    {
        double feet;
        
        feet = value * 0.032808;
        
        return feet;
    }
      
      
      /**
       * This method is uses to convert value of yards to value of meters.
       * pre: x yards
       * post: x.meters
       * return the value of meters and message it out.
       * @param value
       * @return 
       */
       private double yardsToMetres(double value)
    {
        double metres;
        
        metres = value * 0.91;
        
        return metres;
    }
       /**
        * this method is uses to convert the value of meters to value of yards.
        * pre: x meters
        * post: x yards
        * Return the value of yards and message it out.
        * @param value
        * @return 
        */
        private double metresToYards(double value)
    {
        double yards;
        
        yards = value * 1.0936;
        
        return yards;
    }
        
        /**
         * This method is uses to convert the value of miles to value of kilometers.
         * pre: x miles
         * post: x.kilometers
         * Return the value of miles and message it out.
         * @param value
         * @return 
         */
        private double milesToKilometres(double value)
    {
        double kilometres;
       
        kilometres = value * 1.6;
        
        return kilometres;
    }
         
        /**
         * This method is uses to convert the value of kilometers to the value of miles.
         * pre: x. kilometers
         * post: x miles
         * Return the value of miles and message it out.
         * @param value
         * @return 
         */
        private double kilometresToMiles(double value)
    {
        double miles;
        
        miles = value * 0.62137;
        
        return miles;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLinearConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLinearConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLinearConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLinearConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLinearConv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linearLabel;
    private javax.swing.JComboBox methodBox;
    private javax.swing.JLabel methodLabel;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField valueInput;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
