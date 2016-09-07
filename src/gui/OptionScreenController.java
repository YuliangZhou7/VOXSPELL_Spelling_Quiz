package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * Author: Yuliang Zhou 7/09/2016
 */
public class OptionScreenController implements ControlledScreen{

    private ScreensController _myParentScreensController;

    @FXML
    private Button _cancel;

    public void cancelButtonPressed(){
        //TODO: confirm if user wants to discard changes
        _myParentScreensController.setScreen(Main.titleScreenID);
    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        _myParentScreensController = screenParent;
    }
}
