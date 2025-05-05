// ORM class for table 'hosts'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 06 01:50:21 MSK 2025
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

public class hosts extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("host_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_id = (java.math.BigDecimal)value;
      }
    });
    setters.put("host_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_url = (String)value;
      }
    });
    setters.put("host_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_name = (String)value;
      }
    });
    setters.put("host_since", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_since = (java.sql.Date)value;
      }
    });
    setters.put("host_location", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_location = (String)value;
      }
    });
    setters.put("host_about", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_about = (String)value;
      }
    });
    setters.put("host_response_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_response_time = (String)value;
      }
    });
    setters.put("host_response_rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_response_rate = (java.math.BigDecimal)value;
      }
    });
    setters.put("host_acceptance_rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_acceptance_rate = (String)value;
      }
    });
    setters.put("host_thumbnail_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_thumbnail_url = (String)value;
      }
    });
    setters.put("host_picture_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_picture_url = (String)value;
      }
    });
    setters.put("host_neighbourhood", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_neighbourhood = (String)value;
      }
    });
    setters.put("host_listings_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_listings_count = (java.math.BigDecimal)value;
      }
    });
    setters.put("host_total_listings_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_total_listings_count = (java.math.BigDecimal)value;
      }
    });
    setters.put("host_verifications", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hosts.this.host_verifications = (String)value;
      }
    });
  }
  public hosts() {
    init0();
  }
  private java.math.BigDecimal host_id;
  public java.math.BigDecimal get_host_id() {
    return host_id;
  }
  public void set_host_id(java.math.BigDecimal host_id) {
    this.host_id = host_id;
  }
  public hosts with_host_id(java.math.BigDecimal host_id) {
    this.host_id = host_id;
    return this;
  }
  private String host_url;
  public String get_host_url() {
    return host_url;
  }
  public void set_host_url(String host_url) {
    this.host_url = host_url;
  }
  public hosts with_host_url(String host_url) {
    this.host_url = host_url;
    return this;
  }
  private String host_name;
  public String get_host_name() {
    return host_name;
  }
  public void set_host_name(String host_name) {
    this.host_name = host_name;
  }
  public hosts with_host_name(String host_name) {
    this.host_name = host_name;
    return this;
  }
  private java.sql.Date host_since;
  public java.sql.Date get_host_since() {
    return host_since;
  }
  public void set_host_since(java.sql.Date host_since) {
    this.host_since = host_since;
  }
  public hosts with_host_since(java.sql.Date host_since) {
    this.host_since = host_since;
    return this;
  }
  private String host_location;
  public String get_host_location() {
    return host_location;
  }
  public void set_host_location(String host_location) {
    this.host_location = host_location;
  }
  public hosts with_host_location(String host_location) {
    this.host_location = host_location;
    return this;
  }
  private String host_about;
  public String get_host_about() {
    return host_about;
  }
  public void set_host_about(String host_about) {
    this.host_about = host_about;
  }
  public hosts with_host_about(String host_about) {
    this.host_about = host_about;
    return this;
  }
  private String host_response_time;
  public String get_host_response_time() {
    return host_response_time;
  }
  public void set_host_response_time(String host_response_time) {
    this.host_response_time = host_response_time;
  }
  public hosts with_host_response_time(String host_response_time) {
    this.host_response_time = host_response_time;
    return this;
  }
  private java.math.BigDecimal host_response_rate;
  public java.math.BigDecimal get_host_response_rate() {
    return host_response_rate;
  }
  public void set_host_response_rate(java.math.BigDecimal host_response_rate) {
    this.host_response_rate = host_response_rate;
  }
  public hosts with_host_response_rate(java.math.BigDecimal host_response_rate) {
    this.host_response_rate = host_response_rate;
    return this;
  }
  private String host_acceptance_rate;
  public String get_host_acceptance_rate() {
    return host_acceptance_rate;
  }
  public void set_host_acceptance_rate(String host_acceptance_rate) {
    this.host_acceptance_rate = host_acceptance_rate;
  }
  public hosts with_host_acceptance_rate(String host_acceptance_rate) {
    this.host_acceptance_rate = host_acceptance_rate;
    return this;
  }
  private String host_thumbnail_url;
  public String get_host_thumbnail_url() {
    return host_thumbnail_url;
  }
  public void set_host_thumbnail_url(String host_thumbnail_url) {
    this.host_thumbnail_url = host_thumbnail_url;
  }
  public hosts with_host_thumbnail_url(String host_thumbnail_url) {
    this.host_thumbnail_url = host_thumbnail_url;
    return this;
  }
  private String host_picture_url;
  public String get_host_picture_url() {
    return host_picture_url;
  }
  public void set_host_picture_url(String host_picture_url) {
    this.host_picture_url = host_picture_url;
  }
  public hosts with_host_picture_url(String host_picture_url) {
    this.host_picture_url = host_picture_url;
    return this;
  }
  private String host_neighbourhood;
  public String get_host_neighbourhood() {
    return host_neighbourhood;
  }
  public void set_host_neighbourhood(String host_neighbourhood) {
    this.host_neighbourhood = host_neighbourhood;
  }
  public hosts with_host_neighbourhood(String host_neighbourhood) {
    this.host_neighbourhood = host_neighbourhood;
    return this;
  }
  private java.math.BigDecimal host_listings_count;
  public java.math.BigDecimal get_host_listings_count() {
    return host_listings_count;
  }
  public void set_host_listings_count(java.math.BigDecimal host_listings_count) {
    this.host_listings_count = host_listings_count;
  }
  public hosts with_host_listings_count(java.math.BigDecimal host_listings_count) {
    this.host_listings_count = host_listings_count;
    return this;
  }
  private java.math.BigDecimal host_total_listings_count;
  public java.math.BigDecimal get_host_total_listings_count() {
    return host_total_listings_count;
  }
  public void set_host_total_listings_count(java.math.BigDecimal host_total_listings_count) {
    this.host_total_listings_count = host_total_listings_count;
  }
  public hosts with_host_total_listings_count(java.math.BigDecimal host_total_listings_count) {
    this.host_total_listings_count = host_total_listings_count;
    return this;
  }
  private String host_verifications;
  public String get_host_verifications() {
    return host_verifications;
  }
  public void set_host_verifications(String host_verifications) {
    this.host_verifications = host_verifications;
  }
  public hosts with_host_verifications(String host_verifications) {
    this.host_verifications = host_verifications;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof hosts)) {
      return false;
    }
    hosts that = (hosts) o;
    boolean equal = true;
    equal = equal && (this.host_id == null ? that.host_id == null : this.host_id.equals(that.host_id));
    equal = equal && (this.host_url == null ? that.host_url == null : this.host_url.equals(that.host_url));
    equal = equal && (this.host_name == null ? that.host_name == null : this.host_name.equals(that.host_name));
    equal = equal && (this.host_since == null ? that.host_since == null : this.host_since.equals(that.host_since));
    equal = equal && (this.host_location == null ? that.host_location == null : this.host_location.equals(that.host_location));
    equal = equal && (this.host_about == null ? that.host_about == null : this.host_about.equals(that.host_about));
    equal = equal && (this.host_response_time == null ? that.host_response_time == null : this.host_response_time.equals(that.host_response_time));
    equal = equal && (this.host_response_rate == null ? that.host_response_rate == null : this.host_response_rate.equals(that.host_response_rate));
    equal = equal && (this.host_acceptance_rate == null ? that.host_acceptance_rate == null : this.host_acceptance_rate.equals(that.host_acceptance_rate));
    equal = equal && (this.host_thumbnail_url == null ? that.host_thumbnail_url == null : this.host_thumbnail_url.equals(that.host_thumbnail_url));
    equal = equal && (this.host_picture_url == null ? that.host_picture_url == null : this.host_picture_url.equals(that.host_picture_url));
    equal = equal && (this.host_neighbourhood == null ? that.host_neighbourhood == null : this.host_neighbourhood.equals(that.host_neighbourhood));
    equal = equal && (this.host_listings_count == null ? that.host_listings_count == null : this.host_listings_count.equals(that.host_listings_count));
    equal = equal && (this.host_total_listings_count == null ? that.host_total_listings_count == null : this.host_total_listings_count.equals(that.host_total_listings_count));
    equal = equal && (this.host_verifications == null ? that.host_verifications == null : this.host_verifications.equals(that.host_verifications));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof hosts)) {
      return false;
    }
    hosts that = (hosts) o;
    boolean equal = true;
    equal = equal && (this.host_id == null ? that.host_id == null : this.host_id.equals(that.host_id));
    equal = equal && (this.host_url == null ? that.host_url == null : this.host_url.equals(that.host_url));
    equal = equal && (this.host_name == null ? that.host_name == null : this.host_name.equals(that.host_name));
    equal = equal && (this.host_since == null ? that.host_since == null : this.host_since.equals(that.host_since));
    equal = equal && (this.host_location == null ? that.host_location == null : this.host_location.equals(that.host_location));
    equal = equal && (this.host_about == null ? that.host_about == null : this.host_about.equals(that.host_about));
    equal = equal && (this.host_response_time == null ? that.host_response_time == null : this.host_response_time.equals(that.host_response_time));
    equal = equal && (this.host_response_rate == null ? that.host_response_rate == null : this.host_response_rate.equals(that.host_response_rate));
    equal = equal && (this.host_acceptance_rate == null ? that.host_acceptance_rate == null : this.host_acceptance_rate.equals(that.host_acceptance_rate));
    equal = equal && (this.host_thumbnail_url == null ? that.host_thumbnail_url == null : this.host_thumbnail_url.equals(that.host_thumbnail_url));
    equal = equal && (this.host_picture_url == null ? that.host_picture_url == null : this.host_picture_url.equals(that.host_picture_url));
    equal = equal && (this.host_neighbourhood == null ? that.host_neighbourhood == null : this.host_neighbourhood.equals(that.host_neighbourhood));
    equal = equal && (this.host_listings_count == null ? that.host_listings_count == null : this.host_listings_count.equals(that.host_listings_count));
    equal = equal && (this.host_total_listings_count == null ? that.host_total_listings_count == null : this.host_total_listings_count.equals(that.host_total_listings_count));
    equal = equal && (this.host_verifications == null ? that.host_verifications == null : this.host_verifications.equals(that.host_verifications));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.host_id = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.host_url = JdbcWritableBridge.readString(2, __dbResults);
    this.host_name = JdbcWritableBridge.readString(3, __dbResults);
    this.host_since = JdbcWritableBridge.readDate(4, __dbResults);
    this.host_location = JdbcWritableBridge.readString(5, __dbResults);
    this.host_about = JdbcWritableBridge.readString(6, __dbResults);
    this.host_response_time = JdbcWritableBridge.readString(7, __dbResults);
    this.host_response_rate = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.host_acceptance_rate = JdbcWritableBridge.readString(9, __dbResults);
    this.host_thumbnail_url = JdbcWritableBridge.readString(10, __dbResults);
    this.host_picture_url = JdbcWritableBridge.readString(11, __dbResults);
    this.host_neighbourhood = JdbcWritableBridge.readString(12, __dbResults);
    this.host_listings_count = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.host_total_listings_count = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.host_verifications = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.host_id = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.host_url = JdbcWritableBridge.readString(2, __dbResults);
    this.host_name = JdbcWritableBridge.readString(3, __dbResults);
    this.host_since = JdbcWritableBridge.readDate(4, __dbResults);
    this.host_location = JdbcWritableBridge.readString(5, __dbResults);
    this.host_about = JdbcWritableBridge.readString(6, __dbResults);
    this.host_response_time = JdbcWritableBridge.readString(7, __dbResults);
    this.host_response_rate = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.host_acceptance_rate = JdbcWritableBridge.readString(9, __dbResults);
    this.host_thumbnail_url = JdbcWritableBridge.readString(10, __dbResults);
    this.host_picture_url = JdbcWritableBridge.readString(11, __dbResults);
    this.host_neighbourhood = JdbcWritableBridge.readString(12, __dbResults);
    this.host_listings_count = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.host_total_listings_count = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.host_verifications = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(host_id, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(host_url, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(host_since, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(host_location, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_about, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_response_time, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_response_rate, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(host_acceptance_rate, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_thumbnail_url, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_picture_url, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_neighbourhood, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_listings_count, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_total_listings_count, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(host_verifications, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(host_id, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(host_url, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(host_since, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(host_location, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_about, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_response_time, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_response_rate, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(host_acceptance_rate, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_thumbnail_url, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_picture_url, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(host_neighbourhood, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_listings_count, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_total_listings_count, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(host_verifications, 15 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.host_id = null;
    } else {
    this.host_id = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_url = null;
    } else {
    this.host_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_name = null;
    } else {
    this.host_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_since = null;
    } else {
    this.host_since = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.host_location = null;
    } else {
    this.host_location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_about = null;
    } else {
    this.host_about = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_response_time = null;
    } else {
    this.host_response_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_response_rate = null;
    } else {
    this.host_response_rate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_acceptance_rate = null;
    } else {
    this.host_acceptance_rate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_thumbnail_url = null;
    } else {
    this.host_thumbnail_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_picture_url = null;
    } else {
    this.host_picture_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_neighbourhood = null;
    } else {
    this.host_neighbourhood = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_listings_count = null;
    } else {
    this.host_listings_count = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_total_listings_count = null;
    } else {
    this.host_total_listings_count = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_verifications = null;
    } else {
    this.host_verifications = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.host_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_id, __dataOut);
    }
    if (null == this.host_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_url);
    }
    if (null == this.host_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_name);
    }
    if (null == this.host_since) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.host_since.getTime());
    }
    if (null == this.host_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_location);
    }
    if (null == this.host_about) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_about);
    }
    if (null == this.host_response_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_response_time);
    }
    if (null == this.host_response_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_response_rate, __dataOut);
    }
    if (null == this.host_acceptance_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_acceptance_rate);
    }
    if (null == this.host_thumbnail_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_thumbnail_url);
    }
    if (null == this.host_picture_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_picture_url);
    }
    if (null == this.host_neighbourhood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_neighbourhood);
    }
    if (null == this.host_listings_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_listings_count, __dataOut);
    }
    if (null == this.host_total_listings_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_total_listings_count, __dataOut);
    }
    if (null == this.host_verifications) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_verifications);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.host_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_id, __dataOut);
    }
    if (null == this.host_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_url);
    }
    if (null == this.host_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_name);
    }
    if (null == this.host_since) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.host_since.getTime());
    }
    if (null == this.host_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_location);
    }
    if (null == this.host_about) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_about);
    }
    if (null == this.host_response_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_response_time);
    }
    if (null == this.host_response_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_response_rate, __dataOut);
    }
    if (null == this.host_acceptance_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_acceptance_rate);
    }
    if (null == this.host_thumbnail_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_thumbnail_url);
    }
    if (null == this.host_picture_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_picture_url);
    }
    if (null == this.host_neighbourhood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_neighbourhood);
    }
    if (null == this.host_listings_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_listings_count, __dataOut);
    }
    if (null == this.host_total_listings_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_total_listings_count, __dataOut);
    }
    if (null == this.host_verifications) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_verifications);
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
    __sb.append(FieldFormatter.escapeAndEnclose(host_id==null?"null":host_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_url==null?"null":host_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_name==null?"null":host_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_since==null?"null":"" + host_since, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_location==null?"null":host_location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_about==null?"null":host_about, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_time==null?"null":host_response_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_rate==null?"null":host_response_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_acceptance_rate==null?"null":host_acceptance_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_thumbnail_url==null?"null":host_thumbnail_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_picture_url==null?"null":host_picture_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_neighbourhood==null?"null":host_neighbourhood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_listings_count==null?"null":host_listings_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_total_listings_count==null?"null":host_total_listings_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_verifications==null?"null":host_verifications, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(host_id==null?"null":host_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_url==null?"null":host_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_name==null?"null":host_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_since==null?"null":"" + host_since, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_location==null?"null":host_location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_about==null?"null":host_about, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_time==null?"null":host_response_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_rate==null?"null":host_response_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_acceptance_rate==null?"null":host_acceptance_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_thumbnail_url==null?"null":host_thumbnail_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_picture_url==null?"null":host_picture_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_neighbourhood==null?"null":host_neighbourhood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_listings_count==null?"null":host_listings_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_total_listings_count==null?"null":host_total_listings_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_verifications==null?"null":host_verifications, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_id = null; } else {
      this.host_id = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_url = null; } else {
      this.host_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_name = null; } else {
      this.host_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_since = null; } else {
      this.host_since = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_location = null; } else {
      this.host_location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_about = null; } else {
      this.host_about = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_response_time = null; } else {
      this.host_response_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_response_rate = null; } else {
      this.host_response_rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_acceptance_rate = null; } else {
      this.host_acceptance_rate = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_thumbnail_url = null; } else {
      this.host_thumbnail_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_picture_url = null; } else {
      this.host_picture_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_neighbourhood = null; } else {
      this.host_neighbourhood = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_listings_count = null; } else {
      this.host_listings_count = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_total_listings_count = null; } else {
      this.host_total_listings_count = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_verifications = null; } else {
      this.host_verifications = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_id = null; } else {
      this.host_id = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_url = null; } else {
      this.host_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_name = null; } else {
      this.host_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_since = null; } else {
      this.host_since = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_location = null; } else {
      this.host_location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_about = null; } else {
      this.host_about = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_response_time = null; } else {
      this.host_response_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_response_rate = null; } else {
      this.host_response_rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_acceptance_rate = null; } else {
      this.host_acceptance_rate = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_thumbnail_url = null; } else {
      this.host_thumbnail_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_picture_url = null; } else {
      this.host_picture_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_neighbourhood = null; } else {
      this.host_neighbourhood = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_listings_count = null; } else {
      this.host_listings_count = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_total_listings_count = null; } else {
      this.host_total_listings_count = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_verifications = null; } else {
      this.host_verifications = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    hosts o = (hosts) super.clone();
    o.host_since = (o.host_since != null) ? (java.sql.Date) o.host_since.clone() : null;
    return o;
  }

  public void clone0(hosts o) throws CloneNotSupportedException {
    o.host_since = (o.host_since != null) ? (java.sql.Date) o.host_since.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("host_id", this.host_id);
    __sqoop$field_map.put("host_url", this.host_url);
    __sqoop$field_map.put("host_name", this.host_name);
    __sqoop$field_map.put("host_since", this.host_since);
    __sqoop$field_map.put("host_location", this.host_location);
    __sqoop$field_map.put("host_about", this.host_about);
    __sqoop$field_map.put("host_response_time", this.host_response_time);
    __sqoop$field_map.put("host_response_rate", this.host_response_rate);
    __sqoop$field_map.put("host_acceptance_rate", this.host_acceptance_rate);
    __sqoop$field_map.put("host_thumbnail_url", this.host_thumbnail_url);
    __sqoop$field_map.put("host_picture_url", this.host_picture_url);
    __sqoop$field_map.put("host_neighbourhood", this.host_neighbourhood);
    __sqoop$field_map.put("host_listings_count", this.host_listings_count);
    __sqoop$field_map.put("host_total_listings_count", this.host_total_listings_count);
    __sqoop$field_map.put("host_verifications", this.host_verifications);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("host_id", this.host_id);
    __sqoop$field_map.put("host_url", this.host_url);
    __sqoop$field_map.put("host_name", this.host_name);
    __sqoop$field_map.put("host_since", this.host_since);
    __sqoop$field_map.put("host_location", this.host_location);
    __sqoop$field_map.put("host_about", this.host_about);
    __sqoop$field_map.put("host_response_time", this.host_response_time);
    __sqoop$field_map.put("host_response_rate", this.host_response_rate);
    __sqoop$field_map.put("host_acceptance_rate", this.host_acceptance_rate);
    __sqoop$field_map.put("host_thumbnail_url", this.host_thumbnail_url);
    __sqoop$field_map.put("host_picture_url", this.host_picture_url);
    __sqoop$field_map.put("host_neighbourhood", this.host_neighbourhood);
    __sqoop$field_map.put("host_listings_count", this.host_listings_count);
    __sqoop$field_map.put("host_total_listings_count", this.host_total_listings_count);
    __sqoop$field_map.put("host_verifications", this.host_verifications);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
