package io.github.hapjava.services.impl;
import io.github.hapjava.accessories.OutletAccessory;
import io.github.hapjava.accessories.optionalcharacteristic.AccessoryWithName;
import io.github.hapjava.characteristics.ExceptionalConsumer;
import io.github.hapjava.characteristics.HomekitCharacteristicChangeCallback;
import io.github.hapjava.characteristics.impl.common.NameCharacteristic;
import io.github.hapjava.characteristics.impl.common.OnCharacteristic;
import io.github.hapjava.characteristics.impl.outlet.OutletInUseCharacteristic;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
/**
 * This service describes a power outlet.
 */
public class OutletService extends AbstractServiceImpl {
    public OutletService(OnCharacteristic onState, OutletInUseCharacteristic outletInUse) {
        super("00000047-0000-1000-8000-0026BB765291");
        addCharacteristic(onState);
        addCharacteristic(outletInUse);
    }

    public OutletService(OutletAccessory accessory) {
        this(new OnCharacteristic(accessory::getPowerState, accessory::setPowerState, accessory::subscribePowerState, accessory::unsubscribePowerState), new OutletInUseCharacteristic(accessory::getOutletInUse, accessory::subscribeOutletInUse, accessory::unsubscribeOutletInUse));
        if (accessory instanceof AccessoryWithName) {
            addOptionalCharacteristic(new NameCharacteristic(((AccessoryWithName) (accessory))::getName));
        }
    }

    public void addOptionalCharacteristic(NameCharacteristic name) {
        addCharacteristic(name);
    }
}
