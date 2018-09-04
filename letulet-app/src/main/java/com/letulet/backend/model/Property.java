package com.letulet.backend.model;

import com.letulet.backend.model.airbnb.AirbnbUser;
import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.StringLength;

import java.util.Date;

/**
 * Created by stephan on 09/11/17.
 */
public interface Property extends Entity {

    public Type getType();
    void setType(Type type);

    public ListingType getListingType();
    void setListingType(ListingType listingType);

    String getName();
    void setName(String name);

    Tenant getTenant();
    void setTenant(Tenant tenant);

    Landlord getLandlord();
    void setLandlord(Landlord landlord);

    String getAddress1();
    void setAddress1(String address1);

    String getAddress2();
    void setAddress2(String address2);

    String getCity();
    void setCity(String city);

    String getZipCode();
    void setZipCode(String zipCode);

    String getState();
    void setState(String state);

    //@Default("US")
    CountryCode getCountryCode();
    public void setCountryCode(CountryCode country);

    @Default("0")
    int getBedrooms();
    void setBedrooms(int bedrooms);

    @Default("0")
    int getBathrooms();
    void setBathrooms(int bathrooms);

    @Default("0")
    int getBedCount();
    void setBedCount(int bedCount);

    @Default("1")
    int getBaseGuests();
    void setBaseGuests(int baseGuests);

    @Default("1")
    int getMaximumGuests();
    void setMaximumGuests(int maximumGuests);

    @Default("0")
    double getExtraGuestFee();
    void setExtraGuestFee(double extraGuestFee);

    String getPicture();
    void setPicture(String picture);

    String getWebLink();
    void setWebLink(String webLink);

    double getLatitude();
    void setLatitude(double latitude);

    double getLongitude();
    void setLongitude(double longitude);

    @Default("1")
    boolean getIsActive();
    void setIsActive(boolean isActive);

    Date getCreatedOn();
    void setCreatedOn(Date createdOn);

    Date getUpdatedOn();
    void setUpdatedOn(Date updatedOn);

    String getUID();
    void setUID(String uid);

    @Default("0")
    double getCleaningFeeAmount();
    void setCleaningFeeAmount(double cleaningFeeAmount);

    @Default("0")
    double getBaseDailyRate();
    void setBaseDailyRate(double baseDailyRate);

    String getAirBnBID();
    void setAirBnBID(String airBnBID);

    String getAirBnBImportID();
    void setAirBnBImportID(String airBnBImportID);

    @Default("2")     //in days
    int getMinimumStay();
    void setMinimumStay(int minimumStay);

    @Default("0")
    double getSecurityDepositAmount();
    void setSecurityDepositAmount(double securityDepositAmount);

    // Properties with no relationships will get physically deleted
    // Properties with relationships can use this logical delete to be hidden
    @Default("0")
    boolean getIsDeleted();
    void setIsDeleted(boolean isDeleted);

    @StringLength(StringLength.UNLIMITED)
    String getDescription();
    void setDescription(String description);

    String getShortDescription();
    void setShortDescription(String shortDescription);

    @Default("0")
    double getTaxationRate();
    void setTaxationRate(double taxationRate);

    public Currency getCurrency();
    void setCurrency(Currency currency);

    int getFloor();
    void setFloor(int floor);

    int getAreaSize();
    void setAreaSize(int areaSize);

    enum AreaSizeUnitType {SQUARE_METERS, SQUARE_FEET;
        public String getLabel() {
            switch(this) {
                case SQUARE_METERS:
                    return "meters";
                case SQUARE_FEET:
                    return "feet";
                default:
                    return "feet";
            }
        }
    }

    AreaSizeUnitType getAreaSizeUnitType();
    void setAreaSizeUnitType(AreaSizeUnitType areaSizeUnitType);

    @Default("0")
    boolean getAutomatedPricingEnabled();
    void setAutomatedPricingEnabled(boolean automatedPricingEnabled);

    String getBeyondPricingID();
    void setBeyondPricingID(String beyondPricingID);

    @StringLength(StringLength.UNLIMITED)
    String getRentalConditions();
    void setRentalConditions(String rentalConditions);

    @StringLength(StringLength.UNLIMITED)
    String getCancelationPolicy();
    void setCancelationPolicy(String cancelationPolicy);

    @Default("0")
    double getWeekEndRatePercentAdjustment();
    void setWeekEndRatePercentAdjustment(double weekEndRatePercentAdjustment);

    String getTimeZone();
    void setTimeZone(String timeZone);

    // added during Airbnb project

    @Default("15")        // example: 15 for 3pm
    void setDefaultCheckinTime(int defaultCheckinTime);
    public int getDefaultCheckinTime();

    @Default("11")        // example: 11 for 11am
    void setDefaultCheckoutTime(int defaultCheckoutTime);
    public int getDefaultCheckoutTime();

    @Default("0")     //in days. 0 = unlimited
    int getMaximumStay();
    void setMaximumStay(int maximumStay);

    @Default("0")     //in days
    int getMinimumWeekendStay();
    void setMinimumWeekendStay(int minimumWeekendStay);

    @Default("-1")        // maximum booking window. How far from the current date can a guest make a booking. If not set, the default behavior is unlimited. If set, supported values are 90, 180, and 365
    void setMaxDaysNotice(int maxDaysNotice);
    public int getMaxDaysNotice();

    @Default("48")     //in hours
    int getBookingLeadTime();
    void setBookingLeadTime(int bookingLeadTime);

