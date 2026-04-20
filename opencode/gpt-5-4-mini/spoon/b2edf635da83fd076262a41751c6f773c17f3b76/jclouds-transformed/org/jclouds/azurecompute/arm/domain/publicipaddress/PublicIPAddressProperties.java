/* Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.jclouds.azurecompute.arm.domain.publicipaddress;
import org.jclouds.azurecompute.arm.domain.DnsSettings;
import org.jclouds.azurecompute.arm.domain.IdReference;
import org.jclouds.azurecompute.arm.domain.Provisionable;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;
import com.google.auto.value.AutoValue;
@AutoValue
public abstract class PublicIPAddressProperties implements Provisionable {
    // needs to be nullable to create the payload for create request
    @Nullable
    public abstract String provisioningState();

    // only set in succeeded provisioningState for Static IP and for Dynamic when attached to a NIC
    @Nullable
    public abstract String ipAddress();

    public abstract String publicIPAllocationMethod();

    @Nullable
    public abstract Integer idleTimeoutInMinutes();

    // only if attached to NIC
    @Nullable
    public abstract IdReference ipConfiguration();

    // only if DNS name is set
    @Nullable
    public abstract DnsSettings dnsSettings();

    @SerializedNames({ "provisioningState", "ipAddress", "publicIPAllocationMethod", "idleTimeoutInMinutes", "ipConfiguration", "dnsSettings" })
    public static PublicIPAddressProperties create(final String provisioningState, final String ipAddress, final String publicIPAllocationMethod, final Integer idleTimeoutInMinutes, final IdReference ipConfiguration, final DnsSettings dnsSettings) {
        return builder().provisioningState(provisioningState).ipAddress(ipAddress).publicIPAllocationMethod(publicIPAllocationMethod).idleTimeoutInMinutes(idleTimeoutInMinutes).ipConfiguration(ipConfiguration).dnsSettings(dnsSettings).publicIPAllocationMethod(publicIPAllocationMethod).dnsSettings(dnsSettings).build();
    }

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_PublicIPAddressProperties.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder provisioningState(String provisioningState);

        public abstract Builder ipAddress(String ipAddress);

        public abstract Builder publicIPAllocationMethod(String publicIPAllocationMethod);

        public abstract Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes);

        public abstract Builder ipConfiguration(IdReference ipConfiguration);

        public abstract Builder dnsSettings(DnsSettings dnsSettings);

        public abstract PublicIPAddressProperties build();
    }
}
