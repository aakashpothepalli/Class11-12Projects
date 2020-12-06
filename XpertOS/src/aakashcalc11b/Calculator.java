package aakashcalc11b;

import java.awt.Color;
import xpertos.Home;

public class Calculator extends javax.swing.JFrame {

    int oper = 0;
    String  f="", y1="", t1="";
    double b, f1,h;
    
    static String save1 = "";

    boolean check=false;

    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        sin.setVisible(false);
        cos.setVisible(false);
        tan.setVisible(false);
        log.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        root7 = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttond = new javax.swing.JButton();
        root = new javax.swing.JButton();
        buttona = new javax.swing.JButton();
        root2 = new javax.swing.JButton();
        buttons = new javax.swing.JButton();
        buttonm = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        root1 = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonm1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jMenu3.setText("jMenu3");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(208, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 520, 52));

        root7.setBackground(new java.awt.Color(255, 255, 255));
        root7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        root7.setText("advanced");
        root7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        root7.setFocusable(false);
        root7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        root7.setMaximumSize(new java.awt.Dimension(40, 40));
        root7.setMinimumSize(new java.awt.Dimension(40, 40));
        root7.setRequestFocusEnabled(false);
        root7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                root7ActionPerformed(evt);
            }
        });
        getContentPane().add(root7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 520, 50));

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        seven.setText("7");
        seven.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        seven.setFocusable(false);
        seven.setMargin(new java.awt.Insets(0, 0, 0, 0));
        seven.setMaximumSize(new java.awt.Dimension(80, 80));
        seven.setMinimumSize(new java.awt.Dimension(80, 80));
        seven.setPreferredSize(new java.awt.Dimension(40, 40));
        seven.setRequestFocusEnabled(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, 60));

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        eight.setText("8");
        eight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        eight.setFocusable(false);
        eight.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eight.setMaximumSize(new java.awt.Dimension(80, 80));
        eight.setMinimumSize(new java.awt.Dimension(80, 80));
        eight.setPreferredSize(new java.awt.Dimension(40, 40));
        eight.setRequestFocusEnabled(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 60, 60));

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nine.setText("9");
        nine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        nine.setFocusable(false);
        nine.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nine.setMaximumSize(new java.awt.Dimension(80, 80));
        nine.setMinimumSize(new java.awt.Dimension(80, 80));
        nine.setPreferredSize(new java.awt.Dimension(40, 40));
        nine.setRequestFocusEnabled(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, 60));

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        four.setText("4");
        four.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        four.setFocusable(false);
        four.setMargin(new java.awt.Insets(0, 0, 0, 0));
        four.setMaximumSize(new java.awt.Dimension(80, 80));
        four.setMinimumSize(new java.awt.Dimension(80, 80));
        four.setPreferredSize(new java.awt.Dimension(40, 40));
        four.setRequestFocusEnabled(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 60));

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        five.setText("5");
        five.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        five.setFocusable(false);
        five.setMargin(new java.awt.Insets(0, 0, 0, 0));
        five.setMaximumSize(new java.awt.Dimension(80, 80));
        five.setMinimumSize(new java.awt.Dimension(80, 80));
        five.setPreferredSize(new java.awt.Dimension(40, 40));
        five.setRequestFocusEnabled(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 60, 60));

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        six.setText("6");
        six.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        six.setFocusable(false);
        six.setMargin(new java.awt.Insets(0, 0, 0, 0));
        six.setMaximumSize(new java.awt.Dimension(80, 80));
        six.setMinimumSize(new java.awt.Dimension(80, 80));
        six.setPreferredSize(new java.awt.Dimension(40, 40));
        six.setRequestFocusEnabled(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 60, 60));

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        one.setText("1");
        one.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        one.setFocusable(false);
        one.setMargin(new java.awt.Insets(0, 0, 0, 0));
        one.setMaximumSize(new java.awt.Dimension(80, 80));
        one.setMinimumSize(new java.awt.Dimension(80, 80));
        one.setPreferredSize(new java.awt.Dimension(40, 40));
        one.setRequestFocusEnabled(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 60, 60));

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        two.setText("2");
        two.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        two.setFocusable(false);
        two.setMargin(new java.awt.Insets(0, 0, 0, 0));
        two.setMaximumSize(new java.awt.Dimension(80, 80));
        two.setMinimumSize(new java.awt.Dimension(80, 80));
        two.setPreferredSize(new java.awt.Dimension(40, 40));
        two.setRequestFocusEnabled(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 60, 60));

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        three.setText("3");
        three.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        three.setFocusable(false);
        three.setMargin(new java.awt.Insets(0, 0, 0, 0));
        three.setMaximumSize(new java.awt.Dimension(80, 80));
        three.setMinimumSize(new java.awt.Dimension(80, 80));
        three.setPreferredSize(new java.awt.Dimension(40, 40));
        three.setRequestFocusEnabled(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 60));

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        zero.setText("0");
        zero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("© Aakash and Suhail @ APS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 290, -1));

        buttond.setBackground(new java.awt.Color(255, 255, 255));
        buttond.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttond.setText("/");
        buttond.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        buttond.setFocusable(false);
        buttond.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttond.setMaximumSize(new java.awt.Dimension(40, 40));
        buttond.setMinimumSize(new java.awt.Dimension(40, 40));
        buttond.setRequestFocusEnabled(false);
        buttond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondActionPerformed(evt);
            }
        });
        getContentPane().add(buttond, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 60, 60));

        root.setBackground(new java.awt.Color(255, 255, 255));
        root.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        root.setText("√ ");
        root.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        root.setFocusable(false);
        root.setMargin(new java.awt.Insets(0, 0, 0, 0));
        root.setMaximumSize(new java.awt.Dimension(40, 40));
        root.setMinimumSize(new java.awt.Dimension(40, 40));
        root.setRequestFocusEnabled(false);
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });
        getContentPane().add(root, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 60, 60));

        buttona.setBackground(new java.awt.Color(255, 255, 255));
        buttona.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttona.setText("+");
        buttona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        buttona.setFocusable(false);
        buttona.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttona.setMaximumSize(new java.awt.Dimension(40, 40));
        buttona.setMinimumSize(new java.awt.Dimension(40, 40));
        buttona.setRequestFocusEnabled(false);
        buttona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaActionPerformed(evt);
            }
        });
        getContentPane().add(buttona, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 60, 60));

        root2.setBackground(new java.awt.Color(255, 255, 255));
        root2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        root2.setText("^");
        root2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        root2.setFocusable(false);
        root2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        root2.setMaximumSize(new java.awt.Dimension(40, 40));
        root2.setMinimumSize(new java.awt.Dimension(40, 40));
        root2.setRequestFocusEnabled(false);
        root2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                root2ActionPerformed(evt);
            }
        });
        getContentPane().add(root2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 60, 60));

        buttons.setBackground(new java.awt.Color(255, 255, 255));
        buttons.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttons.setText("-");
        buttons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        buttons.setFocusable(false);
        buttons.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttons.setMaximumSize(new java.awt.Dimension(40, 40));
        buttons.setMinimumSize(new java.awt.Dimension(40, 40));
        buttons.setRequestFocusEnabled(false);
        buttons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsActionPerformed(evt);
            }
        });
        getContentPane().add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 60, 60));

        buttonm.setBackground(new java.awt.Color(255, 255, 255));
        buttonm.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        buttonm.setText(".");
        buttonm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        buttonm.setFocusable(false);
        buttonm.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonm.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonm.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonm.setRequestFocusEnabled(false);
        buttonm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmActionPerformed(evt);
            }
        });
        getContentPane().add(buttonm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 60, 60));

        equal.setBackground(new java.awt.Color(255, 255, 255));
        equal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        equal.setText("=");
        equal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 170, 60));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setText("history");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 100, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setText("CE");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        jButton3.setFocusable(false);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 100, 60));
        jButton3.getAccessibleContext().setAccessibleName("");

        root1.setBackground(new java.awt.Color(255, 255, 255));
        root1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        root1.setText("<-");
        root1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        root1.setFocusable(false);
        root1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        root1.setMaximumSize(new java.awt.Dimension(40, 40));
        root1.setMinimumSize(new java.awt.Dimension(40, 40));
        root1.setRequestFocusEnabled(false);
        root1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                root1ActionPerformed(evt);
            }
        });
        getContentPane().add(root1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 100, 60));
        root1.getAccessibleContext().setAccessibleName("");

        sin.setBackground(new java.awt.Color(255, 255, 255));
        sin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sin.setText("sin");
        sin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        sin.setFocusable(false);
        sin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sin.setMaximumSize(new java.awt.Dimension(40, 40));
        sin.setMinimumSize(new java.awt.Dimension(40, 40));
        sin.setRequestFocusEnabled(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });
        getContentPane().add(sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 70, 40));

        cos.setBackground(new java.awt.Color(255, 255, 255));
        cos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cos.setText("cos");
        cos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        cos.setFocusable(false);
        cos.setIconTextGap(1);
        cos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cos.setMaximumSize(new java.awt.Dimension(40, 40));
        cos.setMinimumSize(new java.awt.Dimension(40, 40));
        cos.setRequestFocusEnabled(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        getContentPane().add(cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, 40));

        tan.setBackground(new java.awt.Color(255, 255, 255));
        tan.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tan.setText("tan");
        tan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        tan.setFocusable(false);
        tan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tan.setMaximumSize(new java.awt.Dimension(40, 40));
        tan.setMinimumSize(new java.awt.Dimension(40, 40));
        tan.setRequestFocusEnabled(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });
        getContentPane().add(tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 67, 40));

        log.setBackground(new java.awt.Color(255, 255, 255));
        log.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        log.setText("log");
        log.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        log.setFocusable(false);
        log.setMargin(new java.awt.Insets(0, 0, 0, 0));
        log.setMaximumSize(new java.awt.Dimension(40, 40));
        log.setMinimumSize(new java.awt.Dimension(40, 40));
        log.setRequestFocusEnabled(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, 40));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -30, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/left-angle-bracket (1).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 512, 40, 40));

        buttonm1.setBackground(new java.awt.Color(255, 255, 255));
        buttonm1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonm1.setText("x");
        buttonm1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        buttonm1.setFocusable(false);
        buttonm1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonm1.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonm1.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonm1.setRequestFocusEnabled(false);
        buttonm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonm1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 60, 60));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 30));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed

    }//GEN-LAST:event_resultActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed

        result.setText(result.getText() + "1");
        save1 = save1 + "1";

    }//GEN-LAST:event_oneActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        if(result.getText().length()>0)
        h = Double.parseDouble(result.getText());
        switch (oper) {

            case 1:

                result.setText(String.valueOf(b + h));
                save1 = save1 + " = " + " " + (b + h);
                break;

            case 0:
                result.setText(t1);
                break;

            case 2:

                result.setText(String.valueOf(b - h));
                save1 = save1 + " = " + " " + (b - h);
                break;
            case 3:

                result.setText(String.valueOf(b * h));
                save1 = save1 + " = " + " " + (b * h);
                break;

            case 4:

                
                result.setText(String.valueOf(b / h));
                save1 = save1 + " = " + " " + (b / h);
                break;
            case 5:

                h = Math.pow(h, 1 / 2);

                result.setText(h + "");
                save1 = save1 + " = " + " " + (h);
                break;
            case 6:

                
                f = String.valueOf(Math.pow(f1, Double.parseDouble(result.getText())));
                result.setText(f);
                save1 = save1 + " = " + " " + (f);
                break;

            case 7:

                f1 = Double.parseDouble(result.getText());
                f1 = f1 * Math.PI / 180;
                f1 = Math.tan(f1);
                result.setText("" + f1);
                save1 = save1 + " = " + " " + (f1);
                break;
            case 8:
               
                f1 = Math.sin(Double.parseDouble(result.getText()) * Math.PI / 180);
                result.setText("" + f1);
                save1 = save1 + " = " + " " + (f1);
                break;
            case 9:
                
                f1 = Math.cos(Double.parseDouble(result.getText()) * Math.PI / 180);
                result.setText("" + f1);
                save1 = save1 + " = " + " " + (f1);
                break;
            case 10:
                
                f1 = Math.log(Double.parseDouble(result.getText()));
                result.setText(f1 + "");
                save1 = save1 + " = " + " " + (f1) ;
                break;
        }
