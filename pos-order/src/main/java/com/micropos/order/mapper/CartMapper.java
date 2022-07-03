package com.micropos.order.mapper;


import com.micropos.dto.CartDto;
import com.micropos.model.Cart;
import org.mapstruct.Mapper;

@Mapper
public interface CartMapper {
    CartDto toCartDto(Cart cart);

    Cart toCart(CartDto cartDto);
}
