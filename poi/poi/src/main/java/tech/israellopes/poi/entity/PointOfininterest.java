package tech.israellopes.poi.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_points_of_interest")
public class PointOfininterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long x;

    private Long y;


    // Construtot Vazio
    public PointOfininterest() {
    }


    //Construtot sem o primeiro parametro
    public PointOfininterest(String name, Long x, Long y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    //Construtot get e sets
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }
}
