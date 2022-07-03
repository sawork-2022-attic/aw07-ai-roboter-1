package com.micropos.mapper;


import com.micropos.model.Cart;
import com.micropos.dto.CartDto;
import org.mapstruct.Mapper;

@Mapper
public interface CartMapper {
    CartDto toCartDto(Cart cart);

    Cart toCart(CartDto cartDto);
}
