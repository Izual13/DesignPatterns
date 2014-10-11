package singleton;

/**
 * Created by izual on 11.10.14.
 *
 * Ленивая инициализация
 * Высокая производительность
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance;

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
