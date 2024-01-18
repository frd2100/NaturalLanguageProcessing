package NER.model;

public enum Type {

    PERSON("person"),
    CITY("city"),
    STATE_OR_PROVINCE("state_or_province"),
    COUNTRY("country"),
    EMAIL("email"),
    TITLE("title");

    private String type;

    Type(String type) {
        this.type = type;
    }
    public String getName() {
        return type;
    }

}
