package enums;

public enum Zi {
    LUNI("Monday", "going to park"),
    MARTI("Tuesday", "reading"),
    MIERCURI("Wednesday", "jogging"),
    JOI("Thursday", "going to cinema"),
    VINERI("Friday", "cycling"),
    SAMBATA("Saturday", "sleeping"),
    DUMINICA("Sunday", "eating");




    String englishNameVersion;

    String activity;

    Zi(String englishNameVersion, String activity) {
        this.englishNameVersion = englishNameVersion;
        this.activity = activity;
    }

    public void printActivity(){
        System.out.println(activity);
    }
}
