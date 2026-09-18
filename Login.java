package airlinemanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton submit, reset, close;
    JTextField tfusername;
    JPasswordField tfpassword;
    
    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(22, 22, 102, 22);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(132, 22, 202, 22);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(22, 62, 102, 22);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(132, 62, 202, 22);
        add(tfpassword);
        
        reset = new JButton("Reset");
        reset.setBounds(42, 122, 122, 22);
        reset.addActionListener(this);
        add(reset);
        
        submit = new JButton("Submit");
        submit.setBounds(192, 122, 122, 22);
        submit.addActionListener(this);
        add(submit);
        
        close = new JButton("Close");
        close.setBounds(122, 162, 122, 22);
        close.addActionListener(this);
        add(close);
        
        setSize(402, 252);
        setLocation(602, 252);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            try {
                Conn cn = new Conn();
                
                String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
                
                ResultSet rs = cn.s.executeQuery(query);
                
                if (rs.next()) {
                    new Home();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == reset) {
            tfusername.setText("");
            tfpassword.setText("");
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
