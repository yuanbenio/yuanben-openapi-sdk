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
 * @description 发布文章：单篇文章信息
 */

public class ArticleReq implements Serializable {
    // 文章ID
    @JSONField(name = "client_id")
    private long clientID;
    // 文章标题
    private String title;
    // 文章内容
    private String content;
    // 文章是否对外开放。如果设置为true，则文章不对其他用户开放，默认false
    private boolean closed;
    // 文章原本发布地址
    @JSONField(name = "original_url")
    private String originalURL;
    // 文章原文发布时间抽
    @JSONField(name = "original_publish_time")
    private long originalPublishTime;
    // 授权协议
    private License license;

    public boolean isClosed() {
        return closed;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }

    public long getOriginalPublishTime() {
        return originalPublishTime;
    }

    public void setOriginalPublishTime(long originalPublishTime) {
        this.originalPublishTime = originalPublishTime;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
