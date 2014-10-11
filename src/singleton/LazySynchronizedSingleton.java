package singleton;

/**
 * Created by izual on 11.10.14.
 *
 * Ленивая инициализация
 * Низкая производительность (критическая секция) в наиболее типичном доступе
 */
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton instance;

    public static synchronized LazySynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new LazySynchronizedSingleton();
        }
        return instance;
    }
}
