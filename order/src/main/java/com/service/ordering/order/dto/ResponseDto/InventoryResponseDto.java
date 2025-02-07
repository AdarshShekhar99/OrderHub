package com.service.ordering.order.dto.ResponseDto;


import com.service.ordering.order.dto.CartItemDto;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResponseDto {

    public List<CartItemDto> inventoryItemList;

    public List<CartItemDto> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<CartItemDto> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }
}
