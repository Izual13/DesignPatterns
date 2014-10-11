package adapter;

/**
 * Created by izual on 11.10.14.
 */
public class AdapterWithExtender implements Target {
    private Surrogate surrogate;

    @Override
    public Object targetMethod() {
        if (surrogate == null) {
            surrogate = new Surrogate();
        }
        return surrogate.surrogateMethod();
    }
}
