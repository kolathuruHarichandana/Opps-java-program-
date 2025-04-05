class Travel {
    void travelDetails() {
        System.out.println("General travel details.");
    }
}

class Bus extends Travel {
    @Override
    void travelDetails() {
        System.out.println("Bus: AC Seater, ₹300 per ticket.");
    }
}

class Train extends Travel {
    @Override
    void travelDetails() {
        System.out.println("Train: Sleeper Class, ₹150 per ticket.");
    }
}

class Flight extends Travel {
    @Override
    void travelDetails() {
        System.out.println("Flight: Economy Class, ₹1500 per ticket.");
    }
}

public class F {
    public static void main(String[] args) {
        Travel t;

        t = new Bus();
        t.travelDetails();

        t = new Train();
        t.travelDetails();

        t = new Flight();
        t.travelDetails();
    }
