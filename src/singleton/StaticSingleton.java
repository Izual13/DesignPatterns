package singleton;

/**
 * Created by izual on 11.10.14.
 *
 * Простая и прозрачная реализация
 * Потокобезопасность
 * Не ленивая инициализация
 */
public class StaticSingleton {
    private static final StaticSingleton INSTANCE = new StaticSingleton();

}
