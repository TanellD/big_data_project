// ORM class for table 'review_scores'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon May 05 03:28:22 MSK 2025
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

public class review_scores extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("listing_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.listing_id = (String)value;
      }
    });
    setters.put("review_scores_rating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_rating = (java.math.BigDecimal)value;
      }
    });
    setters.put("review_scores_accuracy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_accuracy = (java.math.BigDecimal)value;
      }
    });
    setters.put("review_scores_cleanliness", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_cleanliness = (java.math.BigDecimal)value;
      }
    });
    setters.put("review_scores_checkin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_checkin = (java.math.BigDecimal)value;
      }
    });
    setters.put("review_scores_communication", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_communication = (java.math.BigDecimal)value;
      }
    });
    setters.put("review_scores_location", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_location = (java.math.BigDecimal)value;
      }
    });
    setters.put("review_scores_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        review_scores.this.review_scores_value = (java.math.BigDecimal)value;
      }
    });
  }
  public review_scores() {
    init0();
  }
  private String listing_id;
  public String get_listing_id() {
    return listing_id;
  }
  public void set_listing_id(String listing_id) {
    this.listing_id = listing_id;
  }
  public review_scores with_listing_id(String listing_id) {
    this.listing_id = listing_id;
    return this;
  }
  private java.math.BigDecimal review_scores_rating;
  public java.math.BigDecimal get_review_scores_rating() {
    return review_scores_rating;
  }
  public void set_review_scores_rating(java.math.BigDecimal review_scores_rating) {
    this.review_scores_rating = review_scores_rating;
  }
  public review_scores with_review_scores_rating(java.math.BigDecimal review_scores_rating) {
    this.review_scores_rating = review_scores_rating;
    return this;
  }
  private java.math.BigDecimal review_scores_accuracy;
  public java.math.BigDecimal get_review_scores_accuracy() {
    return review_scores_accuracy;
  }
  public void set_review_scores_accuracy(java.math.BigDecimal review_scores_accuracy) {
    this.review_scores_accuracy = review_scores_accuracy;
  }
  public review_scores with_review_scores_accuracy(java.math.BigDecimal review_scores_accuracy) {
    this.review_scores_accuracy = review_scores_accuracy;
    return this;
  }
  private java.math.BigDecimal review_scores_cleanliness;
  public java.math.BigDecimal get_review_scores_cleanliness() {
    return review_scores_cleanliness;
  }
  public void set_review_scores_cleanliness(java.math.BigDecimal review_scores_cleanliness) {
    this.review_scores_cleanliness = review_scores_cleanliness;
  }
  public review_scores with_review_scores_cleanliness(java.math.BigDecimal review_scores_cleanliness) {
    this.review_scores_cleanliness = review_scores_cleanliness;
    return this;
  }
  private java.math.BigDecimal review_scores_checkin;
  public java.math.BigDecimal get_review_scores_checkin() {
    return review_scores_checkin;
  }
  public void set_review_scores_checkin(java.math.BigDecimal review_scores_checkin) {
    this.review_scores_checkin = review_scores_checkin;
  }
  public review_scores with_review_scores_checkin(java.math.BigDecimal review_scores_checkin) {
    this.review_scores_checkin = review_scores_checkin;
    return this;
  }
  private java.math.BigDecimal review_scores_communication;
  public java.math.BigDecimal get_review_scores_communication() {
    return review_scores_communication;
  }
  public void set_review_scores_communication(java.math.BigDecimal review_scores_communication) {
    this.review_scores_communication = review_scores_communication;
  }
  public review_scores with_review_scores_communication(java.math.BigDecimal review_scores_communication) {
    this.review_scores_communication = review_scores_communication;
    return this;
  }
  private java.math.BigDecimal review_scores_location;
  public java.math.BigDecimal get_review_scores_location() {
    return review_scores_location;
  }
  public void set_review_scores_location(java.math.BigDecimal review_scores_location) {
    this.review_scores_location = review_scores_location;
  }
  public review_scores with_review_scores_location(java.math.BigDecimal review_scores_location) {
    this.review_scores_location = review_scores_location;
    return this;
  }
  private java.math.BigDecimal review_scores_value;
  public java.math.BigDecimal get_review_scores_value() {
    return review_scores_value;
  }
  public void set_review_scores_value(java.math.BigDecimal review_scores_value) {
    this.review_scores_value = review_scores_value;
  }
  public review_scores with_review_scores_value(java.math.BigDecimal review_scores_value) {
    this.review_scores_value = review_scores_value;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof review_scores)) {
      return false;
    }
    review_scores that = (review_scores) o;
    boolean equal = true;
    equal = equal && (this.listing_id == null ? that.listing_id == null : this.listing_id.equals(that.listing_id));
    equal = equal && (this.review_scores_rating == null ? that.review_scores_rating == null : this.review_scores_rating.equals(that.review_scores_rating));
    equal = equal && (this.review_scores_accuracy == null ? that.review_scores_accuracy == null : this.review_scores_accuracy.equals(that.review_scores_accuracy));
    equal = equal && (this.review_scores_cleanliness == null ? that.review_scores_cleanliness == null : this.review_scores_cleanliness.equals(that.review_scores_cleanliness));
    equal = equal && (this.review_scores_checkin == null ? that.review_scores_checkin == null : this.review_scores_checkin.equals(that.review_scores_checkin));
    equal = equal && (this.review_scores_communication == null ? that.review_scores_communication == null : this.review_scores_communication.equals(that.review_scores_communication));
    equal = equal && (this.review_scores_location == null ? that.review_scores_location == null : this.review_scores_location.equals(that.review_scores_location));
    equal = equal && (this.review_scores_value == null ? that.review_scores_value == null : this.review_scores_value.equals(that.review_scores_value));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof review_scores)) {
      return false;
    }
    review_scores that = (review_scores) o;
    boolean equal = true;
    equal = equal && (this.listing_id == null ? that.listing_id == null : this.listing_id.equals(that.listing_id));
    equal = equal && (this.review_scores_rating == null ? that.review_scores_rating == null : this.review_scores_rating.equals(that.review_scores_rating));
    equal = equal && (this.review_scores_accuracy == null ? that.review_scores_accuracy == null : this.review_scores_accuracy.equals(that.review_scores_accuracy));
    equal = equal && (this.review_scores_cleanliness == null ? that.review_scores_cleanliness == null : this.review_scores_cleanliness.equals(that.review_scores_cleanliness));
    equal = equal && (this.review_scores_checkin == null ? that.review_scores_checkin == null : this.review_scores_checkin.equals(that.review_scores_checkin));
    equal = equal && (this.review_scores_communication == null ? that.review_scores_communication == null : this.review_scores_communication.equals(that.review_scores_communication));
    equal = equal && (this.review_scores_location == null ? that.review_scores_location == null : this.review_scores_location.equals(that.review_scores_location));
    equal = equal && (this.review_scores_value == null ? that.review_scores_value == null : this.review_scores_value.equals(that.review_scores_value));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.listing_id = JdbcWritableBridge.readString(1, __dbResults);
    this.review_scores_rating = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.review_scores_accuracy = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.review_scores_cleanliness = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.review_scores_checkin = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.review_scores_communication = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.review_scores_location = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.review_scores_value = JdbcWritableBridge.readBigDecimal(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.listing_id = JdbcWritableBridge.readString(1, __dbResults);
    this.review_scores_rating = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.review_scores_accuracy = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.review_scores_cleanliness = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.review_scores_checkin = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.review_scores_communication = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.review_scores_location = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.review_scores_value = JdbcWritableBridge.readBigDecimal(8, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(review_scores_rating, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_accuracy, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_cleanliness, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_checkin, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_communication, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_location, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_value, 8 + __off, 2, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(listing_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_rating, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_accuracy, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_cleanliness, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_checkin, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_communication, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_location, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(review_scores_value, 8 + __off, 2, __dbStmt);
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
        this.review_scores_rating = null;
    } else {
    this.review_scores_rating = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_accuracy = null;
    } else {
    this.review_scores_accuracy = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_cleanliness = null;
    } else {
    this.review_scores_cleanliness = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_checkin = null;
    } else {
    this.review_scores_checkin = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_communication = null;
    } else {
    this.review_scores_communication = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_location = null;
    } else {
    this.review_scores_location = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_value = null;
    } else {
    this.review_scores_value = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.listing_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, listing_id);
    }
    if (null == this.review_scores_rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_rating, __dataOut);
    }
    if (null == this.review_scores_accuracy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_accuracy, __dataOut);
    }
    if (null == this.review_scores_cleanliness) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_cleanliness, __dataOut);
    }
    if (null == this.review_scores_checkin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_checkin, __dataOut);
    }
    if (null == this.review_scores_communication) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_communication, __dataOut);
    }
    if (null == this.review_scores_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_location, __dataOut);
    }
    if (null == this.review_scores_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_value, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.listing_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, listing_id);
    }
    if (null == this.review_scores_rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_rating, __dataOut);
    }
    if (null == this.review_scores_accuracy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_accuracy, __dataOut);
    }
    if (null == this.review_scores_cleanliness) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_cleanliness, __dataOut);
    }
    if (null == this.review_scores_checkin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_checkin, __dataOut);
    }
    if (null == this.review_scores_communication) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_communication, __dataOut);
    }
    if (null == this.review_scores_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_location, __dataOut);
    }
    if (null == this.review_scores_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.review_scores_value, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_rating==null?"null":review_scores_rating.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_accuracy==null?"null":review_scores_accuracy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_cleanliness==null?"null":review_scores_cleanliness.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_checkin==null?"null":review_scores_checkin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_communication==null?"null":review_scores_communication.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_location==null?"null":review_scores_location.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_value==null?"null":review_scores_value.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(listing_id==null?"null":listing_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_rating==null?"null":review_scores_rating.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_accuracy==null?"null":review_scores_accuracy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_cleanliness==null?"null":review_scores_cleanliness.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_checkin==null?"null":review_scores_checkin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_communication==null?"null":review_scores_communication.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_location==null?"null":review_scores_location.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_value==null?"null":review_scores_value.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_rating = null; } else {
      this.review_scores_rating = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_accuracy = null; } else {
      this.review_scores_accuracy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_cleanliness = null; } else {
      this.review_scores_cleanliness = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_checkin = null; } else {
      this.review_scores_checkin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_communication = null; } else {
      this.review_scores_communication = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_location = null; } else {
      this.review_scores_location = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_value = null; } else {
      this.review_scores_value = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_rating = null; } else {
      this.review_scores_rating = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_accuracy = null; } else {
      this.review_scores_accuracy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_cleanliness = null; } else {
      this.review_scores_cleanliness = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_checkin = null; } else {
      this.review_scores_checkin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_communication = null; } else {
      this.review_scores_communication = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_location = null; } else {
      this.review_scores_location = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_value = null; } else {
      this.review_scores_value = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    review_scores o = (review_scores) super.clone();
    return o;
  }

  public void clone0(review_scores o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("listing_id", this.listing_id);
    __sqoop$field_map.put("review_scores_rating", this.review_scores_rating);
    __sqoop$field_map.put("review_scores_accuracy", this.review_scores_accuracy);
    __sqoop$field_map.put("review_scores_cleanliness", this.review_scores_cleanliness);
    __sqoop$field_map.put("review_scores_checkin", this.review_scores_checkin);
    __sqoop$field_map.put("review_scores_communication", this.review_scores_communication);
    __sqoop$field_map.put("review_scores_location", this.review_scores_location);
    __sqoop$field_map.put("review_scores_value", this.review_scores_value);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("listing_id", this.listing_id);
    __sqoop$field_map.put("review_scores_rating", this.review_scores_rating);
    __sqoop$field_map.put("review_scores_accuracy", this.review_scores_accuracy);
    __sqoop$field_map.put("review_scores_cleanliness", this.review_scores_cleanliness);
    __sqoop$field_map.put("review_scores_checkin", this.review_scores_checkin);
    __sqoop$field_map.put("review_scores_communication", this.review_scores_communication);
    __sqoop$field_map.put("review_scores_location", this.review_scores_location);
    __sqoop$field_map.put("review_scores_value", this.review_scores_value);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
