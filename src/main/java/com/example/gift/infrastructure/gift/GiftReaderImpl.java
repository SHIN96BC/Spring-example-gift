package com.example.gift.infrastructure.gift;

import com.example.gift.domain.gift.Gift;
import com.example.gift.domain.gift.GiftReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GiftReaderImpl implements GiftReader {

    @Override
    public Gift getGiftBy(String giftToken) {
        return null;
    }

    @Override
    public Gift getGiftByOrderToken(String orderToken) {
        return null;
    }

}
