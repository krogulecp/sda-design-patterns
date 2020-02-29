package info.krogulec.sda.designpatterns.factorymethod;

import java.util.stream.IntStream;

/**
 * @author krogulecp
 */
class World {

    private EnemyFactory enemyFactory;

    public World(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    void createWorld(){
        IntStream.iterate(0, i -> i + 1)
                .forEach(i -> System.out.println(enemyFactory.createEnemy()));
    }
}
