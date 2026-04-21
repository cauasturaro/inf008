class AppConfig {

    private static String appName;
    private static String version;
    private static int maxConnections;
    private static int timeoutSeconds;
    private static boolean isDebugMode;

    public AppConfig(String appName, String version) {
        AppConfig.appName = appName;
        AppConfig.version = version;
        AppConfig.maxConnections = 10;
        AppConfig.timeoutSeconds = 30;
        AppConfig.isDebugMode = false;
    }

    public AppConfig(String appName, String version, int maxConnections, int timeoutSeconds) {
        this(appName, version);
        AppConfig.maxConnections = maxConnections;
        AppConfig.timeoutSeconds = timeoutSeconds;
    }

    public AppConfig(String appName, String version, int maxConnections, int timeoutSeconds, boolean isDebugMode) {
        this(appName, version, maxConnections, timeoutSeconds);
        AppConfig.isDebugMode = isDebugMode;
    }

    public static void updateSettings(int maxConnections, int timeoutSeconds) {
        AppConfig.maxConnections = maxConnections;
        AppConfig.timeoutSeconds = timeoutSeconds;
    }

    public static void updateSettings(boolean isDebugMode) {
        AppConfig.isDebugMode = isDebugMode;
    }

    public static boolean validateConfig() {

        if (appName == null || appName.isEmpty()) {
            System.out.println("App name inválido");
            return false;
        }

        if (version == null || version.isEmpty()) {
            System.out.println("Versão inválida");
            return false;
        }

        if (maxConnections <= 0) {
            System.out.println("maxConnections deve ser > 0");
            return false;
        }

        if (timeoutSeconds <= 0) {
            System.out.println("timeoutSeconds deve ser > 0");
            return false;
        }

        return true;
    }

    public static void displayConfig() {
        System.out.println("App: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Max Connections: " + maxConnections);
        System.out.println("Timeout: " + timeoutSeconds);
        System.out.println("Debug Mode: " + isDebugMode);
    }
}

public class questao5 {
    public static void main(String[] args) {
        
    }
}
