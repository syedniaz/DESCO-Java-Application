/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerServiceRepresentative;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Istiaqs-PC
 */
public class Scene1Controller implements Initializable {

    @FXML
    private TableView<?> ViewCustomerAccountTable;
    @FXML
    private TableColumn<?, ?> ViewCustomerIDColumn;
    @FXML
    private TableColumn<?, ?> ViewComplainIDColumn;
    @FXML
    private TableColumn<?, ?> ViewCustomerComplaintColumn;
    @FXML
    private TableColumn<?, ?> ViewDateColumn;
    @FXML
    private TableColumn<?, ?> viewFeedback;
    @FXML
    private TextField CustomerIDTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewDashboardOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewPromotionsOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewFeedBackManagerOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewCompanyPolicyButtonsOnclick(ActionEvent event) {
    }

    @FXML
    private void logOutOnclick(ActionEvent event) {
    }

    @FXML
    private void markAsResolvedOnclick(ActionEvent event) {
    }
    
}
