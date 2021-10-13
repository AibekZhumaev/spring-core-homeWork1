package peaksoft;

public class Wolf implements Animal {
    private String name;
    private int age;
    private String breed;

    public Wolf() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println(" ++ ");
    }

    @Override
    public void animalMinus() {
        System.out.println(" -- ");
    }
}
