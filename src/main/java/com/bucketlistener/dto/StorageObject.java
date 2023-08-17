package com.bucketlistener.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageObject {

    @SerializedName("kind")
    private String kind;

    @SerializedName("id")
    private String id;

    @SerializedName("selfLink")
    private String selfLink;

    @SerializedName("name")
    private String name;

    @SerializedName("bucket")
    private String bucket;

    @SerializedName("generation")
    private String generation;

    @SerializedName("metageneration")
    private String metageneration;

    @SerializedName("contentType")
    private String contentType;

    @SerializedName("timeCreated")
    private String timeCreated;

    @SerializedName("updated")
    private String updated;

    @SerializedName("storageClass")
    private String storageClass;

    @SerializedName("timeStorageClassUpdated")
    private String timeStorageClassUpdated;

    @SerializedName("size")
    private String size;

    @SerializedName("md5Hash")
    private String md5Hash;

    @SerializedName("mediaLink")
    private String mediaLink;

    @SerializedName("crc32c")
    private String crc32c;

    @SerializedName("etag")
    private String etag;

}
