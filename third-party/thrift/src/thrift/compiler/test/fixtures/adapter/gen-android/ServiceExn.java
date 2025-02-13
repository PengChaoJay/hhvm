/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ServiceExn implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ServiceExn");
  private static final TField ANYHOW_TO_APPLICATION_EXN_FIELD_DESC = new TField("anyhow_to_application_exn", TType.BOOL, (short)1);

  public final Boolean anyhow_to_application_exn;
  public static final int ANYHOW_TO_APPLICATION_EXN = 1;

  public ServiceExn(
      Boolean anyhow_to_application_exn) {
    this.anyhow_to_application_exn = anyhow_to_application_exn;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceExn(ServiceExn other) {
    if (other.isSetAnyhow_to_application_exn()) {
      this.anyhow_to_application_exn = TBaseHelper.deepCopy(other.anyhow_to_application_exn);
    } else {
      this.anyhow_to_application_exn = null;
    }
  }

  public ServiceExn deepCopy() {
    return new ServiceExn(this);
  }

  public Boolean isAnyhow_to_application_exn() {
    return this.anyhow_to_application_exn;
  }

  // Returns true if field anyhow_to_application_exn is set (has been assigned a value) and false otherwise
  public boolean isSetAnyhow_to_application_exn() {
    return this.anyhow_to_application_exn != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof ServiceExn))
      return false;
    ServiceExn that = (ServiceExn)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAnyhow_to_application_exn(), that.isSetAnyhow_to_application_exn(), this.anyhow_to_application_exn, that.anyhow_to_application_exn)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {anyhow_to_application_exn});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static ServiceExn deserialize(TProtocol iprot) throws TException {
    Boolean tmp_anyhow_to_application_exn = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case ANYHOW_TO_APPLICATION_EXN:
          if (__field.type == TType.BOOL) {
            tmp_anyhow_to_application_exn = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    ServiceExn _that;
    _that = new ServiceExn(
      tmp_anyhow_to_application_exn
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.anyhow_to_application_exn != null) {
      oprot.writeFieldBegin(ANYHOW_TO_APPLICATION_EXN_FIELD_DESC);
      oprot.writeBool(this.anyhow_to_application_exn);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

