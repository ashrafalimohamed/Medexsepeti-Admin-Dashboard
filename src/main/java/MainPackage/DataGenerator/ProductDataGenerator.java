package MainPackage.DataGenerator;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class ProductDataGenerator {
    static Faker faker = new Faker();
    static FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
    static String Get_Current_Time = String.valueOf(System.currentTimeMillis());


    // Barcode Data Generator :


    public static String Barcode = "1"+Get_Current_Time;    //Barcode_Generator
    public static String Barcode_2 = "2"+Get_Current_Time;    //Barcode_Generator 2
    public static String Barcode_3 = "3"+Get_Current_Time;    //Barcode_Generator 3
    public static String Barcode_4 = "4"+Get_Current_Time;    //Barcode_Generator 4
    public static String Barcode_5 = "5"+Get_Current_Time;    //Barcode_Generator 5


    // Model Data Generator :
    public static String Model_Name = fakeValuesService.bothify("Test_Automation_??##??##??##??##");
    public static String Model_Name_1 = fakeValuesService.bothify("Test_Automation_1_??##??##??##??##");
    public static String Model_Name_2 = fakeValuesService.bothify("Test_Automation_2_??##??##??##??##");
    public static String Model_Name_3 = fakeValuesService.bothify("Test_Automation_3_??##??##??##??##");
    public static String Model_Name_4 = fakeValuesService.bothify("Test_Automation_4_??##??##??##??##");
    public static String Model_Name_5 = fakeValuesService.bothify("Test_Automation_5_??##??##??##??##");
    public static String Model_Name_6 = fakeValuesService.bothify("Test_Automation_6_??##??##??##??##");
    public static String Model_Name_7 = fakeValuesService.bothify("Test_Automation_7_??##??##??##??##");
    public static String Model_Name_8 = fakeValuesService.bothify("Test_Automation_8_??##??##??##??##");
    public static String Model_Name_9 = fakeValuesService.bothify("Test_Automation_9_??##??##??##??##");
    public static String Model_Name_10 = fakeValuesService.bothify("Test_Automation_10_??##??##??##??##");


    // Product Model Code Data Generator:

    public static String Product_Model_Code = fakeValuesService.bothify("9665########");
    public static String Product_Model_Code_1 = fakeValuesService.bothify("96651#######");
    public static String Product_Model_Code_2 = fakeValuesService.bothify("96652#######");
    public static String Product_Model_Code_3 = fakeValuesService.bothify("96653#######");
    public static String Product_Model_Code_4 = fakeValuesService.bothify("96654#######");
    public static String Product_Model_Code_5 = fakeValuesService.bothify("96655#######");
    public static String Product_Model_Code_6 = fakeValuesService.bothify("96656#######");
    public static String Product_Model_Code_7 = fakeValuesService.bothify("96657#######");
    public static String Product_Model_Code_8 = fakeValuesService.bothify("96658#######");
    public static String Product_Model_Code_9 = fakeValuesService.bothify("96659#######");
    public static String Product_Model_Code_10 = fakeValuesService.bothify("966510######");


    // Product Name Data Generator :

    public static String Product_Name_Generator = "Test_Automation_"+ faker.name().firstName();     //Product Name_Generator
    public static String Product_Name_Generator_2 = "Test_Automation2" + Get_Current_Time;    // Product Name_Generator 2
    public static String Product_Name_Generator_3 = "Test_Automation3" + Get_Current_Time;    //Product Name_Generator 3
    public static String Product_Name_Generator_4 = "Test_Automation4" + Get_Current_Time;    //Product Name_Generator 4
    public static String Product_Name_Generator_5 = "Test_Automation5" + Get_Current_Time;    //Product Name_Generator 5

    // Description Data Generator :

    public static String Description = fakeValuesService.bothify("Test Automation ## ???? @ Description ");


    // DSI  Data Generator:
    public static String DSI_number = fakeValuesService.regexify("([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])");  //  from 1 to  255




}
