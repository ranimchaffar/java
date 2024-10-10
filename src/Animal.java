public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructor with validation for age and name
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        setName(name);  // Use setter to validate name
        setAge(age);    // Use setter to validate age
        this.isMammal = isMammal;
    }

    // Getters and setters with validation
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Animal name cannot be empty.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
