package MainPackage.DataGenerator;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class AuthanticationDataGenerator {
    Faker faker = new Faker();
    FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

    // Login

    public static String Email_Address = "a.ali@medexsepeti.com";   //Email static
    public static String Password = "MX123456789";          //password static


}
