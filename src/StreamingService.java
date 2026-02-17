public class StreamingService extends Service implements PremiumFeature {

    // TODO: declare premium field
    private boolean premium = false;


    // TODO: constructor
    public StreamingService(String name, int id) {
        super(name, id);
    }


    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if (!isActive()) {
            System.out.println("Streaming unavailable.");
            return;
        }

        System.out.println("Streaming video...");
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        premium = true;
        System.out.println("Streaming upgraded to premium!");
    }
}