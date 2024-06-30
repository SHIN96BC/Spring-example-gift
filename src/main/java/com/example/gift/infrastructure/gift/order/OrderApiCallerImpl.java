package com.example.gift.infrastructure.gift.order;

import com.example.gift.domain.gift.GiftCommand;
import com.example.gift.domain.gift.order.OrderApiCaller;
import com.example.gift.domain.gift.order.OrderApiCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderApiCallerImpl implements OrderApiCaller {

    @Override
    public String registerGiftOrder(OrderApiCommand.Register request) {
        return null;
    }

    @Override
    public void updateReceiverInfo(String orderToken, GiftCommand.Accept request) {

    }

}
