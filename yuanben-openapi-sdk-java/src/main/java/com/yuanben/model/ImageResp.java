/*
 * Copyright 2019 Shanghai Qiyin Information Technology Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yuanben.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description 发布图片：单张图片返回信息
 */

public class ImageResp implements Serializable {
    // 发送的ID，原样返回
    @JSONField(name = "client_id")
    private String clientID;
    // 原创认证时使用的公钥（私钥加密后已邮件的形式发送到媒体机构注册时使用的邮箱）
    @JSONField(name = "public_key")
    private String publicKey;
    // 原创认证的数字签名
    private String signature;
    // 图片哈希值
    @JSONField(name = "content_hash")
    private String contentHash;
    // 文章在原本链上的区块地址
    @JSONField(name = "block_hash")
    private String blockHash;
    // 完整原本DNA
    @JSONField(name = "yuanben_id")
    private String yuanbenID;
    // 原本DNA
    @JSONField(name = "short_id")
    private String shortID;
    // 图片在原本的详情页地址
    private String url;

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getContentHash() {
        return contentHash;
    }

    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }

    public String getYuanbenID() {
        return yuanbenID;
    }

    public void setYuanbenID(String yuanbenID) {
        this.yuanbenID = yuanbenID;
    }

    public String getShortID() {
        return shortID;
    }

    public void setShortID(String shortID) {
        this.shortID = shortID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
