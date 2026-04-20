package com.wire.lithium;
import com.wire.xenon.WireAPI;
import com.wire.xenon.WireClientBase;
import com.wire.xenon.backend.models.NewBot;
import com.wire.xenon.crypto.Crypto;
public class BotClient extends WireClientBase {
    public BotClient(WireAPI api, Crypto crypto, NewBot state) {
        super(api, crypto, state);
    }
}
