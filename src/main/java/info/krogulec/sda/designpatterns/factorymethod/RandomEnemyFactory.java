package info.krogulec.sda.designpatterns.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author krogulecp
 */
class RandomEnemyFactory implements EnemyFactory {

    private final Map<Integer,Class<? extends Enemy>> enemies = new HashMap<>();
    private final Random random;

    public RandomEnemyFactory() {
        enemies.put(0, Psycho.class);
        enemies.put(1,Solidier.class);
        enemies.put(2, Zombie.class);
        random = new Random();
    }

    @Override
    public Enemy createEnemy() {
        int enemyKey = random.nextInt(3);
        Class<? extends Enemy> enemyClass = enemies.get(enemyKey);

        Enemy enemy = null;
        try {
            enemy = enemyClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return enemy;
    }
}
