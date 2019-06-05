package model;

public class FlickrAuth {
    private String token;
    private String tokensecret;

    public FlickrAuth(String token, String tokensecret) {
        this.token = token;
        this.tokensecret = tokensecret;
    }

    public String getToken() {
        return token;
    }

    public String getTokensecret() {
        return tokensecret;
    }
}
