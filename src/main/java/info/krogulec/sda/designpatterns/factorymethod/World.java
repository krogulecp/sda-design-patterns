package info.krogulec.sda.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class World {

    private EnemyFactory enemyFactory;

    public World(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    void createWorld(){
        //TODO
    }
}
