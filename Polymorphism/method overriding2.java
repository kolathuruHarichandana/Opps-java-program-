class Restaurant {
    void serveFood() {
        System.out.println("Serving basic food.");
    }
}

class IndianCuisine extends Restaurant {
    @Override
    void serveFood() {
        System.out.println("Serving: Butter Chicken with Naan.");
    }
}

class ChineseCuisine extends Restaurant {
    @Override
    void serveFood() {
        System.out.println("Serving: Veg Manchurian with Fried Rice.");
    }
}

class ItalianCuisine extends Restaurant {
    @Override
    void serveFood() {
        System.out.println("Serving: Pasta Alfredo with Garlic Bread.");
    }
}

public class F {
    public static void main(String[] args) {
        Restaurant r;

        r = new IndianCuisine();
        r.serveFood();

        r = new ChineseCuisine();
        r.serveFood();

        r = new ItalianCuisine();
        r.serveFood();
    }
}
