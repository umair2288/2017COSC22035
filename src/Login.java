import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel Login;
    private JTextField txtUsername;
    private JPasswordField pwPassword;
    private JButton exitButton;
    private JButton loginButton;


    public static JFrame loginFR = new JFrame("LoginBox");

    public Login() {
        loginButton.addActionListener(e->{
            String userName = txtUsername.getText();
            String password = String.valueOf(pwPassword.getPassword());
            System.out.println(password);
            loginCheck(userName,password);
            //JOptionPane.showMessageDialog(null,userName + "System not ready yet");

        });

        exitButton.addActionListener(e->System.exit(0));
    }


    private void loginCheck(String frUserName,String frPW){
        String inUserName = "COSC";
        String inPW = "22035";
        if(frUserName.equals(inUserName)&&frPW.equals(inPW))
            JOptionPane.showMessageDialog(null,"Username and password are correct");
        else
            JOptionPane.showMessageDialog(null,"Incorrect");
    }

    public static void main(String[] args) {

        loginFR.setContentPane(new Login().Login);
        loginFR.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFR.pack();

        loginFR.setVisible(true);

    }
}
