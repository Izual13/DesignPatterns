package proxy;

/**
 * Created by izual on 11.10.14.
 */
public class Surrogate implements Target {
    @Override
    public Object targetMethod() {
        return new Object();
    }
}
