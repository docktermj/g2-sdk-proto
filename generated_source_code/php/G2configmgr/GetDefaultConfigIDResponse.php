<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2configmgr.proto

namespace G2configmgr;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2configmgr.GetDefaultConfigIDResponse</code>
 */
class GetDefaultConfigIDResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 configID = 1;</code>
     */
    protected $configID = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $configID
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Configmgr::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 configID = 1;</code>
     * @return int|string
     */
    public function getConfigID()
    {
        return $this->configID;
    }

    /**
     * Generated from protobuf field <code>int64 configID = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setConfigID($var)
    {
        GPBUtil::checkInt64($var);
        $this->configID = $var;

        return $this;
    }

}

