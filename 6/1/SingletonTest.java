public class SingletonTest {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        config1.setSetting("url", "https://khngldi.com");
        config2.setSetting("timeout", "5000");
        System.out.println("Configfirst Settings: " + config1.getAllSettings());
        System.out.println("Configsecond Settings: " + config2.getAllSettings());
    }
}
