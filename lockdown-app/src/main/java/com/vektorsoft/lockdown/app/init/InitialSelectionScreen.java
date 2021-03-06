/*
 * Copyright (C) 2017 Vektorsoft Ltd. (http://www.vektorsoft.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.vektorsoft.lockdown.app.init;

import com.vektorsoft.lockdown.app.ResourceConstants;
import java.io.IOException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

/**
 * Initial screen to select whether new keyring should be created or restore from backup.
 *
 * @author Vladimir Djurovic <vdjurovic@vektorsoft.com>
 */
public class InitialSelectionScreen {
    
    private static final String FXML_LOCATION = "/gui/fxml/init/init_choice.fxml";
    
    private final Node screenNode;
    private final KeyringCreateWizard wizard;
    
    public InitialSelectionScreen() throws IOException {
        screenNode = FXMLLoader.load(this.getClass().getResource(FXML_LOCATION), ResourceBundle.getBundle(ResourceConstants.INIT_SCREEN_STRINGS));
        wizard = new KeyringCreateWizard();
        
        Button createKeyringButton = (Button)screenNode.lookup("#createKeyringButton");
        createKeyringButton.setOnAction((ActionEvent event) -> {
            wizard.showAndWait().ifPresent(result -> {
                if(result == ButtonType.FINISH) {
                    System.out.println("wizard finished");
                }
            });
        });
    }

    public Node getScreen() {
        return screenNode;
    }
}
