package project;

public class Player {
    private Hero hero;

    public Player(Hero hero) {
        this.hero = hero;
    }

    int attackEnemy(){
        return this.hero.attack();
    }

    void usePotion(){
        this.hero.heal();
    }
}
