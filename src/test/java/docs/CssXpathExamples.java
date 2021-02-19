package docs;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class CssXpathExamples {

    // group: https://t.me/xpath_help
    // hints: https://devhints.io/xpath
    void cssXpathExamples() {
        open("url");

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
        // эталон
        $(by("data-testid", "royal_email")).setValue("some@email.com");    // priory if data-testid exists

        // другие возможности сделать тоже самое
        $("#email").setValue("some@email.com");                        // priory
        $(byId("email")).setValue("some@email.com");
        $("[id='email']").setValue("some@email.com");
        $("input[id='email']").setValue("some@email.com");
        $("input#email").setValue("some@email.com");
        $(by("id", "email")).setValue("some@email.com");

        $x("//input[@id='email']").setValue("some@email.com");
        $x("//*[@id='email']").setValue("some@email.com");

        $(byName("email")).setValue("some@email.com");                       // priory
        $("[name='email']").setValue("some@email.com");
        $("input[name='email']").setValue("some@email.com");
        $(by("name", "email")).setValue("some@email.com");

        //тоже самое с xpath
        $x("//input[@name='email']").setValue("some@email.com");
        $x("//*[@name='email']").setValue("some@email.com");

        $(byClassName("login_form_input_box")).setValue("some@email.com");
        $(".login_form_input_box").setValue("some@email.com");   // priory
        $(".inputtext.login_form_input_box").setValue("some@email.com");
        $("input.inputtext.login_form_input_box").setValue("some@email.com");
        $("input.inputtext.login_form_input_box#email").setValue("some@email.com");

        $x("//*[@class='login_form_input_box']").setValue("some@email.com");


    }

}