if(result.getText().length()>0)
{
        save1 = save1 + "\n";
        oper = 0;
      
        f = "";
        y1 = "";
        t1 = "";
        
        
        
        
        b = 0;
       
        f1 = 0;
        
       
        h = 0;
}
    }//GEN-LAST:event_equalActionPerformed


    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        result.setText(result.getText() + "2");
        save1 = save1 + "2";

    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        result.setText(result.getText() + "3");
        save1 = save1 + "3";
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        result.setText(result.getText() + "4");
        save1 = save1 + "4";
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        result.setText(result.getText() + "5");
        save1 = save1 + "5";
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        result.setText(result.getText() + "6");
        save1 = save1 + "6";

    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        result.setText(result.getText() + "7");

        save1 = save1 + "7";// TODO t your handling code here:
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
         t1 = result.getText() + "8";
        result.setText(t1);
        save1 = save1 + "8";
        // TODO t your handling code here:
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        result.setText(result.getText() + "9");
        save1 = save1 + "9";
        // TODO t your handling code here:
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        result.setText(result.getText() + "0");
        save1 = save1 + "0";
        // TODO t your handling code here:
    }//GEN-LAST:event_zeroActionPerformed

    private void buttonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaActionPerformed
        oper();
        save1 = save1 + " + ";
        oper = 1;// TODO t your handling code here:
    }//GEN-LAST:event_buttonaActionPerformed

    private void buttonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsActionPerformed
        oper();
        save1 = save1 + " - ";
        oper = 2;

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsActionPerformed

    private void buttonmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmActionPerformed
        result.setText(result.getText() + ".");

        save1 = save1 + ".";
    }//GEN-LAST:event_buttonmActionPerformed
    // TODO add your handling code here:

    private void buttondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondActionPerformed
        oper();
        oper = 4;
        save1 = save1 + " / ";
