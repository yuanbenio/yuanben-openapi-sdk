<?php

require 'Request.php';

class ArticleBuilder
{
    protected $reqClient;
    protected $errMsg;

    public function __construct($uri, $token, $is_ssl = false)
    {
        if (!isset($uri) || !isset($token)) {
            throw new Exception('Error: uri or token not provided.');
        }

        $this->reqClient = new Request($uri);
        $this->reqClient->setHeader('authorization', 'Bearer ' . $token);
        $this->reqClient->setTimeout(30);
    }

    public function publish($data)
    {
        if (!isset($data['articles']) || !is_array($data['articles'])) {
            throw new Exception('Error: the data type is invalid');
        }

		$this->reqClient->setRequestType('POST');
        $this->reqClient->setPostFields(http_build_query($data));
		$this->reqClient->execute();

        $httpCode = $this->reqClient->getHttpCode();

        $responseBody = $this->reqClient->getResponse();

        if ($httpCode != 200) {
            $this->errMsg = $responseBody;
            return false;
        }

        return $responseBody;
    }

    public function getErrMsg()
    {
        return $this->errMsg;
    }
}