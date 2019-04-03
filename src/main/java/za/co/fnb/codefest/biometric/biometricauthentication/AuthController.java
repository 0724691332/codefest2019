package za.co.fnb.codefest.biometric.biometricauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biometric/api/v1")
public class AuthController {

    @GetMapping("/customer/{ucn}")
    public String getBiometricAuthIndicator(@PathVariable(value = "ucn") Long ucn){
        return "biometric enabled";
    }

    @GetMapping("/authenticate/{ucn}")
    public String authenticateCustomerUsingBiometric(@PathVariable(value = "ucn") Long ucn){
        return "succesfull";
    }
}
