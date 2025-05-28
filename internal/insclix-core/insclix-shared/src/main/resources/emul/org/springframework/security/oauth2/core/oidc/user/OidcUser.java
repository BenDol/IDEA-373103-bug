package org.springframework.security.oauth2.core.oidc.user;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import java.util.Map;

public interface OidcUser {

    /**
     * Returns the claims about the user. The claims are aggregated from
     * {@link #getIdToken()} and {@link #getUserInfo()} (if available).
     * @return a {@code Map} of claims about the user
     */
    Map<String, Object> getClaims();

    /**
     * Returns the {@link OidcUserInfo UserInfo} containing claims about the user.
     * @return the {@link OidcUserInfo} containing claims about the user.
     */
    OidcUserInfo getUserInfo();

    /**
     * Returns the {@link OidcIdToken ID Token} containing claims about the user.
     * @return the {@link OidcIdToken} containing claims about the user.
     */
    OidcIdToken getIdToken();

    String getName();
}