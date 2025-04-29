// ORM class for table 'listings'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 23 17:45:18 MSK 2025
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

public class listings extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.id = (String)value;
      }
    });
    setters.put("listing_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.listing_url = (String)value;
      }
    });
    setters.put("scrape_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.scrape_id = (String)value;
      }
    });
    setters.put("last_scraped", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.last_scraped = (java.sql.Date)value;
      }
    });
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.name = (String)value;
      }
    });
    setters.put("summary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.summary = (String)value;
      }
    });
    setters.put("space", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.space = (String)value;
      }
    });
    setters.put("description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.description = (String)value;
      }
    });
    setters.put("experiences_offered", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.experiences_offered = (String)value;
      }
    });
    setters.put("neighborhood_overview", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.neighborhood_overview = (String)value;
      }
    });
    setters.put("notes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.notes = (String)value;
      }
    });
    setters.put("transit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.transit = (String)value;
      }
    });
    setters.put("access", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.access = (String)value;
      }
    });
    setters.put("interaction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.interaction = (String)value;
      }
    });
    setters.put("house_rules", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.house_rules = (String)value;
      }
    });
    setters.put("thumbnail_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.thumbnail_url = (String)value;
      }
    });
    setters.put("medium_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.medium_url = (String)value;
      }
    });
    setters.put("picture_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.picture_url = (String)value;
      }
    });
    setters.put("xl_picture_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.xl_picture_url = (String)value;
      }
    });
    setters.put("host_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.host_id = (java.math.BigDecimal)value;
      }
    });
    setters.put("street", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.street = (String)value;
      }
    });
    setters.put("neighbourhood", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.neighbourhood = (String)value;
      }
    });
    setters.put("neighbourhood_cleansed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.neighbourhood_cleansed = (String)value;
      }
    });
    setters.put("neighbourhood_group_cleansed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.neighbourhood_group_cleansed = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.city = (String)value;
      }
    });
    setters.put("state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.state = (String)value;
      }
    });
    setters.put("zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.zipcode = (String)value;
      }
    });
    setters.put("market", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.market = (String)value;
      }
    });
    setters.put("smart_location", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.smart_location = (String)value;
      }
    });
    setters.put("country_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.country_code = (String)value;
      }
    });
    setters.put("country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.country = (String)value;
      }
    });
    setters.put("latitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.latitude = (java.math.BigDecimal)value;
      }
    });
    setters.put("longitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.longitude = (java.math.BigDecimal)value;
      }
    });
    setters.put("geolocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.geolocation = (String)value;
      }
    });
    setters.put("property_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.property_type = (String)value;
      }
    });
    setters.put("room_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.room_type = (String)value;
      }
    });
    setters.put("accommodates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.accommodates = (java.math.BigDecimal)value;
      }
    });
    setters.put("bathrooms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.bathrooms = (java.math.BigDecimal)value;
      }
    });
    setters.put("bedrooms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.bedrooms = (java.math.BigDecimal)value;
      }
    });
    setters.put("beds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.beds = (java.math.BigDecimal)value;
      }
    });
    setters.put("bed_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.bed_type = (String)value;
      }
    });
    setters.put("amenities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.amenities = (String)value;
      }
    });
    setters.put("square_feet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.square_feet = (java.math.BigDecimal)value;
      }
    });
    setters.put("price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.price = (String)value;
      }
    });
    setters.put("weekly_price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.weekly_price = (String)value;
      }
    });
    setters.put("monthly_price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.monthly_price = (String)value;
      }
    });
    setters.put("security_deposit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.security_deposit = (String)value;
      }
    });
    setters.put("cleaning_fee", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.cleaning_fee = (String)value;
      }
    });
    setters.put("guests_included", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.guests_included = (java.math.BigDecimal)value;
      }
    });
    setters.put("extra_people", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.extra_people = (String)value;
      }
    });
    setters.put("minimum_nights", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.minimum_nights = (java.math.BigDecimal)value;
      }
    });
    setters.put("maximum_nights", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.maximum_nights = (java.math.BigDecimal)value;
      }
    });
    setters.put("calendar_updated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.calendar_updated = (String)value;
      }
    });
    setters.put("has_availability", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.has_availability = (String)value;
      }
    });
    setters.put("availability_30", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.availability_30 = (java.math.BigDecimal)value;
      }
    });
    setters.put("availability_60", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.availability_60 = (java.math.BigDecimal)value;
      }
    });
    setters.put("availability_90", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.availability_90 = (java.math.BigDecimal)value;
      }
    });
    setters.put("availability_365", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.availability_365 = (java.math.BigDecimal)value;
      }
    });
    setters.put("calendar_last_scraped", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.calendar_last_scraped = (java.sql.Date)value;
      }
    });
    setters.put("number_of_reviews", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.number_of_reviews = (java.math.BigDecimal)value;
      }
    });
    setters.put("first_review", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.first_review = (java.sql.Date)value;
      }
    });
    setters.put("last_review", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.last_review = (java.sql.Date)value;
      }
    });
    setters.put("license", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.license = (String)value;
      }
    });
    setters.put("jurisdiction_names", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.jurisdiction_names = (String)value;
      }
    });
    setters.put("cancellation_policy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.cancellation_policy = (String)value;
      }
    });
    setters.put("calculated_host_listings_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.calculated_host_listings_count = (java.math.BigDecimal)value;
      }
    });
    setters.put("reviews_per_month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        listings.this.reviews_per_month = (java.math.BigDecimal)value;
      }
    });
  }
  public listings() {
    init0();
  }
  private String id;
  public String get_id() {
    return id;
  }
  public void set_id(String id) {
    this.id = id;
  }
  public listings with_id(String id) {
    this.id = id;
    return this;
  }
  private String listing_url;
  public String get_listing_url() {
    return listing_url;
  }
  public void set_listing_url(String listing_url) {
    this.listing_url = listing_url;
  }
  public listings with_listing_url(String listing_url) {
    this.listing_url = listing_url;
    return this;
  }
  private String scrape_id;
  public String get_scrape_id() {
    return scrape_id;
  }
  public void set_scrape_id(String scrape_id) {
    this.scrape_id = scrape_id;
  }
  public listings with_scrape_id(String scrape_id) {
    this.scrape_id = scrape_id;
    return this;
  }
  private java.sql.Date last_scraped;
  public java.sql.Date get_last_scraped() {
    return last_scraped;
  }
  public void set_last_scraped(java.sql.Date last_scraped) {
    this.last_scraped = last_scraped;
  }
  public listings with_last_scraped(java.sql.Date last_scraped) {
    this.last_scraped = last_scraped;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public listings with_name(String name) {
    this.name = name;
    return this;
  }
  private String summary;
  public String get_summary() {
    return summary;
  }
  public void set_summary(String summary) {
    this.summary = summary;
  }
  public listings with_summary(String summary) {
    this.summary = summary;
    return this;
  }
  private String space;
  public String get_space() {
    return space;
  }
  public void set_space(String space) {
    this.space = space;
  }
  public listings with_space(String space) {
    this.space = space;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public listings with_description(String description) {
    this.description = description;
    return this;
  }
  private String experiences_offered;
  public String get_experiences_offered() {
    return experiences_offered;
  }
  public void set_experiences_offered(String experiences_offered) {
    this.experiences_offered = experiences_offered;
  }
  public listings with_experiences_offered(String experiences_offered) {
    this.experiences_offered = experiences_offered;
    return this;
  }
  private String neighborhood_overview;
  public String get_neighborhood_overview() {
    return neighborhood_overview;
  }
  public void set_neighborhood_overview(String neighborhood_overview) {
    this.neighborhood_overview = neighborhood_overview;
  }
  public listings with_neighborhood_overview(String neighborhood_overview) {
    this.neighborhood_overview = neighborhood_overview;
    return this;
  }
  private String notes;
  public String get_notes() {
    return notes;
  }
  public void set_notes(String notes) {
    this.notes = notes;
  }
  public listings with_notes(String notes) {
    this.notes = notes;
    return this;
  }
  private String transit;
  public String get_transit() {
    return transit;
  }
  public void set_transit(String transit) {
    this.transit = transit;
  }
  public listings with_transit(String transit) {
    this.transit = transit;
    return this;
  }
  private String access;
  public String get_access() {
    return access;
  }
  public void set_access(String access) {
    this.access = access;
  }
  public listings with_access(String access) {
    this.access = access;
    return this;
  }
  private String interaction;
  public String get_interaction() {
    return interaction;
  }
  public void set_interaction(String interaction) {
    this.interaction = interaction;
  }
  public listings with_interaction(String interaction) {
    this.interaction = interaction;
    return this;
  }
  private String house_rules;
  public String get_house_rules() {
    return house_rules;
  }
  public void set_house_rules(String house_rules) {
    this.house_rules = house_rules;
  }
  public listings with_house_rules(String house_rules) {
    this.house_rules = house_rules;
    return this;
  }
  private String thumbnail_url;
  public String get_thumbnail_url() {
    return thumbnail_url;
  }
  public void set_thumbnail_url(String thumbnail_url) {
    this.thumbnail_url = thumbnail_url;
  }
  public listings with_thumbnail_url(String thumbnail_url) {
    this.thumbnail_url = thumbnail_url;
    return this;
  }
  private String medium_url;
  public String get_medium_url() {
    return medium_url;
  }
  public void set_medium_url(String medium_url) {
    this.medium_url = medium_url;
  }
  public listings with_medium_url(String medium_url) {
    this.medium_url = medium_url;
    return this;
  }
  private String picture_url;
  public String get_picture_url() {
    return picture_url;
  }
  public void set_picture_url(String picture_url) {
    this.picture_url = picture_url;
  }
  public listings with_picture_url(String picture_url) {
    this.picture_url = picture_url;
    return this;
  }
  private String xl_picture_url;
  public String get_xl_picture_url() {
    return xl_picture_url;
  }
  public void set_xl_picture_url(String xl_picture_url) {
    this.xl_picture_url = xl_picture_url;
  }
  public listings with_xl_picture_url(String xl_picture_url) {
    this.xl_picture_url = xl_picture_url;
    return this;
  }
  private java.math.BigDecimal host_id;
  public java.math.BigDecimal get_host_id() {
    return host_id;
  }
  public void set_host_id(java.math.BigDecimal host_id) {
    this.host_id = host_id;
  }
  public listings with_host_id(java.math.BigDecimal host_id) {
    this.host_id = host_id;
    return this;
  }
  private String street;
  public String get_street() {
    return street;
  }
  public void set_street(String street) {
    this.street = street;
  }
  public listings with_street(String street) {
    this.street = street;
    return this;
  }
  private String neighbourhood;
  public String get_neighbourhood() {
    return neighbourhood;
  }
  public void set_neighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
  }
  public listings with_neighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
    return this;
  }
  private String neighbourhood_cleansed;
  public String get_neighbourhood_cleansed() {
    return neighbourhood_cleansed;
  }
  public void set_neighbourhood_cleansed(String neighbourhood_cleansed) {
    this.neighbourhood_cleansed = neighbourhood_cleansed;
  }
  public listings with_neighbourhood_cleansed(String neighbourhood_cleansed) {
    this.neighbourhood_cleansed = neighbourhood_cleansed;
    return this;
  }
  private String neighbourhood_group_cleansed;
  public String get_neighbourhood_group_cleansed() {
    return neighbourhood_group_cleansed;
  }
  public void set_neighbourhood_group_cleansed(String neighbourhood_group_cleansed) {
    this.neighbourhood_group_cleansed = neighbourhood_group_cleansed;
  }
  public listings with_neighbourhood_group_cleansed(String neighbourhood_group_cleansed) {
    this.neighbourhood_group_cleansed = neighbourhood_group_cleansed;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public listings with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public listings with_state(String state) {
    this.state = state;
    return this;
  }
  private String zipcode;
  public String get_zipcode() {
    return zipcode;
  }
  public void set_zipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  public listings with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private String market;
  public String get_market() {
    return market;
  }
  public void set_market(String market) {
    this.market = market;
  }
  public listings with_market(String market) {
    this.market = market;
    return this;
  }
  private String smart_location;
  public String get_smart_location() {
    return smart_location;
  }
  public void set_smart_location(String smart_location) {
    this.smart_location = smart_location;
  }
  public listings with_smart_location(String smart_location) {
    this.smart_location = smart_location;
    return this;
  }
  private String country_code;
  public String get_country_code() {
    return country_code;
  }
  public void set_country_code(String country_code) {
    this.country_code = country_code;
  }
  public listings with_country_code(String country_code) {
    this.country_code = country_code;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public listings with_country(String country) {
    this.country = country;
    return this;
  }
  private java.math.BigDecimal latitude;
  public java.math.BigDecimal get_latitude() {
    return latitude;
  }
  public void set_latitude(java.math.BigDecimal latitude) {
    this.latitude = latitude;
  }
  public listings with_latitude(java.math.BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }
  private java.math.BigDecimal longitude;
  public java.math.BigDecimal get_longitude() {
    return longitude;
  }
  public void set_longitude(java.math.BigDecimal longitude) {
    this.longitude = longitude;
  }
  public listings with_longitude(java.math.BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }
  private String geolocation;
  public String get_geolocation() {
    return geolocation;
  }
  public void set_geolocation(String geolocation) {
    this.geolocation = geolocation;
  }
  public listings with_geolocation(String geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  private String property_type;
  public String get_property_type() {
    return property_type;
  }
  public void set_property_type(String property_type) {
    this.property_type = property_type;
  }
  public listings with_property_type(String property_type) {
    this.property_type = property_type;
    return this;
  }
  private String room_type;
  public String get_room_type() {
    return room_type;
  }
  public void set_room_type(String room_type) {
    this.room_type = room_type;
  }
  public listings with_room_type(String room_type) {
    this.room_type = room_type;
    return this;
  }
  private java.math.BigDecimal accommodates;
  public java.math.BigDecimal get_accommodates() {
    return accommodates;
  }
  public void set_accommodates(java.math.BigDecimal accommodates) {
    this.accommodates = accommodates;
  }
  public listings with_accommodates(java.math.BigDecimal accommodates) {
    this.accommodates = accommodates;
    return this;
  }
  private java.math.BigDecimal bathrooms;
  public java.math.BigDecimal get_bathrooms() {
    return bathrooms;
  }
  public void set_bathrooms(java.math.BigDecimal bathrooms) {
    this.bathrooms = bathrooms;
  }
  public listings with_bathrooms(java.math.BigDecimal bathrooms) {
    this.bathrooms = bathrooms;
    return this;
  }
  private java.math.BigDecimal bedrooms;
  public java.math.BigDecimal get_bedrooms() {
    return bedrooms;
  }
  public void set_bedrooms(java.math.BigDecimal bedrooms) {
    this.bedrooms = bedrooms;
  }
  public listings with_bedrooms(java.math.BigDecimal bedrooms) {
    this.bedrooms = bedrooms;
    return this;
  }
  private java.math.BigDecimal beds;
  public java.math.BigDecimal get_beds() {
    return beds;
  }
  public void set_beds(java.math.BigDecimal beds) {
    this.beds = beds;
  }
  public listings with_beds(java.math.BigDecimal beds) {
    this.beds = beds;
    return this;
  }
  private String bed_type;
  public String get_bed_type() {
    return bed_type;
  }
  public void set_bed_type(String bed_type) {
    this.bed_type = bed_type;
  }
  public listings with_bed_type(String bed_type) {
    this.bed_type = bed_type;
    return this;
  }
  private String amenities;
  public String get_amenities() {
    return amenities;
  }
  public void set_amenities(String amenities) {
    this.amenities = amenities;
  }
  public listings with_amenities(String amenities) {
    this.amenities = amenities;
    return this;
  }
  private java.math.BigDecimal square_feet;
  public java.math.BigDecimal get_square_feet() {
    return square_feet;
  }
  public void set_square_feet(java.math.BigDecimal square_feet) {
    this.square_feet = square_feet;
  }
  public listings with_square_feet(java.math.BigDecimal square_feet) {
    this.square_feet = square_feet;
    return this;
  }
  private String price;
  public String get_price() {
    return price;
  }
  public void set_price(String price) {
    this.price = price;
  }
  public listings with_price(String price) {
    this.price = price;
    return this;
  }
  private String weekly_price;
  public String get_weekly_price() {
    return weekly_price;
  }
  public void set_weekly_price(String weekly_price) {
    this.weekly_price = weekly_price;
  }
  public listings with_weekly_price(String weekly_price) {
    this.weekly_price = weekly_price;
    return this;
  }
  private String monthly_price;
  public String get_monthly_price() {
    return monthly_price;
  }
  public void set_monthly_price(String monthly_price) {
    this.monthly_price = monthly_price;
  }
  public listings with_monthly_price(String monthly_price) {
    this.monthly_price = monthly_price;
    return this;
  }
  private String security_deposit;
  public String get_security_deposit() {
    return security_deposit;
  }
  public void set_security_deposit(String security_deposit) {
    this.security_deposit = security_deposit;
  }
  public listings with_security_deposit(String security_deposit) {
    this.security_deposit = security_deposit;
    return this;
  }
  private String cleaning_fee;
  public String get_cleaning_fee() {
    return cleaning_fee;
  }
  public void set_cleaning_fee(String cleaning_fee) {
    this.cleaning_fee = cleaning_fee;
  }
  public listings with_cleaning_fee(String cleaning_fee) {
    this.cleaning_fee = cleaning_fee;
    return this;
  }
  private java.math.BigDecimal guests_included;
  public java.math.BigDecimal get_guests_included() {
    return guests_included;
  }
  public void set_guests_included(java.math.BigDecimal guests_included) {
    this.guests_included = guests_included;
  }
  public listings with_guests_included(java.math.BigDecimal guests_included) {
    this.guests_included = guests_included;
    return this;
  }
  private String extra_people;
  public String get_extra_people() {
    return extra_people;
  }
  public void set_extra_people(String extra_people) {
    this.extra_people = extra_people;
  }
  public listings with_extra_people(String extra_people) {
    this.extra_people = extra_people;
    return this;
  }
  private java.math.BigDecimal minimum_nights;
  public java.math.BigDecimal get_minimum_nights() {
    return minimum_nights;
  }
  public void set_minimum_nights(java.math.BigDecimal minimum_nights) {
    this.minimum_nights = minimum_nights;
  }
  public listings with_minimum_nights(java.math.BigDecimal minimum_nights) {
    this.minimum_nights = minimum_nights;
    return this;
  }
  private java.math.BigDecimal maximum_nights;
  public java.math.BigDecimal get_maximum_nights() {
    return maximum_nights;
  }
  public void set_maximum_nights(java.math.BigDecimal maximum_nights) {
    this.maximum_nights = maximum_nights;
  }
  public listings with_maximum_nights(java.math.BigDecimal maximum_nights) {
    this.maximum_nights = maximum_nights;
    return this;
  }
  private String calendar_updated;
  public String get_calendar_updated() {
    return calendar_updated;
  }
  public void set_calendar_updated(String calendar_updated) {
    this.calendar_updated = calendar_updated;
  }
  public listings with_calendar_updated(String calendar_updated) {
    this.calendar_updated = calendar_updated;
    return this;
  }
  private String has_availability;
  public String get_has_availability() {
    return has_availability;
  }
  public void set_has_availability(String has_availability) {
    this.has_availability = has_availability;
  }
  public listings with_has_availability(String has_availability) {
    this.has_availability = has_availability;
    return this;
  }
  private java.math.BigDecimal availability_30;
  public java.math.BigDecimal get_availability_30() {
    return availability_30;
  }
  public void set_availability_30(java.math.BigDecimal availability_30) {
    this.availability_30 = availability_30;
  }
  public listings with_availability_30(java.math.BigDecimal availability_30) {
    this.availability_30 = availability_30;
    return this;
  }
  private java.math.BigDecimal availability_60;
  public java.math.BigDecimal get_availability_60() {
    return availability_60;
  }
  public void set_availability_60(java.math.BigDecimal availability_60) {
    this.availability_60 = availability_60;
  }
  public listings with_availability_60(java.math.BigDecimal availability_60) {
    this.availability_60 = availability_60;
    return this;
  }
  private java.math.BigDecimal availability_90;
  public java.math.BigDecimal get_availability_90() {
    return availability_90;
  }
  public void set_availability_90(java.math.BigDecimal availability_90) {
    this.availability_90 = availability_90;
  }
  public listings with_availability_90(java.math.BigDecimal availability_90) {
    this.availability_90 = availability_90;
    return this;
  }
  private java.math.BigDecimal availability_365;
  public java.math.BigDecimal get_availability_365() {
    return availability_365;
  }
  public void set_availability_365(java.math.BigDecimal availability_365) {
    this.availability_365 = availability_365;
  }
  public listings with_availability_365(java.math.BigDecimal availability_365) {
    this.availability_365 = availability_365;
    return this;
  }
  private java.sql.Date calendar_last_scraped;
  public java.sql.Date get_calendar_last_scraped() {
    return calendar_last_scraped;
  }
  public void set_calendar_last_scraped(java.sql.Date calendar_last_scraped) {
    this.calendar_last_scraped = calendar_last_scraped;
  }
  public listings with_calendar_last_scraped(java.sql.Date calendar_last_scraped) {
    this.calendar_last_scraped = calendar_last_scraped;
    return this;
  }
  private java.math.BigDecimal number_of_reviews;
  public java.math.BigDecimal get_number_of_reviews() {
    return number_of_reviews;
  }
  public void set_number_of_reviews(java.math.BigDecimal number_of_reviews) {
    this.number_of_reviews = number_of_reviews;
  }
  public listings with_number_of_reviews(java.math.BigDecimal number_of_reviews) {
    this.number_of_reviews = number_of_reviews;
    return this;
  }
  private java.sql.Date first_review;
  public java.sql.Date get_first_review() {
    return first_review;
  }
  public void set_first_review(java.sql.Date first_review) {
    this.first_review = first_review;
  }
  public listings with_first_review(java.sql.Date first_review) {
    this.first_review = first_review;
    return this;
  }
  private java.sql.Date last_review;
  public java.sql.Date get_last_review() {
    return last_review;
  }
  public void set_last_review(java.sql.Date last_review) {
    this.last_review = last_review;
  }
  public listings with_last_review(java.sql.Date last_review) {
    this.last_review = last_review;
    return this;
  }
  private String license;
  public String get_license() {
    return license;
  }
  public void set_license(String license) {
    this.license = license;
  }
  public listings with_license(String license) {
    this.license = license;
    return this;
  }
  private String jurisdiction_names;
  public String get_jurisdiction_names() {
    return jurisdiction_names;
  }
  public void set_jurisdiction_names(String jurisdiction_names) {
    this.jurisdiction_names = jurisdiction_names;
  }
  public listings with_jurisdiction_names(String jurisdiction_names) {
    this.jurisdiction_names = jurisdiction_names;
    return this;
  }
  private String cancellation_policy;
  public String get_cancellation_policy() {
    return cancellation_policy;
  }
  public void set_cancellation_policy(String cancellation_policy) {
    this.cancellation_policy = cancellation_policy;
  }
  public listings with_cancellation_policy(String cancellation_policy) {
    this.cancellation_policy = cancellation_policy;
    return this;
  }
  private java.math.BigDecimal calculated_host_listings_count;
  public java.math.BigDecimal get_calculated_host_listings_count() {
    return calculated_host_listings_count;
  }
  public void set_calculated_host_listings_count(java.math.BigDecimal calculated_host_listings_count) {
    this.calculated_host_listings_count = calculated_host_listings_count;
  }
  public listings with_calculated_host_listings_count(java.math.BigDecimal calculated_host_listings_count) {
    this.calculated_host_listings_count = calculated_host_listings_count;
    return this;
  }
  private java.math.BigDecimal reviews_per_month;
  public java.math.BigDecimal get_reviews_per_month() {
    return reviews_per_month;
  }
  public void set_reviews_per_month(java.math.BigDecimal reviews_per_month) {
    this.reviews_per_month = reviews_per_month;
  }
  public listings with_reviews_per_month(java.math.BigDecimal reviews_per_month) {
    this.reviews_per_month = reviews_per_month;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof listings)) {
      return false;
    }
    listings that = (listings) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.listing_url == null ? that.listing_url == null : this.listing_url.equals(that.listing_url));
    equal = equal && (this.scrape_id == null ? that.scrape_id == null : this.scrape_id.equals(that.scrape_id));
    equal = equal && (this.last_scraped == null ? that.last_scraped == null : this.last_scraped.equals(that.last_scraped));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.summary == null ? that.summary == null : this.summary.equals(that.summary));
    equal = equal && (this.space == null ? that.space == null : this.space.equals(that.space));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.experiences_offered == null ? that.experiences_offered == null : this.experiences_offered.equals(that.experiences_offered));
    equal = equal && (this.neighborhood_overview == null ? that.neighborhood_overview == null : this.neighborhood_overview.equals(that.neighborhood_overview));
    equal = equal && (this.notes == null ? that.notes == null : this.notes.equals(that.notes));
    equal = equal && (this.transit == null ? that.transit == null : this.transit.equals(that.transit));
    equal = equal && (this.access == null ? that.access == null : this.access.equals(that.access));
    equal = equal && (this.interaction == null ? that.interaction == null : this.interaction.equals(that.interaction));
    equal = equal && (this.house_rules == null ? that.house_rules == null : this.house_rules.equals(that.house_rules));
    equal = equal && (this.thumbnail_url == null ? that.thumbnail_url == null : this.thumbnail_url.equals(that.thumbnail_url));
    equal = equal && (this.medium_url == null ? that.medium_url == null : this.medium_url.equals(that.medium_url));
    equal = equal && (this.picture_url == null ? that.picture_url == null : this.picture_url.equals(that.picture_url));
    equal = equal && (this.xl_picture_url == null ? that.xl_picture_url == null : this.xl_picture_url.equals(that.xl_picture_url));
    equal = equal && (this.host_id == null ? that.host_id == null : this.host_id.equals(that.host_id));
    equal = equal && (this.street == null ? that.street == null : this.street.equals(that.street));
    equal = equal && (this.neighbourhood == null ? that.neighbourhood == null : this.neighbourhood.equals(that.neighbourhood));
    equal = equal && (this.neighbourhood_cleansed == null ? that.neighbourhood_cleansed == null : this.neighbourhood_cleansed.equals(that.neighbourhood_cleansed));
    equal = equal && (this.neighbourhood_group_cleansed == null ? that.neighbourhood_group_cleansed == null : this.neighbourhood_group_cleansed.equals(that.neighbourhood_group_cleansed));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.market == null ? that.market == null : this.market.equals(that.market));
    equal = equal && (this.smart_location == null ? that.smart_location == null : this.smart_location.equals(that.smart_location));
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.geolocation == null ? that.geolocation == null : this.geolocation.equals(that.geolocation));
    equal = equal && (this.property_type == null ? that.property_type == null : this.property_type.equals(that.property_type));
    equal = equal && (this.room_type == null ? that.room_type == null : this.room_type.equals(that.room_type));
    equal = equal && (this.accommodates == null ? that.accommodates == null : this.accommodates.equals(that.accommodates));
    equal = equal && (this.bathrooms == null ? that.bathrooms == null : this.bathrooms.equals(that.bathrooms));
    equal = equal && (this.bedrooms == null ? that.bedrooms == null : this.bedrooms.equals(that.bedrooms));
    equal = equal && (this.beds == null ? that.beds == null : this.beds.equals(that.beds));
    equal = equal && (this.bed_type == null ? that.bed_type == null : this.bed_type.equals(that.bed_type));
    equal = equal && (this.amenities == null ? that.amenities == null : this.amenities.equals(that.amenities));
    equal = equal && (this.square_feet == null ? that.square_feet == null : this.square_feet.equals(that.square_feet));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.weekly_price == null ? that.weekly_price == null : this.weekly_price.equals(that.weekly_price));
    equal = equal && (this.monthly_price == null ? that.monthly_price == null : this.monthly_price.equals(that.monthly_price));
    equal = equal && (this.security_deposit == null ? that.security_deposit == null : this.security_deposit.equals(that.security_deposit));
    equal = equal && (this.cleaning_fee == null ? that.cleaning_fee == null : this.cleaning_fee.equals(that.cleaning_fee));
    equal = equal && (this.guests_included == null ? that.guests_included == null : this.guests_included.equals(that.guests_included));
    equal = equal && (this.extra_people == null ? that.extra_people == null : this.extra_people.equals(that.extra_people));
    equal = equal && (this.minimum_nights == null ? that.minimum_nights == null : this.minimum_nights.equals(that.minimum_nights));
    equal = equal && (this.maximum_nights == null ? that.maximum_nights == null : this.maximum_nights.equals(that.maximum_nights));
    equal = equal && (this.calendar_updated == null ? that.calendar_updated == null : this.calendar_updated.equals(that.calendar_updated));
    equal = equal && (this.has_availability == null ? that.has_availability == null : this.has_availability.equals(that.has_availability));
    equal = equal && (this.availability_30 == null ? that.availability_30 == null : this.availability_30.equals(that.availability_30));
    equal = equal && (this.availability_60 == null ? that.availability_60 == null : this.availability_60.equals(that.availability_60));
    equal = equal && (this.availability_90 == null ? that.availability_90 == null : this.availability_90.equals(that.availability_90));
    equal = equal && (this.availability_365 == null ? that.availability_365 == null : this.availability_365.equals(that.availability_365));
    equal = equal && (this.calendar_last_scraped == null ? that.calendar_last_scraped == null : this.calendar_last_scraped.equals(that.calendar_last_scraped));
    equal = equal && (this.number_of_reviews == null ? that.number_of_reviews == null : this.number_of_reviews.equals(that.number_of_reviews));
    equal = equal && (this.first_review == null ? that.first_review == null : this.first_review.equals(that.first_review));
    equal = equal && (this.last_review == null ? that.last_review == null : this.last_review.equals(that.last_review));
    equal = equal && (this.license == null ? that.license == null : this.license.equals(that.license));
    equal = equal && (this.jurisdiction_names == null ? that.jurisdiction_names == null : this.jurisdiction_names.equals(that.jurisdiction_names));
    equal = equal && (this.cancellation_policy == null ? that.cancellation_policy == null : this.cancellation_policy.equals(that.cancellation_policy));
    equal = equal && (this.calculated_host_listings_count == null ? that.calculated_host_listings_count == null : this.calculated_host_listings_count.equals(that.calculated_host_listings_count));
    equal = equal && (this.reviews_per_month == null ? that.reviews_per_month == null : this.reviews_per_month.equals(that.reviews_per_month));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof listings)) {
      return false;
    }
    listings that = (listings) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.listing_url == null ? that.listing_url == null : this.listing_url.equals(that.listing_url));
    equal = equal && (this.scrape_id == null ? that.scrape_id == null : this.scrape_id.equals(that.scrape_id));
    equal = equal && (this.last_scraped == null ? that.last_scraped == null : this.last_scraped.equals(that.last_scraped));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.summary == null ? that.summary == null : this.summary.equals(that.summary));
    equal = equal && (this.space == null ? that.space == null : this.space.equals(that.space));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.experiences_offered == null ? that.experiences_offered == null : this.experiences_offered.equals(that.experiences_offered));
    equal = equal && (this.neighborhood_overview == null ? that.neighborhood_overview == null : this.neighborhood_overview.equals(that.neighborhood_overview));
    equal = equal && (this.notes == null ? that.notes == null : this.notes.equals(that.notes));
    equal = equal && (this.transit == null ? that.transit == null : this.transit.equals(that.transit));
    equal = equal && (this.access == null ? that.access == null : this.access.equals(that.access));
    equal = equal && (this.interaction == null ? that.interaction == null : this.interaction.equals(that.interaction));
    equal = equal && (this.house_rules == null ? that.house_rules == null : this.house_rules.equals(that.house_rules));
    equal = equal && (this.thumbnail_url == null ? that.thumbnail_url == null : this.thumbnail_url.equals(that.thumbnail_url));
    equal = equal && (this.medium_url == null ? that.medium_url == null : this.medium_url.equals(that.medium_url));
    equal = equal && (this.picture_url == null ? that.picture_url == null : this.picture_url.equals(that.picture_url));
    equal = equal && (this.xl_picture_url == null ? that.xl_picture_url == null : this.xl_picture_url.equals(that.xl_picture_url));
    equal = equal && (this.host_id == null ? that.host_id == null : this.host_id.equals(that.host_id));
    equal = equal && (this.street == null ? that.street == null : this.street.equals(that.street));
    equal = equal && (this.neighbourhood == null ? that.neighbourhood == null : this.neighbourhood.equals(that.neighbourhood));
    equal = equal && (this.neighbourhood_cleansed == null ? that.neighbourhood_cleansed == null : this.neighbourhood_cleansed.equals(that.neighbourhood_cleansed));
    equal = equal && (this.neighbourhood_group_cleansed == null ? that.neighbourhood_group_cleansed == null : this.neighbourhood_group_cleansed.equals(that.neighbourhood_group_cleansed));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.market == null ? that.market == null : this.market.equals(that.market));
    equal = equal && (this.smart_location == null ? that.smart_location == null : this.smart_location.equals(that.smart_location));
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.geolocation == null ? that.geolocation == null : this.geolocation.equals(that.geolocation));
    equal = equal && (this.property_type == null ? that.property_type == null : this.property_type.equals(that.property_type));
    equal = equal && (this.room_type == null ? that.room_type == null : this.room_type.equals(that.room_type));
    equal = equal && (this.accommodates == null ? that.accommodates == null : this.accommodates.equals(that.accommodates));
    equal = equal && (this.bathrooms == null ? that.bathrooms == null : this.bathrooms.equals(that.bathrooms));
    equal = equal && (this.bedrooms == null ? that.bedrooms == null : this.bedrooms.equals(that.bedrooms));
    equal = equal && (this.beds == null ? that.beds == null : this.beds.equals(that.beds));
    equal = equal && (this.bed_type == null ? that.bed_type == null : this.bed_type.equals(that.bed_type));
    equal = equal && (this.amenities == null ? that.amenities == null : this.amenities.equals(that.amenities));
    equal = equal && (this.square_feet == null ? that.square_feet == null : this.square_feet.equals(that.square_feet));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.weekly_price == null ? that.weekly_price == null : this.weekly_price.equals(that.weekly_price));
    equal = equal && (this.monthly_price == null ? that.monthly_price == null : this.monthly_price.equals(that.monthly_price));
    equal = equal && (this.security_deposit == null ? that.security_deposit == null : this.security_deposit.equals(that.security_deposit));
    equal = equal && (this.cleaning_fee == null ? that.cleaning_fee == null : this.cleaning_fee.equals(that.cleaning_fee));
    equal = equal && (this.guests_included == null ? that.guests_included == null : this.guests_included.equals(that.guests_included));
    equal = equal && (this.extra_people == null ? that.extra_people == null : this.extra_people.equals(that.extra_people));
    equal = equal && (this.minimum_nights == null ? that.minimum_nights == null : this.minimum_nights.equals(that.minimum_nights));
    equal = equal && (this.maximum_nights == null ? that.maximum_nights == null : this.maximum_nights.equals(that.maximum_nights));
    equal = equal && (this.calendar_updated == null ? that.calendar_updated == null : this.calendar_updated.equals(that.calendar_updated));
    equal = equal && (this.has_availability == null ? that.has_availability == null : this.has_availability.equals(that.has_availability));
    equal = equal && (this.availability_30 == null ? that.availability_30 == null : this.availability_30.equals(that.availability_30));
    equal = equal && (this.availability_60 == null ? that.availability_60 == null : this.availability_60.equals(that.availability_60));
    equal = equal && (this.availability_90 == null ? that.availability_90 == null : this.availability_90.equals(that.availability_90));
    equal = equal && (this.availability_365 == null ? that.availability_365 == null : this.availability_365.equals(that.availability_365));
    equal = equal && (this.calendar_last_scraped == null ? that.calendar_last_scraped == null : this.calendar_last_scraped.equals(that.calendar_last_scraped));
    equal = equal && (this.number_of_reviews == null ? that.number_of_reviews == null : this.number_of_reviews.equals(that.number_of_reviews));
    equal = equal && (this.first_review == null ? that.first_review == null : this.first_review.equals(that.first_review));
    equal = equal && (this.last_review == null ? that.last_review == null : this.last_review.equals(that.last_review));
    equal = equal && (this.license == null ? that.license == null : this.license.equals(that.license));
    equal = equal && (this.jurisdiction_names == null ? that.jurisdiction_names == null : this.jurisdiction_names.equals(that.jurisdiction_names));
    equal = equal && (this.cancellation_policy == null ? that.cancellation_policy == null : this.cancellation_policy.equals(that.cancellation_policy));
    equal = equal && (this.calculated_host_listings_count == null ? that.calculated_host_listings_count == null : this.calculated_host_listings_count.equals(that.calculated_host_listings_count));
    equal = equal && (this.reviews_per_month == null ? that.reviews_per_month == null : this.reviews_per_month.equals(that.reviews_per_month));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.listing_url = JdbcWritableBridge.readString(2, __dbResults);
    this.scrape_id = JdbcWritableBridge.readString(3, __dbResults);
    this.last_scraped = JdbcWritableBridge.readDate(4, __dbResults);
    this.name = JdbcWritableBridge.readString(5, __dbResults);
    this.summary = JdbcWritableBridge.readString(6, __dbResults);
    this.space = JdbcWritableBridge.readString(7, __dbResults);
    this.description = JdbcWritableBridge.readString(8, __dbResults);
    this.experiences_offered = JdbcWritableBridge.readString(9, __dbResults);
    this.neighborhood_overview = JdbcWritableBridge.readString(10, __dbResults);
    this.notes = JdbcWritableBridge.readString(11, __dbResults);
    this.transit = JdbcWritableBridge.readString(12, __dbResults);
    this.access = JdbcWritableBridge.readString(13, __dbResults);
    this.interaction = JdbcWritableBridge.readString(14, __dbResults);
    this.house_rules = JdbcWritableBridge.readString(15, __dbResults);
    this.thumbnail_url = JdbcWritableBridge.readString(16, __dbResults);
    this.medium_url = JdbcWritableBridge.readString(17, __dbResults);
    this.picture_url = JdbcWritableBridge.readString(18, __dbResults);
    this.xl_picture_url = JdbcWritableBridge.readString(19, __dbResults);
    this.host_id = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.street = JdbcWritableBridge.readString(21, __dbResults);
    this.neighbourhood = JdbcWritableBridge.readString(22, __dbResults);
    this.neighbourhood_cleansed = JdbcWritableBridge.readString(23, __dbResults);
    this.neighbourhood_group_cleansed = JdbcWritableBridge.readString(24, __dbResults);
    this.city = JdbcWritableBridge.readString(25, __dbResults);
    this.state = JdbcWritableBridge.readString(26, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(27, __dbResults);
    this.market = JdbcWritableBridge.readString(28, __dbResults);
    this.smart_location = JdbcWritableBridge.readString(29, __dbResults);
    this.country_code = JdbcWritableBridge.readString(30, __dbResults);
    this.country = JdbcWritableBridge.readString(31, __dbResults);
    this.latitude = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.longitude = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.geolocation = JdbcWritableBridge.readString(34, __dbResults);
    this.property_type = JdbcWritableBridge.readString(35, __dbResults);
    this.room_type = JdbcWritableBridge.readString(36, __dbResults);
    this.accommodates = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.bathrooms = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.bedrooms = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.beds = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.bed_type = JdbcWritableBridge.readString(41, __dbResults);
    this.amenities = JdbcWritableBridge.readString(42, __dbResults);
    this.square_feet = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.price = JdbcWritableBridge.readString(44, __dbResults);
    this.weekly_price = JdbcWritableBridge.readString(45, __dbResults);
    this.monthly_price = JdbcWritableBridge.readString(46, __dbResults);
    this.security_deposit = JdbcWritableBridge.readString(47, __dbResults);
    this.cleaning_fee = JdbcWritableBridge.readString(48, __dbResults);
    this.guests_included = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.extra_people = JdbcWritableBridge.readString(50, __dbResults);
    this.minimum_nights = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.maximum_nights = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.calendar_updated = JdbcWritableBridge.readString(53, __dbResults);
    this.has_availability = JdbcWritableBridge.readString(54, __dbResults);
    this.availability_30 = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.availability_60 = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.availability_90 = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.availability_365 = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.calendar_last_scraped = JdbcWritableBridge.readDate(59, __dbResults);
    this.number_of_reviews = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.first_review = JdbcWritableBridge.readDate(61, __dbResults);
    this.last_review = JdbcWritableBridge.readDate(62, __dbResults);
    this.license = JdbcWritableBridge.readString(63, __dbResults);
    this.jurisdiction_names = JdbcWritableBridge.readString(64, __dbResults);
    this.cancellation_policy = JdbcWritableBridge.readString(65, __dbResults);
    this.calculated_host_listings_count = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.reviews_per_month = JdbcWritableBridge.readBigDecimal(67, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.listing_url = JdbcWritableBridge.readString(2, __dbResults);
    this.scrape_id = JdbcWritableBridge.readString(3, __dbResults);
    this.last_scraped = JdbcWritableBridge.readDate(4, __dbResults);
    this.name = JdbcWritableBridge.readString(5, __dbResults);
    this.summary = JdbcWritableBridge.readString(6, __dbResults);
    this.space = JdbcWritableBridge.readString(7, __dbResults);
    this.description = JdbcWritableBridge.readString(8, __dbResults);
    this.experiences_offered = JdbcWritableBridge.readString(9, __dbResults);
    this.neighborhood_overview = JdbcWritableBridge.readString(10, __dbResults);
    this.notes = JdbcWritableBridge.readString(11, __dbResults);
    this.transit = JdbcWritableBridge.readString(12, __dbResults);
    this.access = JdbcWritableBridge.readString(13, __dbResults);
    this.interaction = JdbcWritableBridge.readString(14, __dbResults);
    this.house_rules = JdbcWritableBridge.readString(15, __dbResults);
    this.thumbnail_url = JdbcWritableBridge.readString(16, __dbResults);
    this.medium_url = JdbcWritableBridge.readString(17, __dbResults);
    this.picture_url = JdbcWritableBridge.readString(18, __dbResults);
    this.xl_picture_url = JdbcWritableBridge.readString(19, __dbResults);
    this.host_id = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.street = JdbcWritableBridge.readString(21, __dbResults);
    this.neighbourhood = JdbcWritableBridge.readString(22, __dbResults);
    this.neighbourhood_cleansed = JdbcWritableBridge.readString(23, __dbResults);
    this.neighbourhood_group_cleansed = JdbcWritableBridge.readString(24, __dbResults);
    this.city = JdbcWritableBridge.readString(25, __dbResults);
    this.state = JdbcWritableBridge.readString(26, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(27, __dbResults);
    this.market = JdbcWritableBridge.readString(28, __dbResults);
    this.smart_location = JdbcWritableBridge.readString(29, __dbResults);
    this.country_code = JdbcWritableBridge.readString(30, __dbResults);
    this.country = JdbcWritableBridge.readString(31, __dbResults);
    this.latitude = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.longitude = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.geolocation = JdbcWritableBridge.readString(34, __dbResults);
    this.property_type = JdbcWritableBridge.readString(35, __dbResults);
    this.room_type = JdbcWritableBridge.readString(36, __dbResults);
    this.accommodates = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.bathrooms = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.bedrooms = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.beds = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.bed_type = JdbcWritableBridge.readString(41, __dbResults);
    this.amenities = JdbcWritableBridge.readString(42, __dbResults);
    this.square_feet = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.price = JdbcWritableBridge.readString(44, __dbResults);
    this.weekly_price = JdbcWritableBridge.readString(45, __dbResults);
    this.monthly_price = JdbcWritableBridge.readString(46, __dbResults);
    this.security_deposit = JdbcWritableBridge.readString(47, __dbResults);
    this.cleaning_fee = JdbcWritableBridge.readString(48, __dbResults);
    this.guests_included = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.extra_people = JdbcWritableBridge.readString(50, __dbResults);
    this.minimum_nights = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.maximum_nights = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.calendar_updated = JdbcWritableBridge.readString(53, __dbResults);
    this.has_availability = JdbcWritableBridge.readString(54, __dbResults);
    this.availability_30 = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.availability_60 = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.availability_90 = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.availability_365 = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.calendar_last_scraped = JdbcWritableBridge.readDate(59, __dbResults);
    this.number_of_reviews = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.first_review = JdbcWritableBridge.readDate(61, __dbResults);
    this.last_review = JdbcWritableBridge.readDate(62, __dbResults);
    this.license = JdbcWritableBridge.readString(63, __dbResults);
    this.jurisdiction_names = JdbcWritableBridge.readString(64, __dbResults);
    this.cancellation_policy = JdbcWritableBridge.readString(65, __dbResults);
    this.calculated_host_listings_count = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.reviews_per_month = JdbcWritableBridge.readBigDecimal(67, __dbResults);
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
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(listing_url, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scrape_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(last_scraped, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(summary, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(space, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(experiences_offered, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighborhood_overview, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notes, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(transit, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(access, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(interaction, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(house_rules, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(thumbnail_url, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(medium_url, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picture_url, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(xl_picture_url, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_id, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(street, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood_cleansed, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood_group_cleansed, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(market, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(smart_location, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_code, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(latitude, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(longitude, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(geolocation, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property_type, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_type, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(accommodates, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bathrooms, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bedrooms, 39 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(beds, 40 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(bed_type, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amenities, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(square_feet, 43 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(price, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weekly_price, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(monthly_price, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(security_deposit, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cleaning_fee, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(guests_included, 49 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(extra_people, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(minimum_nights, 51 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(maximum_nights, 52 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(calendar_updated, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(has_availability, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_30, 55 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_60, 56 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_90, 57 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_365, 58 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeDate(calendar_last_scraped, 59 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_reviews, 60 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeDate(first_review, 61 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_review, 62 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(license, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(jurisdiction_names, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cancellation_policy, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(calculated_host_listings_count, 66 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(reviews_per_month, 67 + __off, 2, __dbStmt);
    return 67;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(listing_url, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scrape_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(last_scraped, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(summary, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(space, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(experiences_offered, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighborhood_overview, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notes, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(transit, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(access, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(interaction, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(house_rules, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(thumbnail_url, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(medium_url, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picture_url, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(xl_picture_url, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(host_id, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(street, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood_cleansed, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood_group_cleansed, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(market, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(smart_location, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_code, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(latitude, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(longitude, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(geolocation, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property_type, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_type, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(accommodates, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bathrooms, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bedrooms, 39 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(beds, 40 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(bed_type, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amenities, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(square_feet, 43 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(price, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weekly_price, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(monthly_price, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(security_deposit, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cleaning_fee, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(guests_included, 49 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(extra_people, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(minimum_nights, 51 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(maximum_nights, 52 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(calendar_updated, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(has_availability, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_30, 55 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_60, 56 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_90, 57 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(availability_365, 58 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeDate(calendar_last_scraped, 59 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_reviews, 60 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeDate(first_review, 61 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_review, 62 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(license, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(jurisdiction_names, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cancellation_policy, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(calculated_host_listings_count, 66 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(reviews_per_month, 67 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.listing_url = null;
    } else {
    this.listing_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.scrape_id = null;
    } else {
    this.scrape_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_scraped = null;
    } else {
    this.last_scraped = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.summary = null;
    } else {
    this.summary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.space = null;
    } else {
    this.space = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.experiences_offered = null;
    } else {
    this.experiences_offered = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.neighborhood_overview = null;
    } else {
    this.neighborhood_overview = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.notes = null;
    } else {
    this.notes = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.transit = null;
    } else {
    this.transit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.access = null;
    } else {
    this.access = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.interaction = null;
    } else {
    this.interaction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.house_rules = null;
    } else {
    this.house_rules = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thumbnail_url = null;
    } else {
    this.thumbnail_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.medium_url = null;
    } else {
    this.medium_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.picture_url = null;
    } else {
    this.picture_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.xl_picture_url = null;
    } else {
    this.xl_picture_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_id = null;
    } else {
    this.host_id = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.street = null;
    } else {
    this.street = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.neighbourhood = null;
    } else {
    this.neighbourhood = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.neighbourhood_cleansed = null;
    } else {
    this.neighbourhood_cleansed = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.neighbourhood_group_cleansed = null;
    } else {
    this.neighbourhood_group_cleansed = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zipcode = null;
    } else {
    this.zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.market = null;
    } else {
    this.market = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.smart_location = null;
    } else {
    this.smart_location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country_code = null;
    } else {
    this.country_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.latitude = null;
    } else {
    this.latitude = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.longitude = null;
    } else {
    this.longitude = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation = null;
    } else {
    this.geolocation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.property_type = null;
    } else {
    this.property_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.room_type = null;
    } else {
    this.room_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.accommodates = null;
    } else {
    this.accommodates = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bathrooms = null;
    } else {
    this.bathrooms = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bedrooms = null;
    } else {
    this.bedrooms = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.beds = null;
    } else {
    this.beds = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bed_type = null;
    } else {
    this.bed_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.amenities = null;
    } else {
    this.amenities = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.square_feet = null;
    } else {
    this.square_feet = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.price = null;
    } else {
    this.price = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.weekly_price = null;
    } else {
    this.weekly_price = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.monthly_price = null;
    } else {
    this.monthly_price = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.security_deposit = null;
    } else {
    this.security_deposit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cleaning_fee = null;
    } else {
    this.cleaning_fee = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.guests_included = null;
    } else {
    this.guests_included = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.extra_people = null;
    } else {
    this.extra_people = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.minimum_nights = null;
    } else {
    this.minimum_nights = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.maximum_nights = null;
    } else {
    this.maximum_nights = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.calendar_updated = null;
    } else {
    this.calendar_updated = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.has_availability = null;
    } else {
    this.has_availability = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.availability_30 = null;
    } else {
    this.availability_30 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.availability_60 = null;
    } else {
    this.availability_60 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.availability_90 = null;
    } else {
    this.availability_90 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.availability_365 = null;
    } else {
    this.availability_365 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.calendar_last_scraped = null;
    } else {
    this.calendar_last_scraped = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_reviews = null;
    } else {
    this.number_of_reviews = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_review = null;
    } else {
    this.first_review = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.last_review = null;
    } else {
    this.last_review = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.license = null;
    } else {
    this.license = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.jurisdiction_names = null;
    } else {
    this.jurisdiction_names = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cancellation_policy = null;
    } else {
    this.cancellation_policy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.calculated_host_listings_count = null;
    } else {
    this.calculated_host_listings_count = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reviews_per_month = null;
    } else {
    this.reviews_per_month = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.listing_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, listing_url);
    }
    if (null == this.scrape_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scrape_id);
    }
    if (null == this.last_scraped) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_scraped.getTime());
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.summary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, summary);
    }
    if (null == this.space) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, space);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.experiences_offered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, experiences_offered);
    }
    if (null == this.neighborhood_overview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighborhood_overview);
    }
    if (null == this.notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notes);
    }
    if (null == this.transit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, transit);
    }
    if (null == this.access) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, access);
    }
    if (null == this.interaction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, interaction);
    }
    if (null == this.house_rules) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, house_rules);
    }
    if (null == this.thumbnail_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnail_url);
    }
    if (null == this.medium_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, medium_url);
    }
    if (null == this.picture_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picture_url);
    }
    if (null == this.xl_picture_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, xl_picture_url);
    }
    if (null == this.host_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_id, __dataOut);
    }
    if (null == this.street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, street);
    }
    if (null == this.neighbourhood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood);
    }
    if (null == this.neighbourhood_cleansed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood_cleansed);
    }
    if (null == this.neighbourhood_group_cleansed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood_group_cleansed);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.market) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, market);
    }
    if (null == this.smart_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, smart_location);
    }
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.latitude, __dataOut);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.longitude, __dataOut);
    }
    if (null == this.geolocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation);
    }
    if (null == this.property_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property_type);
    }
    if (null == this.room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_type);
    }
    if (null == this.accommodates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.accommodates, __dataOut);
    }
    if (null == this.bathrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.bathrooms, __dataOut);
    }
    if (null == this.bedrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.bedrooms, __dataOut);
    }
    if (null == this.beds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.beds, __dataOut);
    }
    if (null == this.bed_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bed_type);
    }
    if (null == this.amenities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amenities);
    }
    if (null == this.square_feet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.square_feet, __dataOut);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, price);
    }
    if (null == this.weekly_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weekly_price);
    }
    if (null == this.monthly_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, monthly_price);
    }
    if (null == this.security_deposit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, security_deposit);
    }
    if (null == this.cleaning_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cleaning_fee);
    }
    if (null == this.guests_included) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.guests_included, __dataOut);
    }
    if (null == this.extra_people) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, extra_people);
    }
    if (null == this.minimum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.minimum_nights, __dataOut);
    }
    if (null == this.maximum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.maximum_nights, __dataOut);
    }
    if (null == this.calendar_updated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, calendar_updated);
    }
    if (null == this.has_availability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, has_availability);
    }
    if (null == this.availability_30) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_30, __dataOut);
    }
    if (null == this.availability_60) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_60, __dataOut);
    }
    if (null == this.availability_90) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_90, __dataOut);
    }
    if (null == this.availability_365) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_365, __dataOut);
    }
    if (null == this.calendar_last_scraped) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.calendar_last_scraped.getTime());
    }
    if (null == this.number_of_reviews) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_reviews, __dataOut);
    }
    if (null == this.first_review) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_review.getTime());
    }
    if (null == this.last_review) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_review.getTime());
    }
    if (null == this.license) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, license);
    }
    if (null == this.jurisdiction_names) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, jurisdiction_names);
    }
    if (null == this.cancellation_policy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cancellation_policy);
    }
    if (null == this.calculated_host_listings_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.calculated_host_listings_count, __dataOut);
    }
    if (null == this.reviews_per_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.reviews_per_month, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.listing_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, listing_url);
    }
    if (null == this.scrape_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scrape_id);
    }
    if (null == this.last_scraped) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_scraped.getTime());
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.summary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, summary);
    }
    if (null == this.space) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, space);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.experiences_offered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, experiences_offered);
    }
    if (null == this.neighborhood_overview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighborhood_overview);
    }
    if (null == this.notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notes);
    }
    if (null == this.transit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, transit);
    }
    if (null == this.access) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, access);
    }
    if (null == this.interaction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, interaction);
    }
    if (null == this.house_rules) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, house_rules);
    }
    if (null == this.thumbnail_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnail_url);
    }
    if (null == this.medium_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, medium_url);
    }
    if (null == this.picture_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picture_url);
    }
    if (null == this.xl_picture_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, xl_picture_url);
    }
    if (null == this.host_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.host_id, __dataOut);
    }
    if (null == this.street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, street);
    }
    if (null == this.neighbourhood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood);
    }
    if (null == this.neighbourhood_cleansed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood_cleansed);
    }
    if (null == this.neighbourhood_group_cleansed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood_group_cleansed);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.market) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, market);
    }
    if (null == this.smart_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, smart_location);
    }
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.latitude, __dataOut);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.longitude, __dataOut);
    }
    if (null == this.geolocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation);
    }
    if (null == this.property_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property_type);
    }
    if (null == this.room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_type);
    }
    if (null == this.accommodates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.accommodates, __dataOut);
    }
    if (null == this.bathrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.bathrooms, __dataOut);
    }
    if (null == this.bedrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.bedrooms, __dataOut);
    }
    if (null == this.beds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.beds, __dataOut);
    }
    if (null == this.bed_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bed_type);
    }
    if (null == this.amenities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amenities);
    }
    if (null == this.square_feet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.square_feet, __dataOut);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, price);
    }
    if (null == this.weekly_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weekly_price);
    }
    if (null == this.monthly_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, monthly_price);
    }
    if (null == this.security_deposit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, security_deposit);
    }
    if (null == this.cleaning_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cleaning_fee);
    }
    if (null == this.guests_included) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.guests_included, __dataOut);
    }
    if (null == this.extra_people) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, extra_people);
    }
    if (null == this.minimum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.minimum_nights, __dataOut);
    }
    if (null == this.maximum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.maximum_nights, __dataOut);
    }
    if (null == this.calendar_updated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, calendar_updated);
    }
    if (null == this.has_availability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, has_availability);
    }
    if (null == this.availability_30) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_30, __dataOut);
    }
    if (null == this.availability_60) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_60, __dataOut);
    }
    if (null == this.availability_90) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_90, __dataOut);
    }
    if (null == this.availability_365) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.availability_365, __dataOut);
    }
    if (null == this.calendar_last_scraped) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.calendar_last_scraped.getTime());
    }
    if (null == this.number_of_reviews) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_reviews, __dataOut);
    }
    if (null == this.first_review) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_review.getTime());
    }
    if (null == this.last_review) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_review.getTime());
    }
    if (null == this.license) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, license);
    }
    if (null == this.jurisdiction_names) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, jurisdiction_names);
    }
    if (null == this.cancellation_policy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cancellation_policy);
    }
    if (null == this.calculated_host_listings_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.calculated_host_listings_count, __dataOut);
    }
    if (null == this.reviews_per_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.reviews_per_month, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(listing_url==null?"null":listing_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(scrape_id==null?"null":scrape_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_scraped==null?"null":"" + last_scraped, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(summary==null?"null":summary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(space==null?"null":space, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(experiences_offered==null?"null":experiences_offered, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighborhood_overview==null?"null":neighborhood_overview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(notes==null?"null":notes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transit==null?"null":transit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(access==null?"null":access, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(interaction==null?"null":interaction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(house_rules==null?"null":house_rules, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thumbnail_url==null?"null":thumbnail_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(medium_url==null?"null":medium_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(picture_url==null?"null":picture_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(xl_picture_url==null?"null":xl_picture_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_id==null?"null":host_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(street==null?"null":street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood==null?"null":neighbourhood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood_cleansed==null?"null":neighbourhood_cleansed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood_group_cleansed==null?"null":neighbourhood_group_cleansed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market==null?"null":market, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(smart_location==null?"null":smart_location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":latitude.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":longitude.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation==null?"null":geolocation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property_type==null?"null":property_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_type==null?"null":room_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accommodates==null?"null":accommodates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bathrooms==null?"null":bathrooms.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bedrooms==null?"null":bedrooms.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beds==null?"null":beds.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bed_type==null?"null":bed_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amenities==null?"null":amenities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(square_feet==null?"null":square_feet.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weekly_price==null?"null":weekly_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(monthly_price==null?"null":monthly_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(security_deposit==null?"null":security_deposit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cleaning_fee==null?"null":cleaning_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guests_included==null?"null":guests_included.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(extra_people==null?"null":extra_people, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minimum_nights==null?"null":minimum_nights.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maximum_nights==null?"null":maximum_nights.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(calendar_updated==null?"null":calendar_updated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(has_availability==null?"null":has_availability, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_30==null?"null":availability_30.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_60==null?"null":availability_60.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_90==null?"null":availability_90.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_365==null?"null":availability_365.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(calendar_last_scraped==null?"null":"" + calendar_last_scraped, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_reviews==null?"null":number_of_reviews.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_review==null?"null":"" + first_review, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_review==null?"null":"" + last_review, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(license==null?"null":license, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jurisdiction_names==null?"null":jurisdiction_names, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancellation_policy==null?"null":cancellation_policy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(calculated_host_listings_count==null?"null":calculated_host_listings_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reviews_per_month==null?"null":reviews_per_month.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(listing_url==null?"null":listing_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(scrape_id==null?"null":scrape_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_scraped==null?"null":"" + last_scraped, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(summary==null?"null":summary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(space==null?"null":space, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(experiences_offered==null?"null":experiences_offered, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighborhood_overview==null?"null":neighborhood_overview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(notes==null?"null":notes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transit==null?"null":transit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(access==null?"null":access, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(interaction==null?"null":interaction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(house_rules==null?"null":house_rules, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thumbnail_url==null?"null":thumbnail_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(medium_url==null?"null":medium_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(picture_url==null?"null":picture_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(xl_picture_url==null?"null":xl_picture_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_id==null?"null":host_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(street==null?"null":street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood==null?"null":neighbourhood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood_cleansed==null?"null":neighbourhood_cleansed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood_group_cleansed==null?"null":neighbourhood_group_cleansed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market==null?"null":market, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(smart_location==null?"null":smart_location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":latitude.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":longitude.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation==null?"null":geolocation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property_type==null?"null":property_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_type==null?"null":room_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accommodates==null?"null":accommodates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bathrooms==null?"null":bathrooms.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bedrooms==null?"null":bedrooms.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beds==null?"null":beds.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bed_type==null?"null":bed_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amenities==null?"null":amenities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(square_feet==null?"null":square_feet.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weekly_price==null?"null":weekly_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(monthly_price==null?"null":monthly_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(security_deposit==null?"null":security_deposit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cleaning_fee==null?"null":cleaning_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guests_included==null?"null":guests_included.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(extra_people==null?"null":extra_people, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minimum_nights==null?"null":minimum_nights.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maximum_nights==null?"null":maximum_nights.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(calendar_updated==null?"null":calendar_updated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(has_availability==null?"null":has_availability, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_30==null?"null":availability_30.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_60==null?"null":availability_60.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_90==null?"null":availability_90.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(availability_365==null?"null":availability_365.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(calendar_last_scraped==null?"null":"" + calendar_last_scraped, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_reviews==null?"null":number_of_reviews.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_review==null?"null":"" + first_review, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_review==null?"null":"" + last_review, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(license==null?"null":license, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jurisdiction_names==null?"null":jurisdiction_names, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancellation_policy==null?"null":cancellation_policy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(calculated_host_listings_count==null?"null":calculated_host_listings_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reviews_per_month==null?"null":reviews_per_month.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.listing_url = null; } else {
      this.listing_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.scrape_id = null; } else {
      this.scrape_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_scraped = null; } else {
      this.last_scraped = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.summary = null; } else {
      this.summary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.space = null; } else {
      this.space = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.experiences_offered = null; } else {
      this.experiences_offered = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighborhood_overview = null; } else {
      this.neighborhood_overview = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.notes = null; } else {
      this.notes = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.transit = null; } else {
      this.transit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.access = null; } else {
      this.access = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.interaction = null; } else {
      this.interaction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.house_rules = null; } else {
      this.house_rules = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.thumbnail_url = null; } else {
      this.thumbnail_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.medium_url = null; } else {
      this.medium_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.picture_url = null; } else {
      this.picture_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.xl_picture_url = null; } else {
      this.xl_picture_url = __cur_str;
    }

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
    if (__cur_str.equals("null")) { this.street = null; } else {
      this.street = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood = null; } else {
      this.neighbourhood = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood_cleansed = null; } else {
      this.neighbourhood_cleansed = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood_group_cleansed = null; } else {
      this.neighbourhood_group_cleansed = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.market = null; } else {
      this.market = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.smart_location = null; } else {
      this.smart_location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.geolocation = null; } else {
      this.geolocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property_type = null; } else {
      this.property_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.room_type = null; } else {
      this.room_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accommodates = null; } else {
      this.accommodates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bathrooms = null; } else {
      this.bathrooms = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bedrooms = null; } else {
      this.bedrooms = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beds = null; } else {
      this.beds = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.bed_type = null; } else {
      this.bed_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.amenities = null; } else {
      this.amenities = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.square_feet = null; } else {
      this.square_feet = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.price = null; } else {
      this.price = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.weekly_price = null; } else {
      this.weekly_price = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.monthly_price = null; } else {
      this.monthly_price = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.security_deposit = null; } else {
      this.security_deposit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cleaning_fee = null; } else {
      this.cleaning_fee = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.guests_included = null; } else {
      this.guests_included = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.extra_people = null; } else {
      this.extra_people = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.minimum_nights = null; } else {
      this.minimum_nights = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maximum_nights = null; } else {
      this.maximum_nights = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.calendar_updated = null; } else {
      this.calendar_updated = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.has_availability = null; } else {
      this.has_availability = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_30 = null; } else {
      this.availability_30 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_60 = null; } else {
      this.availability_60 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_90 = null; } else {
      this.availability_90 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_365 = null; } else {
      this.availability_365 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.calendar_last_scraped = null; } else {
      this.calendar_last_scraped = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_reviews = null; } else {
      this.number_of_reviews = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_review = null; } else {
      this.first_review = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_review = null; } else {
      this.last_review = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.license = null; } else {
      this.license = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.jurisdiction_names = null; } else {
      this.jurisdiction_names = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cancellation_policy = null; } else {
      this.cancellation_policy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.calculated_host_listings_count = null; } else {
      this.calculated_host_listings_count = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reviews_per_month = null; } else {
      this.reviews_per_month = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.listing_url = null; } else {
      this.listing_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.scrape_id = null; } else {
      this.scrape_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_scraped = null; } else {
      this.last_scraped = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.summary = null; } else {
      this.summary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.space = null; } else {
      this.space = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.experiences_offered = null; } else {
      this.experiences_offered = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighborhood_overview = null; } else {
      this.neighborhood_overview = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.notes = null; } else {
      this.notes = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.transit = null; } else {
      this.transit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.access = null; } else {
      this.access = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.interaction = null; } else {
      this.interaction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.house_rules = null; } else {
      this.house_rules = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.thumbnail_url = null; } else {
      this.thumbnail_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.medium_url = null; } else {
      this.medium_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.picture_url = null; } else {
      this.picture_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.xl_picture_url = null; } else {
      this.xl_picture_url = __cur_str;
    }

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
    if (__cur_str.equals("null")) { this.street = null; } else {
      this.street = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood = null; } else {
      this.neighbourhood = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood_cleansed = null; } else {
      this.neighbourhood_cleansed = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood_group_cleansed = null; } else {
      this.neighbourhood_group_cleansed = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.market = null; } else {
      this.market = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.smart_location = null; } else {
      this.smart_location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.geolocation = null; } else {
      this.geolocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property_type = null; } else {
      this.property_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.room_type = null; } else {
      this.room_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accommodates = null; } else {
      this.accommodates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bathrooms = null; } else {
      this.bathrooms = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bedrooms = null; } else {
      this.bedrooms = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beds = null; } else {
      this.beds = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.bed_type = null; } else {
      this.bed_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.amenities = null; } else {
      this.amenities = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.square_feet = null; } else {
      this.square_feet = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.price = null; } else {
      this.price = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.weekly_price = null; } else {
      this.weekly_price = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.monthly_price = null; } else {
      this.monthly_price = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.security_deposit = null; } else {
      this.security_deposit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cleaning_fee = null; } else {
      this.cleaning_fee = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.guests_included = null; } else {
      this.guests_included = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.extra_people = null; } else {
      this.extra_people = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.minimum_nights = null; } else {
      this.minimum_nights = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maximum_nights = null; } else {
      this.maximum_nights = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.calendar_updated = null; } else {
      this.calendar_updated = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.has_availability = null; } else {
      this.has_availability = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_30 = null; } else {
      this.availability_30 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_60 = null; } else {
      this.availability_60 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_90 = null; } else {
      this.availability_90 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.availability_365 = null; } else {
      this.availability_365 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.calendar_last_scraped = null; } else {
      this.calendar_last_scraped = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_reviews = null; } else {
      this.number_of_reviews = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_review = null; } else {
      this.first_review = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_review = null; } else {
      this.last_review = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.license = null; } else {
      this.license = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.jurisdiction_names = null; } else {
      this.jurisdiction_names = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cancellation_policy = null; } else {
      this.cancellation_policy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.calculated_host_listings_count = null; } else {
      this.calculated_host_listings_count = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reviews_per_month = null; } else {
      this.reviews_per_month = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    listings o = (listings) super.clone();
    o.last_scraped = (o.last_scraped != null) ? (java.sql.Date) o.last_scraped.clone() : null;
    o.calendar_last_scraped = (o.calendar_last_scraped != null) ? (java.sql.Date) o.calendar_last_scraped.clone() : null;
    o.first_review = (o.first_review != null) ? (java.sql.Date) o.first_review.clone() : null;
    o.last_review = (o.last_review != null) ? (java.sql.Date) o.last_review.clone() : null;
    return o;
  }

  public void clone0(listings o) throws CloneNotSupportedException {
    o.last_scraped = (o.last_scraped != null) ? (java.sql.Date) o.last_scraped.clone() : null;
    o.calendar_last_scraped = (o.calendar_last_scraped != null) ? (java.sql.Date) o.calendar_last_scraped.clone() : null;
    o.first_review = (o.first_review != null) ? (java.sql.Date) o.first_review.clone() : null;
    o.last_review = (o.last_review != null) ? (java.sql.Date) o.last_review.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("listing_url", this.listing_url);
    __sqoop$field_map.put("scrape_id", this.scrape_id);
    __sqoop$field_map.put("last_scraped", this.last_scraped);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("summary", this.summary);
    __sqoop$field_map.put("space", this.space);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("experiences_offered", this.experiences_offered);
    __sqoop$field_map.put("neighborhood_overview", this.neighborhood_overview);
    __sqoop$field_map.put("notes", this.notes);
    __sqoop$field_map.put("transit", this.transit);
    __sqoop$field_map.put("access", this.access);
    __sqoop$field_map.put("interaction", this.interaction);
    __sqoop$field_map.put("house_rules", this.house_rules);
    __sqoop$field_map.put("thumbnail_url", this.thumbnail_url);
    __sqoop$field_map.put("medium_url", this.medium_url);
    __sqoop$field_map.put("picture_url", this.picture_url);
    __sqoop$field_map.put("xl_picture_url", this.xl_picture_url);
    __sqoop$field_map.put("host_id", this.host_id);
    __sqoop$field_map.put("street", this.street);
    __sqoop$field_map.put("neighbourhood", this.neighbourhood);
    __sqoop$field_map.put("neighbourhood_cleansed", this.neighbourhood_cleansed);
    __sqoop$field_map.put("neighbourhood_group_cleansed", this.neighbourhood_group_cleansed);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("market", this.market);
    __sqoop$field_map.put("smart_location", this.smart_location);
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("geolocation", this.geolocation);
    __sqoop$field_map.put("property_type", this.property_type);
    __sqoop$field_map.put("room_type", this.room_type);
    __sqoop$field_map.put("accommodates", this.accommodates);
    __sqoop$field_map.put("bathrooms", this.bathrooms);
    __sqoop$field_map.put("bedrooms", this.bedrooms);
    __sqoop$field_map.put("beds", this.beds);
    __sqoop$field_map.put("bed_type", this.bed_type);
    __sqoop$field_map.put("amenities", this.amenities);
    __sqoop$field_map.put("square_feet", this.square_feet);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("weekly_price", this.weekly_price);
    __sqoop$field_map.put("monthly_price", this.monthly_price);
    __sqoop$field_map.put("security_deposit", this.security_deposit);
    __sqoop$field_map.put("cleaning_fee", this.cleaning_fee);
    __sqoop$field_map.put("guests_included", this.guests_included);
    __sqoop$field_map.put("extra_people", this.extra_people);
    __sqoop$field_map.put("minimum_nights", this.minimum_nights);
    __sqoop$field_map.put("maximum_nights", this.maximum_nights);
    __sqoop$field_map.put("calendar_updated", this.calendar_updated);
    __sqoop$field_map.put("has_availability", this.has_availability);
    __sqoop$field_map.put("availability_30", this.availability_30);
    __sqoop$field_map.put("availability_60", this.availability_60);
    __sqoop$field_map.put("availability_90", this.availability_90);
    __sqoop$field_map.put("availability_365", this.availability_365);
    __sqoop$field_map.put("calendar_last_scraped", this.calendar_last_scraped);
    __sqoop$field_map.put("number_of_reviews", this.number_of_reviews);
    __sqoop$field_map.put("first_review", this.first_review);
    __sqoop$field_map.put("last_review", this.last_review);
    __sqoop$field_map.put("license", this.license);
    __sqoop$field_map.put("jurisdiction_names", this.jurisdiction_names);
    __sqoop$field_map.put("cancellation_policy", this.cancellation_policy);
    __sqoop$field_map.put("calculated_host_listings_count", this.calculated_host_listings_count);
    __sqoop$field_map.put("reviews_per_month", this.reviews_per_month);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("listing_url", this.listing_url);
    __sqoop$field_map.put("scrape_id", this.scrape_id);
    __sqoop$field_map.put("last_scraped", this.last_scraped);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("summary", this.summary);
    __sqoop$field_map.put("space", this.space);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("experiences_offered", this.experiences_offered);
    __sqoop$field_map.put("neighborhood_overview", this.neighborhood_overview);
    __sqoop$field_map.put("notes", this.notes);
    __sqoop$field_map.put("transit", this.transit);
    __sqoop$field_map.put("access", this.access);
    __sqoop$field_map.put("interaction", this.interaction);
    __sqoop$field_map.put("house_rules", this.house_rules);
    __sqoop$field_map.put("thumbnail_url", this.thumbnail_url);
    __sqoop$field_map.put("medium_url", this.medium_url);
    __sqoop$field_map.put("picture_url", this.picture_url);
    __sqoop$field_map.put("xl_picture_url", this.xl_picture_url);
    __sqoop$field_map.put("host_id", this.host_id);
    __sqoop$field_map.put("street", this.street);
    __sqoop$field_map.put("neighbourhood", this.neighbourhood);
    __sqoop$field_map.put("neighbourhood_cleansed", this.neighbourhood_cleansed);
    __sqoop$field_map.put("neighbourhood_group_cleansed", this.neighbourhood_group_cleansed);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("market", this.market);
    __sqoop$field_map.put("smart_location", this.smart_location);
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("geolocation", this.geolocation);
    __sqoop$field_map.put("property_type", this.property_type);
    __sqoop$field_map.put("room_type", this.room_type);
    __sqoop$field_map.put("accommodates", this.accommodates);
    __sqoop$field_map.put("bathrooms", this.bathrooms);
    __sqoop$field_map.put("bedrooms", this.bedrooms);
    __sqoop$field_map.put("beds", this.beds);
    __sqoop$field_map.put("bed_type", this.bed_type);
    __sqoop$field_map.put("amenities", this.amenities);
    __sqoop$field_map.put("square_feet", this.square_feet);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("weekly_price", this.weekly_price);
    __sqoop$field_map.put("monthly_price", this.monthly_price);
    __sqoop$field_map.put("security_deposit", this.security_deposit);
    __sqoop$field_map.put("cleaning_fee", this.cleaning_fee);
    __sqoop$field_map.put("guests_included", this.guests_included);
    __sqoop$field_map.put("extra_people", this.extra_people);
    __sqoop$field_map.put("minimum_nights", this.minimum_nights);
    __sqoop$field_map.put("maximum_nights", this.maximum_nights);
    __sqoop$field_map.put("calendar_updated", this.calendar_updated);
    __sqoop$field_map.put("has_availability", this.has_availability);
    __sqoop$field_map.put("availability_30", this.availability_30);
    __sqoop$field_map.put("availability_60", this.availability_60);
    __sqoop$field_map.put("availability_90", this.availability_90);
    __sqoop$field_map.put("availability_365", this.availability_365);
    __sqoop$field_map.put("calendar_last_scraped", this.calendar_last_scraped);
    __sqoop$field_map.put("number_of_reviews", this.number_of_reviews);
    __sqoop$field_map.put("first_review", this.first_review);
    __sqoop$field_map.put("last_review", this.last_review);
    __sqoop$field_map.put("license", this.license);
    __sqoop$field_map.put("jurisdiction_names", this.jurisdiction_names);
    __sqoop$field_map.put("cancellation_policy", this.cancellation_policy);
    __sqoop$field_map.put("calculated_host_listings_count", this.calculated_host_listings_count);
    __sqoop$field_map.put("reviews_per_month", this.reviews_per_month);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
