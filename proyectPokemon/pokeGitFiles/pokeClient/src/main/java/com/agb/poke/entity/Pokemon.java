package com.agb.poke.entity;

public class Pokemon {

    private String name;
    private int attack;
    private int def;
    private int ps;
    private int special_attack;
    private int special_def;
    private int speed;

    public Pokemon() {
    }

    public Pokemon(String name, int attack, int def, int ps, int special_attack, int special_def, int speed) {

        this.name = name;
        this.attack = attack;
        this.def = def;
        this.ps = ps;
        this.special_attack = special_attack;
        this.special_def = special_def;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getSpecial_attack() {
        return special_attack;
    }

    public void setSpecial_attack(int special_attack) {
        this.special_attack = special_attack;
    }

    public int getSpecial_def() {
        return special_def;
    }

    public void setSpecial_def(int special_def) {
        this.special_def = special_def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
