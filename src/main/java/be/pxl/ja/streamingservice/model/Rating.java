package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little kids"),
    OLDER_KIDS("Older kids",7),
    TEENS("Teens",12),
    MATURE("Mature",16);

    private static final int DEFAULT_AGE = 7;
    private String ageGroup;
    private int minimumAge;

    Rating(String ageGroup, int minimumAge) {
        this.ageGroup = ageGroup;
        this.minimumAge = minimumAge;
    }

    Rating(String ageGroup) {
        this(ageGroup, DEFAULT_AGE );
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public int getMinimumAge() {
        return minimumAge;
    }
}
