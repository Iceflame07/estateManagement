package com.WalkingCompiler.Services;
import com.WalkingCompiler.Data.models.Security;
import com.WalkingCompiler.Data.repositories.SecurityRepository;
import com.WalkingCompiler.Utils.SecurityMapper;

public class SecurityServiceImpl implements SecurityService {

    private SecurityRepository securityRepository;

    @Override
    public Security username(String username) {
        Security secure = SecurityMapper.mapToSecurityService(username);
        Security savedSecurity = securityRepository.save(secure);
        return securityRepository.save(String.valueOf(savedSecurity)).toString();
    };

    @Override
    public Security securityId(String securityId) {
        Security secure = SecurityMapper.mapToSecurityService(securityId);
        Security savedSecurity = securityRepository.save(secure);
        return securityRepository.save(savedSecurity).toString();
    };

    @Override
    public Security generatedOTP(boolean otp) {
        Security secure = SecurityMapper.mapToSecurityService("otp");
        Security generatedOTP = securityRepository.save(secure);
        return securityRepository.save(generatedOTP).hashCode() == generatedOTP.hashCode();
    };

}
