package condoManagement;


import condoManagement.commons.Config;
import condoManagement.commons.ConfigUtil;
import condoManagement.controller.Controller;
import condoManagement.controller.ControllerManager;
import condoManagement.model.*;
import condoManagement.storage.Storage;
import condoManagement.storage.StorageManager;
import condoManagement.view.Ui;
import condoManagement.view.UiManager;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

public class CondoManagementApplication extends Application{

    protected Ui ui;
    protected Controller controller;
    protected Model model;
    protected Storage storage;
    protected Config config;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();

        storage = new StorageManager();
        model = initModelManager(storage);
        controller = new ControllerManager(model, storage);
        config = innitConfig(getApplicationParameter("config"));
        ui = new UiManager(controller, config);
    }

    private String getApplicationParameter(String parameterName) {
        Map<String, String> applicationParameters = getParameters().getNamed();
        return applicationParameters.get(parameterName);
    }

    private Model initModelManager(Storage storage) {
        Optional<ReadOnlyCondoManagement> condoManagementOptional;
        ReadOnlyCondoManagement initialData;

        condoManagementOptional = storage.readCondoManagement();
        if (!condoManagementOptional.isPresent()) {
            initialData = new CondoManagement();
        } else {
            initialData = condoManagementOptional.orElse(new CondoManagement());
        }
        return new ModelManager(initialData);
    }

protected Config innitConfig(String configFilePath) {
    Config initializedConfig;
    String configFilePathUsed;

    configFilePathUsed = Config.DEFAULT_CONFIG_FILE;

    if (configFilePath != null) {
        configFilePathUsed = configFilePath;
    }

    try {
        Optional<Config> configOptional = ConfigUtil.readConfig(configFilePathUsed);
        initializedConfig = configOptional.orElse(new Config());
    } catch (Exception e) {
        initializedConfig = new Config();
    }

    //Update config file in case it was missing to begin with or there are new/unused fields
    try {
        ConfigUtil.saveConfig(initializedConfig, configFilePathUsed);
    } catch (IOException e) {
        e.fillInStackTrace();
    }
    return initializedConfig;
}

    @Override
    public void start(Stage primaryStage) throws Exception {
        ui.start(primaryStage);
    }

    public void stop() throws Exception {
        super.stop();
        Platform.exit();
        System.exit(0);
    }
}
