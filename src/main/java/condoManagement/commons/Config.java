package condoManagement.commons;

import java.util.Objects;

public class Config {
    public static final String DEFAULT_CONFIG_FILE = "config.json";

    private String appTitle = "Condo Management";

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Config config = (Config) o;
        return Objects.equals(appTitle, config.appTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("App Title: " + appTitle);
        return sb.toString();
    }
}
