package ru.mirea.exercise7;

public class AkitaInu extends Dog {
    int age, weight;
    String name;

    public AkitaInu(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public void Bark() {
        System.out.println(name + ": Wooooof");
    }
}
