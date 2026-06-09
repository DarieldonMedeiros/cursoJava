package entities;

@SuppressWarnings("unused")
public class Department {

    private String name;

    // Construtor padrão
    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
