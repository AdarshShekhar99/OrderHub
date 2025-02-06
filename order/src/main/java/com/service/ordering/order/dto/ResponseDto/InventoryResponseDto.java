package com.service.ordering.order.dto.ResponseDto;


import com.service.ordering.order.dto.CartItemDto;
import com.service.ordering.order.dto.InventoryItemDto;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResponseDto {

    public List<InventoryItemDto> inventoryItemList;

    public List<InventoryItemDto> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<CartItemDto> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }
}
