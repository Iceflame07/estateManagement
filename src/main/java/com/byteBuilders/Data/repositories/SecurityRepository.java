package com.byteBuilders.Data.repositories;
import com.byteBuilders.Data.models.Security;

public interface SecurityRepository {

    Security findBySecurityName(String SecurityName);
    Security findBySecurityId(int SecurityId);
    Security save(Security security);

}