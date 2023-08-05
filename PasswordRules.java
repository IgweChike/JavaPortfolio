/*Denzel Chike
 * 10/17/2020
 *JDK 1.8
 * Validating a password entry
 */

import javax.swing.JOptionPane;

public class PasswordRules {
     public static void main(String[] args) {
 String pass1 = JOptionPane.showInputDialog(null,"Enter a password "
 + "\nMust be between a 6-12 characters long"
 + "\nMust contain a number");
  if (pass1.length()>= 6 && pass1.length()<= 12){
      if (pass1.contains ("1") || pass1.contains("2")
              || pass1.contains ("3") || pass1.contains("4")
              || pass1.contains ("5") || pass1.contains("6")
              || pass1.contains ("7") || pass1.contains("8")
              || pass1.contains ("9") || pass1.contains("0")) {
          String pass2 = JOptionPane.showInputDialog(null,"Repeat password");
          if(pass1.equals(pass2)){
              JOptionPane.showMessageDialog(null, "Succesful");
          } else {
              JOptionPane.showMessageDialog(null,"The password are not equal");
          }
    } else {
      JOptionPane.showMessageDialog(null, "Your password must contain a digit");
  }   
     } else {
    JOptionPane.showMessageDialog(null,
            "Your password needs to be between 6-12 characters");
}
}
}