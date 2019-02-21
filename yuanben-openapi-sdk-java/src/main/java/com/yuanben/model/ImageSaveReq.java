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

import java.io.Serializable;
import java.util.List;

/**
 * @description 发布图片： 推送信息ITEM
 */

public class ImageSaveReq implements Serializable {
    private List<ImageReq> images;

    public List<ImageReq> getImages() {
        return images;
    }

    public void setImages(List<ImageReq> images) {
        this.images = images;
    }
}
