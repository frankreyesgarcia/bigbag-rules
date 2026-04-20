package com.wire.lithium.models;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wire.xenon.models.otr.PreKey;
import java.util.ArrayList;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewBotResponseModel {
    @JsonProperty
    public String name;

    @JsonProperty("accent_id")
    public Integer accentId;

    @JsonProperty("last_prekey")
    public PreKey lastPreKey;

    @JsonProperty("prekeys")
    public ArrayList<PreKey> preKeys;

    @JsonProperty("assets")
    public ArrayList<Asset> assets;

    public void addAsset(String key, String size) {
        if (assets == null)
            assets = new ArrayList<>();

        Asset asset = new Asset();
        asset.key = key;
        asset.type = "image";
        asset.size = size;
        assets.add(asset);
    }

    public static class Asset {
        @JsonProperty("type")
        public String type;

        @JsonProperty("key")
        public String key;

        @JsonProperty("size")
        public String size;
    }
}
