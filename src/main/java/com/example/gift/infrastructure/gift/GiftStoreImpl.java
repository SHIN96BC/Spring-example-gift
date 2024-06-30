package com.example.gift.infrastructure.gift;

import com.example.gift.domain.gift.Gift;
import com.example.gift.domain.gift.GiftStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GiftStoreImpl implements GiftStore {

    @Override
    public Gift store(Gift gift) {
        return null;
    }

}
