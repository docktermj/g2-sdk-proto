<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2engine.proto

namespace G2engine;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2engine.WhyEntityByRecordIDRequest</code>
 */
class WhyEntityByRecordIDRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string dataSourceCode = 1;</code>
     */
    protected $dataSourceCode = '';
    /**
     * Generated from protobuf field <code>string recordID = 2;</code>
     */
    protected $recordID = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $dataSourceCode
     *     @type string $recordID
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Engine::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode = 1;</code>
     * @return string
     */
    public function getDataSourceCode()
    {
        return $this->dataSourceCode;
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDataSourceCode($var)
    {
        GPBUtil::checkString($var, True);
        $this->dataSourceCode = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string recordID = 2;</code>
     * @return string
     */
    public function getRecordID()
    {
        return $this->recordID;
    }

    /**
     * Generated from protobuf field <code>string recordID = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setRecordID($var)
    {
        GPBUtil::checkString($var, True);
        $this->recordID = $var;

        return $this;
    }

}

