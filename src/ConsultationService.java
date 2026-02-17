public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (!isActive()) {
            System.out.println("Consultation unavailable.");
            return;
        }

        System.out.println("Starting online consultation...");
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Consultation bill generated.");
    }
}