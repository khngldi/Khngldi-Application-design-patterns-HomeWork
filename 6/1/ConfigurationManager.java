import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private Map<String, String> settings;

    private ConfigurationManager() {
        settings = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void removeSetting(String key) {
        settings.remove(key);
    }

    public Map<String, String> getAllSettings() {
        return settings;
    }

    @Override
    public String toString() {
        return "ConfigurationManager{" +
                "settings=" + settings +
                '}';
    }
}
