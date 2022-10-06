<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2engine.proto

namespace G2engine;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2engine.WhyEntitiesRequest</code>
 */
class WhyEntitiesRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 entityID1 = 1;</code>
     */
    protected $entityID1 = 0;
    /**
     * Generated from protobuf field <code>int64 entityID2 = 2;</code>
     */
    protected $entityID2 = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $entityID1
     *     @type int|string $entityID2
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Engine::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 entityID1 = 1;</code>
     * @return int|string
     */
    public function getEntityID1()
    {
        return $this->entityID1;
    }

    /**
     * Generated from protobuf field <code>int64 entityID1 = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setEntityID1($var)
    {
        GPBUtil::checkInt64($var);
        $this->entityID1 = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 entityID2 = 2;</code>
     * @return int|string
     */
    public function getEntityID2()
    {
        return $this->entityID2;
    }

    /**
     * Generated from protobuf field <code>int64 entityID2 = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setEntityID2($var)
    {
        GPBUtil::checkInt64($var);
        $this->entityID2 = $var;

        return $this;
    }

}

