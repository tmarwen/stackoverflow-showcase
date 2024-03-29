/**
 * Copyright 2015 Wise Brains
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.tmawen.stackoverflow;

/**
 * Calculator
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public class Calculator extends javax.swing.JFrame
{

  double operandOne;
  double operandTwo;
  double result;
  Operation operation;


  public Calculator()
  {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  private void initComponents()
  {
    txtDisplay = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    jButton8 = new javax.swing.JButton();
    jButton9 = new javax.swing.JButton();
    jButton10 = new javax.swing.JButton();
    jButton11 = new javax.swing.JButton();
    jButton12 = new javax.swing.JButton();
    jButton13 = new javax.swing.JButton();
    jButton14 = new javax.swing.JButton();
    jButton15 = new javax.swing.JButton();
    jButton16 = new javax.swing.JButton();
    jButton17 = new javax.swing.JButton();
    jButton18 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton1.setText("1");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton2.setText("2");
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton3.setText("3");
    jButton3.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton4.setText("+");
    jButton4.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton4ActionPerformed(evt);
      }
    });

    jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton5.setText("4");
    jButton5.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton5ActionPerformed(evt);
      }
    });

    jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton6.setText("5");
    jButton6.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton6ActionPerformed(evt);
      }
    });

    jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton7.setText("6");
    jButton7.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton7ActionPerformed(evt);
      }
    });

    jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton8.setText("-");
    jButton8.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton8ActionPerformed(evt);
      }
    });

    jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton9.setText("7");
    jButton9.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton9ActionPerformed(evt);
      }
    });

    jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton10.setText("8");
    jButton10.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton10ActionPerformed(evt);
      }
    });

    jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton11.setText("9");
    jButton11.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton11ActionPerformed(evt);
      }
    });

    jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton12.setText("*");
    jButton12.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton12ActionPerformed(evt);
      }
    });

    jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton13.setText("0");
    jButton13.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton13ActionPerformed(evt);
      }
    });

    jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jButton14.setText("00");
    jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
    jButton14.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton14ActionPerformed(evt);
      }
    });

    jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton15.setText(".");
    jButton15.setToolTipText("");
    jButton15.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton15ActionPerformed(evt);
      }
    });

    jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton16.setText("/");
    jButton16.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton16ActionPerformed(evt);
      }
    });

    jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton17.setText("C");
    jButton17.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton17ActionPerformed(evt);
      }
    });

    jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton18.setText("=");
    jButton18.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton18ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addGap(3, 3, 3)
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
    );

    pack();
  }// </editor-fold>

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton1.getText();
    txtDisplay.setText(input);
  }

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
  {
    operandOne = Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText("");
    operation = Operation.ADD;
  }

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton2.getText();
    txtDisplay.setText(input);
  }

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton5.getText();
    txtDisplay.setText(input);
  }

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton3.getText();
    txtDisplay.setText(input);
  }

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton6.getText();
    txtDisplay.setText(input);
  }

  private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton9.getText();
    txtDisplay.setText(input);
  }

  private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton10.getText();
    txtDisplay.setText(input);
  }

  private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton11.getText();
    txtDisplay.setText(input);
  }

  private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton13.getText();
    txtDisplay.setText(input);
  }

  private void jButton14ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton14.getText();
    txtDisplay.setText(input);
  }

  private void jButton17ActionPerformed(java.awt.event.ActionEvent evt)
  {
    txtDisplay.setText("");
  }

  private void jButton18ActionPerformed(java.awt.event.ActionEvent evt)
  {
    operandTwo = Double.parseDouble(txtDisplay.getText());
    switch (operation)
    {
      case ADD:
        result = operation.apply(operandOne, operandTwo);
        txtDisplay.setText(Double.toString(result));
        break;

      case SUBSTRUCT:
        result = operation.apply(operandOne, operandTwo);
        txtDisplay.setText(Double.toString(result));
        break;

      case MULTIPLY:
        result = operation.apply(operandOne, operandTwo);
        txtDisplay.setText(Double.toString(result));
        break;

      case DEVIDE:
        result = operation.apply(operandOne, operandTwo);
        txtDisplay.setText(Double.toString(result));
        break;
    }
  }

  private void jButton15ActionPerformed(java.awt.event.ActionEvent evt)
  {

    String input;
    input = txtDisplay.getText() + jButton15.getText();
    txtDisplay.setText(input);
  }

  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)
  {
    String input;
    input = txtDisplay.getText() + jButton7.getText();
    txtDisplay.setText(input);
  }

  private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
  {
    operandOne = Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText("");
    operation = Operation.SUBSTRUCT;
  }

  private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)
  {
    operandOne = Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText("");
    operation = Operation.MULTIPLY;
  }

  private void jButton16ActionPerformed(java.awt.event.ActionEvent evt)
  {
    operandOne = Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText("");
    operation = Operation.DEVIDE;
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Calculator().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton10;
  private javax.swing.JButton jButton11;
  private javax.swing.JButton jButton12;
  private javax.swing.JButton jButton13;
  private javax.swing.JButton jButton14;
  private javax.swing.JButton jButton15;
  private javax.swing.JButton jButton16;
  private javax.swing.JButton jButton17;
  private javax.swing.JButton jButton18;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton8;
  private javax.swing.JButton jButton9;
  private javax.swing.JTextField txtDisplay;
// End of variables declaration

}