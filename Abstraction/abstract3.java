abstract class License {
    abstract void issueLicense();
    public void verifyDocuments() {
        System.out.println("Documents verified successfully.");
    }
}
class CarLicense extends License {
    void issueLicense() {
        System.out.println("Car Driving License Issued.");
        verifyDocuments();
    }
}
class BikeLicense extends License {
    void issueLicense() {
        System.out.println("Bike Driving License Issued.");
        verifyDocuments();
    }
}
public class S {
    public static void main(String[] args) {
        License license1 = new CarLicense();
        license1.issueLicense();
        License license2 = new BikeLicense();
        license2.issueLicense();
    }
}
