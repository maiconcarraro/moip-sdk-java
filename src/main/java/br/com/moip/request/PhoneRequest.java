package br.com.moip.request;

public class PhoneRequest {

    private String areaCode;
    private String number;
    private String countryCode;

    public PhoneRequest setAreaCode(final String areaCode) {
        this.areaCode = areaCode;

        return this;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public PhoneRequest setNumber(final String number) {
        this.number = number;

        return this;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public PhoneRequest countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return new StringBuilder("PhoneRequest{")
                .append("areaCode='").append(areaCode).append('\'')
                .append(", number='").append(number).append('\'')
                .append('}').toString();
    }
}
