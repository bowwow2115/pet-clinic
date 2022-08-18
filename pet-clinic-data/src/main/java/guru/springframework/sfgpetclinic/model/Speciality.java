package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;

@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    public String getDesription() {
        return description;
    }
    public void setDesription(String desription) {
        this.description = desription;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
}
