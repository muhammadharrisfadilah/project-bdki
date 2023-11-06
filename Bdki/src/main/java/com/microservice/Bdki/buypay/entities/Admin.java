package com.microservice.Bdki.buypay.entities;
import com.microservice.Bdki.buypay.entities.constants.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "m_admin")
public class Admin extends BaseEntity {

    private String name;

    private String email;

    private String payCode;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @OneToOne
    @JoinColumn(name = "user_credential_id")
    private UserCredential userCredential;

    @Column(columnDefinition = "decimal(10) default 0")
    private BigDecimal profit;
}
