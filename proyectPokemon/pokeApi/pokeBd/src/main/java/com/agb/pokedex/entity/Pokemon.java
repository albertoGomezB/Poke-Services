package com.agb.pokedex.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "attack")
    private int attack;

    @Column(name = "def")
    private int def;

    @Column(name = "ps")
    private int ps;

    @Column(name = "special_attack")
    private int special_attack;

    @Column(name = "special_def")
    private int special_def;

    @Column(name = "speed")
    private int speed;

    public Pokemon() {

    }

    public Pokemon(int id, String name, int attack, int def, int ps, int special_attack, int special_def, int speed) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.def = def;
        this.ps = ps;
        this.special_attack = special_attack;
        this.special_def = special_def;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {

        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", def=" + def +
                ", ps=" + ps +
                ", special_attack=" + special_attack +
                ", special_def=" + special_def +
                ", speed=" + speed +
                '}';
    }
}