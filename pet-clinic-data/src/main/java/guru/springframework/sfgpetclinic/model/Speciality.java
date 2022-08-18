package guru.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {
    private String description;

    public String getDesription() {
        return description;
    }
    public void setDesription(String desription) {
        this.description = desription;
    }
}
