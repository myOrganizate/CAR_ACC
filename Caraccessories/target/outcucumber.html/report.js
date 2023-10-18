$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Use_Cases/Login.feature");
formatter.feature({
  "name": "user login to the Car accessories",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the user is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.LoginStep.that_the_user_is_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"lujainuser@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the password is \"useruser\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user login succeeds",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.LoginStep.the_user_login_succeeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User has the wrong password or email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the user is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.LoginStep.that_the_user_is_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"lujainuser123@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the password is \"useruser\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user login fail",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.LoginStep.the_user_login_fail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_user_is_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Admin or Installer can login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the admin or Installer is not logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the email is \u003cemail\u003e and the pass \u003cpass\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the admin or Installer login succeeds",
  "keyword": "Then "
});
formatter.step({
  "name": "the admin or Installer is logged in",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "pass",
        "status"
      ]
    },
    {
      "cells": [
        "\"lujain\"",
        "\"lujain@gmail.com\"",
        "\"lujain\"",
        "admin"
      ]
    },
    {
      "cells": [
        "\"aya\"",
        "\"aya@gmail.com\"",
        "\"ayaaya1\"",
        "Installer"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Admin or Installer can login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the admin or Installer is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.LoginStep.that_the_admin_or_Installer_is_not_logged_in1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"lujain@gmail.com\" and the pass \"lujain\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is_and_the_pass1(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin or Installer login succeeds",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.LoginStep.the_admin_or_Installer_login_succeeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin or Installer is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_admin_or_Installer_is_logged_in1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin or Installer can login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the admin or Installer is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.LoginStep.that_the_admin_or_Installer_is_not_logged_in1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"aya@gmail.com\" and the pass \"ayaaya1\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is_and_the_pass1(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin or Installer login succeeds",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.LoginStep.the_admin_or_Installer_login_succeeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin or Installer is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_admin_or_Installer_is_logged_in1()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Use_Cases/Product.feature");
formatter.feature({
  "name": "Product Catalog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Products organized into categorie",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Product  available",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.ProductStep.product_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Products organized into categories ( \"Interior\", \"Exterior\",\"Electronics\")",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.ProductStep.products_organized_into_categories(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Products not organized into categorie",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Product  not available",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.ProductStep.product_not_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Products cant organized into categories ( \"Interior\", \"Exterior\",\"Electronics\")",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.ProductStep.products_cant_organized_into_categories(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Browse and Search for Products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Product  available in our stock",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.ProductStep.product_available_in_our_stock()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product have categorie ( \"Interior\", \"Exterior\",\"Electronics\")",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.ProductStep.product_have_categorie(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for Product",
  "keyword": "When "
});
formatter.match({
  "location": "carpack.ProductStep.search_for_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see a product details(\"description\",\"image\",\"price\" ,\"availability\" )",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.ProductStep.i_should_see_a_product_details(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to filter the product by(\"price\",\"Brand\",\"Customer Rating\")",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.ProductStep.i_should_be_able_to_filter_the_product_by(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Use_Cases/Role.feature");
formatter.feature({
  "name": "Roles apply by Admin,Customer,Installer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Admin role",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin is login",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.RoleStep.the_admin_is_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"lujain@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the password is \"lujain\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin can Manage products, categories, and  Manage user accounts",
  "keyword": "When "
});
formatter.match({
  "location": "carpack.RoleStep.admin_can_Manage_products_categories_and_Manage_user_accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "can Manage products, categories, and user accounts",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.RoleStep.can_Manage_products_categories_and_user_accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Customer role",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is login",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.RoleStep.the_user_is_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"lujainuser@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the password is \"useruser\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer can Browse products,make purchases, and view orders",
  "keyword": "When "
});
formatter.match({
  "location": "carpack.RoleStep.customer_can_Browse_products_make_purchases_and_view_orders()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browse products, make purchases, and view orders",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.RoleStep.browse_products_make_purchases_and_view_orders()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Installer  role",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the  Installer  is login",
  "keyword": "Given "
});
formatter.match({
  "location": "carpack.RoleStep.the_Installer_is_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email is \"aya@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_email_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the password is \"ayaaya1\"",
  "keyword": "And "
});
formatter.match({
  "location": "carpack.LoginStep.the_password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Installer  View installation requests and schedule appointments",
  "keyword": "When "
});
formatter.match({
  "location": "carpack.RoleStep.installer_View_installation_requests_and_schedule_appointments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "View installation requests and schedule appointments",
  "keyword": "Then "
});
formatter.match({
  "location": "carpack.RoleStep.view_installation_requests_and_schedule_appointments()"
});
formatter.result({
  "status": "passed"
});
});