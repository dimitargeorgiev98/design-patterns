package Exercise;

public class PlovdivPackage extends Package {

    public PlovdivPackage() {
        this.level = Package.PLOVDIV;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Message: " + message);
    }

}
