/*
 * SwaggerPetstoreLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.swagger.petstore;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import io.swagger.petstore.models.*;

public class Configuration {
    //OAuth 2 Client ID
    //TODO: Replace the oAuthClientId with an appropriate value
    public static String oAuthClientId = "TODO: Replace";

    //OAuth 2 Redirection endpoint or Callback Uri
    //TODO: Replace the oAuthRedirectUri with an appropriate value
    public static String oAuthRedirectUri = "TODO: Replace";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.PRODUCTION;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.SERVER1);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = -633999557L;
        {
            put(Environments.PRODUCTION, new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5125855844959241321L;
                {
                    put(Servers.SERVER1, "https://petstore.swagger.io/v2");
                    put(Servers.SERVER2, "http://petstore.swagger.io/v2");
                    put(Servers.AUTH_SERVER, "https://petstore.swagger.io/oauth");
                }
            });
        }
    };
}
