// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** Describes a oneof.
  */
@SerialVersionUID(0L)
final case class OneofDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    options: _root_.scala.Option[com.google.protobuf.descriptor.OneofOptions] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[OneofDescriptorProto] with scalapb.lenses.Updatable[OneofDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
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
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.OneofDescriptorProto = {
      var __name = this.name
      var __options = this.options
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readString())
          case 18 =>
            __options = Option(_root_.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.OneofOptions.defaultInstance)))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.OneofDescriptorProto(
          name = __name,
          options = __options,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: OneofDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): OneofDescriptorProto = copy(name = Option(__v))
    def getOptions: com.google.protobuf.descriptor.OneofOptions = options.getOrElse(com.google.protobuf.descriptor.OneofOptions.defaultInstance)
    def clearOptions: OneofDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.OneofOptions): OneofDescriptorProto = copy(options = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.OneofDescriptorProto
}

object OneofDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.OneofDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.OneofDescriptorProto, com.google.protobuf.DescriptorProtos.OneofDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.OneofDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.OneofDescriptorProto, com.google.protobuf.DescriptorProtos.OneofDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.OneofDescriptorProto): com.google.protobuf.DescriptorProtos.OneofDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.OneofDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    scalaPbSource.options.map(com.google.protobuf.descriptor.OneofOptions.toJavaProto).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.OneofDescriptorProto): com.google.protobuf.descriptor.OneofDescriptorProto = com.google.protobuf.descriptor.OneofDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.OneofOptions.fromJavaProto(javaPbSource.getOptions)) else _root_.scala.None
  )
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.OneofDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.OneofDescriptorProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.OneofOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.descriptor.OneofOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.OneofDescriptorProto(
    name = _root_.scala.None,
    options = _root_.scala.None
  )
  implicit class OneofDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.OneofDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.OneofDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.OneofOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.OneofOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val OPTIONS_FIELD_NUMBER = 2
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    options: _root_.scala.Option[com.google.protobuf.descriptor.OneofOptions],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.protobuf.descriptor.OneofDescriptorProto = _root_.com.google.protobuf.descriptor.OneofDescriptorProto(
    name,
    options,
    unknownFields
  )
}