// TODO add your handling code here:
    }//GEN-LAST:event_buttondActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        result.setText("");
        oper = 0;
        
        f = "";
        y1 = "";
        t1 = "";
        
      
        b = 0;
    
        f1 = 0;
     
       
        h = 0;
        sin.setBackground(Color.white);
        cos.setBackground(Color.white);
        tan.setBackground(Color.white);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed

        f = result.getText();
        f1 = Double.parseDouble(f);
        f1 = Math.pow(f1, 0.5);
        f = String.valueOf(f1);
        result.setText(f);
        oper = 5;
        // TODO add your handling code here:
    }//GEN-LAST:event_rootActionPerformed

    private void root1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_root1ActionPerformed

        if (result.getText().length()>0) // aviods error when no text is present in the text box
            result.setText(result.getText().substring(0, result.getText().length() - 1));


    }//GEN-LAST:event_root1ActionPerformed

    private void root2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_root2ActionPerformed

        f1 = Double.parseDouble(result.getText());
        result.setText("");
        oper = 6;
        save1 += "^" ;
        // TODO add your handling code here:
    }//GEN-LAST:event_root2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new NewJFrame1().setVisible(true);// TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
        result.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_resultMouseClicked

    private void root7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_root7ActionPerformed

        if (check == false) {
            sin.setVisible(true);
            cos.setVisible(true);
            tan.setVisible(true);
            log.setVisible(true);
            check = true;
        } else {
            sin.setVisible(false);
            cos.setVisible(false);
            tan.setVisible(false);
            log.setVisible(false);
            check = false;
        }
