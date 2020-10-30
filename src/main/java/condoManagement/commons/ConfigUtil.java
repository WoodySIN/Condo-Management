package condoManagement.commons;

import java.io.IOException;
import java.util.Optional;

public class ConfigUtil {
    public static Optional<Config> readConfig(String configFilePath) throws IOException {
        return JsonUtil.readJsonFile(configFilePath, Config.class);
    }

    public static void saveConfig(Config config, String configFilePath) throws IOException {
        JsonUtil.saveJsonFile(config, configFilePath);
    }
}
