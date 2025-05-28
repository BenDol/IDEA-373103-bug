package org.springframework.security.oauth2.core.oidc;

import java.io.Serializable;
import java.util.Map;

/**
 * A representation of a UserInfo Response that is returned from the OAuth 2.0 Protected
 * Resource UserInfo Endpoint.
 *
 * <p>
 * The {@code OidcUserInfo} contains a set of &quot;Standard Claims&quot; about the
 * authentication of an End-User.
 *
 * @author Joe Grandja
 * @since 5.0
 * @see StandardClaimAccessor
 * @see <a target="_blank" href=
 * "https://openid.net/specs/openid-connect-core-1_0.html#UserInfoResponse">UserInfo
 * Response</a>
 * @see <a target="_blank" href=
 * "https://openid.net/specs/openid-connect-core-1_0.html#UserInfo">UserInfo Endpoint</a>
 * @see <a target="_blank" href=
 * "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">Standard
 * Claims</a>
 */
public class OidcUserInfo implements Serializable {

    public OidcUserInfo(Map<String, Object> additionalParameters) {

    }
}