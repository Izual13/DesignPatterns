package adapter;

/**
 * Created by izual on 11.10.14.
 */
public class AdapterWithInterface extends Surrogate implements Target{

    @Override
    public Object targetMethod() {
        return this.surrogateMethod();
    }

}
