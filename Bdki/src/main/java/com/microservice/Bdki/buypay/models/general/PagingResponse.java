package com.microservice.Bdki.buypay.models.general;

import lombok.*;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Builder(toBuilder = true)
public class PagingResponse {
    private Integer currentPage;
    private Integer totalPage;
    private Integer size;
}
