package com.microservice.Bdki.buypay.entities;
import com.microservice.Bdki.buypay.entities.constants.ERole;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "m_role")
public class Role {
    @Id
    @GenericGenerator(strategy = "uuid2", name="system-uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "role_id")
    private String id;

    @Enumerated(EnumType.STRING)
    private ERole role;
}
