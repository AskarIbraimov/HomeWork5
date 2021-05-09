package com.GeekTech;

public class Hero {
    private int health;
    private  int damage;
    private String ultimate;

    public Hero (int healt, int damage, String ultimate){
        this.health = healt;
        this.damage = damage;
        this.ultimate = ultimate;

    }
    public Hero (int healt, int damage){
        this.health = healt;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getUltimate() {
        return ultimate;
    }
}
