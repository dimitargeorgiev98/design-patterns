package Exercise;

public class ForeignPackage extends Package {

    public ForeignPackage() {
        this.level = Package.FOREIGN;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Message: " + message);
    }


}
