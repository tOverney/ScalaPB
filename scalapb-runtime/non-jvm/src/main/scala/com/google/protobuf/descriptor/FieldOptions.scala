// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** @param ctype
  *   The ctype option instructs the C++ code generator to use a different
  *   representation of the field than it normally would.  See the specific
  *   options below.  This option is not yet implemented in the open source
  *   release -- sorry, we'll try to include it in a future version!
  * @param packed
  *   The packed option can be enabled for repeated primitive fields to enable
  *   a more efficient representation on the wire. Rather than repeatedly
  *   writing the tag and type for each element, the entire array is encoded as
  *   a single length-delimited blob. In proto3, only explicit setting it to
  *   false will avoid using packed encoding.
  * @param jstype
  *   The jstype option determines the JavaScript type used for values of the
  *   field.  The option is permitted only for 64 bit integral and fixed types
  *   (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
  *   is represented as JavaScript string, which avoids loss of precision that
  *   can happen when a large value is converted to a floating point JavaScript.
  *   Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
  *   use the JavaScript "number" type.  The behavior of the default option
  *   JS_NORMAL is implementation dependent.
  *  
  *   This option is an enum to permit additional types to be added, e.g.
  *   goog.math.Integer.
  * @param lazy
  *   Should this field be parsed lazily?  Lazy applies only to message-type
  *   fields.  It means that when the outer message is initially parsed, the
  *   inner message's contents will not be parsed but instead stored in encoded
  *   form.  The inner message will actually be parsed when it is first accessed.
  *  
  *   This is only a hint.  Implementations are free to choose whether to use
  *   eager or lazy parsing regardless of the value of this option.  However,
  *   setting this option true suggests that the protocol author believes that
  *   using lazy parsing on this field is worth the additional bookkeeping
  *   overhead typically needed to implement it.
  *  
  *   This option does not affect the public interface of any generated code;
  *   all method signatures remain the same.  Furthermore, thread-safety of the
  *   interface is not affected by this option; const methods remain safe to
  *   call from multiple threads concurrently, while non-const methods continue
  *   to require exclusive access.
  *  
  *  
  *   Note that implementations may choose not to check required fields within
  *   a lazy sub-message.  That is, calling IsInitialized() on the outer message
  *   may return true even if the inner message has missing required fields.
  *   This is necessary because otherwise the inner message would have to be
  *   parsed in order to perform the check, defeating the purpose of lazy
  *   parsing.  An implementation which chooses not to check required fields
  *   must be consistent about it.  That is, for any particular sub-message, the
  *   implementation must either *always* check its required fields, or *never*
  *   check its required fields, regardless of whether or not the message has
  *   been parsed.
  * @param deprecated
  *   Is this field deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for accessors, or it will be completely ignored; in the very least, this
  *   is a formalization for deprecating fields.
  * @param weak
  *   For Google-internal migration only. Do not use.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class FieldOptions(
    ctype: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.CType] = _root_.scala.None,
    packed: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    jstype: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.JSType] = _root_.scala.None,
    `lazy`: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    deprecated: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    weak: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[FieldOptions] with scalapb.lenses.Updatable[FieldOptions] with _root_.scalapb.ExtendableMessage[FieldOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (ctype.isDefined) {
        val __value = ctype.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
      };
      if (packed.isDefined) {
        val __value = packed.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      if (jstype.isDefined) {
        val __value = jstype.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, __value.value)
      };
      if (`lazy`.isDefined) {
        val __value = `lazy`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
      };
      if (deprecated.isDefined) {
        val __value = deprecated.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
      };
      if (weak.isDefined) {
        val __value = weak.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(10, __value)
      };
      uninterpretedOption.foreach { __item =>
        val __value = __item
        __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      ctype.foreach { __v =>
        val __m = __v
        _output__.writeEnum(1, __m.value)
      };
      packed.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      deprecated.foreach { __v =>
        val __m = __v
        _output__.writeBool(3, __m)
      };
      `lazy`.foreach { __v =>
        val __m = __v
        _output__.writeBool(5, __m)
      };
      jstype.foreach { __v =>
        val __m = __v
        _output__.writeEnum(6, __m.value)
      };
      weak.foreach { __v =>
        val __m = __v
        _output__.writeBool(10, __m)
      };
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FieldOptions = {
      var __ctype = this.ctype
      var __packed = this.packed
      var __jstype = this.jstype
      var __lazy = this.`lazy`
      var __deprecated = this.deprecated
      var __weak = this.weak
      val __uninterpretedOption = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __ctype = Option(com.google.protobuf.descriptor.FieldOptions.CType.fromValue(_input__.readEnum()))
          case 16 =>
            __packed = Option(_input__.readBool())
          case 48 =>
            __jstype = Option(com.google.protobuf.descriptor.FieldOptions.JSType.fromValue(_input__.readEnum()))
          case 40 =>
            __lazy = Option(_input__.readBool())
          case 24 =>
            __deprecated = Option(_input__.readBool())
          case 80 =>
            __weak = Option(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.FieldOptions(
          ctype = __ctype,
          packed = __packed,
          jstype = __jstype,
          `lazy` = __lazy,
          deprecated = __deprecated,
          weak = __weak,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    def getCtype: com.google.protobuf.descriptor.FieldOptions.CType = ctype.getOrElse(com.google.protobuf.descriptor.FieldOptions.CType.STRING)
    def clearCtype: FieldOptions = copy(ctype = _root_.scala.None)
    def withCtype(__v: com.google.protobuf.descriptor.FieldOptions.CType): FieldOptions = copy(ctype = Option(__v))
    def getPacked: _root_.scala.Boolean = packed.getOrElse(false)
    def clearPacked: FieldOptions = copy(packed = _root_.scala.None)
    def withPacked(__v: _root_.scala.Boolean): FieldOptions = copy(packed = Option(__v))
    def getJstype: com.google.protobuf.descriptor.FieldOptions.JSType = jstype.getOrElse(com.google.protobuf.descriptor.FieldOptions.JSType.JS_NORMAL)
    def clearJstype: FieldOptions = copy(jstype = _root_.scala.None)
    def withJstype(__v: com.google.protobuf.descriptor.FieldOptions.JSType): FieldOptions = copy(jstype = Option(__v))
    def getLazy: _root_.scala.Boolean = `lazy`.getOrElse(false)
    def clearLazy: FieldOptions = copy(`lazy` = _root_.scala.None)
    def withLazy(__v: _root_.scala.Boolean): FieldOptions = copy(`lazy` = Option(__v))
    def getDeprecated: _root_.scala.Boolean = deprecated.getOrElse(false)
    def clearDeprecated: FieldOptions = copy(deprecated = _root_.scala.None)
    def withDeprecated(__v: _root_.scala.Boolean): FieldOptions = copy(deprecated = Option(__v))
    def getWeak: _root_.scala.Boolean = weak.getOrElse(false)
    def clearWeak: FieldOptions = copy(weak = _root_.scala.None)
    def withWeak(__v: _root_.scala.Boolean): FieldOptions = copy(weak = Option(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): FieldOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: Iterable[com.google.protobuf.descriptor.UninterpretedOption]): FieldOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]): FieldOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => ctype.map(_.javaValueDescriptor).orNull
        case 2 => packed.orNull
        case 6 => jstype.map(_.javaValueDescriptor).orNull
        case 5 => `lazy`.orNull
        case 3 => deprecated.orNull
        case 10 => weak.orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => ctype.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => packed.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => jstype.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => `lazy`.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => deprecated.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => weak.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.FieldOptions
}

object FieldOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldOptions] = this
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.FieldOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.FieldOptions(
        ctype = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.FieldOptions.CType.fromValue(__e.number)),
        packed = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        jstype = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.FieldOptions.JSType.fromValue(__e.number)),
        `lazy` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        deprecated = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        weak = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        uninterpretedOption = __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(12)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(12)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.google.protobuf.descriptor.FieldOptions.CType
      case 6 => com.google.protobuf.descriptor.FieldOptions.JSType
    }
  }
  lazy val defaultInstance = com.google.protobuf.descriptor.FieldOptions(
    ctype = _root_.scala.None,
    packed = _root_.scala.None,
    jstype = _root_.scala.None,
    `lazy` = _root_.scala.None,
    deprecated = _root_.scala.None,
    weak = _root_.scala.None,
    uninterpretedOption = _root_.scala.Seq.empty
  )
  sealed trait CType extends _root_.scalapb.GeneratedEnum {
    type EnumType = CType
    def isString: _root_.scala.Boolean = false
    def isCord: _root_.scala.Boolean = false
    def isStringPiece: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[CType] = com.google.protobuf.descriptor.FieldOptions.CType
    final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.CType.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.FieldOptions.CType.Recognized])
  }
  
  object CType extends _root_.scalapb.GeneratedEnumCompanion[CType] {
    sealed trait Recognized extends CType
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[CType] = this
    /** Default mode.
      */
    @SerialVersionUID(0L)
    case object STRING extends CType with CType.Recognized {
      val value = 0
      val index = 0
      val name = "STRING"
      override def isString: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CORD extends CType with CType.Recognized {
      val value = 1
      val index = 1
      val name = "CORD"
      override def isCord: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object STRING_PIECE extends CType with CType.Recognized {
      val value = 2
      val index = 2
      val name = "STRING_PIECE"
      override def isStringPiece: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends CType with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(STRING, CORD, STRING_PIECE)
    def fromValue(value: _root_.scala.Int): CType = value match {
      case 0 => STRING
      case 1 => CORD
      case 2 => STRING_PIECE
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.scalaDescriptor.enums(0)
  }
  sealed trait JSType extends _root_.scalapb.GeneratedEnum {
    type EnumType = JSType
    def isJsNormal: _root_.scala.Boolean = false
    def isJsString: _root_.scala.Boolean = false
    def isJsNumber: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[JSType] = com.google.protobuf.descriptor.FieldOptions.JSType
    final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.JSType.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.FieldOptions.JSType.Recognized])
  }
  
  object JSType extends _root_.scalapb.GeneratedEnumCompanion[JSType] {
    sealed trait Recognized extends JSType
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[JSType] = this
    /** Use the default type.
      */
    @SerialVersionUID(0L)
    case object JS_NORMAL extends JSType with JSType.Recognized {
      val value = 0
      val index = 0
      val name = "JS_NORMAL"
      override def isJsNormal: _root_.scala.Boolean = true
    }
    
    /** Use JavaScript strings.
      */
    @SerialVersionUID(0L)
    case object JS_STRING extends JSType with JSType.Recognized {
      val value = 1
      val index = 1
      val name = "JS_STRING"
      override def isJsString: _root_.scala.Boolean = true
    }
    
    /** Use JavaScript numbers.
      */
    @SerialVersionUID(0L)
    case object JS_NUMBER extends JSType with JSType.Recognized {
      val value = 2
      val index = 2
      val name = "JS_NUMBER"
      override def isJsNumber: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends JSType with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(JS_NORMAL, JS_STRING, JS_NUMBER)
    def fromValue(value: _root_.scala.Int): JSType = value match {
      case 0 => JS_NORMAL
      case 1 => JS_STRING
      case 2 => JS_NUMBER
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.scalaDescriptor.enums(1)
  }
  implicit class FieldOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.FieldOptions](_l) {
    def ctype: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions.CType] = field(_.getCtype)((c_, f_) => c_.copy(ctype = Option(f_)))
    def optionalCtype: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.CType]] = field(_.ctype)((c_, f_) => c_.copy(ctype = f_))
    def packed: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getPacked)((c_, f_) => c_.copy(packed = Option(f_)))
    def optionalPacked: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.packed)((c_, f_) => c_.copy(packed = f_))
    def jstype: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions.JSType] = field(_.getJstype)((c_, f_) => c_.copy(jstype = Option(f_)))
    def optionalJstype: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.JSType]] = field(_.jstype)((c_, f_) => c_.copy(jstype = f_))
    def `lazy`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getLazy)((c_, f_) => c_.copy(`lazy` = Option(f_)))
    def optionalLazy: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.`lazy`)((c_, f_) => c_.copy(`lazy` = f_))
    def deprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Option(f_)))
    def optionalDeprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def weak: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getWeak)((c_, f_) => c_.copy(weak = Option(f_)))
    def optionalWeak: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.weak)((c_, f_) => c_.copy(weak = f_))
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val CTYPE_FIELD_NUMBER = 1
  final val PACKED_FIELD_NUMBER = 2
  final val JSTYPE_FIELD_NUMBER = 6
  final val LAZY_FIELD_NUMBER = 5
  final val DEPRECATED_FIELD_NUMBER = 3
  final val WEAK_FIELD_NUMBER = 10
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
  def of(
    ctype: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.CType],
    packed: _root_.scala.Option[_root_.scala.Boolean],
    jstype: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.JSType],
    `lazy`: _root_.scala.Option[_root_.scala.Boolean],
    deprecated: _root_.scala.Option[_root_.scala.Boolean],
    weak: _root_.scala.Option[_root_.scala.Boolean],
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.protobuf.descriptor.FieldOptions = _root_.com.google.protobuf.descriptor.FieldOptions(
    ctype,
    packed,
    jstype,
    `lazy`,
    deprecated,
    weak,
    uninterpretedOption,
    unknownFields
  )
}
