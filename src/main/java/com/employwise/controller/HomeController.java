package com.employwise.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<?> status() {
        String htmlBody = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>Nth Employee</title>\n" +
                "  <style>\n" +
                "    body {\n" +
                "      font-family: Arial, sans-serif;\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "      background-color: #f4f4f4;\n" +
                "    }\n" +
                "    \n" +
                "    .container {\n" +
                "      max-width: 800px;\n" +
                "      margin: 0 auto;\n" +
                "      padding: 40px;\n" +
                "      background-color: white;\n" +
                "      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "    }\n" +
                "    \n" +
                "    h1 {\n" +
                "      color: #333;\n" +
                "      text-align: center;\n" +
                "      margin-bottom: 30px;\n" +
                "    }\n" +
                "    \n" +
                "    a {\n" +
                "      color: #007bff;\n" +
                "      text-decoration: none;\n" +
                "    }\n" +
                "    \n" +
                "    a:hover {\n" +
                "      text-decoration: underline;\n" +
                "    }\n" +
                "    \n" +
                "    #bottom-section {\n" +
                "      font-size: 20px;\n" +
                "      border-top: 1px solid #ddd;\n" +
                "      padding-top: 20px;\n" +
                "      margin-top: 30px;\n" +
                "    }\n" +
                "    \n" +
                "    #bottom-section b {\n" +
                "      color: #666;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div class=\"container\">\n" +
                "    <h1>Hey There! Welcome to Nth Employee</h1>\n" +
                "    <a href=\"/swagger-ui/index.html\">Documentation</a>\n" +
                "    <br>\n" +
                "    <a href=\"https://github.com/ratnesh2003/nth-employee\">Repository Link</a>\n" +
                "    <p id=\"bottom-section\">\n" +
                "      <br>\n" +
                "      <b>Regards,<br>\n" +
                "      Ratnesh Mishra<br>\n" +
                "      Phone: +919696485545<br>\n" +
                "      Email: <a href=\"mailto:ratneshmishrarulz@gmail.com\">ratneshmishrarulz@gmail.com</a></b>\n" +
                "    </p>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>";
        return new ResponseEntity<>(htmlBody, HttpStatus.OK);
    }
}
