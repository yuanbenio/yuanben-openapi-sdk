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

/**
 * @description 授权协议具体参数
 */

public class LicenseParameters implements Serializable {
    // 是否允许演绎，对于商业协议，可选'y'或者'n'，对于CC协议，可选'y','n'或者'sa' ('sa'表示相同方式共享)
    private String adaptation;
    // 是否允许商业使用， 'y'或者'n'
    private String commercial;
    // 商业协议的授权转载价格，单位为“分”
    private int price;

    public String getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(String adaptation) {
        this.adaptation = adaptation;
    }

    public String getCommercial() {
        return commercial;
    }

    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
