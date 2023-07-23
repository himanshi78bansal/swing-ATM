import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class projectATM extends JFrame implements ActionListener{

    JPanel panel;
    JLabel d1,d2,d3,transfer, withdrawal, cancell, services, balance, statement, pin;
    JButton l1,l2,l3,l4,r1,r2,r3,n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,ndot,clear,cancel,enter,back;
    int amount = 10000;
    int num1 = 0;


    projectATM(){
        setSize(750, 650);
        setLayout(null);
        setVisible(true);
		getContentPane().setBackground(Color.BLACK);
        // setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font fo = new Font("Arial", Font.BOLD, 16);
        Font lab = new Font("Arial", Font.BOLD, 13);


        // Main Label
        JLabel bank = new JLabel("Bansal's Bank");
        bank.setBounds(250,25,300,60);
        bank.setFont(new Font("Elephant", Font.BOLD, 35));
        bank.setForeground(Color.CYAN);
        add(bank);

        // Panel
        panel = new JPanel();
        panel.setBounds(225, 90, 300,215);
        panel.setBackground(Color.orange);
        panel.setForeground(Color.BLACK);
		panel.setLayout(null);
        add(panel);

        
        //Labels

        transfer = new JLabel("Money Transfer");
        transfer.setBounds(180,60,100,40);
        transfer.setHorizontalAlignment(JTextField.RIGHT);
        transfer.setFont(lab);
        panel.add(transfer);
        
        withdrawal = new JLabel("Cash Withdraw");
        withdrawal.setBounds(180,110,100,40);
        withdrawal.setHorizontalAlignment(JTextField.RIGHT);
        withdrawal.setFont(lab);
        panel.add(withdrawal);

        cancell = new JLabel("Cancel");
        cancell.setBounds(180,160,100,40);
        cancell.setHorizontalAlignment(JTextField.RIGHT);
        cancell.setFont(lab);
        panel.add(cancell);
        
        services = new JLabel("Other Services");
        services.setBounds(20,10,100,40);
        services.setFont(lab);
        panel.add(services);
        
        balance = new JLabel("Check Balance");
        balance.setBounds(20,60,100,40);
        balance.setFont(lab);
        panel.add(balance);
        
        statement = new JLabel("Mini Statement");
        statement.setBounds(20,110,100,40);
        statement.setFont(lab);
        panel.add(statement);
        
        pin = new JLabel("Change Pin");
        pin.setBounds(20,160,250,40);
        pin.setFont(lab);
        panel.add(pin);
        
        d1 = new JLabel("");
        d1.setBounds(80,80,220,40);
        d1.setFont(lab);
        panel.add(d1);
        
        d2 = new JLabel("");
        d2.setBounds(70,150,100,40);
        d2.setFont(lab);
        panel.add(d2);
        
        d3 = new JLabel("");
        d3.setBounds(180,150,100,40);
        d3.setFont(lab);
        panel.add(d3);        


        // Buttons

        l1 = new JButton("->");
        l1.setBounds(160,100,50,40);
        l1.setFont(fo);
        l1.setBackground(Color.GRAY);
        l1.setForeground(Color.BLACK);
        l1.setBorderPainted(false);
        add(l1);
        l1.addActionListener(this);

        l2 = new JButton("->");
        l2.setBounds(160,150,50,40);
        l2.setFont(fo);
        l2.setBackground(Color.GRAY);
        l2.setForeground(Color.BLACK);
        l2.setBorderPainted(false);
        add(l2);
        l2.addActionListener(this);

        l3 = new JButton("->");
        l3.setBounds(160,200,50,40);
        l3.setFont(fo);
        l3.setBackground(Color.GRAY);
        l3.setForeground(Color.BLACK);
        l3.setBorderPainted(false);
        add(l3);
        l3.addActionListener(this);
        
        l4 = new JButton("->");
        l4.setBounds(160,250,50,40);
        l4.setFont(fo);
        l4.setBackground(Color.GRAY);
        l4.setForeground(Color.BLACK);
        l4.setBorderPainted(false);
        add(l4);
        l4.addActionListener(this);
        
        r1 = new JButton("<-");
        r1.setBounds(540,150,50,40);
        r1.setFont(fo);
        r1.setBackground(Color.GRAY);
        r1.setForeground(Color.BLACK);
        r1.setBorderPainted(false);
        add(r1);
        r1.addActionListener(this);
        
        r2 = new JButton("<-");
        r2.setBounds(540,200,50,40);
        r2.setFont(fo);
        r2.setBackground(Color.GRAY);
        r2.setForeground(Color.BLACK);
        r2.setBorderPainted(false);
        add(r2);
        r2.addActionListener(this);

        r3 = new JButton("<-");
        r3.setBounds(540,250,50,40);
        r3.setFont(fo);
        r3.setBackground(Color.GRAY);
        r3.setForeground(Color.BLACK);
        r3.setBorderPainted(false);
        add(r3);
        r3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });

        n0 = new JButton("0");
        n0.setBounds(290,500,120,40);
        n0.setFont(fo);
        n0.setBackground(Color.GRAY);
        n0.setForeground(Color.BLACK);
        n0.setBorderPainted(false);
        add(n0);   
        n0.addActionListener(this);


        n1 = new JButton("1");
        n1.setBounds(220,350,50,40);
        n1.setFont(fo);
        n1.setBackground(Color.GRAY);
        n1.setForeground(Color.BLACK);
        n1.setBorderPainted(false);
        add(n1);
        n1.addActionListener(this);

        n2 = new JButton("2");
        n2.setBounds(290,350,50,40);
        n2.setFont(fo);
        n2.setBackground(Color.GRAY);
        n2.setForeground(Color.BLACK);
        n2.setBorderPainted(false);
        add(n2);
        n2.addActionListener(this);

        n3 = new JButton("3");
        n3.setBounds(360,350,50,40);
        n3.setFont(fo);
        n3.setBackground(Color.GRAY);
        n3.setForeground(Color.BLACK);
        n3.setBorderPainted(false);
        add(n3);
        n3.addActionListener(this);
        
        n4 = new JButton("4");
        n4.setBounds(220,400,50,40);
        n4.setFont(fo);
        n4.setBackground(Color.GRAY);
        n4.setForeground(Color.BLACK);
        n4.setBorderPainted(false);
        add(n4);
        n4.addActionListener(this);

        n5 = new JButton("5");
        n5.setBounds(290,400,50,40);
        n5.setFont(fo);
        n5.setBackground(Color.GRAY);
        n5.setForeground(Color.BLACK);
        n5.setBorderPainted(false);
        add(n5);
        n5.addActionListener(this);
        
        n6 = new JButton("6");
        n6.setBounds(360,400,50,40);
        n6.setFont(fo);
        n6.setBackground(Color.GRAY);
        n6.setForeground(Color.BLACK);
        n6.setBorderPainted(false);
        add(n6);
        n6.addActionListener(this);
        
        n7 = new JButton("7");
        n7.setBounds(220,450,50,40);
        n7.setFont(fo);
        n7.setBackground(Color.GRAY);
        n7.setForeground(Color.BLACK);
        n7.setBorderPainted(false);
        add(n7);
        n7.addActionListener(this);
        
        n8 = new JButton("8");
        n8.setBounds(290,450,50,40);
        n8.setFont(fo);
        n8.setBackground(Color.GRAY);
        n8.setForeground(Color.BLACK);
        n8.setBorderPainted(false);
        add(n8);
        n8.addActionListener(this);
        
        n9 = new JButton("9");
        n9.setBounds(360,450,50,40);
        n9.setFont(fo);
        n9.setBackground(Color.GRAY);
        n9.setForeground(Color.BLACK);
        n9.setBorderPainted(false);
        add(n9);
        n9.addActionListener(this);

        ndot = new JButton(".");
        ndot.setBounds(220,500,50,40);
        ndot.setFont(fo);
        ndot.setBackground(Color.GRAY);
        ndot.setForeground(Color.BLACK);
        ndot.setBorderPainted(false);
        add(ndot);
        ndot.addActionListener(this);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,500,100,40);
        clear.setFont(fo);
        clear.setBackground(Color.BLUE);
        clear.setForeground(Color.WHITE);
        clear.setBorderPainted(false);
        add(clear);
        clear.addActionListener(this);

        cancel = new JButton("CANCEL");
        cancel.setBounds(430,400,100,40);
        cancel.setFont(fo);
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.BLACK);
        cancel.setBorderPainted(false);
        add(cancel);
        cancel.addActionListener(this);

        enter = new JButton("ENTER");
        enter.setBounds(430,350,100,40);
        enter.setFont(fo);
        enter.setBackground(Color.GREEN);
        enter.setForeground(Color.BLACK);
        enter.setBorderPainted(false);
        add(enter);
        enter.addActionListener(this);

        back = new JButton("BACK");
        back.setBounds(430,450,100,40);
        back.setFont(fo);
        back.setBackground(Color.pink);
        back.setForeground(Color.BLACK);
        back.setBorderPainted(false);
        add(back);
        back.addActionListener(this);

    }

    // Action Listener
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == n0){
                d3.setText(d3.getText().concat("0"));
            }
            
            if(e.getSource() == n1){
                d3.setText(d3.getText().concat("1"));
            }
            
            if(e.getSource() == n2){
                d3.setText(d3.getText().concat("2"));
            }
            
            if(e.getSource() == n3){
                d3.setText(d3.getText().concat("3"));
            }
            
            if(e.getSource() == n4){
                d3.setText(d3.getText().concat("4"));
            }
            
            if(e.getSource() == n5){
                d3.setText(d3.getText().concat("5"));
            }
            
            if(e.getSource() == n6){
                d3.setText(d3.getText().concat("6"));
            }
            
            if(e.getSource() == n7){
                d3.setText(d3.getText().concat("7"));
            }
            
            if(e.getSource() == n8){
                d3.setText(d3.getText().concat("8"));
            }
            
            if(e.getSource() == n9){
                d3.setText(d3.getText().concat("9"));
            }
            
            if(e.getSource() == ndot){
                d3.setText(d3.getText().concat("."));
            }

            if(e.getSource() == cancel){
                d3.setText("");
            }

            if(e.getSource() == back){
                String s = d3.getText();
                d3.setText("");
                for (int i = 0; i<s.length()-1; i++){
                    d3.setText(d3.getText() + s.charAt(i));
                }
            }
            
            if(e.getSource() == clear){
                services.setText("Other Services");
                balance.setText("Check Balance");
                statement.setText("Mini Statement");
                pin.setText("Change Pin");
                transfer.setText("Money Transfer");
                withdrawal.setText("Cash Withdrawal");
                cancell.setText("Cancel");

                panel.setBackground(Color.pink);

                d1.setText("");
                d2.setText("");
                d3.setText("");
            }

            if(e.getSource() == enter){
                num1 = Integer.parseInt(d3.getText());
                withdrawal();
            }

            // transfer
            if(e.getSource() == r1){
                services.setText("");
                balance.setText("");
                statement.setText("");
                pin.setText("");
                transfer.setText("");
                withdrawal.setText("");
                cancell.setText("");

                d1.setText("Money Transfer");
                transfer();
            }

            // withdraw
            if(e.getSource() == r2){
                services.setText("");
                balance.setText("");
                statement.setText("");
                pin.setText("");
                transfer.setText("");
                withdrawal.setText("");
                cancell.setText("");

                d1.setText("Enter Amount");
            }

            // services
            if(e.getSource() == l1){
                services.setText("");
                balance.setText("");
                statement.setText("");
                pin.setText("");
                transfer.setText("");
                withdrawal.setText("");
                cancell.setText("");
                d1.setText("");
                d2.setText("");
                d3.setText("");

                panel.setBackground(Color.RED);
                services();
            }

            // balance
            if(e.getSource() == l2){
                services.setText("");
                balance.setText("");
                statement.setText("");
                pin.setText("");
                transfer.setText("");
                withdrawal.setText("");
                cancell.setText("");
                
                d1.setText(Integer.toString(amount));
                balance();
            }
            
            // statement
            if(e.getSource() == l3){
                services.setText("");
                balance.setText("");
                statement.setText("");
                pin.setText("");
                transfer.setText("");
                withdrawal.setText("");
                cancell.setText("");
                
                statement();
            }
            
            // pin
            if(e.getSource() == l4){
                services.setText("");
                balance.setText("");
                statement.setText("");
                pin.setText("");
                transfer.setText("");
                withdrawal.setText("");
                cancell.setText("");
                
                d1.setText("Change PIN");
                pin();
            }
            
        }


        // functions

        private void transfer(){
            JDialog f=new JDialog(this, "Money Transfer");
            f.setSize(450, 300);
            f.setLayout(null);
            f.setLocationRelativeTo(null);

            JLabel name=new JLabel("Receiver's Name");
            name.setBounds(30,50,150,40);
            f.add(name);

            JTextField t1=new JTextField();
            t1.setBounds(140,50,200,40);
            f.add(t1);

            JLabel value=new JLabel("Amount");
            value.setBounds(30,100,150,40);
            f.add(value);

            JTextField t2=new JTextField();
            t2.setBounds(140,100,200,40);
            f.add(t2);

            JButton send=new JButton("Send");
            send.setBounds(230,200,100,50);
            f.add(send);

            JButton cancel=new JButton("Cancel");
            cancel.setBounds(50,200,100,50);
            f.add(cancel);

            send.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String s1 = t1.getText();
                    String s2 = t2.getText();

                    if(s1.length() == 0 || s2.length() == 0){
                        if(s1.length() == 0){
                            t1.setText("Please Enter Name");
                        } else if(s2.length()==0){
                            t2.setText("Please Enter Amount");
                        }
                    } else {
                        JPasswordField pwd=new JPasswordField(4);
                        int pass=JOptionPane.showConfirmDialog(f, pwd, "Enter PIN Code", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

                        if(pass==JOptionPane.OK_OPTION){
                            JOptionPane.showMessageDialog(f, "Your Money has been transfered to "+s1+", Thank you !", "Money Transfer", JOptionPane.INFORMATION_MESSAGE);
                            f.dispose();
                        }
                        else if(pass==JOptionPane.CANCEL_OPTION){
                            JOptionPane.showMessageDialog(f, "Please Enter PIN Code", "Alert !", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            });

            cancel.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.exit(0);	
                }
            });

            f.setVisible(true);
	}
        
        private void withdrawal(){
            num1 = Integer.parseInt(d3.getText());
            amount = amount-num1;
            balance();
            d1.setText("Transaction Successful!");
            // d2.setText("Your Balance");
            // d3.setText(Integer.toString(amount));
        }
            
        private void services(){
            JOptionPane.showMessageDialog(this,"Sorry, Machine gone Out of Services...", "Services", JOptionPane.ERROR_MESSAGE);
        }
            
        private void balance(){
            d1.setText("Remaining Balance");
            if(amount > 5000){
                d2.setText("Your Balance");
                d3.setText(Integer.toString(amount));
                panel.setBackground(Color.GREEN);
            } else {
                d2.setText("Balance is LOW");
                d3.setText(Integer.toString(amount));
                panel.setBackground(Color.RED);
            }
        }
            
        private void statement(){
            balance();
            JOptionPane.showMessageDialog(this,"!!! No, papers to print !!!", "Services", JOptionPane.ERROR_MESSAGE);
        }
            
        private void pin(){
            JDialog f=new JDialog(this, "Change PIN");
            f.setSize(445, 300);
            f.setLayout(null);
            f.setLocationRelativeTo(null);

            JLabel curPin=new JLabel("Current PIN");
            curPin.setBounds(30,40,150,40);
            f.add(curPin);

            JTextField t1=new JTextField();
            t1.setBounds(140,40,200,40);
            f.add(t1);

            JLabel newPin=new JLabel("New PIN");
            newPin.setBounds(30,90,150,40);
            f.add(newPin);

            JTextField t2=new JTextField();
            t2.setBounds(140,90,200,40);
            f.add(t2);

            JLabel conPin=new JLabel("Confirm PIN");
            conPin.setBounds(30,140,150,40);
            f.add(conPin);

            JTextField t3=new JTextField();
            t3.setBounds(140,140,200,40);
            f.add(t3);

            JButton submit=new JButton("Submit");
            submit.setBounds(230,200,100,50);
            f.add(submit);

            JButton cancel=new JButton("Cancel");
            cancel.setBounds(50,200,100,50);
            f.add(cancel);

            submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    String s2=t2.getText();
                    String s3=t3.getText();
                    if(s1.length()==0){
                        t1.setText("Please Enter PIN");
                    }else if(s2.length()==0 || s3.length()==0){
                        if(s2.length()==0){
                            t2.setText("Please Enter New PIN");
                        }else if(s3.length()==0){
                            t3.setText("Please Confirm New PIN");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(f, "Your PIN Code has been Updated, Thank You !", "Change PIN", JOptionPane.INFORMATION_MESSAGE);
                        f.dispose();
                    }
                }
            });

            cancel.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.exit(0);	
                }
            });
            
            f.setVisible(true);
	}
    
    public static void main(String[] args) {
        new projectATM();
    }
}