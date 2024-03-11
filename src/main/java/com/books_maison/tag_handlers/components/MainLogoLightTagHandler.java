package com.books_maison.tag_handlers.components;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MainLogoLightTagHandler extends TagSupport {
  private Logger logger = Logger.getLogger(MainLogoLightTagHandler.class.getName());

  @Override
  public int doStartTag() throws JspException {

    try {
      Scanner scanner = new Scanner(new File("src/main/webapp/images/books-maison-logo-light.svg"));
      while (scanner.hasNextLine()) {
        pageContext.getOut().print(scanner.nextLine());
      }
      scanner.close();
    } catch (IOException e) {
      logger.severe(e.getMessage());
    }
    return SKIP_BODY;
  }
}
