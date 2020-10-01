package ru.mirea.exercise7;

public class Korgi extends Dog{
    int age, weight;
    String name;

    public Korgi(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public void Play(){
        System.out.println(name + " бежит за мячом");
    }

    @Override
    public void Bark() {
        System.out.println(name +": Woof woof woof");
    }
}
