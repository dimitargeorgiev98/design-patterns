package Exercise;

public abstract class Package {

    public static int BULGARIAN = 1;
    public static int PLOVDIV = 2;
    public static int FOREIGN = 3;

    protected int level;

    protected Package nextLogger;

    public void setNextLogger(Package nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {

        if(this.level <= level) {
            this.writeMessage(message);
        }

        if(this.nextLogger != null) {
            this.nextLogger.logMessage(level, message);
        }
    }
    abstract protected void writeMessage(String message);
}