// TODO add your handling code here:
    }//GEN-LAST:event_root7ActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
save1 += "sin " ;
        tan.setBackground(Color.white);
        sin.setBackground(Color.green);
        cos.setBackground(Color.white);

        oper = 8;          // TODO add your handling code here:
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
save1 += "cos " ;
        tan.setBackground(Color.white);
        sin.setBackground(Color.white);
        cos.setBackground(Color.green);
        oper = 9;         // TODO add your handling code here:
    }//GEN-LAST:event_cosActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed

        oper = 10;
    }//GEN-LAST:event_logActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
      save1 += "tan " ;
        tan.setBackground(Color.green);
        sin.setBackground(Color.white);
        cos.setBackground(Color.white);

        oper = 7;
        // TODO add your handling code here:
    }//GEN-LAST:event_tanActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MousePressed

    private void buttonm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonm1ActionPerformed
        oper();
        save1 = save1 + " x ";
        oper = 3;        // TODO add your handling code here:
    }//GEN-LAST:event_buttonm1ActionPerformed

    public void oper() {

        switch (oper) {

            case 0:

                b = Double.parseDouble(result.getText());
                result.setText("");

                break;
            case 1:

                f1 = Double.parseDouble(result.getText());
                b = b + f1;
                result.setText("");
                break;

            case 2:

                f1 = Double.parseDouble(result.getText());
                b = b - f1;
                result.setText("");
                break;

            case 3:
                f = result.getText();
                f1 = Double.parseDouble(result.getText());
                b = b * f1;
                result.setText("");
                break;

            case 4:

                f1 = Double.parseDouble(result.getText());
                b = b / f1;
                result.setText("");
                break;

            case 5:

                f1 = Math.pow(Double.parseDouble(result.getText()), 1 / 2);
                result.setText("");

        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttona;
    private javax.swing.JButton buttond;
    private javax.swing.JButton buttonm;
    private javax.swing.JButton buttonm1;
    private javax.swing.JButton buttons;
    private javax.swing.JButton cos;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JTextField result;
    private javax.swing.JButton root;
    private javax.swing.JButton root1;
    private javax.swing.JButton root2;
    private javax.swing.JButton root7;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

}
