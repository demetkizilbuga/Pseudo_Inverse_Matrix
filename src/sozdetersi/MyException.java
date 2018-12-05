/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sozdetersi;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uset
 */
public class MyException extends Exception{
    
    public DefaultTableModel m_tablo;
    public int boyut1;
    public int boyut2;
    
    public MyException(int id){
        switch (id) {
            case 1:
                JOptionPane.showMessageDialog(null, "Tabloda boş veri bulunmaktadır !");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Matris sadece rakamlardan oluşmaktadır");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Satır ve sütun sayısı farklı olmalıdır !");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Noktadan sonra 1 basamak giriniz !");
                break;
            default:
                break;
        }
    }
    
}
