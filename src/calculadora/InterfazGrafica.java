
package calculadora;

import java.awt.event.*;
import javax.swing.Timer;

/**
 *
 * @author Daniela Gil
 */
public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnCociente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();
        etiquetaError = new javax.swing.JLabel();
        inputOperaciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(243, 243, 243));

        btn7.setBackground(new java.awt.Color(4, 119, 191));
        btn7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn7.setForeground(java.awt.Color.white);
        btn7.setText("7");
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setOpaque(true);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(4, 119, 191));
        btn4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn4.setForeground(java.awt.Color.white);
        btn4.setText("4");
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setOpaque(true);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(4, 119, 191));
        btn1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn1.setForeground(java.awt.Color.white);
        btn1.setText("1");
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setOpaque(true);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(4, 119, 191));
        btn0.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn0.setForeground(java.awt.Color.white);
        btn0.setText("0");
        btn0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.setOpaque(true);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnComa.setBackground(new java.awt.Color(4, 119, 191));
        btnComa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnComa.setForeground(java.awt.Color.white);
        btnComa.setText(".");
        btnComa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComa.setOpaque(true);
        btnComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComaActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(1, 75, 125));
        btnBorrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnBorrar.setForeground(java.awt.Color.white);
        btnBorrar.setText("CE");
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.setOpaque(true);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(4, 119, 191));
        btn3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn3.setForeground(java.awt.Color.white);
        btn3.setText("3");
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setOpaque(true);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(4, 119, 191));
        btn2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn2.setForeground(java.awt.Color.white);
        btn2.setText("2");
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setOpaque(true);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(4, 119, 191));
        btn5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn5.setForeground(java.awt.Color.white);
        btn5.setText("5");
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setOpaque(true);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(4, 119, 191));
        btn8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn8.setForeground(java.awt.Color.white);
        btn8.setText("8");
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setOpaque(true);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(4, 119, 191));
        btn9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn9.setForeground(java.awt.Color.white);
        btn9.setText("9");
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setOpaque(true);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(4, 119, 191));
        btn6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn6.setForeground(java.awt.Color.white);
        btn6.setText("6");
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setOpaque(true);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnResultado.setBackground(new java.awt.Color(0, 4, 56));
        btnResultado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnResultado.setForeground(java.awt.Color.white);
        btnResultado.setText("=");
        btnResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btnCociente.setBackground(new java.awt.Color(1, 75, 125));
        btnCociente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCociente.setForeground(java.awt.Color.white);
        btnCociente.setText("/");
        btnCociente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCociente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocienteActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(1, 75, 125));
        btnProducto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnProducto.setForeground(java.awt.Color.white);
        btnProducto.setText("*");
        btnProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(1, 75, 125));
        btnResta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnResta.setForeground(java.awt.Color.white);
        btnResta.setText("-");
        btnResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(1, 75, 125));
        btnSuma.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSuma.setForeground(java.awt.Color.white);
        btnSuma.setText("+");
        btnSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnBorrarTodo.setBackground(new java.awt.Color(1, 75, 125));
        btnBorrarTodo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnBorrarTodo.setForeground(java.awt.Color.white);
        btnBorrarTodo.setText("C");
        btnBorrarTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrarTodo.setOpaque(true);
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnNegativo.setBackground(new java.awt.Color(4, 119, 191));
        btnNegativo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNegativo.setForeground(java.awt.Color.white);
        btnNegativo.setText("+/-");
        btnNegativo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNegativo.setOpaque(true);
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });

        etiquetaError.setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N
        etiquetaError.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaError.setText("Error");
        etiquetaError.setVisible(false);

        inputOperaciones.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputOperaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 107, 153), 2));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                .addComponent(btnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCociente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputOperaciones))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(inputOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCociente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaError)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lógica para mostrar en pantalla el valor numérico del botón presionado
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComaActionPerformed
        inputOperaciones.setText(inputOperaciones.getText()+".");
    }//GEN-LAST:event_btnComaActionPerformed

    //Lógica para eliminar el último carácter ingresado
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String operacion = inputOperaciones.getText();
        
        if(operacion.length()>0){
            operacion = operacion.substring(0, operacion.length()-1);
            inputOperaciones.setText(operacion);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    //Lógica para mostrar en pantalla las operaciones suma, resta, producto y cociente
    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if(!inputOperaciones.getText().equals("")) {
            inputOperaciones.setText(inputOperaciones.getText()+" - ");
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
       if(!inputOperaciones.getText().equals("")) {
           inputOperaciones.setText(inputOperaciones.getText()+" * ");
       }
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnCocienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocienteActionPerformed
        if(!inputOperaciones.getText().equals("")) {
            inputOperaciones.setText(inputOperaciones.getText()+" / ");
        }
    }//GEN-LAST:event_btnCocienteActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       if(!inputOperaciones.getText().equals("")) {
            inputOperaciones.setText(inputOperaciones.getText()+" + ");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    //Lógica para realizar las operaciones matemáticas que se ingresaron en pantalla
    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        String cadena = inputOperaciones.getText().trim();
        
        Double[] numeros = new Double[10];
        String[] operaciones = new String[9];
        
        String[] elementos = cadena.split(" ");
        
        int indiceNum = 0;
        int indiceOp = 0; 
        
        for (int i = 0; i < elementos.length; i++) {
            if (i % 2 ==0) {
                numeros[indiceNum++] = Double.valueOf(elementos[i]);
            } else {
                operaciones[indiceOp++] = elementos[i];
            }
        }
        
        Double resultado = numeros[0];
        
        for (int i = 0; i < indiceOp; i++) {
            String operacion = operaciones[i];
            Double num2 = numeros[i+1];
            
            switch (operacion) {
                case "+" -> resultado += num2;
                case "-" -> resultado -= num2;
                case "*" -> resultado *= num2;
                case "/" -> {
                    if (num2 != 0) {
                        resultado /= num2;
                    } else {
                        mostrarError("Error: No es posible dividir por cero");
                        return;
                    }
                }
                default -> {
                    mostrarError("Error: Operación no reconocida");
                    return;
                }
            }
        }
        
        inputOperaciones.setText(""+resultado);
    }//GEN-LAST:event_btnResultadoActionPerformed

    //Botón para limpiar lo ingresado en pantalla
    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        inputOperaciones.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    //Botón para convertir el último número ingresado en negativo
    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        String currentText = inputOperaciones.getText().trim();
         
        int ultimoEsp = currentText.lastIndexOf(" ");
        
        if (ultimoEsp == -1) {
            if (currentText.isEmpty()|| currentText.equals("-")) {
                inputOperaciones.setText("-");
            } else if (currentText.charAt(0) != '-') {
                inputOperaciones.setText("-" + currentText);
            } else if (currentText.charAt(0) == '-') {
                inputOperaciones.setText(currentText.substring(1));
            }
        } else {
            String ultimoNum = currentText.substring(ultimoEsp + 1);
            String antesUltimoNum = currentText.substring(0, ultimoEsp + 1);

            if (ultimoNum.isEmpty() || ultimoNum.equals("-")) {
                inputOperaciones.setText(antesUltimoNum + "-");
            } else if (ultimoNum.charAt(0) != '-') {
                inputOperaciones.setText(antesUltimoNum + "-" + ultimoNum);
            } else {
                inputOperaciones.setText(antesUltimoNum + ultimoNum.substring(1));
            }
        }
    }//GEN-LAST:event_btnNegativoActionPerformed

    //Lógica para el manejo de errores
    private void mostrarError(String mensaje) {
        etiquetaError.setText(mensaje);
        etiquetaError.setVisible(true);
        inputOperaciones.setText("");
    
        Timer timer = new Timer(2000, (ActionEvent e) -> {
            etiquetaError.setVisible(false);
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnCociente;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel etiquetaError;
    private javax.swing.JTextField inputOperaciones;
    // End of variables declaration//GEN-END:variables
}
