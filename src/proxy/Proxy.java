package proxy;

/**
 * Created by izual on 11.10.14.
 */
public class Proxy implements Target {
    private Surrogate surrogate;

    @Override
    public Object targetMethod() {
        return surrogate.targetMethod();
    }
}
