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
 * @description 发布图片：返回信息ITEM
 */

public class ImageSaveResp implements Serializable {
    private ImageReturnStatus status;
    private List<ImageSaveItemResp> data;

    public ImageReturnStatus getStatus() {
        return status;
    }

    public void setStatus(ImageReturnStatus status) {
        this.status = status;
    }

    public List<ImageSaveItemResp> getData() {
        return data;
    }

    public void setData(List<ImageSaveItemResp> data) {
        this.data = data;
    }
}
