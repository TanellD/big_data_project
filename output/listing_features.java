// ORM class for table 'listing_features'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon May 05 03:13:03 MSK 2025
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class listing_features extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("listing_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listing_features.this.listing_id = (String)value;
      }
    });
    setters.put("feature_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listing_features.this.feature_name = (String)value;
      }
    });
    setters.put("feature_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listing_features.this.feature_value = (String)value;
      }
    });
  }
  public listing_features() {
    init0();
  }
  private String listing_id;
  public String get_listing_id() {
    return listing_id;
  }
  public void set_listing_id(String listing_id) {
    this.listing_id = listing_id;
  }
  public listing_features with_listing_id(String listing_id) {
    this.listing_id = listing_id;
    return this;
  }
  private String feature_name;
  public String get_feature_name() {
    return feature_name;
  }
  public void set_feature_name(String feature_name) {
    this.feature_name = feature_name;
  }
  public listing_features with_feature_name(String feature_name) {
    this.feature_name = feature_name;
    return this;
  }
  private String feature_value;
  public String get_feature_value() {
    return feature_value;
  }
  public void set_feature_value(String feature_value) {
    this.feature_value = feature_value;
  }
  public listing_features with_feature_value(String feature_value) {
    this.feature_value = feature_value;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof listing_features)) {
      return false;
    }
    listing_features that = (listing_features) o;
    boolean equal = true;
    equal = equal && (this.listing_id == null ? that.listing_id == null : this.listing_id.equals(that.listing_id));
    equal = equal && (this.feature_name == null ? that.feature_name == null : this.feature_name.equals(that.feature_name));
    equal = equal && (this.feature_value == null ? that.feature_value == null : this.feature_value.equals(that.feature_value));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof listing_features)) {
      return false;
    }
    listing_features that = (listing_features) o;
    boolean equal = true;
    equal = equal && (this.listing_id == null ? that.listing_id == null : this.listing_id.equals(that.listing_id));
    equal = equal && (this.feature_name == null ? that.feature_name == null : this.feature_name.equals(that.feature_name));
    equal = equal && (this.feature_value == null ? that.feature_value == null : this.feature_value.equals(that.feature_value));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.listing_id = JdbcWritableBridge.readString(1, __dbResults);
    this.feature_name = JdbcWritableBridge.readString(2, __dbResults);
    this.feature_value = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.listing_id = JdbcWritableBridge.readString(1, __dbResults);
    this.feature_name = JdbcWritableBridge.readString(2, __dbResults);
    this.feature_value = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(listing_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(feature_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(feature_value, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(listing_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(feature_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(feature_value, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.listing_id = null;
    } else {
    this.listing_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.feature_name = null;
    } else {
    this.feature_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.feature_value = null;
    } else {
    this.feature_value = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.listing_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, listing_id);
    }
    if (null == this.feature_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, feature_name);
    }
    if (null == this.feature_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, feature_value);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.listing_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, listing_id);
    }
    if (null == this.feature_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, feature_name);
    }
    if (null == this.feature_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, feature_value);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(listing_id==null?"null":listing_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feature_name==null?"null":feature_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feature_value==null?"null":feature_value, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(listing_id==null?"null":listing_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feature_name==null?"null":feature_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feature_value==null?"null":feature_value, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.listing_id = null; } else {
      this.listing_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.feature_name = null; } else {
      this.feature_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.feature_value = null; } else {
      this.feature_value = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.listing_id = null; } else {
      this.listing_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.feature_name = null; } else {
      this.feature_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.feature_value = null; } else {
      this.feature_value = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    listing_features o = (listing_features) super.clone();
    return o;
  }

  public void clone0(listing_features o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("listing_id", this.listing_id);
    __sqoop$field_map.put("feature_name", this.feature_name);
    __sqoop$field_map.put("feature_value", this.feature_value);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("listing_id", this.listing_id);
    __sqoop$field_map.put("feature_name", this.feature_name);
    __sqoop$field_map.put("feature_value", this.feature_value);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
