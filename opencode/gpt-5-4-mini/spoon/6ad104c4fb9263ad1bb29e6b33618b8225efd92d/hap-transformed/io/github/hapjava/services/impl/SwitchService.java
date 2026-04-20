package io.github.hapjava.services.impl;
import io.github.hapjava.accessories.SwitchAccessory;
import io.github.hapjava.accessories.optionalcharacteristic.AccessoryWithName;
import io.github.hapjava.characteristics.ExceptionalConsumer;
import io.github.hapjava.characteristics.HomekitCharacteristicChangeCallback;
import io.github.hapjava.characteristics.impl.common.NameCharacteristic;
import io.github.hapjava.characteristics.impl.common.OnCharacteristic;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
/**
 * This service describes a binary switch.
 */
public class SwitchService extends AbstractServiceImpl {
    public SwitchService(OnCharacteristic onState) {
        super("00000049-0000-1000-8000-0026BB765291");
        addCharacteristic(onState);
    }

    public SwitchService(SwitchAccessory accessory) {
        this(new OnCharacteristic(accessory::getSwitchState, accessory::setSwitchState, accessory::subscribeSwitchState, accessory::unsubscribeSwitchState));
        if (accessory instanceof AccessoryWithName) {
            addOptionalCharacteristic(new NameCharacteristic(((AccessoryWithName) (accessory))::getName));
        }
    }

    public void addOptionalCharacteristic(NameCharacteristic name) {
        addCharacteristic(name);
    }
}
