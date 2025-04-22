package com.WalkingCompiler.Utils;
import com.WalkingCompiler.Data.models.Security;
import com.WalkingCompiler.Services.SecurityService;
import lombok.Data;


@Data
public class SecurityMapper {

    public static Security mapToSecurityService(String securityService) {
        return new Security(
                "",
                "",
                ""
        );
    }

    public static SecurityService mapToSecurity(SecurityService security) {
        return (SecurityService) new Security(
                "",
                "",
                ""
        );
    }
}
