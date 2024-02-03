import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VendingFrame extends JFrame {
    JTextField textField;
    String left = "";
    JTextArea textArea = new JTextArea();
    Drinks drinks = new Drinks();
    int in = 0;
    JPanel panel = new JPanel();
    JButton coke = new JButton("button");
    JButton fanta = new JButton("button");
    JButton miranda = new JButton("button");
    JButton oronaC = new JButton("button");
    JButton twoPer = new JButton("button");
    JButton gas = new JButton("button");
    JButton inputBtn = new JButton("투입 버튼");
    JLabel lblNewLabel_8 = new JLabel("금액 투입구");
    JButton returnBtn = new JButton("잔액 반환");

    public VendingFrame() {

        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("");//환타
        lblNewLabel.setBounds(169, 33, 100, 100);
        lblNewLabel.setIcon(new ImageIcon("/Users/patricksmacbookair/Desktop/kr_fanta_prod_fanta orange 355ml_750x750 복사본.jpg"));
        panel.add(lblNewLabel);


        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("/Users/patricksmacbookair/Desktop/7341678819_l.png"));
        lblNewLabel_2.setBounds(22, 33, 100, 100);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("/Users/patricksmacbookair/Desktop/202205120811382008_l.jpg"));
        lblNewLabel_3.setBounds(317, 33, 100, 100);
        panel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("/Users/patricksmacbookair/Desktop/5632228_1.jpg"));
        lblNewLabel_4.setBounds(22, 226, 100, 100);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon("/Users/patricksmacbookair/Desktop/210551a583.jpg"));
        lblNewLabel_5.setBounds(169, 226, 100, 100);
        panel.add(lblNewLabel_5);

        JLabel lblNewLabel_5_1 = new JLabel("");
        lblNewLabel_5_1.setIcon(new ImageIcon("/Users/patricksmacbookair/Desktop/7762_7610_469.png"));
        lblNewLabel_5_1.setBounds(317, 226, 100, 100);
        panel.add(lblNewLabel_5_1);

        JLabel lblNewLabel_6_1 = new JLabel("콜라");
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_1.setBounds(45, 118, 61, 16);
        panel.add(lblNewLabel_6_1);

        JLabel lblNewLabel_7_2 = new JLabel("환타");
        lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_2.setBounds(189, 118, 61, 16);
        panel.add(lblNewLabel_7_2);

        JLabel lblNewLabel_7_1_2 = new JLabel("미란다");
        lblNewLabel_7_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_2.setBounds(338, 118, 61, 16);
        panel.add(lblNewLabel_7_1_2);

        JLabel twoPrice = new JLabel("600");
        twoPrice.setHorizontalAlignment(SwingConstants.CENTER);
        twoPrice.setBounds(189, 339, 61, 16);
        panel.add(twoPrice);

        JLabel gasPrice = new JLabel("500");
        gasPrice.setHorizontalAlignment(SwingConstants.CENTER);
        gasPrice.setBounds(327, 340, 61, 16);
        panel.add(gasPrice);

        JLabel oroPrice = new JLabel("500");
        oroPrice.setHorizontalAlignment(SwingConstants.CENTER);
        oroPrice.setBounds(45, 339, 61, 16);
        panel.add(oroPrice);

        JLabel cokePrice = new JLabel("900");
        cokePrice.setHorizontalAlignment(SwingConstants.CENTER);
        cokePrice.setBounds(45, 144, 61, 16);
        panel.add(cokePrice);

        JLabel fantaPrice = new JLabel("800");
        fantaPrice.setHorizontalAlignment(SwingConstants.CENTER);
        fantaPrice.setBounds(189, 145, 61, 16);
        panel.add(fantaPrice);

        JLabel miranPrice = new JLabel("700");
        miranPrice.setHorizontalAlignment(SwingConstants.CENTER);
        miranPrice.setBounds(338, 145, 61, 16);
        panel.add(miranPrice);

        JLabel lblNewLabel_7_1_1 = new JLabel("오로나민C");
        lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1.setBounds(45, 312, 61, 16);
        panel.add(lblNewLabel_7_1_1);

        JLabel lblNewLabel_7_1_1_1 = new JLabel("2%");
        lblNewLabel_7_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1_1.setBounds(189, 312, 61, 16);
        panel.add(lblNewLabel_7_1_1_1);

        JLabel lblNewLabel_7_1_1_1_1 = new JLabel("가스 활명수");
        lblNewLabel_7_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1_1_1.setBounds(327, 312, 61, 16);
        panel.add(lblNewLabel_7_1_1_1_1);

        coke.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drinks.setName("콜라");
                drinks.setPrice(900);
                JOptionPane.showMessageDialog(coke, drinks.getName()+"가 나왔 습니다.");
                drinksLogic(drinks);
            }
        });
        coke.setBounds(17, 159, 117, 29);
        panel.add(coke);

        fanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinks.setName("환타");
                drinks.setPrice(800);
                JOptionPane.showMessageDialog(fanta, drinks.getName()+"가 나왔 습니다.");
                drinksLogic(drinks);

            }
        });
        fanta.setBounds(165, 159, 117, 29);
        panel.add(fanta);

        miranda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            drinks.setName("미란다");
            drinks.setPrice(800);
            JOptionPane.showMessageDialog(miranda, drinks.getName()+"가 나왔 습니다.");
                drinksLogic(drinks);

            }
        });
        miranda.setBounds(311, 159, 117, 29);
        panel.add(miranda);

        oronaC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drinks.setName("오란씨");
                drinks.setPrice(700);
                JOptionPane.showMessageDialog(oronaC, drinks.getName()+"가 나왔 습니다.");
                drinksLogic(drinks);

            }
        });
        oronaC.setBounds(22, 357, 117, 29);
        panel.add(oronaC);

        twoPer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinks.setName("이퍼센트");
                drinks.setPrice(600);
                JOptionPane.showMessageDialog(twoPer, drinks.getName()+"가 나왔 습니다.");
                drinksLogic(drinks);
            }
        });
        twoPer.setBounds(165, 357, 117, 29);
        panel.add(twoPer);

        gas.setBounds(300, 357, 117, 29);
        panel.add(gas);

        textArea.setBounds(305, 426, 123, 30);
        panel.add(textArea);
        buttonAction();
        inputBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input = textArea.getText();
                in = Integer.parseInt(input);
                drinksLogic(drinks);
                textArea.setText(null);
                if(in>=500){
                    oronaC.setEnabled(true);
                    gas.setEnabled(true);
                }
                if(in>=600){
                    oronaC.setEnabled(true);
                    gas.setEnabled(true);
                    miranda.setEnabled(true);
                }
                if(in>=700){
                    oronaC.setEnabled(true);
                    gas.setEnabled(true);
                    miranda.setEnabled(true);
                    fanta.setEnabled(true);
                }
                if(in>=800){
                    oronaC.setEnabled(true);
                    gas.setEnabled(true);
                    miranda.setEnabled(true);
                    fanta.setEnabled(true);
                    twoPer.setEnabled(true);
                }
                if(in>=900){
                    oronaC.setEnabled(true);
                    gas.setEnabled(true);
                    miranda.setEnabled(true);
                    fanta.setEnabled(true);
                    coke.setEnabled(true);
                }
            }
        });
        inputBtn.setBounds(311, 458, 117, 29);
        panel.add(inputBtn);

        lblNewLabel_8.setBounds(338, 398, 61, 16);
        panel.add(lblNewLabel_8);

        textField = new JTextField();
        textField.setBounds(298, 499, 130, 37);
        panel.add(textField);
        textField.setColumns(10);


        returnBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drinksLogic(drinks);
                JOptionPane.showMessageDialog(returnBtn,  left+ "이 반환 되었습니다.");
                textField.setText(null);
                buttonAction();

            }
        });
        returnBtn.setBounds(311, 548, 117, 29);
        panel.add(returnBtn);
    }


    private void drinksLogic(Drinks drinks) {
        if (in > drinks.getPrice()) {
            left = String.valueOf(in - drinks.getPrice());
            textField.setText(left);
            returnBtn.setEnabled(true);

        }else if (in == drinks.getPrice()) {
            String zero = "0";
            textField.setText(zero);
            returnBtn.setEnabled(false);
            buttonAction();
        }else if(in<500){
            left = String.valueOf(in);
            textField.setText(left);
            returnBtn.setEnabled(true);
        }
    }
    private void buttonAction() {
        coke.setEnabled(false);
        fanta.setEnabled(false);
        oronaC.setEnabled(false);
        gas.setEnabled(false);
        twoPer.setEnabled(false);
        miranda.setEnabled(false);
    }

}
