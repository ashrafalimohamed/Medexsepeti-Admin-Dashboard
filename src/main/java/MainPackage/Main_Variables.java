package MainPackage;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class Main_Variables {

    Faker faker = new Faker();
    static FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
    public static final int    timOut = 10000;    //Time out
    public static final String special_characters_Generattor = fakeValuesService.regexify("[$&@#%!]{10}");
    public static final String Unlimited_character = fakeValuesService.regexify("[A-Z][a-z]{500}");

}

