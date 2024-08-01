
package log;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Login extends JFrame
{
    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel userAndPass;
    
    private JLabel headLbl;
    private JLabel userLbl;
    private JLabel passLbl;
    
    private JTextField userTxt;
    private JPasswordField passTxt;
    
    private JButton submit;
    private JButton clear;
    private JButton exit;
    
    public Login()
    {
        setSize(700,700);
        setTitle("Login Page");
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        userAndPass = new JPanel(new GridLayout(2,1,4,4));
        userAndPass.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Login details"));
        
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPnl = new JPanel(new BorderLayout());
        headLbl = new JLabel("Login");
        headLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headLbl.setForeground(Color.RED);
        headLbl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        userLbl = new JLabel("Username: ");
        passLbl = new JLabel("Password: ");
        
        userTxt = new JTextField(10);
        passTxt =  new JPasswordField(10);
        
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        exit = new JButton("Exit");
        
        headingPnl.add(headLbl);
        usernamePnl.add(userLbl);
        usernamePnl.add(userTxt);
        passwordPnl.add(passLbl);
        passwordPnl.add(passTxt);
        userAndPass.add(usernamePnl);
        //userAndPass.add(userTxt);
        userAndPass.add(passwordPnl);
        //userAndPass.add(passTxt);
        btnPnl.add(submit);
        btnPnl.add(clear);
        btnPnl.add(exit);
        
        mainPnl.add(headingPnl,BorderLayout.NORTH);
        mainPnl.add(userAndPass,BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setVisible(true);
    }
}
