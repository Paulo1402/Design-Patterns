import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Robot;
import strategy.behavior.AgressiveBehavior;
import strategy.behavior.Behavior;
import strategy.behavior.DefensiveBehavior;
import strategy.behavior.NormalBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        singletonPattern();
        System.out.println();

        strategyPattern();
        System.out.println();
        
        facadePattern();
    }

    private static void singletonPattern() {
        // Lazy
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        // Eager
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

        // Lazy Holder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }

    private static void strategyPattern() {
        Behavior defensiveBehavior = new DefensiveBehavior();
        Behavior normalBehavior = new NormalBehavior();
        Behavior agressiveBehavior = new AgressiveBehavior();
        
        Robot robot = new Robot();

        robot.setBehavior(normalBehavior);
        robot.move();
        robot.move();

        robot.setBehavior(defensiveBehavior);
        robot.move();

        robot.setBehavior(agressiveBehavior);
        robot.move();
        robot.move();
        robot.move();
    }

    private static void facadePattern() {
        Facade facade = new Facade();
        facade.migrateClient("Paulo", "82510170");
    }

}
