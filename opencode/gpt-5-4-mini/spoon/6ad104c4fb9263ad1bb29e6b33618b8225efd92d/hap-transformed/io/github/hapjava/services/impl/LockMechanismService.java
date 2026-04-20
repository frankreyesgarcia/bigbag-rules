package io.github.hapjava.services.impl;
import io.github.hapjava.accessories.LockMechanismAccessory;
import io.github.hapjava.accessories.optionalcharacteristic.AccessoryWithName;
import io.github.hapjava.characteristics.ExceptionalConsumer;
import io.github.hapjava.characteristics.HomekitCharacteristicChangeCallback;
import io.github.hapjava.characteristics.impl.common.NameCharacteristic;
import io.github.hapjava.characteristics.impl.lock.LockCurrentStateCharacteristic;
import io.github.hapjava.characteristics.impl.lock.LockCurrentStateEnum;
import io.github.hapjava.characteristics.impl.lock.LockTargetStateCharacteristic;
import io.github.hapjava.characteristics.impl.lock.LockTargetStateEnum;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
/**
 * The Lock Mechanism Service describes the physical lock mechanism on a device.
 */
public class LockMechanismService extends AbstractServiceImpl {
    public LockMechanismService(LockCurrentStateCharacteristic lockCurrentState, LockTargetStateCharacteristic lockTargetState) {
        super("00000045-0000-1000-8000-0026BB765291");
        addCharacteristic(lockCurrentState);
        addCharacteristic(lockTargetState);
    }

    public LockMechanismService(LockMechanismAccessory accessory) {
        this(new LockCurrentStateCharacteristic(accessory::getLockCurrentState, accessory::subscribeLockCurrentState, accessory::unsubscribeLockCurrentState), new LockTargetStateCharacteristic(accessory::getLockTargetState, accessory::setLockTargetState, accessory::subscribeLockTargetState, accessory::unsubscribeLockTargetState));
        if (accessory instanceof AccessoryWithName) {
            addOptionalCharacteristic(new NameCharacteristic(((AccessoryWithName) (accessory))::getName));
        }
    }

    public void addOptionalCharacteristic(NameCharacteristic name) {
        addCharacteristic(name);
    }
}
