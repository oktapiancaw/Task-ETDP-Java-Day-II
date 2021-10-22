package project;

public interface Hero {
    int MAX_HEALTH = 100;
    int MIN_HEALTH = 0;

    int attacked(int damage);
    int attack();
    void heal();
}