    @Default("0")     //in days
    int getTurnOverDays();
    void setTurnOverDays(int turnOverDays);

    @Default("0")
    double getDefaultWeekendPrice();
    void setDefaultWeekendPrice(double defaultWeekendPrice);

    String getRentalLicenseNumber();
    void setRentalLicenseNumber(String rentalLicenseNumber);

    // new settings

    String getOwnerName();
    void setOwnerName(String ownerName);

    public AirbnbUser getAirbnbUser();
    void setAirbnbUser (AirbnbUser airbnbUser);


    @Default("1")
    boolean getNotifiedOfNewBooking();
    void setNotifiedOfNewBooking(boolean notifiedOfNewBooking);

    @Default("0")
    boolean getAllowPets();
    void setAllowPets(boolean allowPets);

    //Deprecated
    @Default("0")
    boolean getAllowNoise();
    void setAllowNoise(boolean allowNoise);

    @Default("0") //24h / -1 if rules not set
    int getDisallowNoiseAfter();
    void setDisallowNoiseAfter(int time);

    @Default("0")
    boolean getAllowSmoking();
    void setAllowSmoking(boolean allowSmoking);

    @StringLength(StringLength.UNLIMITED)
    String getComplianceRules();
    void setComplianceRules(String complianceRules);

    @StringLength(StringLength.UNLIMITED)
     String getHouseRules();
     void setHouseRules(String houseRules);

    enum ListingType {
        ENTIREHOME,
        SHAREDROOM,
        PRIVATEROOM;

        public String getLabel() {
            switch(this) {
                case ENTIREHOME:
                    return "entire_home";
                case SHAREDROOM:
                    return "shared_room";
                case PRIVATEROOM:
                    return "private_room";
                default:
                    return "entire_home";
            }
        }
    }

    enum Type {
        HOUSE,
        COTTAGE,
        CONDO,
        BEDANDBREAKFAST,
        VILLA,
        CHALET,
        CABIN,
        STUDIO,
        ROOM,
        APARTMENT,
        HOTEL,
        LODGE,
        TOWNHOUSE,
        DUPLEX,
        TRIPLEX,
        FOURPLEX,
        BUNGALOW,
        FARMHOUSE,
        BOAT,
        HOUSEBOAT,
        RESORT,
        PENTHOUSE,
        CHATEAU,
        GUESTHOUSE,
        HOMESTAY,
        CAMPGROUND,
        MOTELROOM,
        COUNTRYHOUSE,
        LOFT,
        DORM,
        TREEHOUSE,
        PLANE,
        IGLOO,
        RV,
        LIGHTHOUSE,
        YURT,
        TIPI,
        CAVE,
        ISLAND,
        EARTHHOUSE,
        HUT,
        TRAIN,
        TENT,
        SAMPLE,
        OTHER;

        public String getLabel() {
            switch(this) {
                case HOUSE:
                    return "House";
                case COTTAGE:
                    return "Cottage";
                case CONDO:
                    return "Condominium";
                case BEDANDBREAKFAST:
                    return "Bnb";
                case VILLA:
                    return "Villa";
                case CHALET:
                    return "Chalet";
                case CABIN:
                    return "Cabin";
                case STUDIO:
                    return "Studio";
                case ROOM:
                    return "Room";
                case APARTMENT:
                    return "Apartment";
                case HOTEL:
                    return "Hotel";
                case LODGE:
                    return "Lodge";
                case TOWNHOUSE:
                    return "Townhouse";
                case DUPLEX:
                    return "Duplex";
                case TRIPLEX:
                    return "Triplex";
                case FOURPLEX:
                    return "Fourplex";
                case BUNGALOW:
                    return "Bungalow";
                case FARMHOUSE:
                    return "Farmhouse";
                case BOAT:
                    return "Boat";
                case HOUSEBOAT:
                    return "Houseboat";
                case RESORT:
                    return "Resort";
                case PENTHOUSE:
                    return "Penthouse";
                case CHATEAU:
                    return "Castle";
                case GUESTHOUSE:
                    return "Guest House";
                case HOMESTAY:
                    return "Homestay";
                case CAMPGROUND:
                    return "Campground";
                case MOTELROOM:
                    return "Motel Room";
                case COUNTRYHOUSE:
                    return "Country House";
                case SAMPLE:
                    return "Sample Property";
                case LOFT:
                    return "Loft";
                case DORM:
                    return "Dorm";
                case TREEHOUSE:
                    return "Treehouse";
                case PLANE:
                    return "Plane";
                case IGLOO:
                    return "Igloo";
                case RV:
                    return "RV";
                case LIGHTHOUSE:
                    return "Lighthouse";
                case YURT:
                    return "Yurt";
                case TIPI:
                    return "Tipi";
                case CAVE:
                    return "Cave";
                case ISLAND:
                    return "Island";
                case EARTHHOUSE:
                    return "Earthouse";
                case HUT:
                    return "Hut";
                case TRAIN:
                    return "Train";
                case TENT:
                    return "Tent";
                case OTHER:
                    return "Other";
                default:
                    return "Other";
            }
        }
    }

    @Default("0")     //
    int getMaximumReservationsPerYear();
    void setMaximumReservationsPerYear(int maximumReservationsPerYear);

    @Default("0")     //
    int getMaximumDaysPerYear();
    void setMaximumDaysPerYear(int maximumDaysPerYear);
}

