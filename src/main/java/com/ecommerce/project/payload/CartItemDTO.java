package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {
    private Long cartId;
    private CartDTO cart;
    private ProductDTO productDTO;
    private Integer quantiy;
    private Double discount;
    private Double productPrice;

}
