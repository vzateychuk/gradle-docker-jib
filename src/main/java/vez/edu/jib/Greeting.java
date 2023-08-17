package vez.edu.jib;

public class Greeting {

    private final long counter;
    private final String greet;

    public Greeting(long counter, String greet) {
        this.counter = counter;
        this.greet = greet;
    }

    public long getCounter() {
        return counter;
    }

    public String getGreet() {
        return greet;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "counter=" + counter +
                ", greet='" + greet + '\'' +
                '}';
    }
}
