package ui;

import javax.swing.JOptionPane;

/**
 * @author Andrew De Abreu Ruiz
 */
public class ClientJavaFactorialWSGUI extends javax.swing.JFrame {

    public ClientJavaFactorialWSGUI() {
        initComponents();
    }

    private static boolean isNumeric(String inputText){
	try {
		Integer.parseInt(inputText);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        outputPanel = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();
        outputTextField = new javax.swing.JTextField();
        tizaPanel = new javax.swing.JPanel();
        tizaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(78, 82, 88));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 90, 37), 10));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA DE NÚMERO FACTORIALES");

        inputPanel.setBackground(new java.awt.Color(78, 82, 88));
        inputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        inputLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        inputLabel.setForeground(new java.awt.Color(255, 255, 255));
        inputLabel.setText("Introduce un número entero:");

        inputTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(inputLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputTextField))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputPanel.setBackground(new java.awt.Color(78, 82, 88));
        outputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        outputLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputLabel.setText("Resultado:");

        outputTextField.setEditable(false);
        outputTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(outputTextField))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tizaPanel.setBackground(java.awt.Color.white);

        tizaButton.setBackground(java.awt.Color.white);
        tizaButton.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        tizaButton.setText("Calcular");
        tizaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tizaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tizaPanelLayout = new javax.swing.GroupLayout(tizaPanel);
        tizaPanel.setLayout(tizaPanelLayout);
        tizaPanelLayout.setHorizontalGroup(
            tizaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tizaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tizaButton)
                .addContainerGap())
        );
        tizaPanelLayout.setVerticalGroup(
            tizaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tizaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tizaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tizaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tizaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tizaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tizaButtonActionPerformed
        // TODO add your handling code here:
        String inputText = inputTextField.getText();
        if(inputText.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "No ha introducido ningún valor.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);           
        }else{
            if(isNumeric(inputText)){
                int n = Integer.parseInt(inputText);
                // Sustituir por servicio web.
                int result = calculateFactorial(n);
                outputTextField.setText(Integer.toString(result));
            }else{
                JOptionPane.showMessageDialog(this,
                    "El valor introducido no es un número entero.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);                 
            }
        }
    }//GEN-LAST:event_tizaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JButton tizaButton;
    private javax.swing.JPanel tizaPanel;
    // End of variables declaration//GEN-END:variables

    private static int calculateFactorial(int n) {
        org.fact.Factorial_Service service = new org.fact.Factorial_Service();
        org.fact.Factorial port = service.getFactorialPort();
        return port.calculateFactorial(n);
    }
}
