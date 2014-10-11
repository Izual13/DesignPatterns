package singleton;

/**
 * Created by izual on 11.10.14.
 *
 * Ленивая инициализация
 * Высокая производительность
 * Невозможно использовать для не статических полей класса
 */
public class LazyStaticClassSingleton {
    public static class StaticSingleton {
        public static final LazyStaticClassSingleton INSTANCE = new LazyStaticClassSingleton();
    }

    public static LazyStaticClassSingleton getInstance() {
        return StaticSingleton.INSTANCE;
    }
}
