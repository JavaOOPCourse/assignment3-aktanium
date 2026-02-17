public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium = false;

    // TODO: constructor
    public CloudStorageService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (!isActive()) {
            System.out.println("Cloud storage unavailable.");
            return;
        }

        System.out.println("Accessing cloud storage...");

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        premium = true;
        System.out.println("Cloud upgraded to premium storage!");
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Cloud usage bill generated.");
    }
}