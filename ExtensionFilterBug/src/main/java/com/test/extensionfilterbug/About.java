package com.test.extensionfilterbug;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class About {

    /**
     * Constructor
     *
     * @param _main  pointer to GS_Application
     */
    public About(HelloApplication _main) {
        //constructor
        String sLogFileName;
        HelloController controller = _main.getController();
        /*
         * GUI window
         */
        Stage myStage = _main.getStage();
        InputStream stIn = null;

        String sWorking = System.getProperty("user.home");
        File fInitial = new File(sWorking);
        File f;
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(fInitial);
        // Set extension filter

        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("log files (*.log)", "*.log*");
        fc.getExtensionFilters().add(extFilter);
        fc.setTitle("GS WORKING Directory");
        f = fc.showOpenDialog(myStage);
        sLogFileName = f.getName();
        /*
         * array list of text lines
         */
        ArrayList<String> salItems = new ArrayList<>();
        if (f.length() == 0){
            salItems.add(sLogFileName + " is empty!");
            return;
        } else {
            try {
                stIn = new FileInputStream(f);
            } catch (Exception e) {
                e.printStackTrace();
            }

            BufferedReader reader = null;
            if (stIn != null) {
                reader = new BufferedReader(new InputStreamReader(stIn));
            }
            String line;
            try {
                while (true) {
                    assert reader != null;
                    if ((line = reader.readLine()) == null) break;
                    salItems.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String[] sArray = salItems.toArray(new String[0]);
        controller.showText(sArray);
    }


}
