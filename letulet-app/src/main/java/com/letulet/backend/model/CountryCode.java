package com.letulet.backend.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stephan on 07/11/17.
 */
public enum CountryCode {

    AF("AFG","004","Afghanistan",33.0000,65.0000),
    AL("ALB","008","Albania",41.0000,20.0000),
    DZ("DZA","012","Algeria",28.0000,3.0000),
    AS("ASM","016","American Samoa",-14.3333,-170.0000),
    AD("AND","020","Andorra",42.5000,1.5000),
    AO("AGO","024","Angola",-12.5000,18.5000),
    AI("AIA","660","Anguilla",18.2500,-63.1667),
    AG("ATG","028","Antigua and Barbuda",17.0500,-61.8000),
    AR("ARG","032","Argentina",-34.0000,-64.0000),
    AM("ARM","051","Armenia",40.0000,45.0000),
    AW("ABW","533","Aruba",12.5000,-69.9667),
    AU("AUS","036","Australia",-27.0000,133.0000),
    AT("AUT","040","Austria",47.3333,13.3333),
    AZ("AZE","031","Azerbaijan",40.5000,47.5000),
    BS("BHS","044","Bahamas",24.2500,-76.0000),
    BH("BHR","048","Bahrain",26.0000,50.5500),
    BD("BGD","050","Bangladesh",24.0000,90.0000),
    BB("BRB","052","Barbados",13.1667,-59.5333),
    BY("BLR","112","Belarus",53.0000,28.0000),
    BE("BEL","056","Belgium",50.8333,4.0000),
    BZ("BLZ","084","Belize",17.2500,-88.7500),
    BJ("BEN","204","Benin",9.5000,2.2500),
    BM("BMU","060","Bermuda",32.3333,-64.7500),
    BT("BTN","064","Bhutan",27.5000,90.5000),
    BO("BOL","068","Bolivia",-17.0000,-65.0000),
    BA("BIH","070","Bosnia",44.0000,18.0000),
    BW("BWA","072","Botswana",-22.0000,24.0000),
    BR("BRA","076","Brazil",-10.0000,-55.0000),
    BN("BRN","096","Brunei Darussalam",4.5000,114.6667),
    BG("BGR","100","Bulgaria",43.0000,25.0000),
    BF("BFA","854","Burkina Faso",13.0000,-2.0000),
    BI("BDI","108","Brunei",-3.5000,30.0000),
    KH("KHM","116","Cambodia",13.0000,105.0000),
    CM("CMR","120","Cameroon",6.0000,12.0000),
    CA("CAN","124","Canada",60.0000,-95.0000),
    CV("CPV","132","Cape Verde",16.0000,-24.0000),
    KY("CYM","136","Cayman Islands",19.5000,-80.5000),
    CF("CAF","140","Central African Republic",7.0000,21.0000),
    TD("TCD","148","Chad",15.0000,19.0000),
    CL("CHL","152","Chile",-30.0000,-71.0000),
    CN("CHN","156","China",35.0000,105.0000),
    CX("CXR","162","Christmas Island",-10.5000,105.6667),
    CC("CCK","166","Cocos Islands",-12.5000,96.8333),
    CO("COL","170","Colombia",4.0000,-72.0000),
    KM("COM","174","Comoros",-12.1667,44.2500),
    CG("COG","178","Congo",-1.0000,15.0000),
    CK("COK","184","Cook Islands",-21.2333,-159.7667),
    CR("CRI","188","Costa Rica",10.0000,-84.0000),
    CI("CIV","384","Ivory Coast",8.0000,-5.0000),
    HR("HRV","191","Croatia",45.1667,15.5000),
    CU("CUB","192","Cuba",21.5000,-80.0000),
    CW("CUW","531","Curaçao",12.2135187,-68.9495647),
    CY("CYP","196","Cyprus",35.0000,33.0000),
    CZ("CZE","203","Czech Republic",49.7500,15.5000),
    DK("DNK","208","Denmark",56.0000,10.0000),
    DJ("DJI","262","Djibouti",11.5000,43.0000),
    DM("DMA","212","Dominica",15.4167,-61.3333),
    DO("DOM","214","Dominican Republic",19.0000,-70.6667),
    EC("ECU","218","Ecuador",-2.0000,-77.5000),
    EG("EGY","818","Egypt",27.0000,30.0000),
    SV("SLV","222","El Salvador",13.8333,-88.9167),
    GQ("GNQ","226","Equatorial Guinea",2.0000,10.0000),
    ER("ERI","232","Eritrea",15.0000,39.0000),
    EE("EST","233","Estonia",59.0000,26.0000),
    ET("ETH","231","Ethiopia",8.0000,38.0000),
    FJ("FJI","242","Fiji",-18.0000,175.0000),
    FI("FIN","246","Finland",64.0000,26.0000),
    FR("FRA","250","France",46.0000,2.0000),
    GA("GAB","266","Gabon",-1.0000,11.7500),
    GM("GMB","270","Gambia",13.4667,-16.5667),
    GE("GEO","268","Georgia",42.0000,43.5000),
    DE("DEU","276","Germany",51.0000,9.0000),
    GH("GHA","288","Ghana",8.0000,-2.0000),
    GR("GRC","300","Greece",39.0000,22.0000),
    GL("GRL","304","Greenland",72.0000,-40.0000),
    GD("GRD","308","Grenada",12.1167,-61.6667),
    GU("GUM","316","Guam",13.4667,144.7833),
    GT("GTM","320","Guatemala",15.5000,-90.2500),
    GN("GIN","324","Guinea",11.0000,-10.0000),
    GW("GNB","624","Guinea-Bissau",12.0000,-15.0000),
    GY("GUY","328","Guyana",5.0000,-59.0000),
    HT("HTI","332","Haiti",19.0000,-72.4167),
    VA("VAT","336","Vatican City",41.9000,12.4500),
    HN("HND","340","Honduras",15.0000,-86.5000),
    HK("HKG","344","Hong Kong",22.2500,114.1667),
    HU("HUN","348","Hungary",47.0000,20.0000),
    IS("ISL","352","Iceland",65.0000,-18.0000),
    IN("IND","356","India",20.0000,77.0000),
    ID("IDN","360","Indonesia",-5.0000,120.0000),
    IR("IRN","364","Iran",32.0000,53.0000),
    IQ("IRQ","368","Iraq",33.0000,44.0000),
    IE("IRL","372","Ireland",53.0000,-8.0000),
    IL("ISR","376","Israel",31.5000,34.7500),
    IT("ITA","380","Italy",42.8333,12.8333),
    JM("JAM","388","Jamaica",18.2500,-77.5000),
    JP("JPN","392","Japan",36.0000,138.0000),
    JO("JOR","400","Jordan",31.0000,36.0000),
    KZ("KAZ","398","Kazakhstan",48.0000,68.0000),
    KE("KEN","404","Kenya",1.0000,38.0000),
    KI("KIR","296","Kiribati",1.4167,173.0000),
    KP("PRK","408","North Korea",40.0000,127.0000),
    KR("KOR","410","South Korea",37.0000,127.5000),
    KW("KWT","414","Kuwait",29.3375,47.6581),
    KG("KGZ","417","Kyrgyzstan",41.0000,75.0000),
    LA("LAO","418","Laos",18.0000,105.0000),
    LV("LVA","428","Latvia",57.0000,25.0000),
    LB("LBN","422","Lebanon",33.8333,35.8333),
    LS("LSO","426","Lesotho",-29.5000,28.5000),
    LR("LBR","430","Liberia",6.5000,-9.5000),
    LY("LBY","434","Libya",25.0000,17.0000),
    LI("LIE","438","Liechtenstein",47.1667,9.5333),
    LT("LTU","440","Lithuania",56.0000,24.0000),
    LU("LUX","442","Luxembourg",49.7500,6.1667),
    MO("MAC","446","Macau",22.1667,113.5500),
    MK("MKD","807","Macedonia",41.8333,22.0000),
    MG("MDG","450","Madagascar",-20.0000,47.0000),
    MW("MWI","454","Malawi",-13.5000,34.0000),
    MY("MYS","458","Malaysia",2.5000,112.5000),
    MV("MDV","462","Maldives",3.2500,73.0000),
    ML("MLI","466","Mali",17.0000,-4.0000),
    MT("MLT","470","Malta",35.8333,14.5833),
    MH("MHL","584","Marshall Islands",9.0000,168.0000),
    MR("MRT","478","Mauritania",20.0000,-12.0000),
    MX("MEX","484","Mexico",23.0000,-102.0000),
    FM("FSM","583","Micronesia",6.9167,158.2500),
    MD("MDA","498","Moldova",47.0000,29.0000),
    MC("MCO","492","Monaco",43.7333,7.4000),
    MN("MNG","496","Mongolia",46.0000,105.0000),
    MS("MSR","500","Montserrat",16.7500,-62.2000),
    MA("MAR","504","Morocco",32.0000,-5.0000),
    MZ("MOZ","508","Mozambique",-18.2500,35.0000),
    MM("MMR","104","Myanmar",22.0000,98.0000),
    NA("NAM","516","Namibia",-22.0000,17.0000),
    NR("NRU","520","Nauru",-0.5333,166.9167),
    NP("NPL","524","Nepal",28.0000,84.0000),
    NL("NLD","528","Netherlands",52.5000,5.7500),
    NC("NCL","540","New Caledonia",-21.5000,165.5000),
    NZ("NZL","554","New Zealand",-41.0000,174.0000),
    NI("NIC","558","Nicaragua",13.0000,-85.0000),
    NE("NER","562","Niger",16.0000,8.0000),
    NG("NGA","566","Nigeria",10.0000,8.0000),
    NU("NIU","570","Niue",-19.0333,-169.8667),
    NF("NFK","574","Norfolk Island",-29.0333,167.9500),
    NO("NOR","578","Norway",62.0000,10.0000),
    OM("OMN","512","Oman",21.0000,57.0000),
    PK("PAK","586","Pakistan",30.0000,70.0000),
    PW("PLW","585","Palau",7.5000,134.5000),
    PA("PAN","591","Panama",9.0000,-80.0000),
    PG("PNG","598","Papua New Guinea",-6.0000,147.0000),
    PS("PSE","275","Palestine",32.0000,35.2500),
    PY("PRY","600","Paraguay",-23.0000,-58.0000),
    PE("PER","604","Peru",-10.0000,-76.0000),
    PH("PHL","608","Philippines",13.0000,122.0000),
    PL("POL","616","Poland",52.0000,20.0000),
    PT("PRT","620","Portugal",39.5000,-8.0000),
    PR("PRI","630","Puerto Rico",18.2500,-66.5000),
    QA("QAT","634","Qatar",25.5000,51.2500),
    RO("ROM","642","Romania",46.0000,25.0000),
    RU("RUS","643","Russian Federation",60.0000,100.0000),
    RW("RWA","646","Rwanda",-2.0000,30.0000),
    KN("KNA","659","Saint Kitts",17.3333,-62.7500),
    WS("WSM","882","Samoa",-13.5833,-172.3333),
    SM("SMR","674","San Marino",43.7667,12.4167),
    SA("SAU","682","Saudi Arabia",25.0000,45.0000),
    SN("SEN","686","Senegal",14.0000,-14.0000),
    RS("SRB","688","Serbia",44.0000,21.0000),
    SC("SYC","690","Seychelles",-4.5833,55.6667),
    SL("SLE","694","Sierra Leone",8.5000,-11.5000),
    SG("SGP","702","Singapore",1.3667,103.8000),
    SK("SVK","703","Slovakia",48.6667,19.5000),
    SI("SVN","705","Slovenia",46.0000,15.0000),
    SB("SLB","090","Solomon Islands",-8.0000,159.0000),
    SO("SOM","706","Somalia",10.0000,49.0000),
    ZA("ZAF","710","South Africa",-29.0000,24.0000),
    ES("ESP","724","Spain",40.0000,-4.0000),
    LK("LKA","144","Sri Lanka",7.0000,81.0000),
    SR("SUR","740","Suriname",4.0000,-56.0000),
    SJ("SJM","744","Svalbard and Jan Mayen Is.",78.0000,20.0000),
    SZ("SWZ","748","Swaziland",-26.5000,31.5000),
    SE("SWE","752","Sweden",62.0000,15.0000),
    CH("CHE","756","Switzerland",47.0000,8.0000),
    TW("TWN","158","Taiwan",23.5000,121.0000),
    TJ("TJK","762","Tajikistan",39.0000,71.0000),
    TZ("TZA","834","Tanzania",-6.0000,35.0000),
    TH("THA","764","Thailand",15.0000,100.0000),
    TG("TGO","768","Togo",8.0000,1.1667),
    TO("TON","776","Tonga",-20.0000,-175.0000),
    TT("TTO","780","Trinidad and Tobago",11.0000,-61.0000),
    TN("TUN","788","Tunisia",34.0000,9.0000),
    TR("TUR","792","Turkey",39.0000,35.0000),
    TM("TKM","795","Turkmenistan",40.0000,60.0000),
    UG("UGA","800","Uganda",1.0000,32.0000),
    UA("UKR","804","Ukraine",49.0000,32.0000),
    AE("ARE","784","United Arab Emirates",24.0000,54.0000),
    GB("GBR","826","United Kingdom",54.0000,-2.0000),
    US("USA","840","United States",38.0000,-97.0000),
    UY("URY","858","Uruguay",-33.0000,-56.0000),
    UZ("UZB","860","Uzbekistan",41.0000,64.0000),
    VU("VUT","548","Vanuatu",-16.0000,167.0000),
    VE("VEN","862","Venezuela",8.0000,-66.0000),
    VN("VNM","704","Vietnam",16.0000,106.0000),
    VG("VGB","092","Virgin Islands (British)",18.5000,-64.5000),
    VI("VIR","850","Virgin Islands (US)",18.3333,-64.8333),
    WF("WLF","876","Wallis and Futuna Is.",-13.3000,-176.2000),
    EH("ESH","732","Western Sahara",24.5000,-13.0000),
    YE("YEM","887","Yemen",15.0000,48.0000),
    YU("YUG","891","Yugoslavia",44.0000,21.0000),
    ZM("ZMB","894","Zambia",-15.0000,30.0000),
    ZW("ZWE","716","Zimbabwe",-20.0000,30.0000);

    private final String a3;
    private final String iso;
    private final String name;
    private final double latitude;
    private final double longitude;

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getA3() {
        return a3;
    }

    public String getISO() {
        return iso;
    }

    private CountryCode(String a3, String iso, String name,
        double latitude, double longitude) {
        this.a3 = a3;
        this.iso = iso;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public static List<String> keys() {
        ArrayList<String> result = new ArrayList<String>(CountryCode.values().length);
        for (CountryCode cc : CountryCode.values()) {
            result.add(cc.toString());
        }
        return result;
    }


    public static CountryCode findByName(String name){
        for(CountryCode v : values()){
            if( v.getName().equalsIgnoreCase(name)){
                return v;
            }
        }
        return null;
    }
}

