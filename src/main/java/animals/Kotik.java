package main.java.animals;

public class Kotik {
    private String name     = "";
    private String voice    = "";
    private int satiety     = 0;
    private double weight   = 0.0;

    private static int count = 0;

    private static final int METHODS = 5;

    // Constructors for Kotik
    public Kotik(String name, String voice, int satiety, double weight) {
        this.name       = name;
        this.voice      = voice;
        this.satiety    = satiety;
        this.weight     = weight;

        count++;
    }

    public Kotik() {
        count++;
    }

    // Methods with animal behavior
    boolean play() {
        if (this.satiety > 0) {
            this.satiety--;

            return true;
        } else {
            return false;
        }
    }

    boolean sleep() {
        if (this.satiety > 0) {
            this.satiety--;

            return true;
        } else {
            return false;
        }
    }

    boolean wash() {
        if (this.satiety > 0) {
            this.satiety--;

            return true;
        } else {
            return false;
        }
    }

    boolean walk() {
        if (this.satiety > 0) {
            this.satiety--;

            return true;
        } else {
            return false;
        }
    }

    boolean hunt() {
        if (this.satiety > 0) {
            this.satiety--;

            return true;
        } else {
            return false;
        }
    }

    void eat(int satiety) {
    }

    void eat(int satiety, String foodName) {
        this.satiety++;
    }

    void eat() {
        eat(satiety, "");
    }

    public String[] liveAnotherDay() {
        String[] kotikDay = new String[24];

        for (int i = 0; i < 24; i++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (play()) {
                        kotikDay[i] = Integer.toString(i) + " - играл";
                    } else {
                        kotikDay[i] = Integer.toString(i) + " - ел";
                        eat();
                    }
                    break;
                case 2:
                    if (sleep()) {
                        kotikDay[i] = Integer.toString(i) + " - спал";
                    } else {
                        kotikDay[i] = Integer.toString(i) + " - ел";
                        eat();
                    }
                    break;
                case 3:
                    if (wash()) {
                        kotikDay[i] = Integer.toString(i) + " - мылся";
                    } else {
                        kotikDay[i] = Integer.toString(i) + " - ел";
                        eat();
                    }
                    break;
                case 4:
                    if (walk()) {
                        kotikDay[i] = Integer.toString(i) + " - гулял";
                    } else {
                        kotikDay[i] = Integer.toString(i) + " - ел";
                        eat();
                    }
                    break;
                case 5:
                    if (hunt()) {
                    kotikDay[i] = Integer.toString(i) + " - охотился";
                    } else {
                        kotikDay[i] = Integer.toString(i) + " - ел";
                        eat();
                    }
                    break;
            }
        }

        return kotikDay;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("У котика должно быть имя!");
        }
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Котики столько не весят!");
        }
    }

    public int getCount() {
        return count;
    }

    public int getMethods() {
        return METHODS;
    }
}
