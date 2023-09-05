/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.ayarlar;
//ctrl+shift+i sınıfları import etme
import java.awt.Color;
import javax.swing.JButton;


public class ButtonAyarlari {
    
    private static Color originalBgColor,originalFgColor;
    
    public static void setBgFg(JButton button,Color bgColor,Color fgColor){
    originalBgColor = button.getBackground();
    originalFgColor = button.getForeground();
    button.setBackground(bgColor);
    button.setForeground(fgColor);
    }
    
    public static void setOriginalBg(JButton button){
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
    
}
