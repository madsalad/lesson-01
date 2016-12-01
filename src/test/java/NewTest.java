import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class NewTest {

    public WebDriver driver;


    @Before
    public void conf (){

        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void test (){

        System.out.println("Проверка заголовков:");

        driver.get("http://localhost/litecart/admin/");


        //авторизация
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("remember_me")).click();
        driver.findElement(By.name("login")).click();

        //проверка пункта "Appearence"
        WebElement appearence = driver.findElement(By.cssSelector("div#box-apps-menu-wrapper ul.list-vertical li:nth-child(1)"));
        appearence.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Appearence"
        WebElement logotype = driver.findElement(By.cssSelector("li#doc-logotype"));
        logotype.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Catalog"
        WebElement catalog = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(2)"));
        catalog.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Catalog"
        WebElement prodg = driver.findElement(By.cssSelector("li#doc-product_groups"));
        prodg.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement optg = driver.findElement(By.cssSelector("li#doc-option_groups"));
        optg.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement manufacturers = driver.findElement(By.cssSelector("li#doc-manufacturers"));
        manufacturers.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }


        WebElement suppliers = driver.findElement(By.cssSelector("li#doc-suppliers"));
        suppliers.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement delivstat = driver.findElement(By.cssSelector("li#doc-delivery_statuses"));
        delivstat.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement soldout = driver.findElement(By.cssSelector("li#doc-sold_out_statuses"));
        soldout.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement quantity = driver.findElement(By.cssSelector("li#doc-quantity_units"));
        quantity.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement csv = driver.findElement(By.cssSelector("li#doc-csv"));
        csv.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Countries"
        WebElement countries = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(3)"));
        countries.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Currencies"
        WebElement currencies = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(4)"));
        currencies.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Customers"
        WebElement customers = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(5)"));
        customers.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Customers"
        WebElement customcsv = driver.findElement(By.cssSelector("li#doc-csv"));
        customcsv.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement newsletter = driver.findElement(By.cssSelector("li#doc-newsletter"));
        newsletter.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Geo Zones"
        WebElement geozone = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(6)"));
        geozone.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Languages"
        WebElement languages = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(7)"));
        languages.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Storage Encoding"
        WebElement storenc = driver.findElement(By.cssSelector("li#doc-storage_encoding"));
        storenc.click();

        try{
            driver.getTitle();

            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Modules"
        WebElement modules = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(8)"));
        modules.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Modules"
        WebElement custmod = driver.findElement(By.cssSelector("li#doc-customer"));
        custmod.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement shipping = driver.findElement(By.cssSelector("li#doc-shipping"));
        shipping.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement payment = driver.findElement(By.cssSelector("li#doc-payment"));
        payment.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement ordertotal = driver.findElement(By.cssSelector("li#doc-order_total"));
        ordertotal.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement ordersuccess = driver.findElement(By.cssSelector("li#doc-order_success"));
        ordersuccess.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement orderaction = driver.findElement(By.cssSelector("li#doc-order_action"));
        orderaction.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Orders"
        WebElement orders = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(9)"));
        orders.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Orders"
        WebElement orderstat = driver.findElement(By.cssSelector("li#doc-order_statuses"));
        orderstat.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Pages"
        WebElement pages = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(10)"));
        pages.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Reports"
        WebElement reports = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(11)"));
        reports.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Reports"
        WebElement msp = driver.findElement(By.cssSelector("li#doc-most_sold_products"));
        msp.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement msc = driver.findElement(By.cssSelector("li#doc-most_shopping_customers"));
        msc.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Settings"
        WebElement settings = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(12)"));
        settings.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Settings"
        WebElement defaults = driver.findElement(By.cssSelector("li#doc-defaults"));
        defaults.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement general = driver.findElement(By.cssSelector("li#doc-general"));
        general.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement listings = driver.findElement(By.cssSelector("li#doc-listings"));
        listings.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement images = driver.findElement(By.cssSelector("li#doc-images"));
        images.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement checkout = driver.findElement(By.cssSelector("li#doc-checkout"));
        checkout.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement advanced = driver.findElement(By.cssSelector("li#doc-advanced"));
        advanced.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement security = driver.findElement(By.cssSelector("li#doc-security"));
        security.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Slides"
        WebElement slides = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(13)"));
        slides.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Tax"
        WebElement tax = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(14)"));
        tax.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Tax"
        WebElement taxrates = driver.findElement(By.cssSelector("li#doc-tax_rates"));
        taxrates.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Translations"
        WebElement translations = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(15)"));
        translations.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка подпунктов "Translations"
        WebElement scan = driver.findElement(By.cssSelector("li#doc-scan"));
        scan.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        WebElement csvTran = driver.findElement(By.cssSelector("li#doc-csv"));
        csvTran.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "Users"
        WebElement users = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(16)"));
        users.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }

        //проверка пункта "vQmods"
        WebElement vqmods = driver.findElement(By.cssSelector("ul.list-vertical li#app-:nth-child(17)"));
        vqmods.click();

        try{
            driver.getTitle();
            System.out.println(driver.getTitle());
        }catch (NoSuchElementException ex){
            System.out.println("Элемент не найден на странице:" + driver.getCurrentUrl());
        }





    }

    @After
    public void stop(){

        driver.quit();
        System.out.println("Тест окончен.");

    }
}