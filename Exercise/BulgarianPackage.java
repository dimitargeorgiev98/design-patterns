package Exercise;

public class BulgarianPackage extends Package {

    public BulgarianPackage() {
        this.level = Package.BULGARIAN;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Message: " + message);
    }

}
