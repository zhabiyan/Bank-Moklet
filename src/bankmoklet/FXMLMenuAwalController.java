/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmoklet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Zhabiyan
 */
public class FXMLMenuAwalController implements Initializable {
    
    String nominal = "";
    int tmp;
    
    @FXML
    private Button button50;
    @FXML
    private Button button500;
    @FXML
    private Button button100;
    @FXML
    private Button button1000;
    @FXML
    private Button button200;
    @FXML
    private Button buttonLain;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan50(ActionEvent event) {
        nominal = "Rp. 50.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan500(ActionEvent event) {
        nominal = "Rp. 500.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan100(ActionEvent event) {
        nominal = "Rp. 100.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan1000(ActionEvent event) {
        nominal = "Rp. 1.000.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan200(ActionEvent event) {
        nominal = "Rp. 200.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekanLain(ActionEvent event) {
    }
    
}
