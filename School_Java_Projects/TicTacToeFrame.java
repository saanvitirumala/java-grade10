package School_Java_Projects;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 import java.awt.Color;
import java.awt.Dimension;



 /**  *
  * @author saanv
  */
 
 public class TicTacToeFrame extends javax.swing.JFrame {
 
     int turn = 0;  // determines whose turn it is
     boolean xFirst = true;
      int xCount= 0;
      int oCount=0;
      int tieCount = 0;
      int count9=0;
      boolean isWin=false;
     
     
     public TicTacToeFrame() {
         initComponents();
         updateMove();
     }
     public void updateMove(){
         if(turn % 2 == 0){
             nextMoveLabel.setText("X");
         }else{
             nextMoveLabel.setText("O");
         }
     }
     
    
 
     public void checkWin() {
         count9++;
         //Top Row Horizontal Check for X winning
         if (topLeft.getText().equals("X") && topMiddle.getText().equals("X") && topRight.getText().equals("X")) {
             statusButton.setText(" X Wins Horizontal TOP ROW!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             topLeft.setBackground(Color.MAGENTA);
             topMiddle.setBackground(Color.MAGENTA);
             topRight.setBackground(Color.MAGENTA);
             
         } //Middle Row HORIZONTAL Check for X Winning
         else if (middleLeft.getText().equals("X") && center.getText().equals("X") && middleRight.getText().equals("X")) {
             statusButton.setText(" X Wins Horizontal MIDDLE ROW!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             middleLeft.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             middleRight.setBackground(Color.MAGENTA);

             
         } //Bottom Row Horizontal Check for X winning
         else if (bottomLeft.getText().equals("X") && bottomMiddle.getText().equals("X") && bottomRight.getText().equals("X")) {
             statusButton.setText(" X Wins Horizontal BOTTOM ROW!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             bottomLeft.setBackground(Color.MAGENTA);
             bottomMiddle.setBackground(Color.MAGENTA);
             bottomRight.setBackground(Color.MAGENTA);
             
         } // Left Vertical Check for X Winning
         else if (topLeft.getText().equals("X") && middleLeft.getText().equals("X") && bottomLeft.getText().equals("X")){
             statusButton.setText(" X Wins VERTICAL LEFT ROW!!!");    
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             topLeft.setBackground(Color.MAGENTA);
             middleLeft.setBackground(Color.MAGENTA);
             bottomLeft.setBackground(Color.MAGENTA);
         } // Middle Vertical Check for X winning
         else if (topMiddle.getText().equals("X") && center.getText().equals("X") && bottomMiddle.getText().equals("X")){
             statusButton.setText(" X Wins VERTICAL MIDDLE ROW!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             topMiddle.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             bottomMiddle.setBackground(Color.MAGENTA);
         } // Right Vertical Check for X Winning
         else if (topRight.getText().equals("X") && middleRight.getText().equals("X") && bottomRight.getText().equals("X")){
             statusButton.setText(" X Wins VERTICAL RIGHT ROW!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             topRight.setBackground(Color.MAGENTA);
             middleRight.setBackground(Color.MAGENTA);
             bottomRight.setBackground(Color.MAGENTA);
         } // Left to Right Diagonal Check for X Winning
         else if (topLeft.getText().equals("X") && center.getText().equals("X") && bottomRight.getText().equals("X")){
             statusButton.setText(" X Wins DIAGONALLY LEFT-RIGHT!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             topLeft.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             bottomRight.setBackground(Color.MAGENTA);
         } // Right to Left Diagonal Check for X Winning
         else if (topRight.getText().equals("X") && center.getText().equals("X") && bottomLeft.getText().equals("X")){
             statusButton.setText(" X Wins DIAGONALLY RIGHT-LEFT!!!");
             xCount++;
             xPlayerWins.setText(xCount+"");
             isWin=true;
             topRight.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             bottomLeft.setBackground(Color.MAGENTA);
         }
         else if (topLeft.getText().equals("O") && topMiddle.getText().equals("O") && topRight.getText().equals("O")) {
             statusButton.setText(" O Wins Horizontal TOP ROW!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             topLeft.setBackground(Color.MAGENTA);
             topMiddle.setBackground(Color.MAGENTA);
             topRight.setBackground(Color.MAGENTA);
         } //Middle Row HORIZONTAL Check for O Winning
         else if (middleLeft.getText().equals("O") && center.getText().equals("O") && middleRight.getText().equals("O")) {
             statusButton.setText(" O Wins Horizontal MIDDLE ROW!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             middleLeft.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             middleRight.setBackground(Color.MAGENTA);
         } //Bottom Row Horizontal Check for O winning
         else if (bottomLeft.getText().equals("O") && bottomMiddle.getText().equals("O") && bottomRight.getText().equals("O")) {
             statusButton.setText(" O Wins Horizontal BOTTOM ROW!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             bottomLeft.setBackground(Color.MAGENTA);
             bottomMiddle.setBackground(Color.MAGENTA);
             bottomRight.setBackground(Color.MAGENTA);
         } // Left Vertical Check for O Winning
         else if (topLeft.getText().equals("O") && middleLeft.getText().equals("O") && bottomLeft.getText().equals("O")){
             statusButton.setText(" O Wins VERTICAL LEFT ROW!!!");  
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             topLeft.setBackground(Color.MAGENTA);
             middleLeft.setBackground(Color.MAGENTA);
             bottomLeft.setBackground(Color.MAGENTA);
         } // Middle Vertical Check for O winning
         else if (topMiddle.getText().equals("O") && center.getText().equals("O") && bottomMiddle.getText().equals("O")){
             statusButton.setText(" O Wins VERTICAL MIDDLE ROW!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             topMiddle.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             bottomMiddle.setBackground(Color.MAGENTA);
         } // Right Vertical Check for O Winning
         else if (topRight.getText().equals("O") && middleRight.getText().equals("O") && bottomRight.getText().equals("O")){
             statusButton.setText(" O Wins VERTICAL RIGHT ROW!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             topRight.setBackground(Color.MAGENTA);
             middleRight.setBackground(Color.MAGENTA);
             bottomRight.setBackground(Color.MAGENTA);
         } // Left to Right Diagonal Check for O Winning
         else if (topLeft.getText().equals("O") && center.getText().equals("O") && bottomRight.getText().equals("O")){
             statusButton.setText(" O Wins DIAGONALLY LEFT-RIGHT!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             topLeft.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             bottomRight.setBackground(Color.MAGENTA);
         } // Right to Left Diagonal Check for O Winning
         else if (topRight.getText().equals("O") && center.getText().equals("O") && bottomLeft.getText().equals("O")){
             statusButton.setText(" O Wins DIAGONALLY RIGHT-LEFT!!!");
             oCount++;
             oPlayerWins.setText(oCount+"");
             isWin=true;
             topRight.setBackground(Color.MAGENTA);
             center.setBackground(Color.MAGENTA);
             bottomLeft.setBackground(Color.MAGENTA);
         }
            else if (count9 == 9){
             tieCount++;
             tiesTFUI.setText(tieCount+"");
             statusButton.setText(" It's a Tie! Better Luck Next Time.");
             
         }
         
     }
     
 
             
         
             
         
             
 
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {
 
         jPanel1 = new javax.swing.JPanel();
         topRight = new javax.swing.JButton();
         middleLeft = new javax.swing.JButton();
         center = new javax.swing.JButton();
         topLeft = new javax.swing.JButton();
         topMiddle = new javax.swing.JButton();
         middleRight = new javax.swing.JButton();
         bottomLeft = new javax.swing.JButton();
         bottomMiddle = new javax.swing.JButton();
         bottomRight = new javax.swing.JButton();
         tiesTFUI = new javax.swing.JTextField();
         statusButton = new javax.swing.JTextField();
         xPlayerWins = new javax.swing.JTextField();
         oPlayerWins = new javax.swing.JTextField();
         playerXLabel = new javax.swing.JLabel();
         playerXLabel1 = new javax.swing.JLabel();
         playerXLabel2 = new javax.swing.JLabel();
         resetButton = new javax.swing.JButton();
         jLabel1 = new javax.swing.JLabel();
         nextMoveLabel = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setBackground(new java.awt.Color(0, 0, 0));
         setPreferredSize(new Dimension(1600, 1000));
         pack();
         setLocationRelativeTo(null);
         setVisible(true);
         getContentPane().setLayout(null);
 
          
         
 
         jPanel1.setLayout(new java.awt.GridLayout(3, 3, 5, 5));
 
         topRight.setBackground(new java.awt.Color(153, 0, 255));
         topRight.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         topRight.setForeground(new java.awt.Color(255, 213, 0));
         topRight.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         topRight.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 topRightActionPerformed(evt);
             }
         });
         
 
         middleLeft.setBackground(new java.awt.Color(153, 0, 255));
         middleLeft.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         middleLeft.setForeground(new java.awt.Color(255, 213, 0));
         middleLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         middleLeft.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 middleLeftActionPerformed(evt);
             }
         });
         
 
         center.setBackground(new java.awt.Color(153, 0, 255));
         center.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         center.setForeground(new java.awt.Color(255, 213, 0));
         center.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         center.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 centerActionPerformed(evt);
             }
         });
         
 
         topLeft.setBackground(new java.awt.Color(153, 0, 255));
         topLeft.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         topLeft.setForeground(new java.awt.Color(255, 213, 0));
         topLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         topLeft.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 topLeftActionPerformed(evt);
             }
         });
         
 
         topMiddle.setBackground(new java.awt.Color(153, 0, 255));
         topMiddle.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         topMiddle.setForeground(new java.awt.Color(255, 213, 0));
         topMiddle.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         topMiddle.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 topMiddleActionPerformed(evt);
             }
         });
         
 
         middleRight.setBackground(new java.awt.Color(153, 0, 255));
         middleRight.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         middleRight.setForeground(new java.awt.Color(255, 213, 0));
         middleRight.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         middleRight.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 middleRightActionPerformed(evt);
             }
         });
         
 
         bottomLeft.setBackground(new java.awt.Color(153, 0, 255));
         bottomLeft.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         bottomLeft.setForeground(new java.awt.Color(255, 213, 0));
         bottomLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         bottomLeft.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 bottomLeftActionPerformed(evt);
             }
         });
         
 
         bottomMiddle.setBackground(new java.awt.Color(153, 0, 255));
         bottomMiddle.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         bottomMiddle.setForeground(new java.awt.Color(255, 213, 0));
         bottomMiddle.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         bottomMiddle.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 bottomMiddleActionPerformed(evt);
             }
         });
 
 
         bottomRight.setBackground(new java.awt.Color(153, 0, 255));
         bottomRight.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
         bottomRight.setForeground(new java.awt.Color(255, 213, 0));
         bottomRight.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 0, 153)));
         bottomRight.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 bottomRightActionPerformed(evt);
             }
         });
         
          
         
         // maintain order of buttons storage from left to right in 3x3 matrix
         jPanel1.add(topLeft);   //  index 0 
         jPanel1.add(topMiddle); //  index 1
         jPanel1.add(topRight); //  index 2
         jPanel1.add(middleLeft); //  index 3
         jPanel1.add(center); //  index 4
         jPanel1.add(middleRight); //  index 5
         jPanel1.add(bottomLeft); //  index 6
         jPanel1.add(bottomMiddle); //  index 7
         jPanel1.add(bottomRight); //  index 8
         getContentPane().add(jPanel1);
         

         jPanel1.setBounds(380, 150, 760, 570);
 
         tiesTFUI.setBackground(new java.awt.Color(255, 213, 0));
         tiesTFUI.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
         tiesTFUI.setForeground(new java.awt.Color(92, 0, 153));
         tiesTFUI.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 tiesTFUIActionPerformed(evt);
             }
         });
         getContentPane().add(tiesTFUI);
         tiesTFUI.setBounds(100, 440, 190, 60);
 
         statusButton.setBackground(new java.awt.Color(153, 0, 255));
         statusButton.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
         statusButton.setForeground(new java.awt.Color(255, 255, 153));
         statusButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 153)));
         statusButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 statusButtonActionPerformed(evt);
             }
         });
         getContentPane().add(statusButton);
         statusButton.setBounds(500, 760, 580, 40);
 
         xPlayerWins.setBackground(new java.awt.Color(61, 0, 102));
         xPlayerWins.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
         xPlayerWins.setForeground(new java.awt.Color(253, 197, 0));
         xPlayerWins.setText("0");
         xPlayerWins.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 xPlayerWinsActionPerformed(evt);
             }
         });
         getContentPane().add(xPlayerWins);
         xPlayerWins.setBounds(100, 250, 190, 60);
 
         oPlayerWins.setBackground(new java.awt.Color(92, 0, 153));
         oPlayerWins.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
         oPlayerWins.setForeground(new java.awt.Color(253, 197, 0));
         oPlayerWins.setText("0");
         oPlayerWins.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 oPlayerWinsActionPerformed(evt);
             }
         });
         getContentPane().add(oPlayerWins);
         oPlayerWins.setBounds(100, 340, 190, 60);
 
         playerXLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
         playerXLabel.setForeground(new java.awt.Color(61, 0, 102));
         playerXLabel.setText("Game Ties:");
         getContentPane().add(playerXLabel);
         playerXLabel.setBounds(100, 410, 160, 16);
 
         playerXLabel1.setBackground(new java.awt.Color(255, 102, 0));
         playerXLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
         playerXLabel1.setForeground(new java.awt.Color(61, 0, 102));
         playerXLabel1.setText("Player X Wins:");
         getContentPane().add(playerXLabel1);
         playerXLabel1.setBounds(100, 220, 160, 24);
 
         playerXLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
         playerXLabel2.setForeground(new java.awt.Color(61, 0, 102));
         playerXLabel2.setText("Player O Wins:");
         getContentPane().add(playerXLabel2);
         playerXLabel2.setBounds(100, 320, 160, 16);
 
         resetButton.setBackground(new java.awt.Color(153, 51, 255));
         resetButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
         resetButton.setForeground(new java.awt.Color(255, 213, 0));
         resetButton.setText("Play Again");
         resetButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 213, 0)));
         resetButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 resetButtonActionPerformed(evt);
             }
         });
         getContentPane().add(resetButton);
         resetButton.setBounds(100, 650, 190, 50);
 
         jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
         jLabel1.setForeground(new java.awt.Color(61, 0, 102));
         jLabel1.setText("Status:");
         getContentPane().add(jLabel1);
         jLabel1.setBounds(390, 760, 100, 40);
 
         nextMoveLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
         nextMoveLabel.setForeground(new java.awt.Color(61, 0, 102));
         nextMoveLabel.setText("x or o move");
         getContentPane().add(nextMoveLabel);
         nextMoveLabel.setBounds(230, 530, 110, 50);
 
         jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
         jLabel2.setForeground(new java.awt.Color(61, 0, 102));
         jLabel2.setText("Next Move:");
         getContentPane().add(jLabel2);
         jLabel2.setBounds(100, 540, 150, 32);
 
         jLabel3.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
         jLabel3.setForeground(new java.awt.Color(51, 0, 102));
         jLabel3.setText("                   TIC TAC TOE");
         getContentPane().add(jLabel3);
         jLabel3.setBounds(380, 20, 740, 100);
 
         pack();
     }// </editor-fold>                        
 
     
 
     private void checkTurn(){
         if(!isWin){
             turn++;
             checkWin();
            }
            updateMove(); 
      }

     private void bottomRightActionPerformed(java.awt.event.ActionEvent evt) {                                            
         if (bottomRight.getText().equals("")) {
             if (turn % 2 == 0) {
                 bottomRight.setText("X");
                 
             } else {
                 bottomRight.setText("O");
                 
             }
             checkTurn();
         }
 
     }                                           
 
     private void topMiddleActionPerformed(java.awt.event.ActionEvent evt) {                                          
         if (topMiddle.getText().equals("")) {
             if (turn % 2 == 0) {
                 topMiddle.setText("X");
             } else {
                 topMiddle.setText("O");
 
             }
             checkTurn();
         }
     }                                         
 
     private void middleLeftActionPerformed(java.awt.event.ActionEvent evt) {                                           
         if (middleLeft.getText().equals("")) {
             if (turn % 2 == 0) {
                 middleLeft.setText("X");
             } else {
                 middleLeft.setText("O");
                 
             }
             checkTurn();
         }
     }                                          
 
     private void middleRightActionPerformed(java.awt.event.ActionEvent evt) {                                            
         if (middleRight.getText().equals("")) {
             if (turn % 2 == 0) {
                 middleRight.setText("X");
             } else {
                 middleRight.setText("O");
 
             }
             checkTurn();
         }
 
     }                                           
 
     private void centerActionPerformed(java.awt.event.ActionEvent evt) {                                       
         if (center.getText().equals("")) {
             if (turn % 2 == 0) {
                 center.setText("X");
             } else {
                 center.setText("O");
 
             }
             checkTurn();
 
         }
 
     }                                      
 
     private void bottomMiddleActionPerformed(java.awt.event.ActionEvent evt) {                                             
         if (bottomMiddle.getText().equals("")) {
             if (turn % 2 == 0) {
                 bottomMiddle.setText("X");
             } else {
                 bottomMiddle.setText("O");
 
             }
             checkTurn();
         }
 
     }                                            
 
     private void topLeftActionPerformed(java.awt.event.ActionEvent evt) {                                        
         if (topLeft.getText().equals("")) {
             if (turn % 2 == 0) {
                 topLeft.setText("X");
             } else {
                 topLeft.setText("O");
 
             }
             checkTurn();
         }
     }                                       
 
     private void bottomLeftActionPerformed(java.awt.event.ActionEvent evt) {                                           
         if (bottomLeft.getText().equals("")) {
             if (turn % 2 == 0) {
                 bottomLeft.setText("X");
             } else {
                 bottomLeft.setText("O");
 
             }
             checkTurn();
         }
     }                                          
 
     private void topRightActionPerformed(java.awt.event.ActionEvent evt) {                                         
         if (topRight.getText().equals("")) {
             if (turn % 2 == 0) {
                 topRight.setText("X");
             } else {
                 topRight.setText("O");
 
             }
             checkTurn();
         }
 
       
     }                                        
 
     private void tiesTFUIActionPerformed(java.awt.event.ActionEvent evt) {                                         
         // TODO add your handling code here:
     }                                        
 
     private void xPlayerWinsActionPerformed(java.awt.event.ActionEvent evt) {                                            
         // TODO add your handling code here:
     }                                           
 
     private void oPlayerWinsActionPerformed(java.awt.event.ActionEvent evt) {                                            
         // TODO add your handling code here:
     }                                           
 
     private void statusButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
         // TODO add your handling code here:
     }                                            
 
     private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
         xFirst = !xFirst;
         if(xFirst){
             turn = 0;
         }else{
             turn = 1;
         }
         count9=0;
         
        
         topLeft.setText("");topMiddle.setText("");topRight.setText("");
         middleLeft.setText("");center.setText("");middleRight.setText("");
         bottomLeft.setText("");bottomMiddle.setText("");bottomRight.setText("");
         statusButton.setText("");
         topLeft.setBackground(new java.awt.Color(153, 0, 255));
         topMiddle.setBackground(new java.awt.Color(153, 0, 255));
         topRight.setBackground(new java.awt.Color(153, 0, 255));
         middleLeft.setBackground(new java.awt.Color(153, 0, 255));
         center.setBackground(new java.awt.Color(153, 0, 255));
         middleRight.setBackground(new java.awt.Color(153, 0, 255));
         bottomLeft.setBackground(new java.awt.Color(153, 0, 255));
         bottomMiddle.setBackground(new java.awt.Color(153, 0, 255));
         bottomRight.setBackground(new java.awt.Color(153, 0, 255));
         
         isWin=false;
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
             java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
 
         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
              //   new TicTacToeFrame().setVisible(true);
                 new TicTacToeFrame().setVisible(true);
             }
         });
     }
 
     // Variables declaration - do not modify                     
     private javax.swing.JButton bottomLeft;
     private javax.swing.JButton bottomMiddle;
     private javax.swing.JButton bottomRight;
     private javax.swing.JButton center;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JButton middleLeft;
     private javax.swing.JButton middleRight;
     private javax.swing.JLabel nextMoveLabel;
     private javax.swing.JTextField oPlayerWins;
     private javax.swing.JLabel playerXLabel;
     private javax.swing.JLabel playerXLabel1;
     private javax.swing.JLabel playerXLabel2;
     private javax.swing.JButton resetButton;
     private javax.swing.JTextField statusButton;
     private javax.swing.JTextField tiesTFUI;
     private javax.swing.JButton topLeft;
     private javax.swing.JButton topMiddle;
     private javax.swing.JButton topRight;
     private javax.swing.JTextField xPlayerWins;
     // End of variables declaration                   
 }
 
 
 //have fun 
 