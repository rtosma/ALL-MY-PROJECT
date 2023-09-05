/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;



public class TextAyarlari {
    private static String originalText;
    private static Color originalFgColor;
    
    public static void checkTheTextFocusGained(JTextField textField,String org){
        originalText = org;
        if(textField.getText().trim().equals(org)){
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        
        textField.setForeground(Color.ORANGE);
    }
    public static void chekTheTextFocusLost(JTextField textField){
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
            
        }else{
            textField.setForeground(Color.black);
        }
    }
    public static void setOnlyNumber(JTextField textField){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                    
                }
            }
            
        });
    }
    
    public static void setOnlyAlphabetic(JTextField textField){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c = e.getKeyChar();
                if (!Character.isAlphabetic(c)) {
                    e.consume();
                    
                }
            }
            
        });
    }
    
    
    
    private static int limit;
    
    public static void setMaxLimit(JTextField textField,int lim){
        limit = lim;
        textField.setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

                if (str == null) {
                    return;
                    
                }
                if ((getLength()+str.length())<=limit) {
                    super.insertString(offs, str, a);
                    
                }
                
            }
            
        });
    }
    
   
    public static int checkTheTextKeyReleased(JTextField textField,int moneyLimit)
    {
       String text = textField.getText();
       if(!text.equals("")){
           int miktar = Integer.parseInt(text);
           if (miktar>moneyLimit) {
           miktar=moneyLimit;
           textField.setText(String.valueOf(miktar));   
           }
           return miktar;
       }
       return 0;
    }
    
    
    public static boolean textAlanlariDolumu(JPanel panel){
       Component[] components = panel.getComponents();
        for (Component c:components) {
            if(c instanceof JTextField){
                JTextField textField = (JTextField) c;
                if (textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;                   
                }        
            }
            
        }
        return true;
    }
    
    public static boolean uzunlukSundanKucukMu(int length,String str) {
        return (str.length() < length);
    }
}
