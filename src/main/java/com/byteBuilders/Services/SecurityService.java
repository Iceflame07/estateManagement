package com.byteBuilders.Services;
import com.byteBuilders.Data.models.Security;

import java.util.List;

public interface SecurityService {
    private List<Security> getAllSecurity() {
        return List.of(
                new Security (
                        "Adamu",
                        10,
                        0
                )
        );
    }
}
