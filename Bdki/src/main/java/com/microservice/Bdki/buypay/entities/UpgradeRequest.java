package com.microservice.Bdki.buypay.entities;
import com.microservice.Bdki.buypay.entities.constants.BaseEntity;
import com.microservice.Bdki.buypay.entities.constants.EStatus;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "m_upgrade_request")
public class UpgradeRequest extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private EStatus status;
    private LocalDateTime requestDate;
    private LocalDateTime acceptDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
