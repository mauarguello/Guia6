//comentario para un segundo commit
package soda.api.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name = "produ")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Product {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(name="descrip", nullable = false)
private String description;
@Column(name="price", nullable = false)
private double price;
@ManyToOne() @JoinColumn(name = "id_cate")
private Category category;
}