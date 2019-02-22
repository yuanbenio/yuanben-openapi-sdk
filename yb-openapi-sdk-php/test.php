<?php

/**
 * yuanben-openapi-sdk-php-test
 * @link https://github.com/yuanbenio/yb-openapi-docs
 */


/**
 * License demo
 * CC : {"type":"cc","content":{"adaptation":"y","commercial":"n"}}
 * CM : {"type":"cm","content":{"adaptation":"y","price":1000}}
 */

require 'ArticleBuilder.php';

$uri = 'http://openapi.staging.yuanben.site/v1/media/articles';

$token = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImQ0NDBiNTYxYWZhM2NmMjExMTY0M2E5YWIzM2Q3Y2JhZTcxY2JkOGU5MTRkNjk1OTBkZjFjZjY5MzQyMDZjOWJiMzE4ZmRkYTk5MzU2ODBhIn0.eyJhdWQiOiIxIiwianRpIjoiZDQ0MGI1NjFhZmEzY2YyMTExNjQzYTlhYjMzZDdjYmFlNzFjYmQ4ZTkxNGQ2OTU5MGRmMWNmNjkzNDIwNmM5YmIzMThmZGRhOTkzNTY4MGEiLCJpYXQiOjE1NDQ1MTc5MzIsIm5iZiI6MTU0NDUxNzkzMiwiZXhwIjoxODYwMTM3MTMxLCJzdWIiOiIzNjc1Iiwic2NvcGVzIjpbIm1lZGlhIl19.JnsLDSFvqIH94LgXmujjLNhtkejQK4RtGLLedB91cqSlo4HI_dd8gJzw0qZJCA_VVMT54Bd93t8nabh79-nC-L2wKFgHRKyz1U9pa_pKCZcpfkOwe4QG3YKnLsoqO5kINWuy9eX-Zi0zw0zHBZ9lrlR9ePEJPrSVHe_GsfZ7g0urthrqBV2TXTj8GRBgXlTuJzeW1QWnHONrwd1ofQ-Z9l4JlOUy9LdVXyfCH644GgqRjTo18jFit9Y2VZqP6ySY0mMA635DQgYhyZsdkRZ9mJDkMfp9hfyI31rGOWP3iGuTg36RlLr3Olq6c5J6Q3_qvTVpVj3dz6C1-NA_VA4FfA3y80pwWGnXhJYCuKPSKw6wKZ9MKM1e3tH5EIiICGMz7KXJlac6_NVL037-hrKqdso1VxWWAGzSH_tU4Ska_90I6lUKmTfcmvFoF9fln6_aj98B8klC8rXNzwJjxSFT1JM8a6mB9pvZZJrsrhYn9g9G-skstpn1Mfz0XbumxR4inMBhh-_n171PkkrpbF4rsX1voID5zBFqQyIpFFGC8EBfVviyo9rbg_r5FbVrjoVI_BK6HvHjxFIxIwjtst4fNlQo8XQpRIiKU3bh-AAMIFu6j64MUsJWKdkHdcobpuFvjRB9ynQtiHPq-ojlmbF2uai9sRwDtnBoVJB8XCnzrNw';


$builder = new ArticleBuilder($uri, $token);

$testPostData = [
    // 多维数组
    'articles' => [
        [
            'client_id' => 1,  // 自定义,返回数据会与这个client_id 对应
            'title' => '测试',   // must
            'content' => '<p>测试openapi文章是否成功</p>>', //must
            'closed' => false,       // 可选项，默认false
            'original_url' => 'http://test/test',   // 可选项，原文地址
            'original_publish_time' => time(),      // 可选项，原文发布时间
            'license' => [
                'type' => 'cm',
                'content' => [
                    'adaptation' => 'y', // y or n
                    'price' => 1000,  // > 0 int
                ]
            ]
        ],
    ]
];

$res = $builder->publish($testPostData);

$data = json_decode($res, true);

if (!is_array($data)) {
    $errMsg = $builder->getErrMsg();
    echo $errMsg . PHP_EOL;
} else {
    var_dump($data);
}


