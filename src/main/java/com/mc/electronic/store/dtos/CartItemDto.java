package com.mc.electronic.store.dtos;

import lombok.*;

import javax.persistence.*;

import com.mc.electronic.store.entities.Cart;
import com.mc.electronic.store.entities.CartItem;
import com.mc.electronic.store.entities.Product;
import com.mc.electronic.store.entities.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartItemDto {

    private int cartItemId;
    private ProductDto product;
    private int quantity;
    private int totalPrice;

}
