// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** Describes a field within a message.
  *
  * @param type
  *   If type_name is set, this need not be set.  If both this and type_name
  *   are set, this must be one of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
  * @param typeName
  *   For message and enum types, this is the name of the type.  If the name
  *   starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
  *   rules are used to find the type (i.e. first the nested types within this
  *   message are searched, then within the parent, on up to the root
  *   namespace).
  * @param extendee
  *   For extensions, this is the name of the type being extended.  It is
  *   resolved in the same manner as type_name.
  * @param defaultValue
  *   For numeric types, contains the original text representation of the value.
  *   For booleans, "true" or "false".
  *   For strings, contains the default text contents (not escaped in any way).
  *   For bytes, contains the C escaped value.  All bytes &gt;= 128 are escaped.
  *   TODO(kenton):  Base-64 encode?
  * @param oneofIndex
  *   If set, gives the index of a oneof in the containing type's oneof_decl
  *   list.  This field is a member of that oneof.
  * @param jsonName
  *   JSON name of this field. The value is set by protocol compiler. If the
  *   user has set a "json_name" option on this field, that option's value
  *   will be used. Otherwise, it's deduced from the field's name by converting
  *   it to camelCase.
  */
@SerialVersionUID(0L)
final case class FieldDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    number: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    label: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Label] = _root_.scala.None,
    `type`: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Type] = _root_.scala.None,
    typeName: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    extendee: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    defaultValue: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    oneofIndex: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    jsonName: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    options: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[FieldDescriptorProto] with scalapb.lenses.Updatable[FieldDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (number.isDefined) {
        val __value = number.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
      };
      if (label.isDefined) {
        val __value = label.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, __value.value)
      };
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(5, __value.value)
      };
      if (typeName.isDefined) {
        val __value = typeName.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
      };
      if (extendee.isDefined) {
        val __value = extendee.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      if (defaultValue.isDefined) {
        val __value = defaultValue.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
      };
      if (oneofIndex.isDefined) {
        val __value = oneofIndex.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(9, __value)
      };
      if (jsonName.isDefined) {
        val __value = jsonName.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
      };
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      extendee.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      number.foreach { __v =>
        val __m = __v
        _output__.writeInt32(3, __m)
      };
      label.foreach { __v =>
        val __m = __v
        _output__.writeEnum(4, __m.value)
      };
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeEnum(5, __m.value)
      };
      typeName.foreach { __v =>
        val __m = __v
        _output__.writeString(6, __m)
      };
      defaultValue.foreach { __v =>
        val __m = __v
        _output__.writeString(7, __m)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      oneofIndex.foreach { __v =>
        val __m = __v
        _output__.writeInt32(9, __m)
      };
      jsonName.foreach { __v =>
        val __m = __v
        _output__.writeString(10, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FieldDescriptorProto = {
      var __name = this.name
      var __number = this.number
      var __label = this.label
      var __type = this.`type`
      var __typeName = this.typeName
      var __extendee = this.extendee
      var __defaultValue = this.defaultValue
      var __oneofIndex = this.oneofIndex
      var __jsonName = this.jsonName
      var __options = this.options
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readString())
          case 24 =>
            __number = Option(_input__.readInt32())
          case 32 =>
            __label = Option(com.google.protobuf.descriptor.FieldDescriptorProto.Label.fromValue(_input__.readEnum()))
          case 40 =>
            __type = Option(com.google.protobuf.descriptor.FieldDescriptorProto.Type.fromValue(_input__.readEnum()))
          case 50 =>
            __typeName = Option(_input__.readString())
          case 18 =>
            __extendee = Option(_input__.readString())
          case 58 =>
            __defaultValue = Option(_input__.readString())
          case 72 =>
            __oneofIndex = Option(_input__.readInt32())
          case 82 =>
            __jsonName = Option(_input__.readString())
          case 66 =>
            __options = Option(_root_.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.FieldOptions.defaultInstance)))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.FieldDescriptorProto(
          name = __name,
          number = __number,
          label = __label,
          `type` = __type,
          typeName = __typeName,
          extendee = __extendee,
          defaultValue = __defaultValue,
          oneofIndex = __oneofIndex,
          jsonName = __jsonName,
          options = __options,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: FieldDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): FieldDescriptorProto = copy(name = Option(__v))
    def getNumber: _root_.scala.Int = number.getOrElse(0)
    def clearNumber: FieldDescriptorProto = copy(number = _root_.scala.None)
    def withNumber(__v: _root_.scala.Int): FieldDescriptorProto = copy(number = Option(__v))
    def getLabel: com.google.protobuf.descriptor.FieldDescriptorProto.Label = label.getOrElse(com.google.protobuf.descriptor.FieldDescriptorProto.Label.LABEL_OPTIONAL)
    def clearLabel: FieldDescriptorProto = copy(label = _root_.scala.None)
    def withLabel(__v: com.google.protobuf.descriptor.FieldDescriptorProto.Label): FieldDescriptorProto = copy(label = Option(__v))
    def getType: com.google.protobuf.descriptor.FieldDescriptorProto.Type = `type`.getOrElse(com.google.protobuf.descriptor.FieldDescriptorProto.Type.TYPE_DOUBLE)
    def clearType: FieldDescriptorProto = copy(`type` = _root_.scala.None)
    def withType(__v: com.google.protobuf.descriptor.FieldDescriptorProto.Type): FieldDescriptorProto = copy(`type` = Option(__v))
    def getTypeName: _root_.scala.Predef.String = typeName.getOrElse("")
    def clearTypeName: FieldDescriptorProto = copy(typeName = _root_.scala.None)
    def withTypeName(__v: _root_.scala.Predef.String): FieldDescriptorProto = copy(typeName = Option(__v))
    def getExtendee: _root_.scala.Predef.String = extendee.getOrElse("")
    def clearExtendee: FieldDescriptorProto = copy(extendee = _root_.scala.None)
    def withExtendee(__v: _root_.scala.Predef.String): FieldDescriptorProto = copy(extendee = Option(__v))
    def getDefaultValue: _root_.scala.Predef.String = defaultValue.getOrElse("")
    def clearDefaultValue: FieldDescriptorProto = copy(defaultValue = _root_.scala.None)
    def withDefaultValue(__v: _root_.scala.Predef.String): FieldDescriptorProto = copy(defaultValue = Option(__v))
    def getOneofIndex: _root_.scala.Int = oneofIndex.getOrElse(0)
    def clearOneofIndex: FieldDescriptorProto = copy(oneofIndex = _root_.scala.None)
    def withOneofIndex(__v: _root_.scala.Int): FieldDescriptorProto = copy(oneofIndex = Option(__v))
    def getJsonName: _root_.scala.Predef.String = jsonName.getOrElse("")
    def clearJsonName: FieldDescriptorProto = copy(jsonName = _root_.scala.None)
    def withJsonName(__v: _root_.scala.Predef.String): FieldDescriptorProto = copy(jsonName = Option(__v))
    def getOptions: com.google.protobuf.descriptor.FieldOptions = options.getOrElse(com.google.protobuf.descriptor.FieldOptions.defaultInstance)
    def clearOptions: FieldDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.FieldOptions): FieldDescriptorProto = copy(options = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 3 => number.orNull
        case 4 => label.map(_.javaValueDescriptor).orNull
        case 5 => `type`.map(_.javaValueDescriptor).orNull
        case 6 => typeName.orNull
        case 2 => extendee.orNull
        case 7 => defaultValue.orNull
        case 9 => oneofIndex.orNull
        case 10 => jsonName.orNull
        case 8 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => number.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => label.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => `type`.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => typeName.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => extendee.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => defaultValue.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => oneofIndex.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => jsonName.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.FieldDescriptorProto
}

object FieldDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.FieldDescriptorProto, com.google.protobuf.DescriptorProtos.FieldDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.FieldDescriptorProto, com.google.protobuf.DescriptorProtos.FieldDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.FieldDescriptorProto): com.google.protobuf.DescriptorProtos.FieldDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    scalaPbSource.number.foreach(javaPbOut.setNumber)
    scalaPbSource.label.map(com.google.protobuf.descriptor.FieldDescriptorProto.Label.toJavaValue).foreach(javaPbOut.setLabel)
    scalaPbSource.`type`.map(com.google.protobuf.descriptor.FieldDescriptorProto.Type.toJavaValue).foreach(javaPbOut.setType)
    scalaPbSource.typeName.foreach(javaPbOut.setTypeName)
    scalaPbSource.extendee.foreach(javaPbOut.setExtendee)
    scalaPbSource.defaultValue.foreach(javaPbOut.setDefaultValue)
    scalaPbSource.oneofIndex.foreach(javaPbOut.setOneofIndex)
    scalaPbSource.jsonName.foreach(javaPbOut.setJsonName)
    scalaPbSource.options.map(com.google.protobuf.descriptor.FieldOptions.toJavaProto).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.FieldDescriptorProto): com.google.protobuf.descriptor.FieldDescriptorProto = com.google.protobuf.descriptor.FieldDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
    number = if (javaPbSource.hasNumber) Some(javaPbSource.getNumber.intValue) else _root_.scala.None,
    label = if (javaPbSource.hasLabel) Some(com.google.protobuf.descriptor.FieldDescriptorProto.Label.fromJavaValue(javaPbSource.getLabel)) else _root_.scala.None,
    `type` = if (javaPbSource.hasType) Some(com.google.protobuf.descriptor.FieldDescriptorProto.Type.fromJavaValue(javaPbSource.getType)) else _root_.scala.None,
    typeName = if (javaPbSource.hasTypeName) Some(javaPbSource.getTypeName) else _root_.scala.None,
    extendee = if (javaPbSource.hasExtendee) Some(javaPbSource.getExtendee) else _root_.scala.None,
    defaultValue = if (javaPbSource.hasDefaultValue) Some(javaPbSource.getDefaultValue) else _root_.scala.None,
    oneofIndex = if (javaPbSource.hasOneofIndex) Some(javaPbSource.getOneofIndex.intValue) else _root_.scala.None,
    jsonName = if (javaPbSource.hasJsonName) Some(javaPbSource.getJsonName) else _root_.scala.None,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.FieldOptions.fromJavaProto(javaPbSource.getOptions)) else _root_.scala.None
  )
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.FieldDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.FieldDescriptorProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        number = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        label = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.FieldDescriptorProto.Label.fromValue(__e.number)),
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.FieldDescriptorProto.Type.fromValue(__e.number)),
        typeName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        extendee = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        defaultValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        oneofIndex = __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        jsonName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.FieldOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 8 => __out = com.google.protobuf.descriptor.FieldOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => com.google.protobuf.descriptor.FieldDescriptorProto.Label
      case 5 => com.google.protobuf.descriptor.FieldDescriptorProto.Type
    }
  }
  lazy val defaultInstance = com.google.protobuf.descriptor.FieldDescriptorProto(
    name = _root_.scala.None,
    number = _root_.scala.None,
    label = _root_.scala.None,
    `type` = _root_.scala.None,
    typeName = _root_.scala.None,
    extendee = _root_.scala.None,
    defaultValue = _root_.scala.None,
    oneofIndex = _root_.scala.None,
    jsonName = _root_.scala.None,
    options = _root_.scala.None
  )
  sealed trait Type extends _root_.scalapb.GeneratedEnum {
    type EnumType = Type
    def isTypeDouble: _root_.scala.Boolean = false
    def isTypeFloat: _root_.scala.Boolean = false
    def isTypeInt64: _root_.scala.Boolean = false
    def isTypeUint64: _root_.scala.Boolean = false
    def isTypeInt32: _root_.scala.Boolean = false
    def isTypeFixed64: _root_.scala.Boolean = false
    def isTypeFixed32: _root_.scala.Boolean = false
    def isTypeBool: _root_.scala.Boolean = false
    def isTypeString: _root_.scala.Boolean = false
    def isTypeGroup: _root_.scala.Boolean = false
    def isTypeMessage: _root_.scala.Boolean = false
    def isTypeBytes: _root_.scala.Boolean = false
    def isTypeUint32: _root_.scala.Boolean = false
    def isTypeEnum: _root_.scala.Boolean = false
    def isTypeSfixed32: _root_.scala.Boolean = false
    def isTypeSfixed64: _root_.scala.Boolean = false
    def isTypeSint32: _root_.scala.Boolean = false
    def isTypeSint64: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Type] = com.google.protobuf.descriptor.FieldDescriptorProto.Type
    final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Type.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.FieldDescriptorProto.Type.Recognized])
  }
  
  object Type extends _root_.scalapb.GeneratedEnumCompanion[Type] {
    sealed trait Recognized extends Type
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Type] = this
    /** 0 is reserved for errors.
      * Order is weird for historical reasons.
      */
    @SerialVersionUID(0L)
    case object TYPE_DOUBLE extends Type with Type.Recognized {
      val value = 1
      val index = 0
      val name = "TYPE_DOUBLE"
      override def isTypeDouble: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FLOAT extends Type with Type.Recognized {
      val value = 2
      val index = 1
      val name = "TYPE_FLOAT"
      override def isTypeFloat: _root_.scala.Boolean = true
    }
    
    /** Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT64 if
      * negative values are likely.
      */
    @SerialVersionUID(0L)
    case object TYPE_INT64 extends Type with Type.Recognized {
      val value = 3
      val index = 2
      val name = "TYPE_INT64"
      override def isTypeInt64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT64 extends Type with Type.Recognized {
      val value = 4
      val index = 3
      val name = "TYPE_UINT64"
      override def isTypeUint64: _root_.scala.Boolean = true
    }
    
    /** Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT32 if
      * negative values are likely.
      */
    @SerialVersionUID(0L)
    case object TYPE_INT32 extends Type with Type.Recognized {
      val value = 5
      val index = 4
      val name = "TYPE_INT32"
      override def isTypeInt32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED64 extends Type with Type.Recognized {
      val value = 6
      val index = 5
      val name = "TYPE_FIXED64"
      override def isTypeFixed64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED32 extends Type with Type.Recognized {
      val value = 7
      val index = 6
      val name = "TYPE_FIXED32"
      override def isTypeFixed32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BOOL extends Type with Type.Recognized {
      val value = 8
      val index = 7
      val name = "TYPE_BOOL"
      override def isTypeBool: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_STRING extends Type with Type.Recognized {
      val value = 9
      val index = 8
      val name = "TYPE_STRING"
      override def isTypeString: _root_.scala.Boolean = true
    }
    
    /** Tag-delimited aggregate.
      * Group type is deprecated and not supported in proto3. However, Proto3
      * implementations should still be able to parse the group wire format and
      * treat group fields as unknown fields.
      */
    @SerialVersionUID(0L)
    case object TYPE_GROUP extends Type with Type.Recognized {
      val value = 10
      val index = 9
      val name = "TYPE_GROUP"
      override def isTypeGroup: _root_.scala.Boolean = true
    }
    
    /** Length-delimited aggregate.
      */
    @SerialVersionUID(0L)
    case object TYPE_MESSAGE extends Type with Type.Recognized {
      val value = 11
      val index = 10
      val name = "TYPE_MESSAGE"
      override def isTypeMessage: _root_.scala.Boolean = true
    }
    
    /** New in version 2.
      */
    @SerialVersionUID(0L)
    case object TYPE_BYTES extends Type with Type.Recognized {
      val value = 12
      val index = 11
      val name = "TYPE_BYTES"
      override def isTypeBytes: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT32 extends Type with Type.Recognized {
      val value = 13
      val index = 12
      val name = "TYPE_UINT32"
      override def isTypeUint32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_ENUM extends Type with Type.Recognized {
      val value = 14
      val index = 13
      val name = "TYPE_ENUM"
      override def isTypeEnum: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED32 extends Type with Type.Recognized {
      val value = 15
      val index = 14
      val name = "TYPE_SFIXED32"
      override def isTypeSfixed32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED64 extends Type with Type.Recognized {
      val value = 16
      val index = 15
      val name = "TYPE_SFIXED64"
      override def isTypeSfixed64: _root_.scala.Boolean = true
    }
    
    /** Uses ZigZag encoding.
      */
    @SerialVersionUID(0L)
    case object TYPE_SINT32 extends Type with Type.Recognized {
      val value = 17
      val index = 16
      val name = "TYPE_SINT32"
      override def isTypeSint32: _root_.scala.Boolean = true
    }
    
    /** Uses ZigZag encoding.
      */
    @SerialVersionUID(0L)
    case object TYPE_SINT64 extends Type with Type.Recognized {
      val value = 18
      val index = 17
      val name = "TYPE_SINT64"
      override def isTypeSint64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Type with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64)
    def fromValue(value: _root_.scala.Int): Type = value match {
      case 1 => TYPE_DOUBLE
      case 2 => TYPE_FLOAT
      case 3 => TYPE_INT64
      case 4 => TYPE_UINT64
      case 5 => TYPE_INT32
      case 6 => TYPE_FIXED64
      case 7 => TYPE_FIXED32
      case 8 => TYPE_BOOL
      case 9 => TYPE_STRING
      case 10 => TYPE_GROUP
      case 11 => TYPE_MESSAGE
      case 12 => TYPE_BYTES
      case 13 => TYPE_UINT32
      case 14 => TYPE_ENUM
      case 15 => TYPE_SFIXED32
      case 16 => TYPE_SFIXED64
      case 17 => TYPE_SINT32
      case 18 => TYPE_SINT64
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldDescriptorProto.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldDescriptorProto.scalaDescriptor.enums(0)
    def fromJavaValue(pbJavaSource: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type): Type = fromValue(pbJavaSource.getNumber)
    def toJavaValue(pbScalaSource: Type): com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type = {
      _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
      com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.forNumber(pbScalaSource.value)
    }
  }
  sealed trait Label extends _root_.scalapb.GeneratedEnum {
    type EnumType = Label
    def isLabelOptional: _root_.scala.Boolean = false
    def isLabelRequired: _root_.scala.Boolean = false
    def isLabelRepeated: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Label] = com.google.protobuf.descriptor.FieldDescriptorProto.Label
    final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Label.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.FieldDescriptorProto.Label.Recognized])
  }
  
  object Label extends _root_.scalapb.GeneratedEnumCompanion[Label] {
    sealed trait Recognized extends Label
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Label] = this
    /** 0 is reserved for errors
      */
    @SerialVersionUID(0L)
    case object LABEL_OPTIONAL extends Label with Label.Recognized {
      val value = 1
      val index = 0
      val name = "LABEL_OPTIONAL"
      override def isLabelOptional: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LABEL_REQUIRED extends Label with Label.Recognized {
      val value = 2
      val index = 1
      val name = "LABEL_REQUIRED"
      override def isLabelRequired: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LABEL_REPEATED extends Label with Label.Recognized {
      val value = 3
      val index = 2
      val name = "LABEL_REPEATED"
      override def isLabelRepeated: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Label with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(LABEL_OPTIONAL, LABEL_REQUIRED, LABEL_REPEATED)
    def fromValue(value: _root_.scala.Int): Label = value match {
      case 1 => LABEL_OPTIONAL
      case 2 => LABEL_REQUIRED
      case 3 => LABEL_REPEATED
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldDescriptorProto.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldDescriptorProto.scalaDescriptor.enums(1)
    def fromJavaValue(pbJavaSource: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label): Label = fromValue(pbJavaSource.getNumber)
    def toJavaValue(pbScalaSource: Label): com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label = {
      _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
      com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.forNumber(pbScalaSource.value)
    }
  }
  implicit class FieldDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def number: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getNumber)((c_, f_) => c_.copy(number = Option(f_)))
    def optionalNumber: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.number)((c_, f_) => c_.copy(number = f_))
    def label: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto.Label] = field(_.getLabel)((c_, f_) => c_.copy(label = Option(f_)))
    def optionalLabel: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Label]] = field(_.label)((c_, f_) => c_.copy(label = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto.Type] = field(_.getType)((c_, f_) => c_.copy(`type` = Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Type]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def typeName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getTypeName)((c_, f_) => c_.copy(typeName = Option(f_)))
    def optionalTypeName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.typeName)((c_, f_) => c_.copy(typeName = f_))
    def extendee: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getExtendee)((c_, f_) => c_.copy(extendee = Option(f_)))
    def optionalExtendee: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.extendee)((c_, f_) => c_.copy(extendee = f_))
    def defaultValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getDefaultValue)((c_, f_) => c_.copy(defaultValue = Option(f_)))
    def optionalDefaultValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.defaultValue)((c_, f_) => c_.copy(defaultValue = f_))
    def oneofIndex: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getOneofIndex)((c_, f_) => c_.copy(oneofIndex = Option(f_)))
    def optionalOneofIndex: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.oneofIndex)((c_, f_) => c_.copy(oneofIndex = f_))
    def jsonName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getJsonName)((c_, f_) => c_.copy(jsonName = Option(f_)))
    def optionalJsonName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.jsonName)((c_, f_) => c_.copy(jsonName = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val NUMBER_FIELD_NUMBER = 3
  final val LABEL_FIELD_NUMBER = 4
  final val TYPE_FIELD_NUMBER = 5
  final val TYPE_NAME_FIELD_NUMBER = 6
  final val EXTENDEE_FIELD_NUMBER = 2
  final val DEFAULT_VALUE_FIELD_NUMBER = 7
  final val ONEOF_INDEX_FIELD_NUMBER = 9
  final val JSON_NAME_FIELD_NUMBER = 10
  final val OPTIONS_FIELD_NUMBER = 8
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    number: _root_.scala.Option[_root_.scala.Int],
    label: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Label],
    `type`: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Type],
    typeName: _root_.scala.Option[_root_.scala.Predef.String],
    extendee: _root_.scala.Option[_root_.scala.Predef.String],
    defaultValue: _root_.scala.Option[_root_.scala.Predef.String],
    oneofIndex: _root_.scala.Option[_root_.scala.Int],
    jsonName: _root_.scala.Option[_root_.scala.Predef.String],
    options: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.protobuf.descriptor.FieldDescriptorProto = _root_.com.google.protobuf.descriptor.FieldDescriptorProto(
    name,
    number,
    label,
    `type`,
    typeName,
    extendee,
    defaultValue,
    oneofIndex,
    jsonName,
    options,
    unknownFields
  )
}
